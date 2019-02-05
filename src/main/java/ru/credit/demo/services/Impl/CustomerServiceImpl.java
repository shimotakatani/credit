package ru.credit.demo.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.credit.demo.dto.CustomerDto;
import ru.credit.demo.entity.CustomerEntity;
import ru.credit.demo.repositories.CustomerRepository;
import ru.credit.demo.services.CustomerService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<CustomerDto> getAllCustomerList() {
        List<CustomerDto> customerDtoList = new ArrayList<>();
        List<CustomerEntity> customerEntityList = new ArrayList<>();
        repository.findAll().forEach(customerEntityList::add);
        customerEntityList.forEach(customerEntity -> {
            CustomerDto dto = new CustomerDto();
            dto.fromEntity(customerEntity);
            customerDtoList.add(dto);
        });
        return customerDtoList;
    }
}
