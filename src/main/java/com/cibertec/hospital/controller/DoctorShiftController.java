package com.cibertec.hospital.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.hospital.config.common.ApiResponse;
import com.cibertec.hospital.model.DoctorShift;
import com.cibertec.hospital.service.DoctorShiftService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/doctor-shift")
public class DoctorShiftController {
	private final DoctorShiftService doctorShiftService;

	@GetMapping
	public ResponseEntity<ApiResponse<List<DoctorShift>>> findAvailableShifts(
			@RequestParam Long hospitalId, 
			@RequestParam Long doctorId,
			@RequestParam Long specialtyId) {

		return ResponseEntity
				.ok(ApiResponse.success(doctorShiftService.findAvailableShifts(hospitalId, doctorId, specialtyId)));
	}
}
