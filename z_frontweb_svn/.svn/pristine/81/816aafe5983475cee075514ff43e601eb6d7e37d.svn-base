<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="frontweb.database.PreparedStmtDao"
	import="frontweb.Dept"    
    %>
<%--
submit 버튼을 클릭했을 때, form action으로 지정된 곳으로 페이지?key=value
action이 없으면 현재 페이지에 
    name="deptno" value="10"
    name="dname" value="기획"
    name="loc" value="제주"
	a05_deptInsert.jsp?deptno=10&dname=기획&loc=제주
식으로 현재페이지에 요청값 전송한다.
이렇게 전송이 되면 아래와 같이 요청값을 받는다.
--%>
<%
boolean isIns = false;
if(request.getParameter("deptno")!=null){ // 초기화면이 아닐 때 등록
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	String dname = request.getParameter("dname");
	String loc = request.getParameter("loc");
	PreparedStmtDao dao = new PreparedStmtDao();
	int deptCnt = dao.insertDept( new Dept(deptno, dname, loc) );
	isIns = deptCnt>0;
}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.1.1.js"></script>
<script>
var isIns = <%=isIns%>
if(isIns){
	if(!confirm("등록 성공\n계속 하시겠습니까?")){
		location.href="a05_deptList.jsp";
	}
}
$(document).ready( function(){
	$("h2").text("부서등록");
})
</script>
</head>
<body>
    <h2 align="center"></h2>
    <form>
    <table  align="center" border width="50%">
    	<col width="40%">
    	<tr><th>부서번호</th><td><input type="number" name="deptno"/></td></tr>
    	<tr><th>부서명</th><td><input type="text" name="dname"/></td></tr>
    	<tr><th>부서위치</th><td><input type="text" name="loc"/></td></tr>
     	<tr><th colspan="2">
				<input type="submit" value="등록"/>
				<input type="button" value="메인리스트화면" 
					onclick="location.href='a05_deptList.jsp'"/>    	
    		</th></tr>
    </table>
    </form>

</body>
</html>