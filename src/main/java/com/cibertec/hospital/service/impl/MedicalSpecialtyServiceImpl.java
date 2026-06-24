package com.cibertec.hospital.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.hospital.config.enums.ErrorCode;
import com.cibertec.hospital.config.exception.ApiException;
import com.cibertec.hospital.model.MedicalSpecialty;
import com.cibertec.hospital.repository.MedicalSpecialtyRepository;
import com.cibertec.hospital.service.MedicalSpecialtyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MedicalSpecialtyServiceImpl implements MedicalSpecialtyService {
	
	private final MedicalSpecialtyRepository medicalSpecialtyRepository;

	@Override
    public List<MedicalSpecialty> findAllEnabled() {

        List<MedicalSpecialty> specialties =
                medicalSpecialtyRepository.findAllEnabled();

        if (specialties.isEmpty()) {
            throw new ApiException("No existen especialidades médicas disponibles.", ErrorCode.NOT_FOUND);
        }

        return specialties;
    }
    
}