package com.JDBCCRUDApp.controller;

import java.util.Scanner;
import com.JDBCCRUBAPP.dto.Student;
import com.JDBCCRUDApp.ServiceFactory.ServiceFactory;
import com.JDBCCRUDApp.service.IStudentService;

public class StudentControllerImpl implements IStudentController {
	
	private IStudentService stdService;
	public static Scanner sc = new Scanner(System.in);
	@Override
	public String addStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter name of the Student: ");
		String name = sc.next();
		System.out.println("Enter age of the Student: ");
		int age = sc.nextInt();
		System.out.println("Enter city of the Student: ");
		String city = sc.next();
		
		stdService = ServiceFactory.getStudentService();
		return stdService.addStudent(name,age,city);
	}

	@Override
	public Student searchStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter the id of the Student to fetch the details: ");
		int id = sc.nextInt();
		
		stdService = ServiceFactory.getStudentService();
		return stdService.searchStudent(id);
	}

	@Override
	public String deleteStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter the id of the Student to delete: ");
		int id = sc.nextInt();
		
		stdService = ServiceFactory.getStudentService();
		return stdService.deleteStudent(id);
	}

	@Override
	public String updateStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter the id of the Student to update the details: ");
		int id = sc.nextInt();
		System.out.println("Enter the name of the Student to update");
		String name = sc.next();
		stdService = ServiceFactory.getStudentService();
		return stdService.updateStudent(id,name);
	}
}
