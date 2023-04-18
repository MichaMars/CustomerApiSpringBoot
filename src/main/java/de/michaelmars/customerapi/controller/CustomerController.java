package de.michaelmars.customerapi.controller;

import de.michaelmars.customerapi.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;
import de.michaelmars.customerapi.entity.Customer;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @GetMapping("")
    public List<Customer> index(){
        return customerRepository.findAll();
    }

    @RequestMapping("/delete/{id}")
    public void deleteCustomersById(@PathVariable Long id){
        this.customerRepository.deleteById(id);
    }
}
