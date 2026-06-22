package com.cibertec.hospital.config.exception;

import com.cibertec.hospital.config.enums.ErrorCode;

import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {

    private final ErrorCode errorCode;

    protected ApiException(
            String message,
            ErrorCode errorCode
    ) {
        super(message);
        this.errorCode = errorCode;
    }
}