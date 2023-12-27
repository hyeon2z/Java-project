<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"
    import="community.vo.Board"
    import="community.BoardDao"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<%
BoardDao dao = new BoardDao();

int no = 0;
String noStr = request.getParameter("no");
if(noStr!=null) no = Integer.parseInt(noStr);
String userId = "";
if (session != null) {
	userId = (String) session.getAttribute("userId");
}

try {
	dao.deleteBoard(no,userId); // 게시글 번호와 글작성한 회원의 아이디를 넘겨줌
}
catch (Exception e) {
	
} 
finally {
}
%>
<script>
alert("게시글이 삭제되었습니다.");
location.href = "Board.jsp";
</script>