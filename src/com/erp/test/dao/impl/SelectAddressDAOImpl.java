package com.erp.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.erp.test.common.Conn;
import com.erp.test.dao.SelectAddressDAO;

public class SelectAddressDAOImpl implements SelectAddressDAO {

	@Override
	public List<String> selectSidoList(String sido) {
		List<String> sidoList = new ArrayList<>();
		Connection con = Conn.open();
		String sql = "select distinct sido from select_address order by sido";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				sidoList.add(rs.getString("sido"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sidoList;
	}

	@Override
	public List<String> selectGugunList(String sido) {
		List<String> gugunList = new ArrayList<>();
		Connection con = Conn.open();
		String sql = " select distinct gugun from select_address ";
		sql += " where sido= ? order by sido ";
		ResultSet rs = null;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sido);
			rs = ps.executeQuery();
			while (rs.next()) {
				gugunList.add(rs.getString("gugun"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return gugunList;
	}

	@Override
	public List<String> selectDongList(String sido, String gugun) {
		List<String> dongList = new ArrayList<>();
		Connection con = Conn.open();
		String sql = " select distinct dong_name from select_address ";
		sql += " where sido= ? and gugun = ? order by sido ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sido);
			ps.setString(2, gugun);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dongList.add(rs.getString("dong_name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dongList;
	}

	public static void main(String[] args) {
		SelectAddressDAO saDao = new SelectAddressDAOImpl();
		{
			System.out.println(saDao.selectGugunList("서울특별시"));
			System.out.println(saDao.selectDongList("서울특별시", "강북구"));

		}

	}
}
