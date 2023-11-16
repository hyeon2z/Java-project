<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
import = "frontweb.vo.Member" 
import="frontweb.database.PreparedStmtDao"   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">아이디로 회원정보 확인</h2>
<%
// 1. import, DAO호출
// 2. 요청값 처리
// 3. 검색된 Member 할당
// 4. 하단에 출력
PreparedStmtDao dao = new PreparedStmtDao();
String id = request.getParameter("id");
if(id==null)
	id = "";
%>
<form>
	<table align="center" width = "50%" border>
		<col width="30%">
		<tr><th>아이디</th><td><input type = "text" name = "id"/></td></tr>
		<tr><th colspan="2"><input type = "submit" value ="검색"/></th></tr>
	</table>
</form>
<h3 align="center">회원 상세정보</h3>
<%
Member mem = dao.getMember(id);
if(mem!=null){
%>
<table align="center" width="80%" border>
	<col width="50%">
	<tr><th>패스워드</th><td><%=mem.getPwd() %></td></tr>
	<tr><th>회원명</th><td><%=mem.getName() %></td></tr>
	<tr><th>권한</th><td><%=mem.getAuth() %></td></tr>
	<tr><th>포인트</th><td><%=mem.getPoint() %></td></tr>
</table>
<%
}
%>
</body>
</html>