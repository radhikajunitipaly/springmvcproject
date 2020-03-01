<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation Page</title>
</head>
<body>
	<h2>Customer confirmed: ${customer.firstName}  ${customer.lastName}
	<br>
	with ${customer.freePasses} 
	<br>
	number of passes with postal code ${customer.postalCode} 
	<br>
	and course code is ${customer.courseCode}</h2>
	<br/>
</body>
</html>