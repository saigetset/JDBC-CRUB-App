package com.sai.TestApp;

import java.util.Scanner;

import com.JDBCCRUDApp.ControllerFactory.ControllerFactory;
import com.JDBCCRUDApp.controller.IStudentController;

public class TestApp {
	private static IStudentController stdController;
	public static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		while (true) {

			System.out.println("1.Insert 2.Search 3.Delete 4.Update \n Enter your Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				stdController = ControllerFactory.getStudentController();
				System.out.println(stdController.addStudent());
				break;
			case 2:
				stdController = ControllerFactory.getStudentController();
				System.out.println(stdController.searchStudent());
				break;
			case 3:
				stdController = ControllerFactory.getStudentController();
				System.out.println(stdController.deleteStudent());
				break;
			case 4:
				stdController = ControllerFactory.getStudentController();
				System.out.println(stdController.updateStudent());
				break;
			default:
				System.out.println("Invalid Input");
			}
			
			System.out.println("Do you want to Continue ?(yes/no): ");
			String cont = sc.next();
			if(cont.equalsIgnoreCase("yes"))
				continue;
			else
				break;
		}
	}

}
