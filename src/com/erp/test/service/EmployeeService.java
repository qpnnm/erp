package com.erp.test.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

	Map<String, Object> insertEmployee(Map<String, Object> Employee);

	Map<String, Object> updateEmployee(Map<String, Object> Employee);

	Map<String, Object> deleteEmployee(Map<String, Object> Employee);

	Map<String, Object> selectEmployee(Map<String, Object> Employee);

	List<Map<String, Object>> selectEmployeeList(Map<String, Object> Employee);
}
