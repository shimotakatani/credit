package ru.credit.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "castumer")
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
}
