<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer tracker - All</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap.css">
</head>
<body>
<table class="table ">
	<thead class="thead-light">
	<tr>
		<td colspan="3">
			<h2>Customers List</h2>
		</td>
		<td colspan="2" class="text-right">
			<a href="add"><button class="btn btn-primary ">Add Customer</button></a>	
		</td>
	</tr>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th colspan="2" class="text-center">Actions</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach  var="customer" items="${ customers}">
		<tr>
			<td>${customer.firstName }</td>
			<td>${customer.lastName }</td>
			<td>${customer.email }</td>
			<td class="text-center">
				<a href="update?id=${customer.id }"
				class="btn btn-info">Update</a>
			</td>
			<td class="text-center">
				<a href="delete?id=${customer.id }"
					onclick="if(!confirm('Are you sure you want to delete this customer')) return false;"
					class="btn btn-danger">Delete</a>
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>