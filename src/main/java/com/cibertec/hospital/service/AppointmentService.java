package com.cibertec.hospital.service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.cibertec.hospital.dto.AppointmentHistoryDTO;

public interface AppointmentService {
	Page<AppointmentHistoryDTO> findAppointmentHistory(
            Long userId,
            Long specialtyId,
            Long hospitalId,
            String status,
            Pageable pageable);
}
