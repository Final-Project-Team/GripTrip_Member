<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>gripTrip home</title>
<script type="text/javascript">

</script>
<style type="text/css">

</style>
</head>
<body>
	<c:choose>
	<%-- 	<c:when test="${session.mvo}!=null">	
			<h2 align="center">로그인 했을 때</h2><p><p>	
			<a href="member.do?command=showMemberInfo&&email=${session.mvo.email}">개인정보조회 페이지로 이동</a><p>	
			<a href="member.do?command=logout">로그아웃</a>
		</c:when>
	 --%>
	 
	 	<c:when test="${sessionScope.mvo!=null}">
		 	<h2 align="center">로그인</h2>
			<a href="member.do?command=showMemberInfo&&email=${sessionScope.mvo.email}">개인정보 조회페이지 이덩 </a><p>
			<a href="member.do?command=logout">logout!!!!!</a>	 	
	 	</c:when>	
	
		<%-- <c:otherwise>
			<h2 align="center">로그인 아니 했을 때</h2><p><p>
			<a href="registerMember.jsp">회원가입 페이지로 이동</a><p>
			
			<form name="loginForm" action="member.do" method="post">
				<input type="hidden" name="command" value="login"> 
			   	Email :    <input type="text" name="email"> <br><br>
				Password : <input type="password" name="password"><br><br> 
				<input type="submit" value="로그인">
			</form>	
		</c:otherwise>
		 --%>
		<c:otherwise>
			<h2 align="center"> 로그인 하지 아니 하였을 때</h2>
			<a href="registerMember.jsp">회원가입 페이지로 이동</a><p><br>
			
			<form action="member.do" name="loginFrm" method="post">
				<input type="hidden" name="command" value="login">
				Email : <input type="text" name="email" ><p>
				Password : <input type="password" name="password" ><p>
				<input type="submit" value="로그인">
			</form>
		</c:otherwise>
	</c:choose>				
			
</body>
</html>