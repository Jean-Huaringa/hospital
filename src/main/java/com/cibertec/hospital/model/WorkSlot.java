package com.cibertec.hospital.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "work_slot")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "medical_specialties_id")
    private Long medicalSpecialtiesId;

    @Column(name = "start_week_date")
    private LocalDate startWeekDate;

    @Column(name = "end_week_date")
    private LocalDate endWeekDate;

    @Column(name = "status")
    private String status;
}