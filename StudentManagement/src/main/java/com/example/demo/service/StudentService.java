package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;


public interface StudentService {

	    List<Student> getAllStudents();
	    Student saveStudent(Student student);
	    void deleteStudent(Long id);
	

}
