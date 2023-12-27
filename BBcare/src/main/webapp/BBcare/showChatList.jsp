<%@page import="java.util.List"%>
<%@page import="user.Users"%>
<%@page import="user.UserDao"%>
<%@page import="chat.ChatDao"%>
<%@page import="chat.vo.Chat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
UserDao dao = new UserDao();

if (session != null) {
	String userId = (String) session.getAttribute("userId");
	String role = (String) session.getAttribute("role");
	String username = dao.getUserName(userId);
	session.setAttribute("userName",username);
	if (userId != null /* && role.equals("user") */) {
%>
<%
ChatDao chatDao = new ChatDao();
UserDao userDao = new UserDao();
Users user = userDao.getUser(userId);
List<Chat> chatList = chatDao.getAdminChatList();
%>
<%
for (Chat chat : chatList) {
%>
<div id="chat" onclick="clickList('<%=chat.getUser01().getUserId()%>')">
	<div><%=chat.getUser01().getName()%></div>
	<div><%=chat.getChat()%></div>
	<div><%=chat.getSendDate()%></div>
</div>
<%
} }}
%>