<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<jsp:useBean id="gson" class="com.google.gson.Gson"/>
<jsp:useBean id="report" class="admin.vo.Report"/>
<jsp:useBean id="dao" class="admin.ReportDao"/>
<jsp:setProperty property="*" name="report"/>
{"uptCnt":${dao.updateStatus(param.status, param.reportID)}}