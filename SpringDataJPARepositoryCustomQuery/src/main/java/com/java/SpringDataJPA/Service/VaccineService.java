package com.java.SpringDataJPA.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Repostary.IVaccine;

@Service
public class VaccineService implements IVaccineService 
{
	private IVaccine repo;
	@Autowired
	public void setRepo(IVaccine repo)
	{
		this.repo=repo;
	}
	@Override
	public List<Vaccine> fetchByVaccineCompany(String companyName)
	{
		return repo.searchByVaccineCompany(companyName);
	}
	@Override
	public List<Vaccine> fetchByVaccineCompany(String comp1, String comp2)
	{
		return repo.searchByVaccineCompany(comp1, comp2);
	}
	@Override
	public List<String> fetchByVaccineByCost(Double startingRange, Double maxRange)
	{
		return repo.searchByVaccineByCost(startingRange, maxRange);
	}
	@Override
	public int updateThePriceByVaccineName(Double newPrice, String vaccineName) 
	{
		return repo.updatePriceByVaccineName(newPrice, vaccineName);
	}
	@Override
	public int deleteTheVaccinesByvaccineNames(String vaccineName) 
	{
		return repo.deleteVaccinesByvaccineNames(vaccineName);
	}
	@Override
	public int insertVaccinesDetails(Integer id,String vaccineName, String vaccineCompany, Double cost) 
	{
		return repo.insertVaccinesInfo(id,vaccineName, vaccineCompany, cost);
	}
	
	
	
	
	

}
