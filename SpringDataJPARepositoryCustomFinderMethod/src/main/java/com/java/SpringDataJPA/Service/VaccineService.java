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
import com.java.SpringDataJPA.view.ResultView;
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
	public List<ResultView> fetchByCost(Double cost) 
	{
		return repo.findByCostLessThan(cost);
	}
	

}
