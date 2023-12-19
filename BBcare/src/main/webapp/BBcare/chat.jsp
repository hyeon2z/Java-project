<%@page import="chat.vo.Chat"%>
<%@page import="java.util.List"%>
<%@page import="user.Users"%>
<%@page import="user.UserDao"%>
<%@page import="chat.ChatDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" type="image/x-icon" href="images/BBcare.jpg">
<title>뽀봉케어</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
<script>
	$(document).ready(function() {
		
	})
	/* function showChat() {
		$.ajax({
			url : "",
			data : "",
			dataType : "json"
			
		})
	} */
</script>
<%
ChatDao chatDao = new ChatDao();
UserDao userDao = new UserDao();
Users user = userDao.getUser("dlathf0202");
List<Chat> chatList = chatDao.getChatList(user);
%>
<body>
	<!-- 상단바 -->
	<jsp:include page="module_top.jsp" flush="true" />
	
	<div>
		<h2>채팅 테수투~</h2>
	</div>
	<% for (Chat chat : chatList) { %>
	<div>
		<div><%= chat.getChat() %></div>
		<div><%= chat.getUser01().getName() %></div>
		<div><%= chat.getSendDate() %></div>
	</div>
	<% } %>
	<form>
		<input name="chat" />
	</form>
	
</body>
</html>