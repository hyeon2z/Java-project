<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
     import = "frontweb.database.PreparedStmtDao"
     import = "frontweb.vo.Member"
    %>
<%
	String mnoStr = request.getParameter("mno");
	int mno = 0;
	Member member = new Member();
	if(mnoStr!=null){
		mno = Integer.parseInt(mnoStr);
		PreparedStmtDao dao = new PreparedStmtDao();
		member = dao.getMember(mno);
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
	$("h2").text("회원정보상세<%=mno%>");

	$("#uptBtn").click(function(){
		if(confirm("수정하시겠습니까?")){
		$("[name=proc]").val("upt")
		$("form").attr("action","z01_memberProc.jsp");
		$("form").submit();	
		}
	})
	$("#delBtn").click(function(){
		if(confirm("삭제하시겠습니까?")){
			$("[name=proc]").val("del")
			$("form").attr("action","z01_memberProc.jsp");
			$("form").submit();
		}
	})
})

	
})
</script>
</head>
<body>
    <h2></h2>
	<form>
    	<input type = "hidden" name = "proc"/>
    <table align = "center" border width = "50%">
    	<col width = "40%">
    	<tr><th>번호</th><td><input type="number" name="mno" value="<%=member.getMno()%>"/></td></tr>
		<tr><th>이름</th><td><input type="text" name="name" value="<%=member.getName()%>"/></td></tr>
		<tr><th>아이디</th><td><input type="text" name="id" value="<%=member.getId()%>"/></td></tr>
		<tr><th>패스워드</th><td><input type="text" name="pwd" value="<%=member.getPwd()%>"/></td></tr>
		<tr><th>권한</th><td><input type="text" name="auth" value="<%=member.getAuth()%>"/></td></tr>
		<tr><th>포인트</th><td><input type="number" name="point" value="<%=member.getPoint()%>"/></td></tr>
    	<tr><th colspan = "2">
    		<input type = "button" id = "uptBtn" value = "수정"/>
    		<input type = "button" id = "delBtn" value = "삭제"/>
    		<input type = "button" value = "메인리스트화면"
    			onclick = "location.href = 'z01_memberList.jsp'"/></th></tr>
    </table>
    </form>
</body>
</html>