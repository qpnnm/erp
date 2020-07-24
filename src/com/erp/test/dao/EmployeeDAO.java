package com.erp.test.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
	int insertEmployee(Map<String, Object> Employee);

	int updateEmployee(Map<String, Object> Employee);

	int deleteEmployee(Map<String, Object> Employee);

	Map<String, Object> selectEmployee(Map<String, Object> Employee);

	List<Map<String, Object>> selectEmployeeList(Map<String, Object> Employee);
}
