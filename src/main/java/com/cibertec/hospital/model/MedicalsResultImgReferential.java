package com.cibertec.hospital.model;

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
@Table(name = "meidocs_results_img_referential")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MedicalsResultImgReferential {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;

	    @Column(name = "meidocs_results_id")
	    private Long meidocsResultsId;

	    @Column(name = "url_img")
	    private String urlImg;
}
