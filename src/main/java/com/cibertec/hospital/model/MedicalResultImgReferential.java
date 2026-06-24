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
@Table(name = "medical_results_img_referential")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MedicalResultImgReferential {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;

	    @Column(name = "medical_results_id")
	    private Long medicalResultsId;

	    @Column(name = "url_img")
	    private String urlImg;
	    
		@Column(name = "is_enabled")
		private Boolean isEnabled;

		@Column(name = "is_deleted")
		private Boolean isDeleted;

		@Column(name = "created_at")
		private LocalDateTime createdAt;

		@Column(name = "updated_at")
		private LocalDateTime updatedAt;
}
