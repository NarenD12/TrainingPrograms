<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>Cart</h2>
			<hr />

			<input type="button" value="Add Customer"
				onclick="window.location.href='showForm'; return false;"
				class="btn btn-primary" /> <br />
			<br />
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Product List</div>
				</div>
				<div class="panel-body">
					<table class="table table-striped table-bordered">
						<tr>
							<th>Product Name</th>
							<th>Price</th>
							<th>Quantity</th>
							<th>Action</th>
						</tr>

						<c:forEach var="tempProduct" items="${product}">

							<c:url var="updateLink" value="/updateForm">
								<c:param name="id" value="${tempProduct.id}" />
							</c:url>

							<c:url var="deleteLink" value="/delete">
								<c:param name="id" value="${tempProduct.id}" />
							</c:url>
							<tr>
								<td>${tempProduct.name}</td>
								<td>${tempProduct.price}</td>
								<td>${tempProduct.quantity}</td>
								<td>
									<a href="${updateLink}">Update</a>
									 <a href="${deleteLink}">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>