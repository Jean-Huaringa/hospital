package com.cibertec.hospital.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.hospital.config.common.ApiResponse;
import com.cibertec.hospital.dto.DoctorDTO;
import com.cibertec.hospital.service.DoctorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/doctors")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<DoctorDTO>>> findDoctors(
            @RequestParam Long hospitalId,
            @RequestParam Long specialtyId) {

        return ResponseEntity.ok(
                ApiResponse.success(
                        doctorService.findDoctors(
                                hospitalId,
                                specialtyId
                        )
                )
        );
    }
}