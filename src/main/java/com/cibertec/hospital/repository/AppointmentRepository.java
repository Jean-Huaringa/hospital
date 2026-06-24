package com.cibertec.hospital.repository;



import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.dto.AppointmentHistoryDTO;
import com.cibertec.hospital.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	
	@Query(value = """
		    SELECT
		        a.id AS appointmentId,
		        a.consultation_cost AS consultationCost,
		        a.status,

		        h.id AS hospitalId,
		        h.name AS hospitalName,

		        ms.id AS specialtyId,
		        ms.name AS specialtyName,

		        ds.id AS doctorShiftId,
		        ds.assigned_at AS assignedAt,

		        d.id AS doctorId,

		        doctor_user.id AS doctorUserId,
		        CONCAT(
		            doctor_user.names, ' ',
		            doctor_user.maternal_last_name, ' ',
		            doctor_user.paternal_last_name
		        ) AS doctorName,

		        patient.id AS patientUserId,
		        CONCAT(
		            patient.names, ' ',
		            patient.maternal_last_name, ' ',
		            patient.paternal_last_name
		        ) AS patientName

		    FROM appointment a

		    INNER JOIN doctor_shift ds ON ds.id = a.doctor_shift_id
		    INNER JOIN hospital h ON h.id = ds.hospital_id
		    INNER JOIN medical_specialty ms ON ms.id = ds.medical_specialties_id
		    INNER JOIN doctor d ON d.id = ds.doctor_id
		    INNER JOIN user_worker uw ON uw.id = d.user_worker_id
		    INNER JOIN users doctor_user ON doctor_user.id = uw.user_id
		    INNER JOIN users patient ON patient.id = a.users_id

		    WHERE a.users_id = :userId
		      AND (:specialtyId IS NULL OR ds.medical_specialties_id = :specialtyId)
		      AND (:hospitalId IS NULL OR ds.hospital_id = :hospitalId)
		      AND (:status IS NULL OR a.status = :status)

		    ORDER BY a.created_at DESC
		""", nativeQuery = true)
		Page<AppointmentHistoryDTO> findAppointmentHistory(
		        @Param("userId") Long userId,
		        @Param("specialtyId") Long specialtyId,
		        @Param("hospitalId") Long hospitalId,
		        @Param("status") String status,
		        Pageable pageable
		);
}
