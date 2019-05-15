package ru.credit.demo.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.credit.demo.dto.DogovorDto;
import ru.credit.demo.entity.DogovorEntity;
import ru.credit.demo.repositories.CatalogRepository;
import ru.credit.demo.repositories.DogovorRepository;
import ru.credit.demo.services.DogovorService;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogovorServiceImpl implements DogovorService {

    @Autowired
    private DogovorRepository repository;

    public List<DogovorDto> getAllDogovorList() {

        List<DogovorDto> dogovorDtoList = new ArrayList<>();
        List<DogovorEntity> dogovorEntityList = new ArrayList<>();
        repository.findAll().forEach(dogovorEntityList::add);
        dogovorEntityList.forEach(dogovorEntity -> {
            DogovorDto dto = new DogovorDto();
            dto.fromEntity(dogovorEntity);
            dogovorDtoList.add(dto);
        });
        return dogovorDtoList;
    };
}
