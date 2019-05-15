package ru.credit.demo.services;

import ru.credit.demo.dto.CatalogDto;

import java.util.List;

public interface CatalogService {

    List<CatalogDto> getAllCatalogList();
}
