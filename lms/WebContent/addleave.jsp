<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Register" method="post">
<table>
<tr><td>EMAIL: </td><td><input type="text" name="email"></td></tr>
<tr><td>FROM(START DATE): </td><td><input type="text" name="from"></td></tr>
<tr><td>TO(END DATE): </td><td><input type="text" name="to"></td></tr>
<tr><td>REASON: </td><td><input type="text" name="reason"></td></tr>
<tr><td></td><td><input type="submit" value="APPLY"></td></tr>
</table>
<input type="button" onclick="window.location.href='http://localhost:8080/lms/loginSuccess.jsp';"value="BACK" />
</form>
</body>
</html>