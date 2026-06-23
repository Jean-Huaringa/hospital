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
@Table(name = "refund_policy")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefundPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type_process_id")
    private Long typeProcessId;

    @Column(name = "return_policy")
    private String returnPolicy;

    @Column(name = "return_type")
    private String returnType;

    @Column(name = "subscription_id")
    private Long subscriptionId;
}