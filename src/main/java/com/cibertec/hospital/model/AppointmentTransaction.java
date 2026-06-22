package com.cibertec.hospital.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointment_transaction")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "appointment_id")
    private Long appointmentId;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "paid_at")
    private LocalDateTime paidAt;
}