package com.JDBCCRUDApp.service;

import com.JDBCCRUBAPP.dto.Student;

public interface IStudentService {
	public String addStudent(String name,int age,String city);
	public Student searchStudent(int id);
	public String deleteStudent(int id);
	public String updateStudent(int id,String name);
}
