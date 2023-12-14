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
사원정보 중복체크 : z18_empnoDupck.jsp
사원정보 등록 : z22_empInsert.jsp

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
		$("form").on("keypress", function(e){
			if(e.keyCode==13){ // enter키의 keycode는 13
				e.preventDefault() // enter키의 기본 동작을 중단 처리
			}
		})
		search();
		$("[name=deptno]").change(function(){
			search()
		})
		$("#schBtn").click(function(){
			search()
		})
		$("[name=ename],[name=job]").keyup(function(){
			if(event.keyCode==13){
				search()
			}
		})
		$("#regFrmBtn").click(function(){
			$("#modalTitle").text("부서정보등록")
		})
		$("#frm02 [name=empno]").keyup(function(){
			if(event.keyCode==13){
				$.ajax({
					url:"z18_empnoDupck.jsp",
					data:"empno="+$(this).val(),
					dataType:"json",
					success:function(rs){
						if(rs.checkDeptno){
							alert("등록된 사원번호가 있습니다.\n다른 번호를 입력하세요")
							$("#frm02 [name=empno]").val("").focus()
						}else{
							alert("등록가능한 사원번호 입니다.")
							$("#ckNo").val("Y")
						}
					},
					error:function(err){
						console.log(err)
					}
				})
			}
		})
		$("#regBtn").click(function(){
			if($("#ckNo").val()!="Y"){
				alert("사원번호 중복 체크를 해야합니다.")
				return;
			}
			if(confirm("등록하시겠습니까?")){
				$.ajax({
					url:"z22_empInsert.jsp",
					data:$("#frm02").serialize(),
					dataType:"json",
					success:function(rs){
						var rcnt = rs.insEmp
						if(rcnt>0){
							alert("등록 성공!")
							search()
							$("#frm02")[0].reset()
							if(!confirm("계속 등록하시겠습니까?")){
								$("#clsBtn").click()
							}
						}else{
							alert("등록 실패")
						}
					},
					error:function(err){
						console.log(err)
					}
				})
			}
		})
		
		
	});
	function search(){
		$.ajax({
			url:"z21_empList.jsp",
			data:$("#frm01").serialize(),
			dataType:"html",
			success:function(empHTML){
				$("#empList").html(empHTML)
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
  <h2>사원정보(ajax)</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <select name="deptno" class="form-control mr-sm-2">
	    	<option value="0">부서선택</option>
	    	<option value="10">ACCOUNTING</option>
	    	<option value="20">RESEARCH</option>
	    	<option value="30">SALES</option>
	    	<option value="40">OPERATIONS</option>
	    </select>
	    
	    <input name="ename" class="form-control mr-sm-2" placeholder="이름" />
	    <input name="job" class="form-control mr-sm-2" placeholder="직책" />
	    <button id="schBtn" class="btn btn-info" type="button">검색</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter" id="regFrmBtn"
	        type="button">등록</button>
 	</nav>
	</form>
   <table class="table table-hover table-striped">

    <thead>
    
      <tr class="table-success text-center">
        <th>사원번호</th>
        <th>사원명</th>
        <th>직책</th>
        <th>관리자번호</th>
        <th>입사일</th>
        <th>급여</th>
        <th>보너스</th>
        <th>부서번호</th>
      </tr>
    </thead>	
    <tbody id="empList">
</tbody>
	</table>    
    
</div>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="modalTitle">부서</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
		<form id="frm02" class="form"  method="post">
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="사원번호 입력" name="empno">
	        <input type="hidden" id="ckNo" value="N"/>
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="사원명 입력" name="ename">
	      </div>
	     </div>
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="직책 입력" name="job">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="관리자번호 입력" name="mgr">
	      </div>
	     </div>
	     <div class="row">
	      <div class="col">
	        <input type="date" class="form-control" placeholder="입사일 입력" name="hiredate">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="급여 입력" name="sal">
	      </div>
	     </div>
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="보너스 입력" name="comm">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="부서번호 입력" name="deptno">
	      </div>
	     </div>
	    </form> 
      </div>
      <div class="modal-footer">
        <button id= "clsBtn" type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
        <button id = "regBtn" type="button" class="btn btn-primary">등록</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>