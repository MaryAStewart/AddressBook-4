<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address Book List</title>
<link rel="stylesheet" href="styles/list.css" type="text/css"/>
 <style>
 table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
<h1>Address Book</h1>
<table>
<thead>
   <tr><th>Name</th><th>Email</th><th>Phone Number</th></tr>
   </thead>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="user" items="${users}" >
<tr><td>${user.name }</td>
	<td>${user.email }</td>
	<td>${user.phoneNumber }</td>
	</tr>
	</c:forEach>
</table>	



</body>
</html>