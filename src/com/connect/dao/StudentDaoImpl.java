package com.connect.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.model.Student;
import com.connect.util.HibernateUtil;

public class StudentDaoImpl implements iStudentDao {
	
	Session session = HibernateUtil.getSession();

	@Override
	public String save(Student student) {
		Transaction transaction = session.beginTransaction();
		session.save(student);
		boolean flag = true;
		String status = null;
		
		if(flag) {
			transaction.commit();
			status = "success";
        } else {
            transaction.rollback();
            status = "failure";
		}
		
		return status;
	}

	@Override
	public Student findById(Integer sid) {
		Student student = session.get(Student.class, sid);
		return student;
	}

	@Override
	public String updateById(Student student) {
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(student);
		boolean flag = true;
		String status = null;
		
		if(flag) {
			transaction.commit();
			status = "success";
        } else {
            transaction.rollback();
            status = "failure";
		}
		return status;
	}

	@Override
	public String deleteById(Integer sid) {
		Transaction transaction = session.beginTransaction();
		Student student = findById(sid);
        
		if(student != null) {
			session.delete(student);
			boolean flag = true;
			String status = null;
			
			if(flag) {
                transaction.commit();
                status = "success";
            } else {
                transaction.rollback();
                status = "failure";
            
			}
			return status;
			
		} else {
			return "notfound";
		}
		
		//
	}

}
