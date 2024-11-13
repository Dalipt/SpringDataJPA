package com.java.SpringDataJPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Service.VaccineService;
/* JPA repository extending list PagingSorting and CurdReposatory return type is list
 * In below example we fetching all the record we use custom finding method
 * Static and Dynamic projection
 */
@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaApplication.class, args);
		VaccineService service = container.getBean(VaccineService.class);
		
		service.fetchByCost(8000.5).forEach(v->System.out.println(v.getVaccineCompany()+" "+v.getVaccineName()));
		 
	}
}