<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>my mvc app</title>
<script type="text/javascript">
	function validateHomePage() {
		var usernameLength = document.getElementById("yn").value;
		var crushNameLength = document.getElementById("cn").value;
		return usernameLength.length&&crushNameLength > 3 ? true : false;
	}
</script>

</head>
<body>

	<h1 align="center">LOVE CALCULATOR</h1>
	<hr>
	<form:form action="result" method="get" modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn"> Your Name :</label> 
				<form:input path="yourName" id="yn" /> 
				<form:errors path="yourName" />
				
			</p>
			<p>
				<label for="cn"> Crush Name : </label>
				<form:input path="crushName" id="cn" /> 
				<form:errors path="crushName" />
				

			</p>
			<input type="submit" value="Calculate">
		</div>

	</form:form>
	<hr>

</body>
</html>