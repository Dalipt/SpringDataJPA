package com.java.SpringDataJPA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Iterable<Vaccine> fetchDetailBySorting(boolean status, String... Properties)
	{
		Sort sort = Sort.by(status?Direction.DESC:Direction.ASC, Properties);
		return repo.findAll(sort);
	}


	@Override
	public List<Vaccine> fetchDetailByPaging(int pgNo, int pgSize, boolean status, String... Properties) {
		Sort sort= Sort.by(status? Direction.DESC:Direction.ASC, Properties);
		PageRequest pageable = PageRequest.of(pgNo, pgSize,sort);
		Page <Vaccine> page= repo.findAll(pageable); 
		return page.getContent();
	}


	@Override
	public void fetchDetailByPaging(int pgSize) 
	{
		long count=7;
		
		long pageCount=count/pgSize;
		
		pageCount=count%pgSize==0?pageCount:++pageCount;
		
		for(int i=0;i<pageCount;i++)
		{
			PageRequest pageable = PageRequest.of(i, pgSize);
			Page<Vaccine> page = repo.findAll(pageable);
			page.getContent().forEach(v->System.out.println(v.getVaccineCompany()+"   "+v.getVaccineName()));
			System.out.println("--------");
		}
		
	}

}
