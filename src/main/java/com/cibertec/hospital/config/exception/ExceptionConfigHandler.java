package com.cibertec.hospital.config.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cibertec.hospital.config.common.ApiResponse;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Log4j2
public class ExceptionConfigHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ApiResponse<Object>> handlerRuntimeException(
    		RuntimeException ex
    ) {
    	log.error("Error: ", ex);
    	
        return ResponseEntity
                		.status(HttpStatus.NOT_FOUND)
                        .body(ApiResponse.error("Tenemos un problema"));
    }

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiResponse<Object>> handlerCommonException(
    		ApiException ex
    ) {
    	
    	log.error("Error: ", ex);
    	
        return ResponseEntity
                        .status(ex.getErrorCode().getHttpStatus())
                        .body(ApiResponse.error(ex.getMessage())
        );
    }
}
