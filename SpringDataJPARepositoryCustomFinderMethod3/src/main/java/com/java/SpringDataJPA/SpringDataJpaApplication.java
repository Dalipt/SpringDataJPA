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
		//1.Fetching by my custom fetchbyCost method
			//service.fetchByCost(5645.5).forEach(v->System.out.println(v));
		
		//2.Fetching by my custom fetchbyCostLessThanEqual method
		   //service.fetchByCostLessThanEqual(5645.5).forEach(v->System.out.println(v));;
		
		//3.Fetching by my custom fetchbyCostBetween method
		 //service.fetchByCostBetween(5445.5,8000.5) .forEach(v->System.out.println(v));
		
		  
		//4.Fetching by VaccineCompanyName method 
		/*
		 * service.fetchByvaccineCompanyEquals("Moderna")
		 * .forEach(v->System.out.println(v));
		 */
		//5.Fetching by fetchByvaccineNameInAndCostBetween method 
		Collection<String> vaccineNames=new HashSet<>();
		vaccineNames.add("Phizer");
		vaccineNames.add("Polio");
		//vaccineNames.add("Covax");
		service.fetchByvaccineNameInAndCostBetween(vaccineNames, 4545.5, 8888.9);
	}
}