package com.cibertec.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.MedicalSpecialty;

@Repository
public interface MedicalSpecialtyRepository extends JpaRepository<MedicalSpecialty, Long> {

    @Query(value = """
            SELECT *
            FROM medical_specialty
            WHERE is_deleted = 0
              AND is_enabled = 1
            """, nativeQuery = true)
        List<MedicalSpecialty> findAllEnabled();
}