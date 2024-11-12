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
		//Vaccine vac = new Vaccine("Phizer","Moderna",5645.5);
		//Vaccine vac1 = new Vaccine("Polio","WHO",5645.5);
		//Vaccine vac2 = new Vaccine("Covax","BharatBio",5445.5);

		  List<Vaccine> vaccine = new ArrayList<Vaccine>(); 
		  vaccine.add(new Vaccine("Phizer","Moderna",5645.5)); 
		  vaccine.add(new Vaccine("Polio","WHO",5645.5));
		   vaccine.add(new Vaccine("Covax","BharatBio",5445.5));
		  service.registerMultiVaccineInfo(vaccine).forEach(v->System.out.println(v));
		 
		
		  	long count = service.vaccineCount();
			System.out.println("Total Vaccine available is "+count);
			int id=2;
			Boolean co = service.checkVaccineAvailability(id);
			if(co)
			{
				System.out.println("Available Vaccine is "+ co);
			}
			else
			{
			System.out.println("No vaccine available with specified id"+co);
			}
			}
		
			//service.allAvailableVaccine().forEach(v->System.out.println(v));
			/*
			List <Integer> ad= new ArrayList<>();
			ad.add(1);
			ad.add(3);
			service.getallVaccine(ad).forEach(v->System.out.println(v));
			*/
			//String stt=service.removeVaccineByID(2);
			//System.out.println(stt);
}
