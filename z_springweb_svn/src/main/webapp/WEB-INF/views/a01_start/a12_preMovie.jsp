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
		$("form").on("keypress",function(e){
			if(e.keyCode==13){   //  enter키의 keycode는 13
				e.preventDefault() // enter키의 기본 동작을 중단 처리
			}
		})		
	});
</script>
</head>

<body>
	<div class="jumbotron text-center">
		<h2>영화 예약 정보</h2>

	</div>
	<%-- 
		
    --%>
	<div class="container">
		<form id="frm01" class="form" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input type="date" placeholder="날짜" name="date" class="form-control mr-sm-2" /> 
				<input placeholder="영화제목" name="name" class="form-control mr-sm-2" />
				<input type="number" placeholder="예약인원" name="cnt" class="form-control mr-sm-2" />
				<button class="btn btn-info" type="submit">예약</button>
			</nav>
		</form>
		<table class="table table-hover table-striped">
			<col width="33%">
			<col width="34%">
			<col width="33%">
			<thead><tr class="table-success text-center">
					<th>예약일</th>
					<th>제목</th>
					<th>예약인원</th>
				</tr>
			</thead>
			<tbody><%-- @ModelAttribute("m01) Movie m01로 설정했기에 --%>
				<c:if test="${not empty m01.date}">
				<tr>
					<td>${m01.date}</td>
					<td>${m01.name}</td>
					<td>${m01.cnt}</td>
				</tr>
				</c:if>
			</tbody>
		</table>

	</div>
</body>
</html>