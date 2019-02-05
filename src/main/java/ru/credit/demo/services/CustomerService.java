package ru.credit.demo.services;

import ru.credit.demo.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getAllCustomerList();
}
