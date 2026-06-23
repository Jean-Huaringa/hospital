package com.cibertec.hospital.repository;

import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentCostRepository extends JpaRepository<AppointmentCostRepository, Long>{

}
