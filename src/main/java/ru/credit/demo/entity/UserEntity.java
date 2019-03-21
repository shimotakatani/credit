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
@Table(name = "user", schema = "bd")
public class UserEntity extends BaseEntity{

    /**
     * Имя пользователя
     */
    @Column(name = "username")
    private String username;

    /**
     * Пароль
     */
    @Column(name = "password")
    private String password;

    /**
     * Роль
     */
    @Column(name = "role")
    private String role;

    /**
     * Дата? чего
     */
    @Column(name = "date")
    private LocalDate date;

    /**
     * ФИО клиента
     */
    @Column(name = "fullname")
    private String fullname;
}
