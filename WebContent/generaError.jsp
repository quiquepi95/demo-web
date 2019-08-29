<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="ShowError.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Handling</title>
</head>
<body>
	<%
		int x = 1;
		if (x == 1) {
			throw new RuntimeException("Error intencionado!!!");
		}
	%>
</body>
</html>