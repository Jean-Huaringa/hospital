package com.cibertec.hospital.config.enums;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public enum ErrorCode {

    NOT_FOUND(HttpStatus.NOT_FOUND),

    ALREADY_ASSIGNED(HttpStatus.CONFLICT),

    LIMIT_EXCEEDED(HttpStatus.TOO_MANY_REQUESTS),

    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR);

    private final HttpStatus httpStatus;

    ErrorCode(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
