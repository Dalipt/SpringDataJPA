package com.java.SpringDataJPA.Service;

import com.java.SpringDataJPA.Entity.Vaccine;

public interface IVaccineService 
{
	public String registerVaccineInfo(Vaccine vaccine);
	public Iterable<Vaccine> registerMultiVaccineInfo(Iterable<Vaccine> vaccine);
	public long vaccineCount();
	public Boolean checkVaccineAvailability(Integer id);
	public Iterable<Vaccine> allAvailableVaccine();
	public Iterable<Vaccine> getallVaccine(Iterable<Integer>id);
	
	public String removeVaccineByID(Integer Id);
	
}
