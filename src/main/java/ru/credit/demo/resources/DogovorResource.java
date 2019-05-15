package ru.credit.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.credit.demo.dto.DogovorDto;
import ru.credit.demo.services.CatalogService;
import ru.credit.demo.services.DogovorService;

import java.util.List;

@RestController
@RequestMapping("dogovor")
public class DogovorResource {

    @Autowired
    public DogovorService dogovorService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<DogovorDto> getAllCustomerList() {
        return dogovorService.getAllDogovorList();
    }

}
