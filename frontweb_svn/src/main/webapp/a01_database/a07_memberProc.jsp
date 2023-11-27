<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import = "frontweb.database.MemberDao"
	import = "frontweb.vo.Member"      
    %>
<%
String mnoStr = request.getParameter("mno");
String pointStr = request.getParameter("point");
String name = request.getParameter("name");
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");
String auth = request.getParameter("auth");
String proc = request.getParameter("proc");
if(proc==null) proc="";
int mno = 0;

if(mnoStr!=null) {
	mno = Integer.parseInt(mnoStr);
	int point = Integer.parseInt(pointStr);
	MemberDao dao = new MemberDao();
	if(proc.equals("upt")){
		// Member(int mno, String name, String id, String pwd,
				//String auth, int point) 
		if(dao.updateMember(new Member(mno, name, id, pwd, auth, point) ) ==0){
			proc ="수정실패";
		}
	}
	if(proc.equals("del")){
		if(dao.deleteMember(mno)==0){
			proc ="삭제실패";
		}
	}	
}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.1.1.js"></script>
<script>
var proc = "<%=proc%>"
if(proc!=""){
	if(proc=="upt"){
		if(confirm("수정 성공\n상세화면은 확인, 조회화면은 취소")){
			location.href="a07_memberDetail.jsp?mno=<%=mno%>";
		}else{
			location.href="a07_memberList.jsp";
		}
	}else if(proc=="del"){
		alert("삭제 성공")
		location.href="a07_memberList.jsp";
	}else{
		alert(proc+"\n 조회화면으로 이동")
		location.href="a07_memberList.jsp";
	}	
}
$(document).ready( function(){
	
})
</script>
</head>
<body>
    <h2></h2>

</body>
</html>