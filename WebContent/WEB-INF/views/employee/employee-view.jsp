<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/employee/update" id="frm">
		<input type="hidden" name="emp_no" value="${employee.emp_num}">
		<table border="1">
			<tr>
				<th>직급번호</th>
				<td><input type="text" name="grd_no" value="${employee.grd_no}"></td>
			<tr>
				<th>이름</th>
				<td><input type="text" name="emp_name"
					value="${employee.emp_name}"></td>
			</tr>
			<tr>
				<th>연봉</th>
				<td><input type="text" name="emp_salary"
					value="${employee.emp_salary}"></td>
			</tr>
			<tr>
				<th>고용번호</th>
				<td><input type="number" name="emp_no"
					value="${employee.emp_no}"></td>
			</tr>
			<tr>
				<th>가입일</th>
				<td>${employee.emp_credat}</td>
			</tr>
			<tr>
				<th>재직여부</th>
				<td>${employee.emp_activce}</td>
			</tr>
			<tr>
				<th colspan="2"><button>수정</button>
					<button type="button" onclick="doDelete()">삭제</button>
			</tr>
		</table>
	</form>
	<script>
		function doDelete() {
			var formObj = document.querySelector('#frm');
			formObj.action = '/employee/delete';
			formObj.submit();

		}
	</script>
</body>
</html>