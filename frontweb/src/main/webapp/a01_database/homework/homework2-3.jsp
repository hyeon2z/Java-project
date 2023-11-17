<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 	
3) **로그인 시뮬레이션**: 사용자 아이디와 비밀번호를 입력받아,
특정 아이디/비밀번호와 일치할 때 "로그인 성공"을,
그렇지 않으면 "로그인 실패"를 출력하는 페이지 만들기.
 -->
<%
String userId = "himan";
String userPwd = "7777";
String result = "";
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

if(id==null) id="아이디 입력";
if(pwd==null) pwd="비밀번호 입력";

if(userId.equals(id) && userPwd.equals(pwd)){
	result = "로그인 성공";
}else{
	result = "로그인 실패";
}

%>
<body>
<form>
	아이디 : <input type = "text" name = "id"><br>
	비밀번호 : <input type = "password" name = "pwd">
	<input type = "submit" value = "로그인">
</form>
<h2>로그인결과</h2>
<%=result %>
</body>
</html>