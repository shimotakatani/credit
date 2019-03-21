package ru.credit.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "payment")
public class PlatEntity extends BaseEntity  {

    /**
     * Id договора
     */
    @Column(name = "contract_id")
    private Long contractId;

    /**
     * Сумма платежа(взнос)
     */
    @Column(name = "pay")
    private BigDecimal pay;

    /**
     * Процент кредита
     */
    @Column(name = "percent")
    private Integer percent;

    /**
     * Погашено
     */
    @Column(name = "repay")
    private BigDecimal repay;

    /**
     * Остаток
     */
    @Column(name = "balance")
    private BigDecimal balance;

    /**
     * ФИО клиента
     */
    @Column(name = "fio")
    private String fio;

    /**
     * Примечание
     */
    @Column(name = "description")
    private String description;

    /**
     * ID пользователя
     */
    @Column(name = "user_id")
    private Long userId;
}
