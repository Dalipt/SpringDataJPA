package com.java.SpringDataJPA.Repostary;

import org.springframework.data.repository.CrudRepository;

import com.java.SpringDataJPA.Entity.Vaccine;

public interface IVaccine extends CrudRepository<Vaccine, Integer> 
{

}
