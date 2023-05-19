package com.JDBCCRUDApp.service;

import com.JDBCCRUBAPP.dto.Student;
import com.JDBCCRUDApp.DAOFactory.DAOFactory;
import com.JDBCCRUDApp.model.IStudentDAO;

public class StudentServiceImpl implements IStudentService {
	public IStudentDAO stdDAO;
	
	@Override
	public String addStudent(String name,int age,String city) {
		stdDAO = DAOFactory.getStudentDAO();
		return stdDAO.addStudent(name,age,city);
	}
	
	@Override
	public Student searchStudent(int id) {
		stdDAO = DAOFactory.getStudentDAO();
		return stdDAO.searchStudent(id);
	}
	
	@Override
	public String deleteStudent(int id) {
		stdDAO = DAOFactory.getStudentDAO();
		return stdDAO.deleteStudent(id);
	}
	
	@Override
	public String updateStudent(int id,String name) {
		stdDAO = DAOFactory.getStudentDAO();
		return stdDAO.updateStudent(id,name);
	}

}
