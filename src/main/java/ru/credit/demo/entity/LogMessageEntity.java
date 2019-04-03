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
@Table(name = "log", schema = "bd")
public class LogMessageEntity extends BaseEntity {

    /**
     * ID пользователя
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * ID платежа
     */
    @Column(name = "payment_id")
    private Long paymentId;

    /**
     * ID договора
     */
    @Column(name = "contract_id")
    private Long contractId;

    /**
     * Дата логирования
     */
    @Column(name = "log_date")
    private LocalDate logDate;

    /**
     * Тип лога(или сразу сюда или по справчнику)
     */
    @Column(name = "log_type")
    private String logType;

    /**
     * Примечание
     */
    @Column(name = "description")
    private String description;
}
