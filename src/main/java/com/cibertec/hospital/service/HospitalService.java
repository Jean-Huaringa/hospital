package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.model.Hospital;

public interface HospitalService {

	List<Hospital> findByMedicalSpecialty(Long specialtyId);
}
