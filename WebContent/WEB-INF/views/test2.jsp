<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	시도:
	<select id="sido" onchange="changeSido(this)">
		<option value="">선택</option>
		<c:forEach items="${sidoList}" var="sido">
			<option value="${sido}"
				<c:if test="${sido eq param.sido}">
selected
				</c:if>>${sido}</option>
		</c:forEach>
	</select>
	<br> 구군:
	<select id="gugun" onchange="changeGugun(this)">
		<option value="">선택</option>
		<c:forEach items="${gugunList}" var="gugun">
			<option value="${gugun}"
				<c:if test="${gugun eq param.gugun}">
				selected
				</c:if>>
				${gugun}</option>
		</c:forEach>
	</select> 동:
	<select id="dong" onchange="changeDong(this)">
		<option value="">선택</option>
		<c:forEach items="${dongList}" var="dong">
			<option value="${dong}">${dong}</option>
		</c:forEach>
	</select>
	<script>
		function changeSido(obj) {
			location.href = '/test2?sido=' + obj.value;
		}
		function changeGugun(obj) {
			var sidoObj = document.querySelector('#sido');
			location.href = '/test2?sido=' + sidoObj.value + '&gugun='
					+ obj.value;
		}

		/* window.onload = function(){
			var sido = '${param.sido}';
			document.querySelectr(#'sido').value =sido;
		 */

		/*Browser Object Model BOM (root as window)
		Document Object Model DOM   (root as document)
		 */
	</script>
</body>
</html>