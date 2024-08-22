package com.connect.factory;

import com.connect.controller.StudentControllerImpl;
import com.connect.controller.iStudentController;

public class StudentControllerFactory {
	
	private static iStudentController studentController = null;
	
	
	private StudentControllerFactory() {
        
    }
	
	public static iStudentController getStudentController() {
		// if studentController is null, create a new instance of StudentControllerImpl
		if (studentController == null) {
			studentController = new StudentControllerImpl();
		}
		//if studentController is not null, return the existing instance of StudentController
		return studentController; 
	}
	
		
}
