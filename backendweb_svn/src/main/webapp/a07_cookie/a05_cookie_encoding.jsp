<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" import="backendweb.z01_vo.*"
	import="backendweb.d01_dao.*"
	import="java.net.URLEncoder"
	import="java.net.URLDecoder"
	%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<!DOCTYPE html>
<%--
# 쿠키의 encoding/decoding처리
1. 쿠키는 2byte이상의 데이터를 저장하지 못한다.
2. 그래서 한글의 경우 encoding하여 저장후, 다시 가져와서 확인할 때는 
	decoding하여 출력하여야 한다.
3. encoding 처리를 위한 코드
	import java.net.URLEncoder
	new Cookie( URLEncoding.encoding("키","utf-8"), 
				URLEncoding.encoding("값","utf-8") );
4. decoding 처리를 위한 코드
	import java.net.URLDecoder
	String key = URLDecoder.decode(c1.getName(),"utf-8");		
	String val = URLDecoder.decode(c1.getValue(),"utf-8");		
 --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css">
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css">
<style>
td {
	text-align: center;
}
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script
	src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api"
	type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {

	});
</script>
</head>

<body>
	<div class="jumbotron text-center">
		<h2>한글 쿠키값 설정</h2>

	</div>
	<%-- 
		
    --%>
    <%
    String cookieKey = request.getParameter("cookieKey");
    
    String cookieVal = request.getParameter("cookieVal");
    // 쿠키의 key와 val을 한글로 encoding 처리
    if(cookieKey!=null&&cookieVal!=null){
    	Cookie ck = new Cookie(
    			               URLEncoder.encode(cookieKey,"utf-8"), 
    			               URLEncoder.encode(cookieVal,"utf-8") 
    			              );
    	response.addCookie(ck);
    	%>
    	<script>
    		alert("쿠키 한글로 추가 성공\n쿠키값 확인하러가기")
    		location.href="a06_cookie_decoding.jsp";
    	</script>
    	<%
    } 
    %>
	<div class="container">
		<form id="frm01" class="form" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input placeholder="쿠키의 키(한글)" 
						name="cookieKey" class="form-control mr-sm-2" /> 
				<input placeholder="쿠키의 값(한글)" 
						name="cookieVal" class="form-control mr-sm-2" />
				<button class="btn btn-info" type="submit">쿠키값등록</button>
			</nav>
		</form>
	</div>
</body>
</html>