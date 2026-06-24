package com.cibertec.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.dto.DoctorDTO;
import com.cibertec.hospital.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	@Query(value = """
	        SELECT DISTINCT
	            d.id AS doctorId,
	            CONCAT(
	                u.names, ' ',
	                u.maternal_last_name, ' ',
	                u.paternal_last_name
	            ) AS doctorName,
	            u.names,
	            u.paternal_last_name AS paternalLastName,
	            u.maternal_last_name AS maternalLastName,
	            u.email,
	            u.phone_number AS phoneNumber,
	            ms.name AS specialty
	        FROM doctor d
	        INNER JOIN user_worker uw
	            ON d.user_worker_id = uw.id
	        INNER JOIN users u
	            ON uw.user_id = u.id
	        INNER JOIN doctor_medical_specialty dms
	            ON d.id = dms.doctor_id
	        INNER JOIN medical_specialty ms
	            ON dms.medical_specialties_id = ms.id
	        WHERE uw.hospital_id = :hospitalId
	          AND dms.medical_specialties_id = :medicalSpecialId
	          AND dms.is_deleted = 0
	          AND dms.is_enabled = 1
	        """, nativeQuery = true)
	    List<DoctorDTO> findDoctorsByHospitalAndSpecialty(
	            @Param("hospitalId") Long hospitalId,
	            @Param("medicalSpecialId") Long medicalSpecialId);
	
}