package com.cibertec.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/appointment")
public class AppointmentController {
	@GetMapping("/history")
	public String history(Model model) {
	    model.addAttribute("userName", "María");
	    return "client/history";
	}

	@GetMapping("/exam-history")
	public String examHistory(Model model) {
	    model.addAttribute("userName", "María");
	    return "client/exam-history";
	}

	@GetMapping("/list")
	public String appointmentList(Model model) {
	    model.addAttribute("userName", "María");
	    return "client/appointment-list";
	}
}
