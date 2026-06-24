package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.model.DoctorShift;

public interface DoctorShiftService {

	List<DoctorShift> findAvailableShifts(
            Long hospitalId,
            Long doctorId,
            Long specialtyId);
}
