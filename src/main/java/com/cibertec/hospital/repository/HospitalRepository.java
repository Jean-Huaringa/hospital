package com.cibertec.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {

    @Query(value = """
            SELECT DISTINCT h.*
            FROM hospital h
            INNER JOIN medical_specialty_hospital msh
                ON msh.hospital_id = h.id
            WHERE msh.medical_specialties_id = :medicalSpecialtiesId
            """, nativeQuery = true)
        List<Hospital> findByMedicalSpecialty(
                @Param("medicalSpecialtiesId") Long medicalSpecialtiesId);
}