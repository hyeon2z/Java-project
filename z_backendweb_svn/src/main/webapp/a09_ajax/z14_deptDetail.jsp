<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<jsp:useBean id="gson" class="com.google.gson.Gson"/>
<jsp:useBean id="dao" class="backendweb.d01_dao.PreparedStmtDao"/>
${gson.toJson(dao.getDept(param.deptno))}  
<%-- 
http://localhost:5080/backendweb/a09_ajax/z14_deptDetail.jsp?deptno=30
 --%>  