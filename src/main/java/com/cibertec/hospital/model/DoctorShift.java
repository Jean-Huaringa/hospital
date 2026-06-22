package com.cibertec.hospital.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Table(name = "doctor_shift")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorShift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "work_slot_id")
    private Long workSlotId;

    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "assigned_at")
    private LocalDateTime assignedAt;

    @Column(name = "status")
    private String status;
}