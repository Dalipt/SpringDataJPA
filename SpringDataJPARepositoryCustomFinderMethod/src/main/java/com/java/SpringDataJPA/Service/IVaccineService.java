package com.java.SpringDataJPA.Service;

import java.util.List;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Repostary.IVaccine;
import com.java.SpringDataJPA.view.ResultView;

public interface IVaccineService 
{
	public List<ResultView> fetchByCost(Double cost);
}
