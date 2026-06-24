package com.cibertec.hospital.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.hospital.config.enums.ErrorCode;
import com.cibertec.hospital.config.exception.ApiException;
import com.cibertec.hospital.model.Hospital;
import com.cibertec.hospital.repository.HospitalRepository;
import com.cibertec.hospital.service.HospitalService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HospitalServiceImpl implements HospitalService {
	
	private final HospitalRepository hospitalRepository;
	

	@Override
    public List<Hospital> findByMedicalSpecialty(Long specialtyId) {

        if (specialtyId == null) {
            throw new ApiException(
                    "La especialidad médica es obligatoria.", ErrorCode.NOT_FOUND);
        }

        List<Hospital> hospitals =
                hospitalRepository.findByMedicalSpecialty(specialtyId);

        if (hospitals.isEmpty()) {
            throw new ApiException(
                    "No existen hospitales asociados a la especialidad.", ErrorCode.NOT_FOUND);
        }

        return hospitals;
    }
}