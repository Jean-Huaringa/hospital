package com.cibertec.hospital.dto;

import java.math.BigDecimal;

public interface MedicalResultDTO {

	Long getMedicalResultId();

	String getTitle();

	Long getAppointmentId();

	BigDecimal getConsultationCost();

	String getStatus();

	Long getHospitalId();

	String getHospitalName();

	Long getSpecialtyId();

	String getSpecialtyName();

	Long getDoctorShiftId();

	Long getDoctorId();

	Long getDoctorUserId();

	String getDoctorName();

	Long getPatientUserId();

	String getPatientName();

}
