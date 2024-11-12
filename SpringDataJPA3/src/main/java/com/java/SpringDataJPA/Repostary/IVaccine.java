package com.java.SpringDataJPA.Repostary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.java.SpringDataJPA.Entity.Vaccine;

public interface IVaccine extends PagingAndSortingRepository<Vaccine, Integer>
{
	
}
