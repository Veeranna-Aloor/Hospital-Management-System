package com.spring.bioMedical.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.bioMedical.entity.Appointment;
import com.spring.bioMedical.entity.User;

/**
 * @author Veeranna Aloor
 */
@Repository("appointmentRepository")
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	
}