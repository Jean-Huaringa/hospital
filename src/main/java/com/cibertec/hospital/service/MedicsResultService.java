package com.cibertec.hospital.service;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;

import com.cibertec.hospital.dto.MedicalResultDTO;

public interface MedicsResultService {
	Page<MedicalResultDTO> findMedicalResults(
            Long userId,
            Long specialtyId,
            Long hospitalId,
            Pageable pageable);
}
