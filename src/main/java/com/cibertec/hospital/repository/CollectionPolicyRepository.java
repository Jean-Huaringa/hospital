package com.cibertec.hospital.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.CollectionPolicy;

@Repository
public interface CollectionPolicyRepository extends JpaRepository<CollectionPolicy, Long> {

    @Query(value = """
        SELECT *
        FROM collection_policy
        WHERE subscription_id = :subscriptionId
          AND medical_specialty_id = :medicalSpecialtyId
        LIMIT 1
        """, nativeQuery = true)
    Optional<CollectionPolicy> findPolicy(
            @Param("subscriptionId") Long subscriptionId,
            @Param("medicalSpecialtyId") Long medicalSpecialtyId);
}
