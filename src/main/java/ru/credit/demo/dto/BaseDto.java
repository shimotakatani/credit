package ru.credit.demo.dto;

import ru.credit.demo.entity.BaseEntity;

public class BaseDto {

    private Long id;

    public void fromEntity(BaseEntity entity){
        if (entity != null) {
            this.id = entity.getId();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
