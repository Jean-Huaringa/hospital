package com.cibertec.hospital.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointment_return_transaction")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentReturnTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "appointment_return_id")
    private Long appointmentReturnId;

    @Column(name = "refund_method")
    private String refundMethod;

    @Column(name = "processed_at")
    private LocalDateTime processedAt;
}