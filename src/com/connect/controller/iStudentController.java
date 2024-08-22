package com.connect.controller;

import com.connect.model.Student;

public interface iStudentController {
	
	//Creating a record
	//Reading a record
	//Updating a record
	//Deleting a record
	
	String save(Student student);
	
	Student findById(Integer sid);
	
	String updateById(Student student);
	
	String deleteById(Integer sid);
}
