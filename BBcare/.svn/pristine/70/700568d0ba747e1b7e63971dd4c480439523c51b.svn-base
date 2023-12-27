<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<jsp:useBean id="gson" class="com.google.gson.Gson"/>
<jsp:useBean id="report" class="admin.vo.Report"/>
<jsp:useBean id="dao" class="admin.ReportDao"/>
<jsp:setProperty property="*" name="report"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
${gson.toJson(dao.reportList(param.status))}
