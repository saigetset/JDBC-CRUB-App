package com.JDBCCRUDApp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.JDBCCRUBAPP.dto.Student;
import com.JDBCPrograms.JDBCUtil.JDBCUtil;

public class StudentDAOImpl implements IStudentDAO {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	@Override
	public String addStudent(String name, int age, String city) {
		// TODO Auto-generated method stub
		int val = 0;
		try {
			con = JDBCUtil.getJDBCConnection();
			if (con != null)
				pstmt = con.prepareStatement("Insert into Students(name,age,city) values(?,?,?)");
			if (pstmt != null) {
				pstmt.setString(1, name);
				pstmt.setInt(2, age);
				pstmt.setString(3, city);
				val = pstmt.executeUpdate();
			}
			if (val == 1) {
				return "successful";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JDBCUtil.cleanUp(con, pstmt, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "failed";
	}

	@Override
	public Student searchStudent(int id) {
		// TODO Auto-generated method stub
		Student std = null;
		try {
			con = JDBCUtil.getJDBCConnection();
			if (con != null)
				pstmt = con.prepareStatement("Select * from Students where id = ?");
			if (pstmt != null) {
				pstmt.setInt(1, id);
				rs = pstmt.executeQuery();
			}
			if (rs != null) {
				if (rs.next()) {
					std = new Student();
					std.setID(rs.getInt(1));
					std.setName(rs.getString(2));
					std.setAge(rs.getInt(3));
					std.setCity(rs.getString(4));

					return std;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JDBCUtil.cleanUp(con, pstmt, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return std;
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		int val = 0;
		try {
			con = JDBCUtil.getJDBCConnection();
			if (con != null)
				pstmt = con.prepareStatement("Delete from Students where id=?");
			if (pstmt != null) {
				pstmt.setInt(1, id);
				val = pstmt.executeUpdate();
			}
			if (val == 1) {
				return "successful";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JDBCUtil.cleanUp(con, pstmt, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "failed";
	}

	@Override
	public String updateStudent(int id, String name) {
		// TODO Auto-generated method stub
		int val = 0;
		try {
			con = JDBCUtil.getJDBCConnection();
			if (con != null)
				pstmt = con.prepareStatement("Update Students set name=? where id=?");
			if (pstmt != null) {
				pstmt.setString(1, name);
				pstmt.setInt(2, id);
				val = pstmt.executeUpdate();
			}
			if (val == 1) {
				return "successful";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JDBCUtil.cleanUp(con, pstmt, rs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "failed";
	}

}
