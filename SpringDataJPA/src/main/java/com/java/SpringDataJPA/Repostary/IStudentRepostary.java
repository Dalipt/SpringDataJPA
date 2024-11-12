package com.java.SpringDataJPA.Repostary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.SpringDataJPA.Entity.Student;

@Repository
public interface IStudentRepostary extends CrudRepository<Student, Integer>
{

}
