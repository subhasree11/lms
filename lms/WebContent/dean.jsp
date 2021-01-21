<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align ="center">
<h1 style="color:white; font-size:30px">LEAVE MANAGEMENT SYSTEM</h1>
<form action ="login" method="post">
<input type="button" onclick="window.location.href='http://localhost:8080/lms/login.jsp';"value="FACULTY LOGIN"  />
<h2 style="color:white; font-size:18px">DEAN</h2>
<table>
<tr><td><font color="white">ENTER REGISTERED EMAIL ID: </font></td><td><input type="text" name="username"></td></tr>
<tr><td><font color="white">PASSWORD:</font> </td><td><input type="password" name="password"></td></tr>
<tr><td></td><td><input type="submit" value="SUBMIT"></td></tr>
</table>


</form>

</div>
</body>
</html>