<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 
	1) **사용자 이름 출력하기**: 사용자로부터 이름을 입력받아,
	"안녕하세요, [이름]님!" 이라고 출력하는 페이지 만들기.
-->
<%
String name = request.getParameter("name");

if(name==null) name="이름";
%>
<body>
<form>
	이름 : <input type = "text" name = "name"/><br>
	<input type = "submit" value = "입력"/>
</form>

<h2>안녕하세요, <%=name %>님!</h2>
</body>
</html>