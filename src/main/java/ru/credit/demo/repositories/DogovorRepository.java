package ru.credit.demo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.credit.demo.entity.DogovorEntity;

public interface DogovorRepository extends PagingAndSortingRepository<DogovorEntity, Long> {
}
