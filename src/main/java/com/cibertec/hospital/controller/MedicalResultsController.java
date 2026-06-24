package com.cibertec.hospital.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.hospital.config.common.ApiResponse;
import com.cibertec.hospital.dto.MedicalResultDTO;
import com.cibertec.hospital.service.MedicsResultService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/api/medical-results")
@RequiredArgsConstructor
public class MedicalResultsController {

	private final MedicsResultService medicsResultService;

	@GetMapping
	public ResponseEntity<ApiResponse<Page<MedicalResultDTO>>> findMedicalResults(
			@RequestParam Long userId,
			@RequestParam(required = false) Long specialtyId,
			@RequestParam(required = false) Long hospitalId,
			Pageable pageable) {

		return ResponseEntity.ok(
				ApiResponse.success(medicsResultService.findMedicalResults(userId, specialtyId, hospitalId, pageable)));
	}
}