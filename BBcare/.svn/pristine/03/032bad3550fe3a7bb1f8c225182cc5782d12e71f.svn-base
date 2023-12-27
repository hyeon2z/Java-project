<%@page import="user.UserDao"%>
<%@ page language="java" contentType="application/json; charset=UTF-8" %>
<jsp:useBean id="dao" class="user.UserDao"/>

<%
String userId = request.getParameter("userId");
int delSubResult = dao.deleteSubNow(userId);

// 삭제가 성공했을 때에만 업데이트 실행
if (delSubResult > 0) {
    dao.updateUserSubN(userId);
}

// JSON 응답 생성
response.setContentType("application/json");
response.setCharacterEncoding("UTF-8");
out.print("{\"delSub\":" + delSubResult + "}");
%>