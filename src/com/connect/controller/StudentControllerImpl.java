package com.connect.controller;

import com.connect.factory.StudentServiceFactory;
import com.connect.model.Student;
import com.connect.service.iStudentService;

public class StudentControllerImpl implements iStudentController {
	
	iStudentService stdService;

	@Override
	public String save(Student student) {
		stdService = StudentServiceFactory.getStudentService();
		return stdService.save(student);
		
	}

	@Override
	public Student findById(Integer sid) {
		stdService = StudentServiceFactory.getStudentService();
		return stdService.findById(sid);
	}

	@Override
	public String updateById(Student student) {
		stdService = StudentServiceFactory.getStudentService();
		return stdService.updateById(student);
	}

	@Override
	public String deleteById(Integer sid) {
		stdService = StudentServiceFactory.getStudentService();
		return stdService.deleteById(sid);
	}

}
