<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"
    import="backendweb.d01_dao.*"    
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




 --%>
</div>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String logSuc = "";
if(id!=null){ // 초기 아이디 패스워드 입력 전 화면과 구분..
	PreparedStmtDao dao = new PreparedStmtDao();
	Member mem = dao.login(id, pwd);	
	if( mem!=null ){	
		logSuc = "Y";
		session.setAttribute("member", mem); // 로그인 성공하였기에
	}else{ 
		logSuc = "N";
	}
	
	
}
%>
<script type="text/javascript">
	var logSuc = "<%=logSuc%>";
	if(logSuc=="Y"){
		alert("로그인 성공")
		location.href="a13_mainSession.jsp";
	}
	if(logSuc=="N"){
		alert("로그인 실패\n다시 로그인 하세요!");
	}
</script>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name="id" placeholder="아이디입력"  class="form-control mr-sm-2"/>
	    <input name="pwd" type="password" placeholder="패스워드입력" class="form-control mr-sm-2"/>
	    <button class="btn btn-info" type="submit">로그인</button>
 	</nav>
	</form>
</div>
</body>
</html>
