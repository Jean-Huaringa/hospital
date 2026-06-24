package com.cibertec.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.DoctorShift;

@Repository
public interface DoctorShiftRepository extends JpaRepository<DoctorShift, Long> {

    @Query(value = """
            SELECT *
            FROM doctor_shift ds
            WHERE ds.hospital_id = :hospitalId
              AND (:doctorId IS NULL OR ds.doctor_id = :doctorId)
              AND (:specialtyId IS NULL OR ds.medical_specialties_id = :specialtyId)
              AND ds.status = 'ASSIGNED'
            ORDER BY ds.assigned_at
            """, nativeQuery = true)
        List<DoctorShift> findAvailableShifts(
                @Param("hospitalId") Long hospitalId,
                @Param("doctorId") Long doctorId,
                @Param("specialtyId") Long specialtyId);
    
}