<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

</script>
<style type="text/css">

</style>
</head>
<body>
<h2 align="center">${mvo.email}의 정보조회 페이지</h2><p>
	<table border="2px">
		<tr>
			<td>email</td>
			<td>password</td>
			<td>username</td>
			<td>nickname</td>
			<td>address</td>
		</tr>
		<tr>
			<td>${mvo.email}</td>
			<td>${mvo.password}</td>
			<td>${mvo.username}</td>
			<td>${mvo.nickname}</td>
			<td>${mvo.address}</td>
		</tr>
	</table>
	<p>
	<a href="checkPasswordForMemberUpdate.jsp?email=${mvo.email}">정보수정하기</a>

<%-- <form name="showMemberInfoForm" action="member.do" method="post">
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
</form>--%>

</body>
</html>