package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.RefundPolicy;

@Repository
public interface RefundPolicyRepository extends JpaRepository<RefundPolicy, Long> {

}