package ru.credit.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "contract", schema = "bd")
public class DogovorEntity extends BaseEntity {

    /**
     * Id магазина (надо будет завести справочник)
     */
    @Column(name = "shop_id")
    private Long shopId;

    /**
     * Номер договора
     */
    @Column(name = "contract_number")
    private Long contractNumber;

    /**
     * Сумма договора
     */
    @Column(name = "price")
    private BigDecimal price;

    /**
     * Длительность договора
     */
    @Column(name = "contract_period")
    private Integer contractPeriod;

    /**
     * Сумма одного взноса(похоже ануитетные платежи)
     */
    @Column(name = "payment_value")
    private Integer paymentValue;

    /**
     * ID клиента
     */
    @Column(name = "customer_id")
    private Long customerId;

    /**
     * Дата договора
     */
    @Column(name = "contract_date")
    private LocalDate data;

    /**
     * Остаток по договору
     */
    @Column(name = "balance")
    private LocalDate balance;

    /**
     * ID товара
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * Примечание
     */
    @Column(name = "description")
    private String description;
}
