<%@page import="java.awt.event.FocusAdapter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="login.*"
    import="login.vo.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     

<%
MemberDao dao = new MemberDao();
UpdateMemDao dao1 = new UpdateMemDao();
if (session != null) {
    String userId = (String) session.getAttribute("User");

    if (userId != null) {
        // 사용자가 수정한 정보를 받아오기
        String newPassword = request.getParameter("changePwd");
        String newPhoneNum = request.getParameter("changePhoneNum");
        String newAddress = request.getParameter("changeAddress");

        // 기존 회원 정보 mem
        Member mem = dao.getMemberInfo(userId);

        // 수정된 정보로 업데이트하기
        if (newPassword != null && !newPassword.isEmpty()) {
            mem.setPwd(newPassword);
        }
        if (newPhoneNum != null && !newPhoneNum.isEmpty()) {
            mem.setPhonenum(newPhoneNum);
        }
        if (newAddress != null && !newAddress.isEmpty()) {
            mem.setAddress(newAddress);
        }

        // 업데이트된 정보 DB 반영
        dao1.updateMem(mem);
    }
}
response.sendRedirect("mypage.jsp"); // 수정이 완료된 후 마이페이지로 리다이렉트
%>