package com.java.SpringDataJPA;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Service.VaccineService;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaApplication.class, args);
		VaccineService service = container.getBean(VaccineService.class);
		/*
		 * service.fetchDetailBySorting(true, "vaccineName","vaccineCompany")
		 * .forEach(v->System.out.println(v.getVaccineName()+" "+v.getVaccineCompany()))
		 * ;
		 */
		/*
		 * service.fetchDetailByPaging(1, 3, true,"VaccineName","VaccineCompany").
		 * forEach(v->System.out.println(v.getVaccineName()+" "+v.getVaccineCompany()));
		 */
		
		service.fetchDetailByPaging(3);
		
	}
}