package com.cibertec.hospital.config.exception;

import com.cibertec.hospital.config.enums.ErrorCode;

import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private final ErrorCode errorCode;

    public ApiException(
            String message,
            ErrorCode errorCode
    ) {
        super(message);
        this.errorCode = errorCode;
    }
}