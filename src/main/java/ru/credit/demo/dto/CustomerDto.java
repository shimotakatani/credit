package ru.credit.demo.dto;

import ru.credit.demo.entity.BaseEntity;
import ru.credit.demo.entity.CustomerEntity;

import java.time.LocalDate;

public class CustomerDto extends BaseDto {

    /**
     * ФИО клиента
     */
    private String fio;

    /**
     * Серия паспорта клиента
     */
    private Integer passportSeria;

    /**
     * Номер паспорта клиента
     */
    private Integer passportNumber;

    /**
     * Дата рождения клиента
     */
    private LocalDate birthDate;

    /**
     * Дата выдачи паспорта клиента
     */
    private LocalDate passportIssuanceDate;

    /**
     * Место выдачи паспорта клиента
     */
    private String passportIssuancePlace;

    /**
     * Адрес регистрации клиента
     */
    private String registrationPlace;

    /**
     * Адрес фактического проживания клиента
     */
    private String livingPlace;

    /**
     * Место работы клиента
     */
    private String workPlace;

    /**
     * Телефон клиента
     */
    private String phone;

    /**
     * Домашний телефон клиента
     */
    private String homePhone;

    /**
     * Рабочий телефон клиента
     */
    private String workPhone;

    /**
     * Примечание
     */
    private String description;

    @Override
    public void fromEntity(BaseEntity entity) {
        super.fromEntity(entity);
        if (entity instanceof CustomerEntity) {
            CustomerEntity customerEntity = (CustomerEntity) entity;
            this.setFio(customerEntity.getFio());
            this.setPassportSeria(customerEntity.getPassportSeria());
            this.setPassportNumber(customerEntity.getPassportNumber());
            this.setBirthDate(customerEntity.getBirthDate());
            this.setPassportIssuanceDate(customerEntity.getPassportIssuanceDate());
            this.setPassportIssuancePlace(customerEntity.getPassportIssuancePlace());
            this.setRegistrationPlace(customerEntity.getRegistrationPlace());
            this.setLivingPlace(customerEntity.getLivingPlace());
            this.setWorkPlace(customerEntity.getWorkPlace());
            this.setPhone(customerEntity.getPhone());
            this.setHomePhone(customerEntity.getHomePhone());
            this.setWorkPhone(customerEntity.getWorkPhone());
            this.setDescription(customerEntity.getDescription());
        }
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(Integer passportSeria) {
        this.passportSeria = passportSeria;
    }

    public Integer getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Integer passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getPassportIssuanceDate() {
        return passportIssuanceDate;
    }

    public void setPassportIssuanceDate(LocalDate passportIssuanceDate) {
        this.passportIssuanceDate = passportIssuanceDate;
    }

    public String getPassportIssuancePlace() {
        return passportIssuancePlace;
    }

    public void setPassportIssuancePlace(String passportIssuancePlace) {
        this.passportIssuancePlace = passportIssuancePlace;
    }

    public String getRegistrationPlace() {
        return registrationPlace;
    }

    public void setRegistrationPlace(String registrationPlace) {
        this.registrationPlace = registrationPlace;
    }

    public String getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(String livingPlace) {
        this.livingPlace = livingPlace;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
