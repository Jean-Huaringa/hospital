package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.DoctorMedicalSpecialty;

@Repository
public interface DoctorMedicalSpecialtyRepository extends JpaRepository<DoctorMedicalSpecialty, Long> {

}