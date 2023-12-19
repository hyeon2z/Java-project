<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<jsp:useBean id="gson" class="com.google.gson.Gson"/>
<jsp:useBean id="users" class="user.Users"/>
<jsp:useBean id="dao" class="admin.UserManageDao"/>
<jsp:setProperty property="*" name="users"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
${gson.toJson(dao.searchUsers(param.query))}
