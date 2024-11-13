package com.java.SpringDataJPA.Repostary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.view.View;
/* Custom finder method explain in this example
 * 
 * Rule:- 1.Findby(Properties name)//available in entity class--Keyword
 *
 * 
 */
public interface IVaccine extends JpaRepository<Vaccine, Integer>
{
	//We simply giving basic information
	public <T extends View> List <T> findByCostLessThan(Double cost,Class<T>cls);
}
