<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String msg = (String)request.getAttribute("msg");
 if(msg!=null){
 %>
<h1 id="msg"><%=msg %></h1>
<%if(msg.contains("Go to Login Page")){
%>
<a href="login">Click</a>
<% 
}} %>
</body>
</html>