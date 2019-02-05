package ru.credit.demo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.credit.demo.entity.CustomerEntity;

public interface CustomerRepository extends PagingAndSortingRepository<CustomerEntity, Long> {
}
