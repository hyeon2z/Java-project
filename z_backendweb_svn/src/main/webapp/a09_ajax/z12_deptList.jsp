<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<jsp:useBean id="gson" class="com.google.gson.Gson"/>
<jsp:useBean id="dao" class="backendweb.d01_dao.PreparedStmtDao"/>
${gson.toJson(dao.getDeptList(param.dname,param.loc))}

<%--
# gson lib 사용
1. 주요기능 : 자바의 객체를 ajax에서 사용되는 json문자열로 변경처리.
2. 사용방법
	1) lib를 위치시킴:WEB-INF\lib\gson-2.8.2.jar
	2) import, usebean사용시는 해당 패키지와 클래스 생성
	3) toJson(객체)를 통해서 객체를 json데이터변경..
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach var="d" items="${dao.getDeptList(param.dname,param.loc)}" >
	<tr><td>${d.deptno}</td><td>${d.dname}</td><td>${d.loc}</td></tr>
</c:forEach>
z12_deptList.jsp?dname=O&loc=YORK
 --%>


			       
    