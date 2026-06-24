package com.cibertec.hospital.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.hospital.config.enums.ErrorCode;
import com.cibertec.hospital.config.exception.ApiException;
import com.cibertec.hospital.model.DoctorShift;
import com.cibertec.hospital.repository.DoctorShiftRepository;
import com.cibertec.hospital.service.DoctorShiftService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DoctorShiftServiceImpl implements DoctorShiftService {

	private final DoctorShiftRepository doctorShiftRepository;

	@Override
	public List<DoctorShift> findAvailableShifts(Long hospitalId, Long doctorId, Long specialtyId) {
		if (hospitalId == null) {
			throw new ApiException("El hospital es obligatorio.", ErrorCode.NOT_FOUND);
		}

		if (doctorId == null) {
			throw new ApiException("El doctor es obligatorio.", ErrorCode.NOT_FOUND);
		}
		if (specialtyId == null) {
			throw new ApiException("La especialidad medica es obligatoria.", ErrorCode.NOT_FOUND);
		}

		List<DoctorShift> doctorShift = doctorShiftRepository.findAvailableShifts(hospitalId, doctorId, specialtyId);

		if (doctorShift.isEmpty()) {
			throw new ApiException("No se encontraron horarios para los filtros indicados.", ErrorCode.NOT_FOUND);
		}

		return doctorShift;
	}
}