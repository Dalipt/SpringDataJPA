package com.java.SpringDataJPA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.java.SpringDataJPA.Entity.Vaccine;
import com.java.SpringDataJPA.Repostary.IVaccine;
@Service
public class VaccineService implements IVaccineService 
{
	private IVaccine repo;
	@Autowired
	public void setRepo(IVaccine repo)
	{
		this.repo=repo;
	}
	@Override
	public Vaccine searchVaccineById(Integer id) 
	{
		return repo.getReferenceById(id);
	}
	@Override
	//creating sort object
	//public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac, boolean status, String... params)
	//Sort sort = Sort.by(status?Direction.ASC:Direction.DESC,params);
	public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac)
	{
		Example<Vaccine> example = Example.of(vac);
		return repo.findAll(example);
		
	}
	@Override
	public String removeVaccineInfoByIds(Iterable<Integer> Ids)
	{
		List<Vaccine> rep = repo.findAllById(Ids);
		if(rep.size()!=0)
		{
			repo.deleteAllByIdInBatch(Ids);
			return "Record deleted for given Id";
		}
		return "Unable to delete record";
	}
		

}
