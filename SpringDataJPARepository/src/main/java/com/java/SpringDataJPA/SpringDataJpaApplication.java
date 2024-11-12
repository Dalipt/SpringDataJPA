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
				
//		Vaccine vac = service.searchVaccineById(52);
//		System.out.println(vac);
		
		//Vaccine vc= new Vaccine("Phizer", "Moderna", 5645.5);
		//vc.setId(52);
		//service.searchVaccineByGivenInfo(vc).forEach(v->System.out.println(v));
		
		
		  List<Integer> list= new ArrayList<>(); 
		  list.add(1);
		  list.add(3);
		  list.add(53);
		  String serv = service.removeVaccineInfoByIds(list);
		  System.out.println(serv);
		 
	}
}