<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<jsp:useBean id="dao" class="backendweb.d01_dao.PreparedStmtDao"/>
<jsp:useBean id="upt" class="backendweb.z01_vo.Dept"/>
<jsp:setProperty name="upt" property="*"/> 
{"uptCnt":${dao.updateDept(upt)}}
<%--
${gson.toJson(dao.getDept(param.deptno))}

z15_deptUpt.jsp?deptno=10&dname=인사&loc=서울
 --%>  