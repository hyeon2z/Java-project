<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
import="frontweb.database.PreparedStmtDao"
import="frontweb.vo.Member"    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// 1. import, DAO 호출,
PreparedStmtDao dao = new PreparedStmtDao();
// 2. 요청값 처리
String id = request.getParameter("id");
if(id==null) id="";
// 3. 검색된 Member  할당
Member mem = dao.getMember(id);
// 4. 하단에 출력
%>
<h2 align="center" >아이디로 회원정보 확인</h2>
<form>
	<table align="center" width="50%" border>
		<col width="30%">
		<tr><th>아이디</th>
			<td><input type="text" name="id" value="<%=id%>"/></td></tr>			
		<tr><th colspan="2"><input type="submit" value="검색"/></td></tr>			
	</table>
</form>
<h3  align="center">회원 상세정보</h3>
<table align="center" width="80%" border>
	<%if(mem!=null){ %>
	<col width="50%">
	<tr><th>패스워드</th><td><%=mem.getPwd() %></td></tr>
	<tr><th>회원명</th><td><%=mem.getName() %></td></tr>
	<tr><th>권한</th><td><%=mem.getAuth() %></td></tr>
	<tr><th>포인트</th><td><%=mem.getPoint() %></td></tr>
	<%}else{ %>
	<tr><th>id:<%=id%>는 데이터가 없습니다.</th></tr>
	<%}%>
</table>

</body>
</html>