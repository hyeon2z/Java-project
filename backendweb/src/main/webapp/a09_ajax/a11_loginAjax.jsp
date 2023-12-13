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
# 로그인 ajax 처리
1. 핵심 기능
    아이디와 패스워드를 입력하고 로그인 버튼 클릭 시, 비동기적으로 인증 여부를 출력처리 한다.
2. 주요 파일
    1) 화면:a11_loginAjax.jsp
    2) json데이터 : z11_loginData.jsp
    3) dao및 login 처리 메서드 : PreparedStmtDao login(id,pwd)
    

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
/*
# form의 내장된 이벤트
1. javascript를 설정하지 않더라도 처리되는 이벤트를 default 이벤트라고 한다.
2. form 하위에 입력값을 입력하고, enter 키를 입력 시 default 이벤트로 submit이 처리되는 현상을 볼 수 있다.
3. 위 default submit 이벤트의 경우, 일반 화면전환 요청처리의 경우 유용하게 사용할 수 있지만,
    ajax의 경우 불편한 경우를 발생하게 된다.
    
4. 위 default 이벤트를 방지하려면 다음과 같은 코드를 처리하여야 한다.
    $("form").on("keypress",function(e){
		if(e.keyCode==13){ // enter키의 keycode는 13
			e.preventDefault() // enter키의 기본 동작을 중단 처리
		}
    })

 */
	
	$(document).ready(function(){
		$("form").on("keypress", function(e){
			if(e.keyCode==13){
				e.preventDefault()
			}
		})
		
		$("#loginBtn").click(function(){
			ckId()
		})
		$("[name=id],[name=pwd]").keyup(function(){
			if(event.keyCode==13)
				ckId()
		})
	});	

		function ckId(){
			$.ajax({
				url:"z11_loginData.jsp",
				data:$("form").serialize(),
				dataType:"json",
				success:function(rs){
					if(rs.loginRst){
						alert("로그인 성공")
					}else{
						alert("로그인 실패")
					}
				},
				error:function(err){
					console.log(err)
				}
			})
		
		}
		
	
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2>타이틀</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name="id" class="form-control mr-sm-2" placeholder="아이디" />
	    <input name="pwd" class="form-control mr-sm-2" placeholder="비밀번호" />
	    <button id = "loginBtn" class="btn btn-info" type="button">로그인</button>
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
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">타이틀</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
		<form id="frm02" class="form"  method="post">
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="사원명 입력" name="ename">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="직책명 입력" name="job">
	      </div>
	     </div>
	    </form> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>