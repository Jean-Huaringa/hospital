package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.UserVerificationCode;

@Repository
public interface UserVerificationCodeRepository extends JpaRepository<UserVerificationCode, Long> {

}