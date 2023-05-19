package com.JDBCCRUDApp.DAOFactory;

import com.JDBCCRUDApp.model.IStudentDAO;
import com.JDBCCRUDApp.model.StudentDAOImpl;

public class DAOFactory {
	private DAOFactory() {}//objects cannot be created
	
	private static IStudentDAO stdDAO=null;
	public static IStudentDAO getStudentDAO() {
		if (stdDAO == null) {
			stdDAO = new StudentDAOImpl();
		}
		return stdDAO;
	}
}
