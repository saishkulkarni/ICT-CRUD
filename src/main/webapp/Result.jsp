<%@page import="org.jsp.crud.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Student> list=(List<Student>)request.getAttribute("list"); %>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Mobile</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<% for(Student student:list) {%>
<tr>
<th><%=student.getId() %></th>
<th><%=student.getName() %></th>
<th><%=student.getMobile() %></th>
<th><a><button>Delete</button></a></th>
<th><a><button>Edit</button></a></th>
</tr>

<%} %>
</table>
</body>
</html>