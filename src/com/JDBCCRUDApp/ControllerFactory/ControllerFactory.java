package com.JDBCCRUDApp.ControllerFactory;

import com.JDBCCRUDApp.controller.IStudentController;
import com.JDBCCRUDApp.controller.StudentControllerImpl;

public class ControllerFactory {
	private ControllerFactory(){}
	
	private static IStudentController stdController = null;
	public static IStudentController getStudentController() {
		if(stdController == null)
			stdController = new StudentControllerImpl();
		return stdController;
	}
}
