<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer tracker - Add</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap.css">
</head>
<body  class="p-5">
	
			<h2 class="mb-4">Add Customer</h2>
	<form:form action = "list"  modelAttribute="customer" method = "POST" class="w-50">
		<div class="form-group">
			<form:label path = "firstName">First Name:</form:label>
			<form:input path = "firstName" class="form-control" />
		</div>
		<div class="form-group">
			<form:label path = "lastName" >Last Name:</form:label>
			<form:input path = "lastName" class="form-control"/>
			</div>
		<div class="form-group">
				<form:label path = "email" >Email:</form:label>
				<form:input path = "email" class="form-control"/>
			</div>
          <button  class="btn btn-primary">Submit</button>
      </form:form>
      
      <br />
      <a href="list">Go back to customers list >></a>
</body>
</html>