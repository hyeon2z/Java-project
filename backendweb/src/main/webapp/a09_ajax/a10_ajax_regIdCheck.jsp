<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"
    import="backendweb.d01_dao.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<%--


 --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css" >
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css" >
<style>
	td{text-align:center;}
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function(){
		/*
		$("#checkIdBtn").click(function(){
			var idVal = $("[name=id]").val()
			$.ajax({
				url:"z10_checkData.jsp",
				data:"id="+idVal,
				dataType:"json",
				success:function(rs){
					console.log(rs)
					console.log(rs.hasMember)
					if(rs.hasMember){
						alert("등록된 아이디가 있습니다.\n다른 아이디로 등록하세요")
						$("[name=id]").val("").focus()
					
					}else{
						alert("해당 아이디로 등록가능합니다.")
						$("ckId").val("Y")
					}
				},
				error:function(err){
					console.log(err)
				}
			})
		})
		*/
		$("#loginBtn").click(function(){
			var idVal = $("[name=id]").val()
			var pwdVal = $("[name=pwd]").val()
			$.ajax({
				url:"z10_checkData.jsp",
				data:$("form").serialize(),
				dataType:"json",
				success:function(rs){
					console.log(rs)
					console.log(rs.login)
					if(rs.login){
						alert("로그인성공!")
						//$("ckLogin").val("Y")
					}else{
						alert("아이디 비밀번호를 확인해주세요")
						$("[name=id]").val("").focus()
					}
				},
				error:function(err){
					console.log(err)
				}
			})
		})
		
	});
	/*
	ex) 처리가 완료된 분들은 PreparedStmtDao에 login()기능메서드 활용
	로그인 폼을 만들고, ajax로 로그인 성공여부를 처리해 보세요
	*/
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2>타이틀</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name="id" class="form-control mr-sm-2" placeholder="아이디입력" />
	    <input name="pwd" class="form-control mr-sm-2" placeholder="패스워드입력" />
	    <button id="checkIdBtn" 
	    class="btn btn-info" type="button">등록여부확인</button>
	    <button id="loginBtn" 
	    class="btn btn-info" type="button">로그인</button>
	    <input type="hidden" id="ckId" value="N"/>
	    <input type="hidden" id="ckLogin" value="N"/>
	    <%-- 최종적으로 회원 등록 시, 아이디입력을 통해 등록여부 확인해서
	        유효한 id 입력시에 Y로 값이 변경되고, 해당 값일 때만 회원등록 처리 가능 --%>
	</nav>
	</form>
   <table class="table table-hover table-striped">
   	<col width="10%">
   	<col width="50%">
   	<col width="15%">
   	<col width="15%">
   	<col width="10%">
    <thead>
    
      <tr class="table-success text-center">
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회</th>
      </tr>
    </thead>	
    <tbody>
    	<tr><td></td><td></td><td></td><td></td><td></td></tr>
    	<tr><td></td><td></td><td></td><td></td><td></td></tr>
    	<tr><td></td><td></td><td></td><td></td><td></td></tr>
    </tbody>
	</table>    
    
</div>

</body>
</html>