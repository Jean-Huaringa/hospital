package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.WorkSlot;

@Repository
public interface WorkSlotRepository extends JpaRepository<WorkSlot, Long> {

}