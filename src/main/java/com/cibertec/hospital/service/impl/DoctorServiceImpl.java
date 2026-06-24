package com.cibertec.hospital.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.hospital.config.enums.ErrorCode;
import com.cibertec.hospital.config.exception.ApiException;
import com.cibertec.hospital.dto.DoctorDTO;
import com.cibertec.hospital.repository.DoctorRepository;
import com.cibertec.hospital.service.DoctorService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

	private final DoctorRepository doctorRepository;
	
	@Override
    public List<DoctorDTO> findDoctors(
            Long hospitalId,
            Long medicalSpecialtyId) {

        if (hospitalId == null) {
            throw new ApiException(
                    "El hospital es obligatorio.", ErrorCode.NOT_FOUND);
        }

        if (medicalSpecialtyId == null) {
            throw new ApiException(
                    "La especialidad médica es obligatoria.", ErrorCode.NOT_FOUND);
        }

        List<DoctorDTO> doctors =
                doctorRepository.findDoctorsByHospitalAndSpecialty(
                        hospitalId,
                        medicalSpecialtyId);

        if (doctors.isEmpty()) {
            throw new ApiException(
                    "No se encontraron doctores para los filtros indicados.", ErrorCode.NOT_FOUND);
        }

        return doctors;
    }
}