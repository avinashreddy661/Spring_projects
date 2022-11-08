<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>resultpage</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>
	<!-- Way 2  -->
	<div align="center">
		<form:form modelAttribute="user">
			<p>You are able to see the result</p>
				Your Name :<form:input path="userName" /></br>
				Crush Name :<form:input path="crushName" />
				
		</form:form>
	</div>


	<%-- Way 1
	 <form  method="get" >
	Your name : ${u1}
	cursh Name :${c1} --%>
	</form>


</body>
</html>