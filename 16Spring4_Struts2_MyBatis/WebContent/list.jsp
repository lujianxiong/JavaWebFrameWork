<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<table width="400" align="center">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>密码</td>
		</tr>
		<c:forEach items="${list }" var="bean">
		<tr>
			<td>${bean.id }</td>
			<td>${bean.username }</td>
			<td>${bean.password }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>