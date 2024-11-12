package com.java.SpringDataJPA.Service;

import java.util.List;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Repostary.IVaccine;

public interface IVaccineService 
{
	public Vaccine searchVaccineById(Integer id);
	
	public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac); 
	
	public String removeVaccineInfoByIds(Iterable <Integer> Ids);
}
