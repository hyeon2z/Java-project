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

if (session != null) {
    String userId = (String) session.getAttribute("User");

    if (userId != null) {

		String password = request.getParameter("pwd");
		
		// 회원 삭제를 위한 DAO 호출
		DeleteMemDao deleteDao = new DeleteMemDao();
		Member deleteMem = new Member();
		deleteMem.setId(userId);
		deleteMem.setPwd(password);
		
		int Result = deleteDao.deleteMem(deleteMem);
		
		if (Result > 0) {
		    // 삭제 성공
		    session.invalidate();
		    out.println("<script>alert('성공적으로 탈퇴처리 되었습니다.'); window.location.href = 'index02.jsp';</script>");
		} else {
		    // 삭제 실패
		    out.println("<script>alert('회원탈퇴 실패. 비밀번호를 확인하세요.'); history.back();</script>");
		}
    }
}
%>