package com.cibertec.hospital.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.hospital.config.common.ApiResponse;
import com.cibertec.hospital.dto.AppointmentHistoryDTO;
import com.cibertec.hospital.service.AppointmentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;
	
	@GetMapping("/history")
	public String history(Model model) {
		model.addAttribute("userName", "María");
		return "history";
	}

	@GetMapping("/exam-history")
	public String examHistory(Model model) {
		model.addAttribute("userName", "María");
		return "exam-history";
	}
	@GetMapping("/list") 
	public String appointmentList(Model model) { 
		model.addAttribute("userName", "María"); 
		return "appointment-list"; 
		}
	
	 @GetMapping
	    public ResponseEntity<ApiResponse<Page<AppointmentHistoryDTO>>> findAppointments(
	            @RequestParam Long userId,
	            @RequestParam(required = false) Long specialtyId,
	            @RequestParam(required = false) Long hospitalId,
	            @RequestParam(required = false) String status,
	            Pageable pageable) {

	        return ResponseEntity.ok(
	                ApiResponse.success(
	                        appointmentService.findAppointmentHistory(
	                                userId,
	                                specialtyId,
	                                hospitalId,
	                                status,
	                                pageable
	                        )
	                )
	        );
	    }
}
