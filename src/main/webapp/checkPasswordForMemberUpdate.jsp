<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.2.1.js"></script>
<style>
	
</style>
<script type="text/javascript">
	$(function(){
		 
		
	});
</script>
</head>
<body>
<h2 align="center">비번 확인</h2>
	<form action="member.do?command=checkPassword&&email=${param.email}" method="post"> 
		Password: <input type="text" name="password">
		<input type="submit" value="확인">
	</form>
</body>
</html>