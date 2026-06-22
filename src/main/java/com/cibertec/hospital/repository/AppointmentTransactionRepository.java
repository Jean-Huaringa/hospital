package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.AppointmentTransaction;

@Repository
public interface AppointmentTransactionRepository extends JpaRepository<AppointmentTransaction, Long> {

}