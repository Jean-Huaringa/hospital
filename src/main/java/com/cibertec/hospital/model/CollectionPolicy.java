package com.cibertec.hospital.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.cibertec.hospital.enums.RefundPolicyTypeEnum;

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
@Table(name = "collection_policy")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollectionPolicy {
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
	
	@Enumerated(EnumType.STRING)
    @Column(name = "refund_policy_type")
    private RefundPolicyTypeEnum refundPolicyType; 
    
    @Column(name = "return_money")
    private Double returnMoney;
    
	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	@Column(name = "is_enabled")
	private Boolean isEnabled;

	@Column(name = "is_deleted")
	private Boolean isDeleted;
}
