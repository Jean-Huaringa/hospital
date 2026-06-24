package com.cibertec.hospital.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.hospital.config.common.ApiResponse;
import com.cibertec.hospital.model.Hospital;
import com.cibertec.hospital.service.HospitalService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/api/hospitals")
@RequiredArgsConstructor

public class HospitalController {

    private final HospitalService hospitalService;

    @GetMapping("/specialty/{specialtyId}")
    public ResponseEntity<ApiResponse<List<Hospital>>> findBySpecialty(
            @PathVariable Long specialtyId) {

        return ResponseEntity.ok(
                ApiResponse.success(
                        hospitalService.findByMedicalSpecialty(specialtyId)
                )
        );
    }
}