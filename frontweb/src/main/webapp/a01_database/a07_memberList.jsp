<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
import = "frontweb.database.MemberDao"
import = "frontweb.vo.Member"   
    %>
<%
MemberDao dao = new MemberDao();
String name = request.getParameter("name");
if(name==null) name = "";
String auth = request.getParameter("auth");
if(auth==null) auth = "";
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/frontweb/com/a03_comm.css">
<style type="text/css">


</style>
<script src="/frontweb/com/jquery-3.6.0.js"></script>

<script>
$(document).ready( function(){
	
})
</script>
</head>
<body>
<h2 align="center">회원정보조회</h2>


<form>
<table  class="customers"  width="40%" border align="center">
	<col width="40%">
	<col width="60%">
	<tr><th class="th_form" >회원명</th><td><input type="text" name="name" 
							value="<%=name%>"/></td>
	<tr><th class="th_form" >권한</th><td><input type="text" name="auth" value="<%=auth%>"/></td>
	<tr><th class="th_form"  colspan="2">
			<input type="submit"  value="검색"/>
			<input type="button" value="등록화면" 
				onclick="location.href='a07_memberInsert.jsp'"
			/>
			</th>
</table>
</form>


<table class="customers" width="80%" border  align="center">
	<tr><th>회원번호</th><th>아이디</th><th>회원명</th><th>권한</th>
		<th>포인트</th></tr>
	<%
	for(Member mem:dao.getMemberList(name, auth)){ %>		
	<tr ondblclick="goPage(<%=mem.getMno()%>)">
		<td><%=mem.getMno()%></td>	
		<td><%=mem.getId()%></td>	
		<td><%=mem.getName()%></td>
		<td><%=mem.getAuth()%></td>
		<td><%=mem.getPoint()%></td></tr>
	<%}%>			
</table>
<script type="text/javascript">
	function goPage(mno){
		location.href="a07_memberDetail.jsp?mno="+mno;
	}
	
</script>	
</body>
</html>


