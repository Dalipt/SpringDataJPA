package com.java.SpringDataJPA.Repostary;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.SpringDataJPA.Entity.Vaccine;

/* Custom requirement implementation is also provided by springdataJPA
 * 
 *
 * 
 */
public interface IVaccine extends JpaRepository<Vaccine, Integer>
{
	//For giving implementation 
	//We used to use findBy--+propertyName(Entity)+keyword
	
	public List<Vaccine> findByCost(Double cost);
	public List<Vaccine> findByCostLessThanEqual(Double cost);
	public List<Vaccine> findByCostBetween(Double startCost, Double endingCost);
	
	public List<Vaccine> findByvaccineCompanyEquals(String name);
	
	public List<Vaccine> findByvaccineNameInAndCostBetween(Collection <String> names,Double minCost, Double maxCost);
}
