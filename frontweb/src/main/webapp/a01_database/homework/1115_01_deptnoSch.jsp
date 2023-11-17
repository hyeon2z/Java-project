<%@page import="frontweb.Emp"%>
<%@page import="frontweb.homework.A1115Dao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
String deptnoStr = request.getParameter("deptno");
int deptno = 10;
if(deptnoStr != null) deptno = Integer.parseInt(deptnoStr);
A1115Dao dao = new A1115Dao();
List<Emp> empList = dao.getEmpListByDeptno(deptno);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript" src = "jquery-3.1.1.js"></script>
<script type = "text/javascript">
	$(document).ready(function(){
		$("[name=deptno]").val("<%=deptno%>");
		// 부서번호 select를 변경할 때 이벤트
		$("[name=deptno]").change(function(){
			// form에 있는 내용을 전송 처리, submit버튼을 클릭한 것과 동일
			$("form").submit();
		});
	})
</script>
</head>
<body>
	<h4>부서번호를 통한 사원정보 조회 : <%=deptno %></h4>
	<form>
		부서번호 : <select name="deptno">
			<option>10</option>
			<option>20</option>
			<option>30</option>
			<option>40</option>
		</select> <input type="submit" value="조회">
	</form>
	<table border>
		<tr>
			<th>사원번호</th>
			<th>사원명</th>
			<th>급여</th>
			<th>부서번호</th>
		</tr>
		<%for(Emp emp:empList){ %>
		<tr>
			<th><%=emp.getEmpno() %></th>
			<th><%=emp.getEname() %></th>
			<th><%=emp.getSal() %></th>
			<th><%=emp.getDeptno() %></th>
		</tr>
		<%} %>
	</table>
</body>
</html>