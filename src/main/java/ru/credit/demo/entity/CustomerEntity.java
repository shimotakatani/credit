package ru.credit.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "castumer", schema = "BD")
public class CustomerEntity extends BaseEntity {

    /**
     * ФИО клиента
     */
    @Column(name = "FIO")
    private String fio;

    /**
     * Серия паспорта клиента
     */
    @Column(name = "Psre")
    private Integer passportSeria;

    /**
     * Номер паспорта клиента
     */
    @Column(name = "Pnom")
    private Integer passportNumber;

    /**
     * Дата рождения клиента
     */
    @Column(name = "DayR")
    private LocalDate birthDate;

    /**
     * Дата выдачи паспорта клиента
     */
    @Column(name = "Pday")
    private LocalDate passportIssuanceDate;

    /**
     * Место выдачи паспорта клиента
     */
    @Column(name = "Pvyd")
    private String passportIssuancePlace;

    /**
     * Адрес регистрации клиента
     */
    @Column(name = "prop")
    private String registrationPlace;

    /**
     * Адрес фактического проживания клиента
     */
    @Column(name = "Mzh")
    private String livingPlace;

    /**
     * Место работы клиента
     */
    @Column(name = "Work")
    private String workPlace;

    /**
     * Телефон клиента
     */
    @Column(name = "Fone")
    private String phone;

    /**
     * Домашний телефон клиента
     */
    @Column(name = "Home_fone")
    private String homePhone;

    /**
     * Рабочий телефон клиента
     */
    @Column(name = "Fone_worck")
    private String workPhone;

    /**
     * Примечание
     */
    @Column(name = "Desc")
    private String description;

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
