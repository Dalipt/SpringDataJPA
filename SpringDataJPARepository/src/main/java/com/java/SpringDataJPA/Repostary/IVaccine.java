package com.java.SpringDataJPA.Repostary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.View.ResultView;
/* Custom finder method explain in this example
 * 
 * Rule:- 1.Findby(Properties name)//available in entity class--Keyword
 *
 * 
 */
public interface IVaccine extends JpaRepository<Vaccine, Integer>
{
	//We simply its giving 
	List<ResultView>findByCostLessThan(Double cost);
}
