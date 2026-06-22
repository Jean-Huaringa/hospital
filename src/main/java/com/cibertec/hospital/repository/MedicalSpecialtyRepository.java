package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.MedicalSpecialty;

@Repository
public interface MedicalSpecialtyRepository extends JpaRepository<MedicalSpecialty, Long> {

}