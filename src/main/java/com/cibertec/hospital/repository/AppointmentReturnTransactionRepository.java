package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.AppointmentReturnTransaction;

@Repository
public interface AppointmentReturnTransactionRepository extends JpaRepository<AppointmentReturnTransaction, Long> {

}