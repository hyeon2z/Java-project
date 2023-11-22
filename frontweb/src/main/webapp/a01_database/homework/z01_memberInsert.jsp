<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "frontweb.database.PreparedStmtDao"
    import = "frontweb.vo.Member"
    %>
    <%
boolean isIns = false;
    String mnoStr = request.getParameter("mno");
    int mno = 0;
    if(mnoStr!=null) mno = Integer.parseInt(mnoStr);

    String name = request.getParameter("name");
    if(name==null) name = "";
    String id = request.getParameter("id");
    if(id==null) id = "";
    String pwd = request.getParameter("pwd");
    if(pwd==null) pwd = "";
    String auth = request.getParameter("auth");
    if(auth==null) auth = "";
    String pointStr = request.getParameter("point");
    int point = 0;
    if(pointStr!=null) point = Integer.parseInt(pointStr);

    if(mnoStr!=null&&!mnoStr.trim().equals("")){
    	PreparedStmtDao dao = new PreparedStmtDao();
    	dao.insertMember(new Member(
    				mno, name, id, pwd, auth, point
    			));
    	
    }
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.1.1.js"></script>
<script>
var isIns = <%=isIns%>;
if(isInsert){
	if(!confirm("등록 성공\n계속등록하시겠습니까?")){
		location.href = "a01_empList.jsp";
	}
}
$(document).ready( function(){
	$("h2").text("회원정보등록(<%=mno%>)");
})
</script>
</head>
<body>
    <h2></h2>

</body>
</html>