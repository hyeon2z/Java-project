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
1)[선택]  부서번호별 직원 조회:
EMP와 각 부서 번호에 해당하는 직원들의 이름과 
부서번호를 조회하는 쿼리 작성.
	   부서번호 [10~40  ] [조회] 
       사원번호 사원명  급여  부서번호
 -->
<%
PreparedStmtDao dao = new PreparedStmtDao();
String deptnoStr = request.getParameter("deptno");
int deptno = 0;
if(deptnoStr!=null) deptno = Integer.parseInt(deptnoStr);
%>
<body>
	<h2>직원 조회</h2>
	<form>
	부서번호 입력 : <input type = "text" name = "deptno" value = <%=deptno%>>
	<input type = "submit" value = "검색"/>
	</form>
	<table border align = "center">
	<tr><th>사원번호</th><th>사원명</th><th>급여</th><th>부서번호</th></tr>
	<%
	for (Emp emp : dao.getEmpList2(deptno)){
	%>
	<tr><th><%=emp.getEmpno() %></th><th><%=emp.getEname() %></th><th><%=emp.getSal() %></th><th><%=emp.getDeptno() %></th></tr>
	
	<%
	}
	%>
	</table>
</body>
</html>