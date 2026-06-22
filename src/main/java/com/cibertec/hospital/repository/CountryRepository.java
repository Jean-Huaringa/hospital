package com.cibertec.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.hospital.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}