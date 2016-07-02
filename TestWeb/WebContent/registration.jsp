<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
	<pre>
		Name : <input type="text" name="patientName">
		</br>
		Contact : <input type="text" name="contact">
		</br>
		Email : <input type="text" name="email">
		</br>
		Security Key :<input type="password" name="securityKey">
		<br>
		<input value="Submit" type="submit" name="operation"/>
		
	</pre>
	</form>
</body>
</html>