package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.model.PaymentMethod;

public interface PaymentMethodService {
	List<PaymentMethod> findAllEnabled();
}
