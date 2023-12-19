<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
    %>
<%@ page isErrorPage="true" %>
<%-- isErrorPage="true"일때만, exception 사용가능 --%>    
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
<title>에러페이지</title>
<style>
	td{text-align:center;}
	body {
		text-align: center !important;
	}
</style>
</head>

<body>
	<!-- 상단바 -->
	<jsp:include page="module_top.jsp" flush="true"/>
	
	<div>
		<h2>에러 처리 페이지</h2>
	</div>
	<div>
		
		<%-- <table>
			<col width="30%">
			<col width="70%">
			<thead>
				<tr>
					<th>에러타입</th>
					<th>에러메시지</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</table> --%>
		<%if(exception!=null){ %>
			에러 타입 : <%=exception.getClass().getName() %> <br>
			에러 내용 : <%= exception.getMessage() %>
		<% } %>
		
		<%-- <% } else { 
			<h3>아직 예외없음/테스트 중!</h3>
		<% } %> --%>
	</div>
	<img src="images/error.jpg" style="width: 30%; height: 30%;">
	
</body>
</html>