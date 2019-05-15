package ru.credit.demo.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.credit.demo.dto.CatalogDto;
import ru.credit.demo.entity.CatalogEntity;
import ru.credit.demo.repositories.CatalogRepository;
import ru.credit.demo.services.CatalogService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CatalogRepository repository;

    public List<CatalogDto> getAllCatalogList() {

        List<CatalogDto> catalogDtoList = new ArrayList<>();
        List<CatalogEntity> catalogEntityList = new ArrayList<>();
        repository.findAll().forEach(catalogEntityList::add);
        catalogEntityList.forEach(customerEntity -> {
            CatalogDto dto = new CatalogDto();
            dto.fromEntity(customerEntity);
            catalogDtoList.add(dto);
        });
        return catalogDtoList;
    }
}
