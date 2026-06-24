package com.cibertec.hospital.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.hospital.config.common.ApiResponse;
import com.cibertec.hospital.model.PaymentMethod;
import com.cibertec.hospital.service.PaymentMethodService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/payment-method")
public class PaymentMethodController {
	
	private final PaymentMethodService paymentMethodService;
	

    @GetMapping
    public ResponseEntity<ApiResponse<List<PaymentMethod>>> findAll() {

        return ResponseEntity.ok(
                ApiResponse.success(
                		paymentMethodService.findAllEnabled()
                )
        );
    }
}
