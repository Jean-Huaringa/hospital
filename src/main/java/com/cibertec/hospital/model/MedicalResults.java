package com.cibertec.hospital.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "medical_results")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalResults {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;

	    @Column(name = "title")
	    private String title;

	    @Column(name = "appointment_id")
	    private Long appointmentId;

	    @Column(name = "diagnosis")
	    private String diagnosis;

	    @Column(name = "observations")
	    private String observations;

	    @Column(name = "prescription")
	    private String prescription;
	    
		@Column(name = "is_enabled")
		private Boolean isEnabled;

		@Column(name = "is_deleted")
		private Boolean isDeleted;

		@Column(name = "created_at")
		private LocalDateTime createdAt;

		@Column(name = "updated_at")
		private LocalDateTime updatedAt;
}
