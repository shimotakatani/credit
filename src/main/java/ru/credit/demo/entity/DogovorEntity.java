package ru.credit.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "dogovor")
public class DogovorEntity extends BaseEntity {

    /**
     * Id магазина (надо будет завести справочник)
     */
    @Column(name = "Magaz")
    private Long shopId;

    /**
     * Номер договора
     */
    @Column(name = "Ndog")
    private Long contractNumber;

    /**
     * Сумма договора
     */
    @Column(name = "Price")
    private BigDecimal price;

    /**
     * Длительность договора
     */
    @Column(name = "Dlit")
    private Integer contractPeriod;

    /**
     * Сумма одного взноса(похоже ануитетные платежи)
     */
    @Column(name = "Vsnos")
    private Integer paymentValue;

    /**
     * ID клиента
     */
    @Column(name = "id_custumer")
    private Long customerId;

    /**
     * Дата договора
     */
    @Column(name = "Data")
    private LocalDate data;

    /**
     * Остаток по договору
     */
    @Column(name = "Ost")
    private LocalDate balance;

    /**
     * ID товара
     */
    @Column(name = "id_tov")
    private Long productId;

    /**
     * Примечание
     */
    @Column(name = "Desc")
    private String description;
}
