package com.java.SpringDataJPA.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Repostary.IVaccine;

public interface IVaccineService 
{
	public List<Vaccine> fetchByVaccineCompany(String companyName);
	public List<Vaccine> fetchByVaccineCompany(String comp1,String comp2);
	
	public List<String> fetchByVaccineByCost(Double startingRange, Double maxRange);
	
	public int updateThePriceByVaccineName(Double newPrice,String vaccineName);
	
	public int deleteTheVaccinesByvaccineNames(String vaccineName);
	
	public int insertVaccinesDetails(Integer id,String vaccineName, String vaccineCompany, Double cost);




}
