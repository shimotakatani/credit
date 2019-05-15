package ru.credit.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.credit.demo.dto.CatalogDto;
import ru.credit.demo.dto.CustomerDto;
import ru.credit.demo.services.CatalogService;

import java.util.List;

@RestController
@RequestMapping("catalog")
public class CatalogResource {

    @Autowired
    public CatalogService customerService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<CatalogDto> getAllCatalogList() {
        return customerService.getAllCatalogList();
    }
}
