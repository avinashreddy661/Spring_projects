<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<title>Homepage</title>
<script>
	function validationfun() {
		var userame = document.getElementById("userName").value;

		if (userame.length < 1) {
			alert("enter valid input");
			return false;
		}
		elase
		{
			return true;
		}

	}
</script>

</head>

<body>

	<h1 align="center">Love Calculator</h1>
	<hr>

	<!-- way 2 -->
	<div align="center">
		<form:form action="processing-homepage" modelAttribute="user"
			>
			<p>
				<label>Your Name :</label>
				<form:input id="userName" path="userName" />
			</p>

			<p>
				<label>Crush Name :</label>
				<form:input path="crushName" />
			</p>
			<input type="submit" value="calculate">
		</form:form>
	</div>
	<%--  way 1
	<form action="processing-homepage" method="get">

		<p>
			<label id="username1"> UserName : </label> <input type="text" name="username1">
		</p>


		<p>
			<label id="crushname1"> crush : </label> <input type="text" name="crushname1">
		</p>

		<input type="submit" value="calculate">
	</form> --%>

</body>

</html>