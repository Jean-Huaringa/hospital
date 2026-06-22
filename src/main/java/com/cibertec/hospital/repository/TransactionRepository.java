package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}