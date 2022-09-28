<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="prime" method="post">
		<h1>Details of Prime Minister</h1>
		<a href="Savesuccess.jsp">Show page</a> <br> <br> Name:<input
			type="text" id="name" name="Name"> <br> <br>
		Country:<select name="Country">
			<option>---Select Country---</option>
			<option value="India">India</option>
			<option value="Germany">Germany</option>
			<option value="USA">USA</option>
			<option value="Australia">Australia</option>
		</select> <br> <br> Marriage Status: <input type="radio"
			id="marriage" name="Marriage" value="Married">Married <input
			type="radio" id="marriage" name="Marriage" value="Single">Single
		<br> <br> Party: <select name="Party">
			<option>---Select Party---</option>
			<option value="BJP">BJP</option>
			<option value="Congress">Congress</option>
			<option value="JDS">JDS</option>
		</select> <br> <br> Age:<input type="text" id="age" name="Age">
		<br> <br> Gender: <input type="radio" id="gender"
			name="Gender" value="Male">Male <input type="radio"
			id="gender" name="Gender" value="Female">Female <input
			type="radio" id="gender" name="Gender" value="Others">Others
		<br> <br> Period: <input type="text" id="period"
			name="Period"> <br> <br> Times Represented:<select
			name="Represented">
			<option>---Select Times---</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
		</select> <br> <br> <input type="submit" value="save">
	</form>
</body>
</html>