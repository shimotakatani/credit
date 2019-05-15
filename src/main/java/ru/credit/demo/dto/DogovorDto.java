package ru.credit.demo.dto;

import ru.credit.demo.entity.BaseEntity;
import ru.credit.demo.entity.DogovorEntity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DogovorDto extends BaseDto  {

    /**
     * Id магазина (надо будет завести справочник)
     */
    private Long shopId;

    /**
     * Номер договора
     */
    private Long contractNumber;

    /**
     * Сумма договора
     */
    private BigDecimal price;

    /**
     * Длительность договора
     */
    private Integer contractPeriod;

    /**
     * Сумма одного взноса(похоже ануитетные платежи)
     */
    private Integer paymentValue;

    /**
     * ID клиента
     */
    private Long customerId;

    /**
     * Дата договора
     */
    private String data;

    /**
     * Остаток по договору
     */
    private BigDecimal balance;

    /**
     * ID товара
     */
    private Long productId;

    /**
     * Примечание
     */
    private String description;

    @Override
    public void fromEntity(BaseEntity entity) {
        super.fromEntity(entity);
        if (entity instanceof DogovorEntity) {
            DogovorEntity dogovorEntity = (DogovorEntity) entity;
            this.setBalance(dogovorEntity.getBalance());
            this.setContractNumber(dogovorEntity.getContractNumber());
            this.setContractPeriod(dogovorEntity.getContractPeriod());
            this.setCustomerId(dogovorEntity.getCustomerId());
            this.setData(dogovorEntity.getData());
            this.setDescription(dogovorEntity.getDescription());
            this.setPaymentValue(dogovorEntity.getPaymentValue());
            this.setPrice(dogovorEntity.getPrice());
            this.setProductId(dogovorEntity.getProductId());
            this.setShopId(dogovorEntity.getShopId());
        }
    }

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
