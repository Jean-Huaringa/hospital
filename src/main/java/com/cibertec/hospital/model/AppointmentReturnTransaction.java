package com.cibertec.hospital.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
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
    
    //-- Nuevo:

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}