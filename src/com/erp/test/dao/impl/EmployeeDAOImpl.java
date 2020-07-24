package com.erp.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.erp.test.common.Conn;
import com.erp.test.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int insertEmployee(Map<String, Object> employee) {

		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Conn.open();
			String sql = " insert into employee(emp_no,emp_name,emp_salary,grd_no,emp_credat) values(SEQ_EMP_NO.nextval,?,?,?,sysdate) ";
			ps = con.prepareStatement(sql);
			ps.setObject(1, employee.get("emp_name"));
			ps.setObject(2, employee.get("emp_salary"));
			ps.setObject(3, employee.get("grd_no"));
			result = ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conn.close(ps, con);
		}
		return result;
	}

	@Override
	public int updateEmployee(Map<String, Object> employee) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Conn.open();
			String sql = "update Employee set emp_name=?,emp_salary=? where emp_no=?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, employee.get("emp_name"));
			ps.setObject(2, employee.get("emp_salary"));
			ps.setObject(3, employee.get("emp_no"));
			result = ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conn.close(ps, con);
		}
		return result;
	}

	@Override
	public int deleteEmployee(Map<String, Object> employee) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = Conn.open();
			String sql = "delete from employee where emp_no=?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, employee.get("emp_no"));
			result = ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conn.close(ps, con);
		}
		return result;
	}

	@Override
	public Map<String, Object> selectEmployee(Map<String, Object> employee) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = Conn.open();
			String sql = "select * from Employee where emp_no=?";
			ps = con.prepareStatement(sql);
			ps.setObject(1, employee.get("emp_no"));
			rs = ps.executeQuery();
			if (rs.next()) {
				Map<String, Object> e = new HashMap<>();
				e.put("emp_no", rs.getInt("emp_no"));
				e.put("emp_name", rs.getString("emp_name"));
				e.put("emp_salary", rs.getString("emp_salary"));
				e.put("grd_no", rs.getInt("grd_no"));
				e.put("emp_credat", rs.getString("emp_credat"));
				return e;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conn.close(rs, ps, con);
		}
		return null;
	}

	@Override
	public List<Map<String, Object>> selectEmployeeList(Map<String, Object> employee) {
		List<Map<String, Object>> EmployeeList = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = Conn.open();
			String sql = "select * from Employee";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, Object> e = new HashMap<>();
				e.put("emp_no", rs.getInt("emp_no"));
				e.put("emp_name", rs.getString("emp_name"));
				e.put("emp_salary", rs.getString("emp_salary"));
				e.put("grd_no", rs.getInt("grd_no"));
				e.put("emp_credat", rs.getString("emp_credat"));
				EmployeeList.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conn.close(rs, ps, con);
		}
		return EmployeeList;
	}
}
