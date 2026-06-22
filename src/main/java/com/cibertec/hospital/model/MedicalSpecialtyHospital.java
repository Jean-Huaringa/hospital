package com.cibertec.hospital.model;

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
@Table(name = "medical_specialty_hospital")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalSpecialtyHospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "hospital_id")
    private Long hospitalId;

    @Column(name = "medical_specialties_id")
    private Long medicalSpecialtiesId;
}