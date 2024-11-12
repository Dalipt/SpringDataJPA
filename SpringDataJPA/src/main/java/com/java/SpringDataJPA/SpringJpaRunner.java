package com.java.SpringDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.java.SpringDataJPA.Entity.Student;
import com.java.SpringDataJPA.Repostary.IStudentRepostary;
@Component
public class SpringJpaRunner implements CommandLineRunner 
{
	@Autowired
	private IStudentRepostary repo;
	public void run(String... args) throws Exception
	{
		repo.save(new Student(1,"Names","Delhi"));
		repo.save(new Student(2,"Ramesh","London"));
		repo.save(new Student(3,"Kalu","Delhi"));
	}

}
