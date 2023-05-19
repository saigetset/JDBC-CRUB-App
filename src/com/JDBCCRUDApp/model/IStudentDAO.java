package com.JDBCCRUDApp.model;

import com.JDBCCRUBAPP.dto.Student;

public interface IStudentDAO {
	public String addStudent(String name,int age,String city);
	public Student searchStudent(int id);
	public String deleteStudent(int id);
	public String updateStudent(int id,String name);
}
