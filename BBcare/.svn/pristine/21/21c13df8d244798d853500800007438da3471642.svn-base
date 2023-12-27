<%@page import="java.util.List"%>
<%@page import="user.Users"%>
<%@page import="user.UserDao"%>
<%@page import="chat.ChatDao"%>
<%@page import="chat.vo.Chat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:useBean id="chatDao" class="chat.ChatDao" />
<jsp:useBean id="userDao" class="user.UserDao" />
<jsp:useBean id="chat" class="chat.vo.Chat" />
<%-- <jsp:setProperty name="chat" property="*" />
<jsp:useBean id="user01" class="user.Users" />
<jsp:setProperty property="userId" name="user01" value="${ param.user01 }"/>
<jsp:useBean id="user02" class="user.Users" />
<jsp:setProperty property="userId" name="user02" value="${ param.user02 }"/> --%>
<jsp:useBean id="user01" class="user.Users" />
<jsp:setProperty property="userId" name="user01" value="${ param.user01 }"/>
<jsp:useBean id="user02" class="user.Users" />
<jsp:setProperty property="userId" name="user02" value="${ param.user02 }"/>
<%-- <%
Users user01 = userDao.getUser("dlathf0202");
Users user02 = userDao.getUser("hyeon2");
String chat = "" ;

chatDao.insertChat(chat, user01, user02);

%> --%>
{"insChat" : ${ chatDao.insertChat(param.chat, user01, user02) } }
