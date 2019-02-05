package ru.credit.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.credit.demo.dto.CustomerDto;
import ru.credit.demo.services.CustomerService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class RestResource {

    @Autowired
    public CustomerService customerService;

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(@PathParam("value") String value){
        return value;
    }

    @RequestMapping(value = "/customer/all", method = RequestMethod.GET)
    public List<CustomerDto> getAllCustomerList() {
        return customerService.getAllCustomerList();
    }
}
