package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.DoctorShift;

@Repository
public interface DoctorShiftRepository extends JpaRepository<DoctorShift, Long> {

}