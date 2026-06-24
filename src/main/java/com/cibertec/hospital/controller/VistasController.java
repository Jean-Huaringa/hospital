package com.cibertec.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistasController {
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

    @GetMapping("/appointment-list")
    public String appointmentList(Model model) {
        model.addAttribute("userName", "María");
        return "client/appointment-list";
    }

    @GetMapping("/admin/doctors")
    public String doctorList(Model model) {
        model.addAttribute("userName", "María");
        return "admin/doctor-list";
    }
    
    @GetMapping("/admin/doctors/create")
    public String doctorCreate(Model model) {

        model.addAttribute("userName", "María");

        return "admin/doctor-create";
    }
    
    @GetMapping("/admin/doctors/edit")
    public String doctorEdit(Model model) {
        model.addAttribute("userName", "María");
        return "admin/doctor-edit";
    }
    
    @GetMapping("/admin/specialties")
    public String specialtyList(Model model) {
    model.addAttribute("userName", "María");
    return "admin/specialty-list";
    }

    @GetMapping("/admin/specialties/create")
    public String specialtyCreate(Model model) {
    model.addAttribute("userName", "María");
    return "admin/specialty-create";
    }

    @GetMapping("/admin/specialties/edit")
    public String specialtyEdit(Model model) {
    model.addAttribute("userName", "María");
    return "admin/specialty-edit";
    }

}
