package com.java.SpringDataJPA;

import java.util.*;
import java.util.Collection;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Service.VaccineService;

/* JPA repository extending list PagingSorting and CurdReposatory return type is list
 * In below example we fetching all the record we use custom finding method
 * Static and Dynamic projection
 * If we have number of columns create number of interface
 */
@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaApplication.class, args);
		VaccineService service = container.getBean(VaccineService.class);
		
		//1.Fetching by company name single company
			//service.fetchByVaccineCompany("Moderna").forEach(v->System.out.println(v));
		
		//2.Fetching by multiple company name
			//service.fetchByVaccineCompany("Moderna","WHO").forEach(v->System.out.println(v));
		
		//3.Fetching by min and max range with using Between Operation
		
		 	// service.fetchByVaccineByCost(5454.5, 5645.5)
		 	//.forEach(v->System.out.println(v)); ;
		
		//4.updating vaccine price record with vaccineName
		/*
		 * int rowsaffected = service.updateThePriceByVaccineName(8545.5, "Polio");
		 * if(rowsaffected!=0) { System.out.println("Update Success"); } else {
		 * System.out.println("Update Failed"); }
		 */
		
		//5.deletion vaccine record with vaccineName
		/*
		 * int rowsaffected = service.deleteTheVaccinesByvaccineNames("Polio");
		 * 
		 * if(rowsaffected!=0) { System.out.println("Delete Success"); } else {
		 * System.out.println("Delete Failed"); }
		 */
		
		//5.Inserting  newvaccine record in table
		int rowsaffected =service.insertVaccinesDetails(4,"Polio", "WHO", 6545.6);
		if(rowsaffected!=0)
		{ 
			System.out.println("Record Added Success");
			} 
		else
			{
			System.out.println("Insert Failed"); 
			}
		
	}
}