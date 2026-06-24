package com.cibertec.hospital.service.impl;


import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cibertec.hospital.config.enums.ErrorCode;
import com.cibertec.hospital.config.exception.ApiException;
import com.cibertec.hospital.dto.AppointmentHistoryDTO;
import com.cibertec.hospital.repository.AppointmentRepository;
import com.cibertec.hospital.service.AppointmentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

	private final AppointmentRepository appointmentRepository;

	@Override
	public Page<AppointmentHistoryDTO> findAppointmentHistory(Long userId, Long specialtyId, Long hospitalId,
			String status, Pageable pageable) {

		if (userId == null) {
			throw new ApiException("El id del usuario es obligatorio", ErrorCode.NOT_FOUND);
		}

		Page<AppointmentHistoryDTO> appointments = appointmentRepository.findAppointmentHistory(userId, specialtyId,
				hospitalId, status, pageable);

		if (appointments.isEmpty()) {
			throw new ApiException("No se encontraron citas", ErrorCode.NOT_FOUND);
		}

		return appointments;
	}
}