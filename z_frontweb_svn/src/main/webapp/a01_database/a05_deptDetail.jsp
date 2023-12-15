<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
import="frontweb.database.PreparedStmtDao"
import="frontweb.Dept"    
    %>
<%
String deptnoStr = request.getParameter("deptno");
int deptno = 0;
Dept detail = new Dept();
if(deptnoStr!=null){
	PreparedStmtDao dao = new PreparedStmtDao();
	deptno = Integer.parseInt(deptnoStr);
	detail = dao.getDept(deptno);
	
}

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.1.1.js"></script>
<script>
$(document).ready( function(){
	$("h2").text("부서등록상세(<%=deptno%>)");
	$("#uptBtn").click(function(){
		if(confirm("수정하시겠습니까?")){
			$("[name=proc]").val("upt");
			$("form").submit();	
		}
	});	
	
	$("#delBtn").click(function(){
		if(confirm("삭제하시겠습니까?")){
			$("[name=proc]").val("del");
			$("form").submit();	
		}
	});		
	
})
</script>
</head>
<body>
    <h2 align="center"></h2>
    <form action="a05_deptProc.jsp">
    	<input type="hidden" name="proc">
    
	    <table align="center" border>
	    	<tr><th>부서번호</th>
	    		<td><input type="number" name="deptno" value="<%=detail.getDeptno() %>"/></td></tr>
	    	<tr><th>부서명</th>
	    		<td><input type="text" name="dname" value="<%=detail.getDname() %>"/></td></tr>
	    	<tr><th>부서위치</th>
	    		<td><input type="text" name="loc" value="<%=detail.getLoc() %>"/></td></tr>
	    	<tr><th colspan="2">
	    		<input type="button"  value="수정" id="uptBtn"/>
	    		<input type="button"  value="삭제" id="delBtn"/>
	    		<input type="button"  value="메인이동" 
	    			onclick="location.href='a05_deptList.jsp'"
	    		/>
	    		
	    		</th></tr>
	    	
	    </table>
    </form>

</body>
</html>