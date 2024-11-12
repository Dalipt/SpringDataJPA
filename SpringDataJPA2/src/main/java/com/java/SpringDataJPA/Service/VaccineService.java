package com.java.SpringDataJPA.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Repostary.IVaccine;
@Service
public class VaccineService implements IVaccineService 
{
	
	private IVaccine repo;
	@Autowired
	public void SetRepo(IVaccine repo)
	{
		this.repo=repo;
	}
	
	public String registerVaccineInfo(Vaccine vaccine) 
	{
		 Vaccine vac=repo.save(vaccine);
		 return "Vaccine Inforegister with VaccineId"+vac.getId();
	}

	public Iterable<Vaccine> registerMultiVaccineInfo(Iterable<Vaccine> vaccine)
	{
		
		return repo.saveAll(vaccine);
	}

	@Override
	public long vaccineCount() {
		return repo.count();
	}

	@Override
	public Boolean checkVaccineAvailability(Integer id) {
		return repo.existsById(id);
	}

	@Override
	public Iterable<Vaccine> allAvailableVaccine() {
		return repo.findAll();
	}

	@Override
	public Iterable<Vaccine> getallVaccine(Iterable<Integer> id) 
	{
		return repo.findAllById(id);	
	}

	@Override
	public String removeVaccineByID(Integer id)
	{
		Optional <Vaccine> opt=repo.findById(id);
		if(opt.isPresent())
		{
			repo.deleteById(id);
			return "Vaccine with Id "+id+ "deleted Successfully"; 
		}
		return "Vaccine with Id "+id+ "not available for deletion"; 
		
	}


}
