<%@page import="chat.vo.Chat"%>
<%@page import="java.util.List"%>
<%@page import="user.Users"%>
<%@page import="user.UserDao"%>
<%@page import="chat.ChatDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" type="image/x-icon" href="images/BBcare.jpg">
<title>뽀봉케어</title>
<meta name="google" content="notranslate">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/bootstrap-datepicker.css">
<link rel="stylesheet" href="css/jquery.timepicker.css">
<link rel="stylesheet" href="css/flaticon.css">
<link rel="stylesheet" href="css/style.css">
</head>
<style>
body {
	padding-top: 30px;
	text-align: center;
}
.closeBtn:hover {
    border: 1px solid #FFF7D7;
    color: #FFF7D7;
}
.closeBtn {
    background: #FFC35A;
    border: 1px solid #FFC35A;
    color: #fff;
}
.closeBtn:not(:disabled):not(.disabled) {
    cursor: pointer;
}
</style>
<body>
<%
UserDao dao = new UserDao();

if (session != null) {
	String userId = (String) session.getAttribute("userId");
	String role = (String) session.getAttribute("role");
	String username = dao.getUserName(userId);
	session.setAttribute("userName",username);
	String sub = dao.checkSub(userId);
	if (userId != null) {
%>
<%
String searchUser = request.getParameter("userId");
Users userInfo = dao.getUser(searchUser);
%>
<div style="color: black;"><%= userInfo.getUserName() %>(<%= userInfo.getName() %>)</div>
<div>(<%= userInfo.getUserId() %>)</div>
<div><%= userInfo.getEmail() %></div>

<%-- <jsp:useBean id="user01" class="user.Users" />
<jsp:setProperty property="*" name="user" value="${ chatDao.getUsers(param.userId) }"/>

<div>${ user.userId }</div> --%>
<%if(role.equals("admin"))  { %>
<div><%= userInfo.getPhoneNumber() %></div>
<div><%= userInfo.getAddress() %></div>
<%} %>
<button type="button" class="closeBtn" onclick="window.close()">닫기</button>
<%} else { %>
		<script>
		alert("로그인 후 이용 가능합니다.")
		location.href="index.jsp"
		</script>
	<% } }%>
	

<script src="js/jquery-migrate-3.0.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/jquery.waypoints.min.js"></script>
<script src="js/jquery.stellar.min.js"></script>
<script src="js/jquery.animateNumber.min.js"></script>
<script src="js/bootstrap-datepicker.js"></script>
<script src="js/jquery.timepicker.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/scrollax.min.js"></script>
<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
<script src="js/google-map.js"></script>
<script src="js/main.js"></script>


	
</body>
</html>