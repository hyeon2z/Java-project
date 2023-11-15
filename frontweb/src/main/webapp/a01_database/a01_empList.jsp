<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="frontweb.database.PreparedStmtDao"
	import="frontweb.Emp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사원정보조회</h2>
	<%
	PreparedStmtDao dao = new PreparedStmtDao();
	%>
	<table border>
		<tr>
			<th>사원번호</th>
			<th>사원명</th>
			<th>직책명</th>
			<th>관리자번호</th>
			<th>급여</th>
			<th>보너스</th>
			<th>부서번호</th>
		</tr>
		<%
		for (Emp emp : dao.getEmpList(new Emp("", "", 30))) {
		%>
		<tr>
			<th><%=emp.getEmpno()%></th>
			<th><%=emp.getEname()%></th>
			<th><%=emp.getJob()%></th>
			<th><%=emp.getMgr()%></th>
			<th><%=emp.getSal()%></th>
			<th><%=emp.getComm()%></th>
			<th><%=emp.getDeptno()%></th>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>