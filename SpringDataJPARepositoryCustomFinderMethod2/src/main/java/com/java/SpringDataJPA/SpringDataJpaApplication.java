package com.java.SpringDataJPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Service.VaccineService;
import com.java.SpringDataJPA.view.ResultView1;
import com.java.SpringDataJPA.view.ResultView2;
import com.java.SpringDataJPA.view.ResultView3;
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
		
		/* Fetching detail with respect to views 
		 * service.fetchByCostLessThan(5645.5, ResultView1.class)
		 * .forEach(v->System.out.println(v.getVaccineCompany()+" "+v.getVaccineName()))
		 * ;
		 */
		//We must pass exact values as per method 
		//Based of view interfaces result we get by passing interface with .class
		
		//We dynamically decide result
		//
		service.fetchByCostLessThan(8000.0, ResultView2.class)
		.forEach(v->System.out.println(v.getCost()+" "+v.getVaccineName()+v.getVaccineCompany()));
		
		
	 
	}
}