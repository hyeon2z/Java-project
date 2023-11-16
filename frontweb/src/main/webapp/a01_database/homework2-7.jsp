<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8" import="frontweb.database.PreparedStmtDao"
	import="frontweb.Emp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 
2) 직책명 [     ]
   입사분기 [1~4 ]  [조회]
   사원번호 사원명 직책명 입사분기 입사일
 -->
<%
PreparedStmtDao dao = new PreparedStmtDao();
String job = request.getParameter("job");
String hire = request.getParameter("hire");

if (job == null)
	job = "";
if (hire == null)
	hire = "";
%>
<body>
	<h2>직원 조회</h2>
	<form>
		<input type="text" name="job"> <input type="text" name="hire">
		<input type="submit" value="조회">

		<table border align="center">
			<tr>
				<th>사원번호</th>
				<th>사원명</th>
				<th>직책명</th>
				<th>입사분기</th>
				<th>입사일</th>
			</tr>
			<%
			for (Emp emp : dao.getEmpMem(job, hire)) {
			%>
			<tr>
				<th><%=emp.getEmpno()%></th>
				<th><%=emp.getEname()%></th>
				<th><%=emp.getJob()%></th>
				<th><%=emp.getHire()%></th>
				<th><%=emp.getHiredate()%></th>
			</tr>
			<%
			}
			%>
		</table>
	</form>
</body>
</html>