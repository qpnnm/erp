package com.erp.test.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.erp.test.dao.EmployeeDAO;
import com.erp.test.dao.impl.EmployeeDAOImpl;
import com.erp.test.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO eDao = new EmployeeDAOImpl();

	@Override
	public Map<String, Object> insertEmployee(Map<String, Object> employee) {
		Map<String, Object> rMap = new HashMap<>();
		rMap.put("msg", eDao.insertEmployee(employee) == 1 ? "등록성공" : "등록실패");
		return rMap;
	}

	@Override
	public Map<String, Object> updateEmployee(Map<String, Object> employee) {
		Map<String, Object> rMap = new HashMap<>();
		rMap.put("msg", eDao.updateEmployee(employee) == 1 ? "수정성공" : "수정실패");
		return rMap;
	}

	@Override
	public Map<String, Object> deleteEmployee(Map<String, Object> employee) {
		Map<String, Object> rMap = new HashMap<>();
		rMap.put("msg", eDao.deleteEmployee(employee) == 1 ? "삭제성공" : "삭제실패");
		return rMap;
	}

	@Override
	public Map<String, Object> selectEmployee(Map<String, Object> employee) {
		return eDao.selectEmployee(employee);
	}

	@Override
	public List<Map<String, Object>> selectEmployeeList(Map<String, Object> employee) {
		return eDao.selectEmployeeList(employee);
	}

}