package com.cibertec.hospital.model;

import java.time.LocalDateTime;

import com.cibertec.hospital.enums.DoctorShiftStatusEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    
    @Column(name = "assigned_at")
    private LocalDateTime assignedAt;

	@Enumerated(EnumType.STRING)
    @Column(name = "status")
    private DoctorShiftStatusEnum status;
    
	@Column(name = "is_enabled")
	private Boolean isEnabled;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
    
    //-- Nuevo:

    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "medical_specialties_id")
    private Long medicalSpecialtiesId;

    @Column(name = "hospital_id")
    private Long hospitalId;
}