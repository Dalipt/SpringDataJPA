package com.java.SpringDataJPA.Repostary;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.java.SpringDataJPA.Entity.Vaccine;


/* Custom requirement implementation is also provided by springdataJPA
 * 
 *
 * 
 */
public interface IVaccine extends JpaRepository<Vaccine, Integer>
{
	//If both is matching then we need not to speicify param
		//@Query("FROM Vaccine WHERE vaccineCompany=:company")
		//public List<Vaccine> searchByVaccineCompany(String company);
	
		//If both is matching then we need not to specify param
	@Query("FROM Vaccine WHERE vaccineCompany=:company")
	public List<Vaccine> searchByVaccineCompany(@Param("company")String companyName);
	
	@Query("FROM Vaccine WHERE vaccineCompany IN (:comp1, :comp2)")
	public List<Vaccine> searchByVaccineCompany(@Param("comp1") String comp1, @Param("comp2") String comp2);

	@Query("SELECT vaccineName,vaccineCompany FROM Vaccine WHERE cost BETWEEN:startingRange AND :maxRange")
	public List<String> searchByVaccineByCost(Double startingRange, Double maxRange);
	
	//Example of Update operation
		//Whenever we do non select operation its must be transactional
		//With Transactional annotation either all happens or non
		//So if Transactional is their we must specify modifying annotation also
	@Transactional
	@Modifying
	@Query("UPDATE Vaccine SET cost=:newPrice WHERE vaccineName=:vaccineName")
	public int updatePriceByVaccineName(Double newPrice,String vaccineName);
	
	//Example of Delete operation
		//Whenever we do non select operation its must be transactional
		//With Transactional annotation either all happens or non
		//So if Transactional is their we must specify modifying annotation also
	@Transactional
	@Modifying
	@Query("DELETE FROM Vaccine WHERE vaccineName=:vaccineName")
	public int deleteVaccinesByvaccineNames(String vaccineName);
	
	//Example of Insert operation
		//With Transactional annotation either all happens or non
		//So if Transactional is their we must specify modifying annotation also
		@Transactional
		@Modifying
		@Query(value="INSERT INTO vaccine(id,vaccine_name,vaccine_company,cost) Values(?,?,?,?)", nativeQuery=true)
		public int insertVaccinesInfo(Integer id,String vaccineName, String vaccineCompany, Double cost);
	
}
