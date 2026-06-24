package com.cibertec.hospital.config.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {

	private Boolean status;
	private String message;	
	private T data;
	

	public static <T> ApiResponse<T> success() {
		return new ApiResponse<>(true, "Operación exitosa", null);
	}

	public static <T> ApiResponse<T> success(T data) {
		return new ApiResponse<>(true,"Operation completed successfully", data);}

	public static <T> ApiResponse<T> error(String message) {
		return new ApiResponse<>(false, message, null); }

}
