package ge.tanini.taro.customer.service;

import ge.tanini.taro.customer.model.Customer;
import ge.tanini.taro.customer.repository.CustomerRepository;
import ge.tanini.taro.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CustomerServiceImpl  implements CustomerService{

    private CustomerRepository customerRepository;

    @Autowired
    CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    @Override
    @Transactional(rollbackFor = Throwable.class)
    public Customer getCustomer(Long id) {
        Optional<Customer> optionalCustomer=customerRepository.findById(id);
        if (!optionalCustomer.isPresent()){
            throw new NotFoundException(String.format("Customer with id %d not found",id));
        }
        return optionalCustomer.get();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
