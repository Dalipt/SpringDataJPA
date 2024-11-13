package com.java.SpringDataJPA.Services;

import java.util.List;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Repostary.IVaccine;
import com.java.SpringDataJPA.View.ResultView;

public interface IVaccineService 
{
	public List<ResultView> fetchByCost(Double cost);
}
