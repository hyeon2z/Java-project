<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="backendweb.d01_dao.PreparedStmtDao"/>
<jsp:useBean id="emp" class="backendweb.z01_vo.EmpDTO"/>
<jsp:setProperty property="*" name="emp"/>
{"insEmp": ${dao.insertEmp01(emp)}}

<%-- 
{"insDept":${not empty dept.dname and dao.insertDept(dept)>0?"등록성공":"등록실패"}}
--%>
<%-- z13_deptInsert.jsp?deptno=11&dname=재무&loc=부산 --%>