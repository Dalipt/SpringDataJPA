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
	public List<Vaccine> fetchByCost(Double cost)
	{
		return repo.findByCost(cost);
	}
	@Override
	public List<Vaccine> fetchByCostLessThanEqual(Double cost) 
	{
		return repo.findByCostLessThanEqual(5645.5);
	}
	@Override
	public List<Vaccine> fetchByCostBetween(Double startCost, Double endingCost) 
	{
		return repo.findByCostBetween(startCost, endingCost);
	}
	@Override
	public List<Vaccine> fetchByvaccineCompanyEquals(String name)
	{
		return repo.findByvaccineCompanyEquals(name);
	}
	@Override
	public List<Vaccine> fetchByvaccineNameInAndCostBetween(Collection<String> names, Double minCost, Double maxCost) 
	{	
		return repo.findByvaccineNameInAndCostBetween(names, minCost, maxCost);
	}
	
	
	
	
	

}
