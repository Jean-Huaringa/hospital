package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.dto.DoctorDTO;

public interface DoctorService {

	List<DoctorDTO> findDoctors(
            Long hospitalId,
            Long medicalSpecialtyId);
}
