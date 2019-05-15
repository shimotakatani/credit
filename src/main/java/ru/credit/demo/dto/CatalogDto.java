package ru.credit.demo.dto;

import ru.credit.demo.entity.BaseEntity;
import ru.credit.demo.entity.CatalogEntity;

import java.math.BigDecimal;

public class CatalogDto  extends BaseDto  {

    /**
     * ID договора
     */
    private Long contractId;

    /**
     * Наименование товара
     */
    private String goodName;

    /**
     * Цена товара
     */
    private BigDecimal price;

    /**
     * Количество товара
     */
    private Double goodCount;

    @Override
    public void fromEntity(BaseEntity entity) {
        super.fromEntity(entity);
        if (entity instanceof CatalogEntity) {
            CatalogEntity catalogEntity = (CatalogEntity) entity;
            this.setContractId(catalogEntity.getContractId());
            this.setGoodCount(catalogEntity.getGoodCount());
            this.setGoodName(catalogEntity.getGoodName());
            this.setPrice(catalogEntity.getPrice());
        }
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Double goodCount) {
        this.goodCount = goodCount;
    }
}
