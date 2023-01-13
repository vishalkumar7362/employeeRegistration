<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h2>User Registration</h2>
	<form action="saveUser" method="post">
		<table>
			<tr>
				<td>Designation</td>
				<td><select name="designation">
						<option value="java developer">Java Developer</option>
						<option value="Fullstack developer">FullStack Developer</option>
						<option value="Backend developer">Backend Developer</option>
						<option value="Frontend developer">Frontend Developer</option>
				</select></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" /></td>
			</tr>             
			<tr>
				<td>Father's Name</td>
				<td><input type="text" name="fatherName" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="number" name="mobile" /></td>
			</tr>
			<tr>
				<td>D.O.B</td>
				<td><input type="date" name="dateOfBirth"/></td>
			</tr>
			<tr>
				<td><input type="submit" name="Submit"/></td>
			</tr>
		</table>
	</form>

</body>
</html>