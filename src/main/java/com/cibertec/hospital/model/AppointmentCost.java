package com.cibertec.hospital.model;

import java.math.BigDecimal;

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
@Table(name = "appointment_cost")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentCost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "appointment_cost")
	private BigDecimal appointmentCost;

	@Column(name = "total_cost")
	private BigDecimal totalCost;

	@Column(name = "subscription_id")
	private Long subscriptionId;

	@Column(name = "medical_specialty_id")
	private Long medicalSpecialtyId;
}
