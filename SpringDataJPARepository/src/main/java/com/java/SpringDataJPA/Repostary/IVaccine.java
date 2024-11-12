package com.java.SpringDataJPA.Repostary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.SpringDataJPA.Entity.Vaccine;

public interface IVaccine extends JpaRepository<Vaccine, Integer>
{
	
}
