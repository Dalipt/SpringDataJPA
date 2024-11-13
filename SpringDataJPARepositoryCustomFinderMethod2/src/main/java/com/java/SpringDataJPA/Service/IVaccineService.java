package com.java.SpringDataJPA.Service;

import java.util.List;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Repostary.IVaccine;
import com.java.SpringDataJPA.view.View;

public interface IVaccineService 
{
	public <T extends View>List<T>fetchByCostLessThan(Double cost,Class<T> cls);

}
