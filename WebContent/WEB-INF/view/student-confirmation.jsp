<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation Page</title>
</head>
<body>
	<h2>Student confirmed: ${student.firstName}  ${student.lastName} from ${student.country} with fav language ${student.language} </h2>
	<br/>
	<h4>Student is good at OS:  </h4>
	<ul>
	<c:forEach var="item" items="${student.os}">
		<li>${item}</li>
	</c:forEach>
	</ul>
	
	
</body>
</html>