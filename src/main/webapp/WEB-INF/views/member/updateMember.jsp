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
		  $('input[id=repassword]').keyup(function(){
			   var password = $('#password').val();
			   var repassword = $(this).val();
			   if(password!=repassword){
				   $('span#repassCheckResult').html('<font color=red> 비밀번호와 일치하지 않음 </font>');
			   }else{
				   $('span#repassCheckResult').html('<font color=blue> 비밀번호와 일치  </font>');
			   }
		   }); // keyup  
	});
</script>
</head>
<body>
<h2 align="center">회원정보수정하기</h2><p>
<form name="updateForm" id="updateFrm" action="member.do" method="post">
  <input type="hidden" name="command" value="update"> 
   	Email : <input type="text" name="email" value="${mvo.email}" required="required" id="email"><br><br>
	Password : <input type="password" name="password"  value="${mvo.password}" required="required" id="password"><br><br> 
   	Password(check) : <input type="password" name="repassword"  value="${mvo.repassword}" required="required" id="repassword"><span id="repassCheckResult"></span> <br><br>
	Username : <input type="text" name="username"  value="${mvo.username}" required="required" id="username"><br><br> 
	Nickname : <input type="text" name="nickname"  value="${mvo.nickname}" required="required" id="nickname"><span id="nicknameCheckResult"></span><br><br> 
	Address : <input type="text" name="address"  value="${mvo.address}" required="required" id="address"><br><br> 
	<input type="button" id="registerBtn" value="수정">
 </form>
</body>
</html>