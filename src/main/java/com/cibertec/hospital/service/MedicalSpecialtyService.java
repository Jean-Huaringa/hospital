package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.model.MedicalSpecialty;

public interface MedicalSpecialtyService {

	List<MedicalSpecialty> findAllEnabled();
}
