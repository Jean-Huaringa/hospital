package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.AppointmentCost;

@Repository
public interface AppointmentCostRepository extends JpaRepository<AppointmentCost, Long>{

}
