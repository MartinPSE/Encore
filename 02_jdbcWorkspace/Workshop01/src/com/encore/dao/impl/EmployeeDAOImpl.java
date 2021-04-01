package com.encore.dao.impl;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.encore.dao.EmployeeDAO;
import com.encore.vo.Employee.Employee;

import config.ServerInfo;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static EmployeeDAOImpl dao = new EmployeeDAOImpl(); 
			
	private EmployeeDAOImpl(){
		
		// 1. Driver Loading 
		
		try {
			Class.forName(ServerInfo.Driver);
			System.out.println("<< Driver Lodading Complete >>");
		}catch(ClassNotFoundException e) {
			System.out.println("<< Driver Loading Error >>");
			Toolkit tool = Toolkit.getDefaultToolkit();
			tool.beep();
		}
		
	}
	
	public static EmployeeDAOImpl getInstance() {
		
	
		return dao;
	}

	@Override
	public Connection getConnect() {
		
		// 2. DB Server 연결
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
			System.out.println("<< DB Server Connecting Complete >>");
		} catch (SQLException e) {
			System.out.println("<<<<< DB Server Connection Error >>>>>");
			Toolkit tool = Toolkit.getDefaultToolkit();
			tool.beep();
		}

		return conn;
		
	}

	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
					if (ps != null) ps.close();
					if (conn != null) conn.close();
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if ( rs!= null ) rs.close();
		closeAll(ps,conn);
		
		
		
	}

	@Override
	public void insertEmp(Employee emp) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement ps = null;
		
		
			String insertsql = "INSERT INTO employee VALUES (?,?,?,?)";
			ps = conn.prepareStatement(insertsql);
			System.out.println("<< Prepared Satement Creating >>");
			
			ps.setInt(1, emp.getNum());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getAddress());
			
			int row = ps.executeUpdate();
			if (row > 0 ) {
				System.out.println(row + "(row) Insert Complete");
			} 
			else {
				System.out.println("Sorry Update Error");
				Toolkit tool = Toolkit.getDefaultToolkit();
				tool.beep();
			}
			
			closeAll(ps, conn);

			
		}
		


	@Override
	public void removeEmp(int num) throws SQLException{
		Connection conn = getConnect();
		PreparedStatement ps = null;
		
		String deletesql = "DELETE FROM employee where num=?";
		
			ps = conn.prepareStatement(deletesql);
			ps.setInt(1, num);
			int row = ps.executeUpdate();
			
			if ( row > 0 ) System.out.println(row+"(row) Delete Complete");
			else {
				System.out.println("<<<<< Sorry Delete Error >>>>>");
				Toolkit tool = Toolkit.getDefaultToolkit();
				tool.beep();
			}
			
		
		closeAll(ps, conn);

	}

	@Override
	public void updateEmp(Employee emp) throws SQLException {
		Connection conn = getConnect();
		PreparedStatement ps = null;
		
		String updatesql = "UPDATE employee SET name=?, salary =?, address =? WHERE num =?";
		
			ps = conn.prepareStatement(updatesql);
			ps.setString(1, emp.getName());
			ps.setDouble(2, emp.getSalary());
			ps.setString(3, emp.getAddress());
			ps.setInt(4, emp.getNum());
			
			int row = ps.executeUpdate();
			if (row > 0) System.out.println(row +"(row) Update Complete");
			else {
				System.out.println("<<<<< Sorry Update Error >>>>>");
				Toolkit tool = Toolkit.getDefaultToolkit();
				tool.beep();
			}
			
		
		
		closeAll(ps, conn);
		
		
		
		
	}

	@Override
	public ArrayList<Employee> selectAll() throws SQLException{
		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection conn = getConnect();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		String selectsql = "SELECT num, name, salary, address FROM employee";
		
			ps = conn.prepareStatement(selectsql);
			rs = ps.executeQuery();
			
			while(rs.next()){
				list.add(new Employee(rs.getInt("num"),
						rs.getString("name"),
						rs.getDouble("salary"),
						rs.getString("address")));

			}
			closeAll(rs, ps, conn);
			return list;
			}
	}

	


