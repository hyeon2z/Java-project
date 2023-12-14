<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="gson" class="com.google.gson.Gson"/>
<jsp:useBean id="dao" class="backendweb.d01_dao.PreparedStmtDao"/>
<jsp:useBean id="emp" class="backendweb.z01_vo.Emp"/>

<jsp:setProperty property="*" name="emp"/>
<c:if test="${empty emp.ename}">${emp.setEname("")}</c:if>
<c:if test="${empty emp.job}">${emp.setJob("")}</c:if>
${gson.toJson(dao.getEmpList(emp))}
<%--
<c:forEach var="e" items="${dao.getEmpList(emp)}">
	<tr>
		<td>${e.empno }</td>
		<td>${e.ename }</td>
		<td>${e.job }</td>
		<td>${e.mgr }</td>
		<td><fmt:formatDate value="${e.hiredate}"/></td>
		<td><fmt:formatNumber value="${e.sal}"/></td>
		<td>${e.comm}</td>
		<td>${e.deptno}</td>
	</tr>
</c:forEach>
 --%>