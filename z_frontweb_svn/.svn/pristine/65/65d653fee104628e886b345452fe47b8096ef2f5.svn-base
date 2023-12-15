<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import = "frontweb.database.MemberDao"
	import = "frontweb.vo.Member"     
    %>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String name = request.getParameter("name");
String auth = request.getParameter("auth");
String pointStr = request.getParameter("point");
int point = 0; if(pointStr!=null) point = Integer.parseInt(pointStr);
// 숫자형 데이터 초기화
boolean isInsert = false;
if( id!=null ){
	MemberDao dao = new MemberDao();
	dao.insertMember(new Member(0, name, id,  pwd, auth, point));
	isInsert = true;
}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/frontweb/com/a03_comm.css">
<script src="/frontweb/com/jquery-3.6.0.js"></script>
<script>
var isInsert = <%=isInsert%>;
if(isInsert){
	if( !confirm("등록 성공\n계속 등록하시겠습니까?")){
		location.href="a07_memberList.jsp";
	}
}

$(document).ready( function(){
	$("th").addClass("th_form");
	$("h2").text("회원정보등록");
})
</script>
</head>
<body>
    <h2 align="center"></h2>
    <form>
    <table  class="customers"   align="center" border width="50%">
    	<col width="40%"> 
    	<tr><th>회원아이디</th><td><input type="text" name="id"/></td></tr>
    	<tr><th>패스워드</th><td><input type="text" name="pwd"/></td></tr>
    	<tr><th>회원명</th><td><input type="text" name="name"/></td></tr>
    	<tr><th>권한</th><td><input type="text" name="auth"/></td></tr>
    	<tr><th>포인트</th><td><input type="number" name="point"/></td></tr>
    	<tr><th colspan="2">
				<input type="submit" value="등록"/>
				<input type="button" value="메인리스트화면" 
					onclick="location.href='a07_memberList.jsp'"/>    	
    		</th></tr>
    </table>
    </form>
</body>
</html>