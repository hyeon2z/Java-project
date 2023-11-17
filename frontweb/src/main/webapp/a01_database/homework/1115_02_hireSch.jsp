<%@ page import="frontweb.Emp"%>
<%@ page import="frontweb.homework.A1115Dao"%>
<%@ page import="frontweb.vo.EmpHire"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String job = request.getParameter("job");
if (job == null)
	job = "";
String hire_qua = request.getParameter("hire_qua");
if (hire_qua == null)
	hire_qua = "1";
A1115Dao dao = new A1115Dao();
%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="jquery-3.1.1.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("[name=hire_qua]").val("<%=hire_qua%>");
		$("[name=job]").val("<%=job%>");
		$("[name=hire_qua]").change(function() {
			// form에 있는 내용을 전송 처리, submit버튼을 클릭한 것과 동일
			$("form").submit();
		})
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">
		사원정보 조회
	</h2>
	<form>
		<table align="center" width="40%" border>
			<tr>
				<th>직책명</th>
				<td><input type="text" name="job" value="<%=job%>" /></td>
			<tr>
				<th>입사분기</th>
				<td><select name="hire_qua">
						<option value="1">1/4분기</option>
						<option value="2">2/4분기</option>
						<option value="3">3/4분기</option>
						<option value="4">4/4분기</option>
				</select></td>
			</tr>
			<tr>
				<th><input type="submit" value="조회" /></th>
		</table>
	</form>
	<table align="center" width="80%" border>
		<col width="25%">
		<col width="25%">
		<col width="25%">
		<col width="25%">
		<tr>
			<th>사원번호</th>
			<th>직책명</th>
			<th>입사분기</th>
			<th>입사일</th>
		</tr>
		<%for(EmpHire emp:dao.getEmpHireInfo(job, hire_qua)){ %>
		<tr>
			<td><%=emp.getEmpno() %></td>
			<td><%=emp.getJob() %></td>
			<td><%=emp.getHire_qua() %></td>
			<td><%=emp.getHire_str() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>