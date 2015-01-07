<%@ page language="java" buffer="none" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>ProjectBrowserGameSpring</title>
<script src="${pageContext.request.contextPath}/resources/javascript/jquery-2.1.1.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<td>
				<tiles:insertAttribute name="header"/>
			</td>
		</tr>
		<tr>
			<td>
				<tiles:insertAttribute name="navigation"/>
			</td>
		</tr>
		<tr>
			<td>
				<tiles:insertAttribute name="body"/>
			</td>
		</tr>
		<tr>
			<td>
				<tiles:insertAttribute name="footer"/>
			</td>
		</tr>
	</table>
</body>	
</html>