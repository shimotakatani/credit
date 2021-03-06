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
    private String data;

    /**
     * Остаток по договору
     */
    @Column(name = "balance")
    private BigDecimal balance;

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

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Long contractNumber) {
        this.contractNumber = contractNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(Integer contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public Integer getPaymentValue() {
        return paymentValue;
    }

    public void setPaymentValue(Integer paymentValue) {
        this.paymentValue = paymentValue;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
