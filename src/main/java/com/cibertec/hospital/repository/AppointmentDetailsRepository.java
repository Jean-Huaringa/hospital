package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.AppointmentDetails;

@Repository
public interface AppointmentDetailsRepository extends JpaRepository<AppointmentDetails, Long> {

}