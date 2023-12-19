<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<jsp:useBean id="dao" class="user.UserDao"/>
<jsp:useBean id="users" class="user.Users"/>
<jsp:setProperty property="*" name="users"/>
{"insertUser":${dao.insertUser(users)}}
<%--http://localhost:7080/BBcare/BBcare/userAjax/insertUser.jsp?
userId=mm01&name=%EC%9E%84%EC%86%94&userName=%EB%B4%89%EB%B4%89&password=7777&
email=dla@name.com&address=%EC%A7%84%EA%B1%B4%EC%A7%B1&phoneNumber=2020&petStatus=Y&subStatus=N&subDate=&role=user--%>