<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<title>Homepage</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

<script>
	function validationfun() {
		var userame = document.getElementById("userName").value;

		if (userame.length < 3) {
			alert("your name should have atleast 3 chars");
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
			method="get" onsubmit="return validationfun()">
			<p>
				<label>Your Name :</label>
				<form:input id="userName" path="userName" />
				<form:errors path="userName" cssClass="error"></form:errors>
			</p>

			<p>
				<label>Crush Name :</label>
				<form:input path="crushName" />
				<form:errors path="crushName" cssClass="error"></form:errors>
			</p>
			<p>
				<form:checkbox path="termAndCondition" id="check" />
				<label>I'm agreeing that this is for fun.</label>
				<form:errors path="termAndCondition" cssClass="error"></form:errors>
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