<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>update member result page</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.2.1.js"></script>
<style>
	
</style>
<script type="text/javascript">
	$(function(){
		 
		
	});
</script>
</head>
<body>
<h2 align="center">${mvo.email}의 수정페이지</h2><p>
 <form name="showMemberInfoForm" action="member.do" method="post">
	<input type="hidden" name="command" value="updateMember"> 
   	Email : <input type="text" name="email" value="${ vo.email}" readonly="readonly"> <br><br>
	Password : <input type="password" name="password" value="${ vo.password}" readonly="readonly"><br><br> 
   	Password(check) : <input type="password" name="password2" value="${ vo.password}" readonly="readonly"> <br><br>
	Username : <input type="text" name="username" value="${ vo.username}" readonly="readonly"><br><br> 
	Nickname : <input type="text" name="nickname" value="${ vo.nickname}" readonly="readonly"><br><br> 
	Address : <input type="text" name="address" value="${ vo.address}" readonly="readonly"><br><br> 
	<input type="submit" value="정보수정" onclick="">
	<input type="submit" value="회원탈퇴" onclick=""> 
	<a href="index.jsp">홈으로 이동</a><p> 
</form>
</body>
</html>