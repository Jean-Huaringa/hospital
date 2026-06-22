package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.AppointmentStatuses;

@Repository
public interface AppointmentStatusRepository extends JpaRepository<AppointmentStatuses, Long> {

}