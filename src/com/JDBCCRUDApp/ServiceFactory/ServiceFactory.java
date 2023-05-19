package com.JDBCCRUDApp.ServiceFactory;

import com.JDBCCRUDApp.service.IStudentService;
import com.JDBCCRUDApp.service.StudentServiceImpl;

public class ServiceFactory {
	
	private ServiceFactory() {}
	
	private static IStudentService stdService=null;
	
	public static IStudentService getStudentService() {
		if(stdService==null)
			stdService = new StudentServiceImpl();
		return stdService;
	}

}
