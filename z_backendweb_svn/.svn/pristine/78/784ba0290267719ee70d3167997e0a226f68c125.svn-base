<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="gb" class="com.google.gson.GsonBuilder" />
<jsp:useBean id="dao" class="backendweb.d01_dao.PreparedStmtDao"/>
<c:set var="gson" value='${gb.setDateFormat("yyyy-MM-dd").create()}'/>
${gson.toJson(dao.getEmp(param.empno))}    