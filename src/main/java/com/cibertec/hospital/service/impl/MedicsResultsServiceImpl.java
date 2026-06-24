package com.cibertec.hospital.service.impl;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cibertec.hospital.config.enums.ErrorCode;
import com.cibertec.hospital.config.exception.ApiException;
import com.cibertec.hospital.dto.MedicalResultDTO;
import com.cibertec.hospital.repository.MedicsResultsRepository;
import com.cibertec.hospital.service.MedicsResultService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MedicsResultsServiceImpl implements MedicsResultService{

	private final MedicsResultsRepository medicsResultsRepository;
	
	@Override
	public Page<MedicalResultDTO> findMedicalResults(
            Long userId,
            Long specialtyId,
            Long hospitalId,
            Pageable pageable) {

        if (userId == null) {
            throw new ApiException(
                    "El id del usuario es obligatorio",
                    ErrorCode.NOT_FOUND
            );
        }

        Page<MedicalResultDTO> result =
                medicsResultsRepository.findMedicalResults(
                        userId,
                        specialtyId,
                        hospitalId,
                        pageable
                );

        if (result.isEmpty()) {
            throw new ApiException(
                    "No se encontraron resultados médicos",
                    ErrorCode.NOT_FOUND
            );
        }

        return result;
    }
}
