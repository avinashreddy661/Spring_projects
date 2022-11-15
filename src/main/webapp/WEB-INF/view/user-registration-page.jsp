<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body>
	<h1 align="center">Please Register Here !!</h1>

	<div align="center">
		<form:form action="registration-success" method="get" modelAttribute="userregistraction">
			<label>Name : </label>
			<form:input path="name" />
			<br>
			<label>UserName : </lab4el> <form:input path="userName" /> <br>
				<label>Password : </label> <form:password path="password" /> <br>
				<label>Country : </label> <form:select path="country">
					<form:option value="IND" label="India"></form:option>
					<form:option value="Pak" label="Pakisthan"></form:option>
					<form:option value="USA" label="United State Of America"></form:option>
					<form:option value="SL" label="Srilanka"></form:option>
					<form:option value="AFG" label="Afganisthan"></form:option>
					<form:option value="CHN" label="China"></form:option>


				</form:select> <br /> <label>Hobby : </label> Cricket : <form:checkbox
					path="hobby" value="Cricket" /> Boxing : <form:checkbox
					path="hobby" value="Boxing" /> Dancing : <form:checkbox
					path="hobby" value="Dancing" /> Football : <form:checkbox
					path="hobby" value="Football" /> Travelling : <form:checkbox
					path="hobby" value="Travelling" /> <br> <label>Gender
					: </label> Male : <form:radiobutton path="gender" value="Male" /> Female :
				<form:radiobutton path="gender" value="Female" /> <br>
				
				<br>
				<div align="center">
				<h3>Communication : </h3>
				<label>Email : </label>
				<form:input path="communicationDTO.email"/>
				
				<label>Phone : </label>
				<form:input path="communicationDTO.phone"/>
				
				
				
				</div>
				 <input
				type="submit" vale="Reister">
		</form:form>
	</div>
</body>
</html>