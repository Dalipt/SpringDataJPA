package com.java.SpringDataJPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Services.VaccineService;

/* JPA repository extending list PagingSorting and CurdReposatory return type is list
 * In below example we fetching all the record we use custom finding method
 * Static and Dynamic projection
 */
@SpringBootApplication
/*Static/Dynamic projection:- Whenever we perform searching operations and want to retriew specifice record 
 * as we have number of table columns
 */

public class SpringDataJpaApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpaApplication.class, args);
		VaccineService service = container.getBean(VaccineService.class);	
		
		service.fetchByCost(5645.5).forEach(v-> System.out.println(v.getVaccineCompany()+" "+v.getVaccineName()));
		 
	}
}