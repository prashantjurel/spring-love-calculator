<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
<style type="text/css">
.error {
	color: red;
	text-align: left;
	position: fixed;
	margin-left: 30px;
}
</style>
</head>
<body>
	<h1 align="center">LOVE CALCULATOR</h1>
	<hr>
	<form:form action="registration-success" method="GET"
		modelAttribute="userReg">
		<div align="center">
			<p>
				<label for="name">Name : </label>
				<form:input path="nameString" id="name" />
			</p>
			<p>
				<label for="username">Username : </label>
				<form:input path="usernameString" id="username" />
			</p>
			<p>
				<label for="password">Password : </label>
				<form:input type="password" path="passwordString" id="password" />
			</p>

			<p>
				<label for="age">Age : </label>
				<form:input path="ageInteger" id="age" />
				<form:errors path ="ageInteger" cssClass="error"/>
			</p>

			<p>
				<label for="country">Country : </label>
				<form:select path="countryString">
					<form:option value="Ind" label="India" />
					<form:option value="Usa" label="United States" />
					<form:option value="Uk" label="United Kingdom" />
					<form:option value="Sl" label="Sri Lanka" />

				</form:select>
			</p>
			<p>
				<label for="hobby">Hobbies : </label> Cricket
				<form:checkbox path="hobbiesStrings" value="cricket" />
				Reading
				<form:checkbox path="hobbiesStrings" value="reading" />
				Travel
				<form:checkbox path="hobbiesStrings" value="travel" />
				Programming
				<form:checkbox path="hobbiesStrings" value="programming" />
			</p>
			<p>
				<label>Gender : </label> Male
				<form:radiobutton path="genderString" value="male" />
				Female
				<form:radiobutton path="genderString" value="female" />
			</p>

			<p>
				<label>Communication Details : </label><br> 
				Email :
				<form:input path="communicationDTO.emailString" />
				Phone Number :
				<form:input path="communicationDTO.phone" />
			</p>
			<p>
				<input type="submit" value="Register" />
			</p>

		</div>


	</form:form>

</body>
</html>