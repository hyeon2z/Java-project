<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="dao" class="backendweb.d01_dao.MemberDao"/>
<jsp:useBean id="mem" class="backendweb.z01_vo.Member"/>
<jsp:setProperty property="*" name="mem"/>
<c:set var="m" value="${dao.getMember(param.mno)}"/>
   
<tr><td>${m.mno}</td><td>${m.name}</td><td>${m.id}</td><td>${m.pwd}</td><td>${m.auth}</td><td>${m.point}</td></tr>
