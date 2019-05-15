package ru.credit.demo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.credit.demo.entity.CatalogEntity;

public interface CatalogRepository extends PagingAndSortingRepository<CatalogEntity, Long> {
}
