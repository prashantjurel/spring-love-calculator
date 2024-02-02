<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator Registration Success</title>
</head>
<body>
<h1>Registration Successful</h1>
<hr>
<h2>Here are your Details</h2>
<br>
Name: ${userReg.nameString} <br>
Username: ${userReg.usernameString} <br>
Password: ${userReg.passwordString} <br>
Country: ${userReg.countryString} <br>
Hobbies:  
<c:forEach var="temp" items="${userReg.hobbiesStrings}">
${temp}
</c:forEach>
<br>
Gender: ${userReg.genderString} <br>
Email: ${userReg.communicationDTO.emailString} <br>
Phone Number: ${userReg.communicationDTO.phone} <br>
</body>
</html>