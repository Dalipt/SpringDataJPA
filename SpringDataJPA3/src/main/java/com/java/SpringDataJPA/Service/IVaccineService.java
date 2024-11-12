package com.java.SpringDataJPA.Service;

import java.util.List;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Repostary.IVaccine;

public interface IVaccineService 
{
	public Iterable <Vaccine> fetchDetailBySorting(boolean status,String... Properties);
	
	public List <Vaccine> fetchDetailByPaging(int pgNo,int pgSize, boolean status,String... Properties);
	
	public void fetchDetailByPaging(int pgSize);
}
