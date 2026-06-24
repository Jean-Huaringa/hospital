package com.cibertec.hospital.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.hospital.config.common.ApiResponse;
import com.cibertec.hospital.model.MedicalSpecialty;
import com.cibertec.hospital.service.MedicalSpecialtyService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/medical-specialty")
public class MedicalSpecialtyController {

    private final MedicalSpecialtyService medicalSpecialtyService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<MedicalSpecialty>>> findAll() {

        return ResponseEntity.ok(
                ApiResponse.success(
                        medicalSpecialtyService.findAllEnabled()
                )
        );
    }
}
