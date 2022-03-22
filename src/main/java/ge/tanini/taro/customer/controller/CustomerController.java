package ge.tanini.taro.customer.controller;

import ge.tanini.taro.customer.model.Customer;
import ge.tanini.taro.customer.service.CustomerService;
import ge.tanini.taro.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    CustomerController (CustomerService customerService){
        this.customerService=customerService;
    }

    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable Long id) throws NotFoundException {
        return customerService.getCustomer(id);
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        customer.setId(null);
        return customerService.addCustomer(customer);
    }

}
