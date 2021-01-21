<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<title>display</title>

</head>
<body>
<%
try {
String connectionURL = "jdbc:mysql://localhost:3306/userdb";
Connection connection = null;
Statement statement = null;
ResultSet rs = null;
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection(connectionURL, "root", "password");
statement = connection.createStatement();
String QueryString = "SELECT * from leavetable";
rs = statement.executeQuery(QueryString);
%>
<TABLE cellpadding="20" border="1" style="background-color:#ffcccc;">
<%
while (rs.next()) {
%>
<TR>
<TD><%=rs.getString(1) %> </TD>
<TD><%=rs.getString(2)%></TD>
<TD><%=rs.getString(3)%></TD>
<TD><%=rs.getString(4)%></TD>
<TD><%=rs.getString(5)%></TD>
<TD>
<form action="./actionforbutton" method="post">
<input type="text" name="Email">
<button name="action" value="approve">Approve</button>
<button name="action" value="disapprove">Disapprove</button>
</form>
</TR>
<% }String val=rs.getString(1); %>
<%
// close all the connections.
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>
<%

}
%>
</TABLE><TABLE>
<input type="button" onclick="window.location.href='http://localhost:8080/lms/deansucces.jsp';"value="BACK" />
<TR>
</TR>
</TABLE>
</body>
</html>