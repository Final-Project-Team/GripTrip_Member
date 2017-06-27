<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>griptrip 회원가입</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.2.1.js"></script>
<style>
	
</style>
<script type="text/javascript">
	$(function(){
	  $('input[id=email]').keyup(function(){
		 	var input = $(this).val();
		 //	alert(input);
		  $.ajax({
	 		  url: "member.do",
	 		  data: "command=isEmailExist&&email="+input,
			  type: "post",
			  
	 		  success: function(result) {
				// alert(result.found);		  
				var found = result.found;
				if(found==false){  //db에 email이 없다.  사용가능한 email
				   $('span#emailCheckResult').html('<font color=blue> 사용가능한 email </font>');
				}else{
    			   $('span#emailCheckResult').html('<font color=red> 사용불가능 email </font>');
				}
	 		  }//success
		  });//ajax
	   });//keyup(email)
	   
	   $('input[id=nickname]').keyup(function(){
		   var input = $(this).val();
		  // alert(input);
		  	$.ajax({
		  		url: "member.do",
		  		data: "command=isNicknameExist&&nickname="+input,
		  		type: "post",
		  		
		  		success: function(result){
		  		//  alert(result.foundNick);
		  		  var found = result.found;
		  		  if(found==false){
		  			  $('span#nicknameCheckResult').html('<font color=blue>사용 가능 nickname </font>');
		  		  }else{
		  			  $('span#nicknameCheckResult').html('<font color=red>사용불가능 nickname </font>');
		  		  } 			  			
		  		}//success
		  	});//ajax
	   });//keyup(nickname)
	   $('input[id=repassword]').keyup(function(){
		   var password = $('#password').val();
		   var repassword = $(this).val();
		   //alert(password);
		   //alert(repassword);
		   if(password!=repassword){
			   $('span#repassCheckResult').html('<font color=red> 비밀번호와 일치하지 않음 </font>');
		   }else{
			   $('span#repassCheckResult').html('<font color=blue> 비밀번호와 일치  </font>');
		   }
	   }); // keyup  
	});//function
</script>
</head>
<body>
<h2 align="center">회원가입하기</h2><p>
<form name="loginForm" id="regFrm" action="member.do" method="post">
	<input type="hidden" name="command" value="login"> 
   	Email : <input type="text" name="email" required="required" id="email"> <span id="emailCheckResult"></span> <br><br>
	Password : <input type="password" name="password" required="required" id="password"><br><br> 
   	Password(check) : <input type="password" name="repassword" required="required" id="repassword"><span id="repassCheckResult"></span> <br><br>
	Username : <input type="text" name="username" required="required" id="username"><br><br> 
	Nickname : <input type="text" name="nickname" required="required" id="nickname"><span id="nicknameCheckResult"></span><br><br> 
	Address : <input type="text" name="address" required="required" id="address"><br><br> 
	<input type="button" id="registerBtn" value="등록" onclick="register()">
	<input type="submit" value="취소" onclick="cancel()"> 
</form>
</body>
</html>