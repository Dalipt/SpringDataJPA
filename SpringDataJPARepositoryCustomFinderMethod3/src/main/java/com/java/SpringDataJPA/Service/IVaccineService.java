package com.java.SpringDataJPA.Service;

import java.util.Collection;
import java.util.List;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Repostary.IVaccine;

public interface IVaccineService 
{
	public List<Vaccine> fetchByCost(Double cost);
	public List<Vaccine> fetchByCostLessThanEqual(Double cost);
	
	public List<Vaccine> fetchByCostBetween(Double startCost, Double endingCost);
	
	public List<Vaccine> fetchByvaccineCompanyEquals(String name);
	
	public List<Vaccine> fetchByvaccineNameInAndCostBetween(Collection <String> names,Double minCost, Double maxCost);


}
