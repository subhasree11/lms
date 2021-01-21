<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html><head>
<title>display data from the table using jsp</title>
</head><body><%
try {
String connectionURL = "jdbc:mysql://localhost:3306/userdb";
Connection connection = null;
Statement statement = null;
ResultSet rs = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
connection = DriverManager.getConnection(connectionURL, "root", "password");
%>
<TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">
<form action="./LeaveStatus" method="post">
<h4>ENTER YOUR EMAIL ID </h4>
<input type="text" name="Email"><br>
<button name="action" value="enter">ENTER</button>
</form>
<%
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%><%}%>
</TABLE></body></html>