package ru.credit.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.credit.demo.dto.CustomerDto;
import ru.credit.demo.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerResource {

    @Autowired
    public CustomerService customerService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<CustomerDto> getAllCustomerList() {
        return customerService.getAllCustomerList();
    }
}
