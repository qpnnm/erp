<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>직급번호</th>
		<th>${grade.grd_no}</th>
	</tr>
	<tr>
		<th>직급</th>
		<th><input type="text" name="grd_name" value="${grade.grd_name}"></th>
	</tr>
	<tr>
		<th>설명</th>
		<th><input type="text" name="grd_desc" value="${grade.grd_desc}"></th>
	</tr>
	<tr>
		<th colspan="2"><button>수정</button></th>
	</tr>
</table>
</body>
</html>