<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List,service.impl.MemberServiceImpl"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width=500px align=center border=1>
<tr>
	<td>id<td>name<td>username<td>password
	<%out.println(new MemberServiceImpl().showAll());%>
</table>
</body>
</html>