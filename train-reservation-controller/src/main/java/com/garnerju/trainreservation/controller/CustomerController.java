package com.garnerju.trainreservation.controller;

import com.garnerju.trainreservation.model.Customer;
import com.garnerju.trainreservation.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping("/customers")
    public Customer addNewCustomer(@RequestBody Customer newCustomer) {
        return customerService.createCustomer(newCustomer);
    }

    @PutMapping("/customers/")
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);

    }





}
