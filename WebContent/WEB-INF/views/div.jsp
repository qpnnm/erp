<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div.sido {
	border: 2px solid #D4F4FA;
	width: 200px;
	text-align: center;
	font-size: 30px;
	float: left;
	margin-left: 5px;
	background: #EBF7FF;
	cursor: pointor;
}

div.gugun {
	border: 2px solid #a1f4b2;
	width: 150px;
	text-align: center;
	font-size: 24px;
	float: left;
	margin-left: 4px;
	cursor: pointor;
}

div.sido:hover {
	background-color: #EAEAEA
}

div.gugun:hover {
	background-color: #EAEAEA
}

div.dong {
	border: 2px solid #a1b2f4;
	width: 150px;
	text-align: center;
	font-size: 24px;
	float: left;
	margin-left: 4px;
}

div.dong:hover {
	background-color: #EAEAEA
}

div.selected {
	border: 1px solid #f1f1f1;
	margin-left: 3px;
	background-color: #BDBDBD;
}
</style>
</head>
<body>
	<div
		class="sido
	<c:if test="${param.sido eq null}">selected</c:if>
	">전체</div>
	<c:forEach items="${sidoList}" var="sido" varStatus="idx">
		<div class="sido <c:if test="${param.sido eq sido}">selected</c:if>"
			onclick="selectSido(this)" data-sido="${sido}">
			<c:if
				test="${fn:contains(sido,'충청') or fn:contains(sido,'경상') or fn:contains (sido,'전라') }">
			${fn:substring(sido,0,1)}${fn:substring(sido,2,3)}
		</c:if>
			<c:if
				test="${!fn:contains(sido,'충청') and !fn:contains(sido,'경상') and !fn:contains (sido,'전라') }">
			${fn:substring(sido,0,2)}
		</c:if>
		</div>
		<c:if test="${idx.count eq 8}">
			<br>
		</c:if>
	</c:forEach>
	<div>
		<br>
		<div
			class="gugun 
		<c:if test="${param.gugun eq null}"> 
		selected </c:if>
		">전체</div>
		<c:forEach items="${gugunList}" var="gugun" varStatus="idx">
			<div class="gugun <c:if test="${param.gugun==gugun}">selected</c:if>"
				onclick="gugunList(this)" data-gugun="${gugun}">
				${fn:substring(gugun,0,3)}</div>
			<c:if test="${idx.count eq 12}">
				<br>
			</c:if>
		</c:forEach>
	</div>
	<div>
		<br>
		<c:forEach items="${dongList}" var="dong" varStatus="idx">
			<div class="dong" onclick="dongList(this)" data-dong="${dong}">
				${fn:substring(dong,0,3)}</div>
			<c:if test="${idx.count eq 12}">
				<br>
			</c:if>
		</c:forEach>
	</div>
	<script>
		function selectSido(sidoObj) {
			var sido = sidoObj.getAttribute('data-sido');
			location.href = '/div?sido=' + sido;
		}
		function gugunList(gugunObj) {
			var gugun = gugunObj.getAttribute('data-gugun');
			location.href = '/div?sido=' + "${param.sido}" + '&gugun=' + gugun;
		}
	</script>
</body>
</html>