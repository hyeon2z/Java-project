<%@page import="user.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<jsp:useBean id="dao" class="user.UserDao"/>
{"delPet":${dao.deletePet(param.petNo)}}