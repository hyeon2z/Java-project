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

// 전송받은 값들을 변수에 대입
//

int price = 0;
String noStr = request.getParameter("price");
if(noStr!=null) price = Integer.parseInt(noStr);

String category = request.getParameter("category");
if(category==null) category = "";

String name = request.getParameter("name");
if(name==null) name = "";

String drink_type = request.getParameter("drink_type");
if(drink_type==null) drink_type = "";

String detail = request.getParameter("detail");
if(detail==null) detail = "";

// DB의 no 값 중에 최대값을 가져오는 함수를 통해 값 가져와서 1을 더해서 입력할수 있도록 변수를 만
int no = 0;
noStr = request.getParameter("no");
if(noStr!=null) no = Integer.parseInt(noStr);


// 메뉴 입력
try {
	dao.updateMenu(new Menu(
			no,category,name,drink_type,price,detail));
}
catch (Exception e) {
	
} 
finally {
}
%>
<script>
alert("메뉴가 수정되었습니다.");
location.href = "admin_list.jsp";
</script>