<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div.sido {
	border: 2px solid #f1f1f1;
	width: 200px;
	text-align: center;
	font-size: 30px;
	float: left;
	margin-left: 5px;
	background: #ffd9f1;
}
</style>
</head>
<body>
	<div class="sido selected">전체</div>
	<c:forEach items="${sidoList}" var="sido" varStatus="idx">
		<div class="sido">
			<c:if
				test="${fn:contains(sido,'충청') or fn:contains(sido,'경상') or fn:contains (sido,'전라') }">
			${fn:substring(sido,0,1)}${fn:substring(sido,2,3)}
		</c:if>
			<c:if
				test="${!fn:contains(sido,'충청') and !fn:contains(sido,'경상') and !fn:contains (sido,'전라') }">
			${fn:substring(sido,0,2)}
		</c:if>
		</div>
		<c:if test="${idx.count==8}">
			<br>
		</c:if>
	</c:forEach>

</body>
</html>