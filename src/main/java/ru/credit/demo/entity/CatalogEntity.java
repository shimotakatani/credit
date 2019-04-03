package ru.credit.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "catalog", schema = "bd")
public class CatalogEntity extends BaseEntity {

    /**
     * ID договора
     */
    @Column(name = "contract_id")
    private Long contractId;

    /**
     * Наименование товара
     */
    @Column(name = "good_name")
    private String goodName;

    /**
     * Цена товара
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * Количество товара
     */
    @Column(name = "good_count")
    private Double goodCount;
}
