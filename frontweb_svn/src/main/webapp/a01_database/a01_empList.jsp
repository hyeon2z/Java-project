<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
import="frontweb.database.PreparedStmtDao"
import="frontweb.Emp"    
    %>
<%
PreparedStmtDao dao = new PreparedStmtDao();
String ename = request.getParameter("ename");
if(ename==null) ename = "";
String job = request.getParameter("job");
if(job==null) job = "";
String deptnoStr = request.getParameter("deptno");
int deptno = 0; // 초기화면에 출력 부서번호가 10기본 출력하기 위해서..
if(deptnoStr!=null) deptno = Integer.parseInt(deptnoStr);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=button], input[type=submit] {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}
.customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

.customers td, .customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

.customers tr:nth-child(even){background-color: #f2f2f2;}

.customers tr:hover {background-color: #ddd;}


.customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
  
}

.customers .th_form {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: white;
  color: #04AA6D;
  text-align:center;
}


</style>
<script src="/frontweb/com/jquery-3.6.0.js"></script>

<script>
$(document).ready( function(){
	$("[name=deptno]").val("<%=deptno%>");
})
</script>
</head>
<body>
<h2 align="center">사원정보조회</h2>


<form>
<table  class="customers"  width="40%" border align="center">
	<col width="40%">
	<col width="60%">
	<tr><th class="th_form" >사원명</th><td><input type="text" name="ename" 
							value="<%=ename%>"/></td>
	<tr><th class="th_form" >직책명</th><td><input type="text" name="job" value="<%=job%>"/></td>
	<tr><th class="th_form" >부서</th>
		<td><select name="deptno" >
				<option value="0">전체</option>
				<option value="10">인사</option>
				<option value="20">재무</option>
				<option value="30">회계</option>
				<option value="40">기획</option>
			</select>
		</td>
	<tr><th class="th_form"  colspan="2">
			<input type="submit"  value="검색"/>
			<input type="button" value="등록화면" 
				onclick="location.href='a01_empInsert.jsp'"
			/>
			</th>
</table>
</form>


<table class="customers" width="80%" border  align="center">
	<tr><th>사원번호</th><th>사원명</th><th>직책명</th><th>관리자번호</th>
		<th>급여</th><th>보너스</th><th>부서번호</th></tr>
	<%for(Emp emp:dao.getEmpList( new Emp(ename,job,deptno) )){ %>		
	<tr ondblclick="goPage(<%=emp.getEmpno()%>)"><td><%=emp.getEmpno()%></td>
		<td><%=emp.getEname()%></td>
		<td><%=emp.getJob()%></td>
		<td><%=emp.getMgr()%></td>
		<td><%=emp.getSal()%></td>
		<td><%=emp.getComm()%></td>
		<td><%=emp.getDeptno()%></td></tr>
	<%}%>			
</table>
<script type="text/javascript">
	function goPage(empno){
		//alert(empno)
		location.href="a01_empDetail.jsp?empno="+empno;
	}
	
</script>	
</body>
</html>


