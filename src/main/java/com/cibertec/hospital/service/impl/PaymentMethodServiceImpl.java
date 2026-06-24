package com.cibertec.hospital.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.hospital.config.enums.ErrorCode;
import com.cibertec.hospital.config.exception.ApiException;
import com.cibertec.hospital.model.PaymentMethod;
import com.cibertec.hospital.repository.PaymentMethodRepository;
import com.cibertec.hospital.service.PaymentMethodService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentMethodServiceImpl implements PaymentMethodService {

	private final PaymentMethodRepository paymentMethodRepository;

	@Override
    public List<PaymentMethod> findAllEnabled() {

        List<PaymentMethod> specialties = paymentMethodRepository.findAllEnabled();

        if (specialties.isEmpty()) {
            throw new ApiException("No existen metodos de pago disponibles.", ErrorCode.NOT_FOUND);
        }

        return specialties;
    }
}