<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String msg = (String)request.getAttribute("msg");  
if(msg!=null){%>
<p><%=msg %></p>
<%} %>
<form action="login" method="post">
Email : <input type="text" name="email" value="" autocomplete="off"/>
<br/>
Password : <input type="password" name="securityKey" value="" autocomplete="off"/>
<br/>
<input type="submit" value="login" name="operation" />
<a href="register">SignUp</a>
</form>
</body>
</html>