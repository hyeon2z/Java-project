<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="frontweb.database.PreparedStmtDao"
	import="frontweb.Dept"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">부서정보</h2>
	<%
	// 1. import 처리 Dao, VO
	// 2. 요청값 처리 부서명과 부서위치 value값 설정
	// 3. dao.getDeptList(new Dept(부서명,부서위치)) for each 구문 반복 처리
	// 테이블 출력 처리
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	if (dname == null)
		dname = "";
	if (loc == null)
		loc = "";

	PreparedStmtDao dao = new PreparedStmtDao();
	%>
	<form>
		<table align="center" width="50%" border>
			<col width="30%">
			<tr>
				<th>부서명</th>
				<td><input type="text" name="dname" /></td>
			</tr>
			<tr>
				<th>부서위치</th>
				<td><input type="text" name="loc" /></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="검색"></th>
			</tr>
		</table>
	</form>
	<%
	for (Dept dept : dao.getDeptList(dname, loc)) {
	%>
	<table align="center" width="80%" border>
		<col width="33%">
		<col width="33%">
		<col width="34%">
		<tr>
			<th>부서번호</th>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		<tr>
			<th><%=dept.getDeptno()%></th>
			<th><%=dept.getDname()%></th>
			<th><%=dept.getLoc()%></th>
		</tr>
	</table>
	<%
	}
	%>
</body>
</html>