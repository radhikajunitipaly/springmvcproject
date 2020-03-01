<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<style>
	.error {color: red}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName"/>
		<br/>
		<br/>
		Last name(*):  <form:input path="lastName"/>
					<form:errors path="lastName" cssClass="error"></form:errors>
		<br/>
		<br/>
		Country: <form:select path="country">
					<!-- <form:option value="India" label="India"></form:option>
					<form:option value="US" label="US"></form:option>
					<form:option value="Norway" label="Norway"></form:option> -->
					<form:options items="${countries}"/>
				</form:select>
		<br/>
		<br/>
		Programming Language: <!-- <form:radiobutton path="language" value="Java" label="Java"/>
							  <form:radiobutton path="language" value="Python" label="Python"/>
							  <form:radiobutton path="language" value="C#" label="C#"/>-->
							  <form:radiobuttons path="language" items="${languages}"/>
							  
		<br/>
		<br/>
		Operating System:	  <!-- <form:checkbox path="os" value="windows" label="windows"/>
							  <form:checkbox path="os" value="linux" label="linux"/>
							  <form:checkbox path="os" value="ios" label="ios"/>-->
							  <form:checkboxes items="${osList}" path="os"/>
							  
		<br/>
		<br/>
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>