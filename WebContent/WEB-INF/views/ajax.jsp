<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		function getAjax() {
			var xhr = new XMLHttpRequest();
			xhr.open('GET', '/ajax');
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4) {
					var obj = JSON.parse(xhr.responseText);
					alert(obj.key);
				}
			}
			xhr.send();
		}
	</script>
	<button onclick="getAjax()">기모찌</button>
	<div id="rDiv"></div>
</body>
</html>