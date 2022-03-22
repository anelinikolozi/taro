package ge.tanini.taro.customer.service;

import ge.tanini.taro.customer.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer getCustomer(Long id);

    Customer addCustomer(Customer customer);
}
