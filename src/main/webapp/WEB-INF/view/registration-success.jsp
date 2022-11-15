<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Your registration is Successful !!</h1>
	<h2>Here you have entered data !!</h2>
	Name : ${userregistraction.name}
	<br> UserName : ${userregistraction.userName}
	<br> Password : ${userregistraction.password}
	<br> Country : ${userregistraction.country}
	<br> Hobby :
	<c:forEach var="temp" items="${userregistraction.hobby}">
${temp}
</c:forEach>

	<br> Gender : ${userregistraction.gender}

<br> Email: ${userregistraction.communicationDTO.email }

<br> Phone : ${userregistraction.communicationDTO.phone}


</body>
</html>