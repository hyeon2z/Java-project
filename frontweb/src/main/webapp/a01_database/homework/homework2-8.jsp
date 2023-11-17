<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="frontweb.database.PreparedStmtDao"
	import="frontweb.vo.EmpHomework"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 
3) 특정 기간에 입사한 직원 조회: 
EMP 테이블을 사용하여 
@@@@/@@/@@ 부터 @@@@/@@/@@ 
사이에 입사한 직원들의 목록을 조회하는 쿼리 작성.
	입사일:[@@@@/@@/@@] ~ [@@@@/@@/@@] [검색]
	사원번호 사원명 직책 입사일(@@@/@@/@@표시) 부서번호
 -->
<%
PreparedStmtDao dao = new PreparedStmtDao();
String start = request.getParameter("start");
if (start == null)
	start = "";
String end = request.getParameter("end");
if (end == null)
	end = "";
%>
<body>
	<h2>직원 조회</h2>
	<form>
		첫번째 날짜 입력 : <input type="date" name="start"> 두번째 날짜 입력 : <input
			type="date" name="end"> <input type="submit" value="검색">
	</form>

	<h2>조회결과</h2>
	<table border align="center">
		<tr>
			<th>사원번호</th>
			<th>사원명</th>
			<th>직책</th>
			<th>입사일</th>
			<th>부서번호</th>
		</tr>
		<%
		for (EmpHomework eh : dao.getEmpMem2(start, end)) {
		%>
		<tr>
			<th><%=eh.getEmpno()%></th>
			<th><%=eh.getEname()%></th>
			<th><%=eh.getJob()%></th>
			<th><%=eh.getHiredate()%></th>
			<th><%=eh.getDeptno()%></th>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>