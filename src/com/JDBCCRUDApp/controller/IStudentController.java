package com.JDBCCRUDApp.controller;

import com.JDBCCRUBAPP.dto.Student;

public interface IStudentController {
	public String addStudent();
	public Student searchStudent();
	public String deleteStudent();
	public String updateStudent();
}
