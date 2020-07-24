<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/employee/employee-insert" id="frm">
		<table border="1">
			<tr>
				<th>사원-성명</th>
				<th><input type="text" name="emp_name"></th>
			</tr>
			<tr>
				<th>연봉</th>
				<th><input type="text" name="emp_salary"></th>
			</tr>
			<tr>
				<th>직급번호</th>
				<th><input type="text" name="grd_no"></th>
			</tr>
			<tr>
				<th colspan="3"><button>사원등록</button>
					<button type="reset">초기화</button></th>
			</tr>
		</table>
	</form>
</body>
</html>