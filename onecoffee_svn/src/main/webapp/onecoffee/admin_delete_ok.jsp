<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"
    import= "admin.vo.*"
    import= "admin.*"
    import= "admin.MenuDao"
    import= "admin.vo.Menu"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<%
MenuDao dao = new MenuDao();

int no = 0;
String noStr = request.getParameter("no");
if(noStr!=null) no = Integer.parseInt(noStr);


try {
	dao.deleteMenu(no);
}
catch (Exception e) {
	
} 
finally {
}
%>
<script>
alert("메뉴가 삭제되었습니다.");
location.href = "admin_list.jsp";
</script>