<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"

    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<%--


 --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css" >
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css" >
<style>
	td{text-align:center;}
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function(){
		<%-- 
		
		--%>	
	});
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2>로그인</h2>
<%--
a12_login.jsp
id: @@@
pwd : @@@
	[로그인]
==> 요청값을 받아 맞으면 a13_main.jsp
	그렇지 않으면 a14_error.jsp
를 forward로 처리해보자.

# login DB 연동처리 순서
1. sql 작성
SELECT *
FROM member01
WHERE id=? AND pwd=?

2. VO작성/확인
결과의 type과 sql 문의 결과 컬럼에 따라 작성..

3. Dao 기능 메서드 처리
4. 화면 구성
5. 요청값 처리
6. Dao 호출
7. login 여부에 따라 다시 로그인
8. 해당 로그인 member 있을 때
	session 처리
9. 로그인 메인페이지 이동
	
	



 --%>
</div>
<%

String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
if(id!=null){
	if(id.equals("himan") && pwd.equals("7777")){	
%>	
		<jsp:forward page="a13_main.jsp"/>
<%	
	}else{ %>
		<jsp:forward page="a14_error.jsp"/>
<%
	}
}
%>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name="id" placeholder="아이디입력"  class="form-control mr-sm-2"/>
	    <input name="pwd" type="password" placeholder="패스워드입력" class="form-control mr-sm-2"/>
	    <button class="btn btn-info" type="submit">로그인</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>

</div>
</body>
</html>