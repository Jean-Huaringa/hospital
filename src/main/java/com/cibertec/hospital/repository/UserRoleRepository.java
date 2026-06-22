package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}