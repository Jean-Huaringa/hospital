package com.cibertec.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.PaymentMethod;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {

    @Query(value = """
            SELECT *
            FROM payment_method
            WHERE is_deleted = 0
              AND is_enabled = 1
            """, nativeQuery = true)
        List<PaymentMethod> findAllEnabled();
    
}