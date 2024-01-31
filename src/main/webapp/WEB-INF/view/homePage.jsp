<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>my mvc app</title>

<style type="text/css">
.error {
	color: red;
	text-align: left;
	position: fixed;
	margin-left: 30px;
}
</style>

<script type="text/javascript">
	function validateHomePage() {
		var usernameLength = document.getElementById("yn").value;
		var crushNameLength = document.getElementById("cn").value;
		var checkBoxTicked = document.getElementById("check").checked;

		if (checkBoxTicked && ((usernameLength.length && crushNameLength) > 2)) {
			return true;
		} else if (usernameLength.length <= 2) {
			alert("Please provide proper name");
			return false;
		} else if (crushNameLength.length <= 2) {
			alert("Please provide proper crush name");
			return false;
		} else if (!checkBoxTicked) {
			alert("Please check the condition");
			return false;
		}
	}
</script>

</head>
<body>

	<h1 align="center">LOVE CALCULATOR</h1>
	<hr>
	<form:form action="result" method="get" modelAttribute="userInfo"
		onsubmit="return validateHomePage()">
		<div align="center">
			<p>
				<label for="yn"> Your Name :</label>
				<form:input path="yourName" id="yn" />
				<form:errors cssClass="error" path="yourName" />

			</p>
			<p>
				<label for="cn"> Crush Name : </label>
				<form:input path="crushName" id="cn" />
				<form:errors cssClass="error" path="crushName" />


			</p>
			<p>
				<form:checkbox path="termAndCondition" id="check" />
				<label>I agree that this is for fun</label>
				<form:errors cssClass="error" path="termAndCondition" />
			</p>


			<input type="submit" value="Calculate">
		</div>

	</form:form>
	<hr>

</body>
</html>