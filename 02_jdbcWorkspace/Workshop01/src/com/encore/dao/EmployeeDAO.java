package com.encore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.encore.vo.Employee.Employee;

public interface EmployeeDAO {
	
	Connection getConnect();
	void closeAll(PreparedStatement ps, Connection conn) throws SQLException;
	void closeAll(ResultSet rs,PreparedStatement ps, Connection conn) throws SQLException;
	void insertEmp(Employee emp) throws SQLException;
	void removeEmp(int num) throws SQLException;
	void updateEmp(Employee emp) throws SQLException;
	ArrayList<Employee> selectAll() throws SQLException;
	
	
	
	
	

}
