<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
     import = "frontweb.database.PreparedStmtDao"
     import = "frontweb.vo.Member"
    %>
<%
PreparedStmtDao dao = new PreparedStmtDao();

String mnoStr = request.getParameter("mno");
int mno = 0;
if(mnoStr!=null) mno = Integer.parseInt(mnoStr);

String name = request.getParameter("name");
if(name==null) name = "";
String id = request.getParameter("id");
if(id==null) id = "";
String pwd = request.getParameter("pwd");
if(pwd==null) pwd = "";
String auth = request.getParameter("auth");
if(auth==null) auth = "";
String pointStr = request.getParameter("point");
int point = 0;
if(pointStr!=null) point = Integer.parseInt(pointStr);
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.1.1.js"></script>
<script>

</script>
</head>
<body>
    <h2 align ="center">멤버조회</h2>

	<form>
	<table width = "40%" border align ="center">
		<col width = "40%">
		<col width = "60%">
		<tr><th>이름</th><td><input type="text" name="name" value="<%=name%>"/></td></tr>
		<tr><td colspan="2">
		<input type="submit" value="검색"/>
		<input type="button" value="등록화면"
		onclick="location.href = 'z01_memberInsert.jsp'"
		/>
		</td></tr>
	</table>
	</form>

	<table width = "80%" border align ="center">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>아이디</th>
			<th>패스워드</th>
			<th>권한</th>
			<th>포인트</th>
		</tr>
		<%
		for (Member member : dao.getMemberList(name)) {
		%>
		<tr ondblclick="goPage(<%=member.getMno()%>)">
			<th><%=member.getMno()%></th>
			<th><%=member.getName()%></th>
			<th><%=member.getId()%></th>
			<th><%=member.getPwd()%></th>
			<th><%=member.getAuth()%></th>
			<th><%=member.getPoint()%></th>
		</tr>
		<%
		}
		%>
	</table>
	<script type = "text/javascript">
		function goPage(mno){
			// alert(mno)
			location.href = "z01_memberDetail.jsp?mno="+mno;
		}
	</script>

</body>
</html>