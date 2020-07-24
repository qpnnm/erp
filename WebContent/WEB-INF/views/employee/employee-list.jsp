<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="/views/employee/employee-insert"><button>고용인 추가</button></a>
	<table border="1">
		<tr>
			<th>직급번호</th>
			<th>사원번호</th>
			<th>사원:성명</th>
			<th>연봉</th>
			<th>사원 등록일</th>

		</tr>
		<c:if test="${empty employeeList}">
			<tr>
				<td colspan="3">내용이 없습니다.</td>
			</tr>
		</c:if>
		<c:forEach items="${employeeList}" var="employee">
			<tr onclick="goView(${employee.emp_no})">
				<td>${employee.grd_no}</td>
				<td>${employee.emp_no}</td>
				<td>${employee.emp_name}</td>
				<td>${employee.emp_salary}</td>
				<td>${employee.emp_credat}</td>
			</tr>
		</c:forEach>
	</table>
	<script>
function goView(emp_no){
	location.href='/employee/employee-view?emp_no=' + emp_no;
}
</script>
</body>
</html>