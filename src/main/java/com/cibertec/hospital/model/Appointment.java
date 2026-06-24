package com.cibertec.hospital.model;

import java.math.BigDecimal;
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
@Table(name = "appointment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "status")
	private String status;

	@Column(name = "motive")
	private String motive;

	@Column(name = "consultation_cost")
	private BigDecimal consultationCost;

	@Column(name = "is_enabled")
	private Boolean isEnabled;

	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	// -- Agregados:

	@Column(name = "payment_method_id")
	private Long paymentMethodId;

	@Column(name = "users_id")
	private Long usersId;

	@Column(name = "doctor_shift_id")
	private Long doctorShiftId;
}