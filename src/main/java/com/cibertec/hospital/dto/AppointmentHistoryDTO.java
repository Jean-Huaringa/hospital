package com.cibertec.hospital.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface AppointmentHistoryDTO {
	
	Long getAppointmentId();

    BigDecimal getConsultationCost();

    String getStatus();

    Long getHospitalId();

    String getHospitalName();

    Long getSpecialtyId();

    String getSpecialtyName();

    Long getDoctorShiftId();

    LocalDateTime getAssignedAt();

    Long getDoctorId();

    Long getDoctorUserId();

    String getDoctorName();

    Long getPatientUserId();

    String getPatientName();
}
