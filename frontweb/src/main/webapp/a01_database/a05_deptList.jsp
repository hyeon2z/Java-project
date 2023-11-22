<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="frontweb.database.PreparedStmtDao"
	import="frontweb.Dept"
	import="java.util.List"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">부서정보</h2>
<%
// 1. import 처리   Dao, VO
PreparedStmtDao dao = new PreparedStmtDao();
// 2. 요청값 처리  부서명과 부서위치 value값 설정
String dname = request.getParameter("dname");
if(dname==null) dname = "";
String loc = request.getParameter("loc");
if(loc==null) loc = "";



// 3. dao.getDeptList(new Dept(부서명,부서위치)) for each구문 반복 처리
//    테이블 출력 처리..
%>
<form>
	<table align="center" width="50%" border>
		<col width="30%">
		<tr><th>부서명</th>
			<td><input type="text" name="dname" value="<%=dname%>" /></td></tr>			
		<tr><th>부서위치</th><td>
			<input type="text"  name="loc" value="<%=loc%>"  /></td></tr>			
		<tr><th colspan="2">
			<input type="button" value="부서등록" 
				onclick="location.href='a05_deptInsert.jsp'"/>
			<input type="submit" value="검색"/>
			
			</td></tr>			
	</table>
</form>
<table align="center" width="80%" border>
		<col width="33%"><col width="33%"><col width="34%">
		<tr><th>부서번호</th><th>부서이름</th><th>부서위치</th></tr>
		<%for(Dept d:dao.getDeptList(dname, loc)){ %>
		<tr ondblclick="goPage(<%=d.getDeptno()%>)"><td><%=d.getDeptno()%></td>
			<td><%=d.getDname() %></td>
			<td><%=d.getLoc() %></td></tr>
		<%}%>
		<%--goPage(<%=d.getDeptno()%>) : 숫자형일 때..  --%>
		<%--goPage('<%=d.getId()%>') : 문자형일 때 ''사이에 필요  --%>

</table>
<script type="text/javascript">
	function goPage(deptno){
		location.href="a05_deptDetail.jsp?deptno="+deptno;
	}
</script>	

</body>
</html>