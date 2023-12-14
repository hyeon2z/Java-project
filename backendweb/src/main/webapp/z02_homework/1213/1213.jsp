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
[1단계:개념] 1. form 입력에서 default 이벤트란 무엇이면, 어떤 장점/단점이 있고, 이를 해결할려는 코드를 설명하세요

default 로 submit 이벤트일때 엔터키를 누르면 실행되는데, 이는 데이터를 전송 할 떄 마다 페이지가 새로고침해야해서 불편하다는 점이 있고
비동기처리 또한 되지 않음.
button식으로 한 뒤 ajax를 이용해서 페이지 새로고침 없이 동기처리로 할 수 있는데
이 때 버튼을 누르지 않고 엔터키를 이용해서 검색을 실행하게 할 수 있다.
$("form").on("keypress", function(e){
			if(e.keyCode==13){ // enter키 keycode = 13
				e.preventDefault()  enter 기본 동작을 중단 처리
			}
		})
		$("[name=ename],[name=job]").keyup(function(){
			if(event.keyCode==13){
				search()
			}
		})
[1단계:확인] 2. 회원리스트 dao를 확인하고, ajax로 회원리스트를 조회하는 화면을 구현하세요
	$(document).ready(function(){
		$("form").on("keypress",function(e){
			if(e.keyCode==13){   //  enter키의 keycode는 13
				e.preventDefault() // enter키의 기본 동작을 중단 처리
			}
		})
		search();
		$("#schBtn").click(function(){
			search()
		})
		$("[name=name],[name=auth]").keyup(function(){
			if(event.keyCode==13){
				search()
			}
		})
	});
	function search(){
		$.ajax({
			url:"memList.jsp",
			data:$("#frm01").serialize(),
			dataType:"html",
			success:function(empHTML){
				$("#memList").html(empHTML)
			},
			error:function(err){
				console.log(err)
			}
		})
	}
		
		<table class="table table-hover table-striped">
			<thead>

				<tr class="table-success text-center">
					<th>회원번호</th>
					<th>회원명</th>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>권한</th>
					<th>포인트</th>
				</tr>
			</thead>
			<tbody id="memList">
			</tbody>
		</table>
		
	<jsp:useBean id="dao" class="backendweb.d01_dao.MemberDao"/>
	<jsp:useBean id="mem" class="backendweb.z01_vo.Member"/>
	<jsp:setProperty property="*" name="mem"/>
	<c:forEach var="m" items="${dao.getMemberList(param.name,param.auth)}">
	<tr>
		<td>${m.mno}</td>
		<td>${m.name}</td>
		<td>${m.id}</td>
		<td>${m.pwd}</td>
		<td>${m.auth}</td>
		<td>${m.point}</td>
	</tr>
	</c:forEach>
	
[1단계:개념] 3. ajax로 모달창을 이용한 데이터 등록 처리 순서와 핵심 코드를 기술하세요.
모달 창 쪽 input 폼에 name을 지정하고, 모달 창 등록라인 id값을 지정 한 뒤
정보들을입력하고, 등록버튼을 누르게 되면 입력된 정보들이
ajax를 이용해서 insert dao를 만들어 놓은 곳으로 데이터값을 보내주게 되고 데이터 등록처리가 된다.

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
					
<jsp:useBean id="dao" class="backendweb.d01_dao.PreparedStmtDao"/>
<jsp:useBean id="emp" class="backendweb.z01_vo.Emp"/>
<jsp:setProperty property="*" name="emp"/>
{"insEmp":${dao.insertEmp(emp)}}

[1단계:확인] 4. 물건등록 버튼 클릭시, 물건명/가격/갯수를 등록 모달창을 로딩하고, 해당 데이터를 입력시, 해당정보를 
		입력한 정보를 {"name":"사과","price",3000, "cnt",5} 형식으로 출력하는 jsp를 만들고, 그것을
		ajax로 출력하는 jsp를 구현해보세요.
		
		<div class="modal-body">
			<form id="frm02" class="form" method="post">
				<div class="row">
					<div class="col">
						<input type="text" class="form-control" placeholder="과일명 입력"
							name="name">
					</div>
					<div class="col">
						<input type="text" class="form-control" placeholder="가격 입력"
							name="price">
					</div>
					<div class="col">
						<input type="text" class="form-control" placeholder="개수 입력"
							name="cnt">
					</div>
				</div>
			</form>
		</div>
		<div class="modal-footer">
			<button type="button" class="btn btn-secondary"
				data-dismiss="modal">Close</button>
			<button id="regBtn" type="button" class="btn btn-primary">Save changes</button>
		
		$("#regBtn").click(function(){
			$.ajax({
				url:"fruit.jsp",
				data:$("#frm02").serialize(),
				dataType:"json",
				success:function(data){
					alert("과일명:"+data.name +"가격:"+data.price +"갯수:"+ data.cnt)
				},
				error:function(err){
					console.log(err)
				}
			})
		})
		
		{"name":"${param.name}", "price":"${param.price}", "cnt":"${param.cnt}"}

[1단계:확인] 5. 회원등록 dao를 확인하고, ajax로 회원아이디 중복 체크 후, 회원등록하는 처리를 모달창으로 처리해보세요.
		$("#frm02 [name=id]").keyup(function(){
			if(event.keyCode==13){
				$.ajax({
					url:"idCheck.jsp",
					data:"id="+$(this).val(),
					dataType:"json",
					success:function(rs){
						if(rs.checkId){
							alert("등록된 아이디가 있습니다.\n다른 아이디를 입력하세요")
							$("#frm02 [name=id]").val("").focus()
						}else{
							alert("사용가능한 아이디 입니다.")
							$("#ckNo").val("Y")
						}
					},
					error:function(err){
						console.log(err)
					}
				})
			}
		})
		
<jsp:useBean id="dao" class="backendweb.d01_dao.MemberDao"/>
{"checkId":${dao.checkId(empty param.id?0:param.id)}}
		
		$("#regBtn").click(function(){
			if($("#ckNo").val()!="Y"){
				alert("아이디 중복 체크를 해야합니다.")
				return;
			}
			if(confirm("등록하시겠습니까?")){
				$.ajax({
					url:"memInsert.jsp",
					data:$("#frm02").serialize(),
					dataType:"json",
					success:function(rs){
						var rcnt = rs.insMember
						if(rcnt>0){
							alert("회원가입 완료")
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
		
<jsp:useBean id="dao" class="backendweb.d01_dao.MemberDao"/>
<jsp:useBean id="mem" class="backendweb.z01_vo.Member"/>
<jsp:setProperty property="*" name="mem"/>
{"insMember": ${dao.insertMember(mem)}}
		
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
		$("form").on("keypress",function(e){
			if(e.keyCode==13){   //  enter키의 keycode는 13
				e.preventDefault() // enter키의 기본 동작을 중단 처리
			}
		})
		search();
		$("#schBtn").click(function(){
			search()
		})
		$("[name=name],[name=auth]").keyup(function(){
			if(event.keyCode==13){
				search()
			}
		})
		$("#frm02 [name=id]").keyup(function(){
			if(event.keyCode==13){
				$.ajax({
					url:"idCheck.jsp",
					data:"id="+$(this).val(),
					dataType:"json",
					success:function(rs){
						if(rs.checkId){
							alert("등록된 아이디가 있습니다.\n다른 아이디를 입력하세요")
							$("#frm02 [name=id]").val("").focus()
						}else{
							alert("사용가능한 아이디 입니다.")
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
				alert("아이디 중복 체크를 해야합니다.")
				return;
			}
			if(confirm("등록하시겠습니까?")){
				$.ajax({
					url:"memInsert.jsp",
					data:$("#frm02").serialize(),
					dataType:"json",
					success:function(rs){
						var rcnt = rs.insMember
						if(rcnt>0){
							alert("회원가입 완료")
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
			url:"memList.jsp",
			data:$("#frm01").serialize(),
			dataType:"html",
			success:function(empHTML){
				$("#memList").html(empHTML)
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
		<h2>멤버정보</h2>

	</div>
	<%-- 
		
    --%>
	<div class="container">
		<form id="frm01" class="form" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input placeholder="회원명" name="name" class="form-control mr-sm-2" /> <input
					placeholder="권한" name="auth" class="form-control mr-sm-2" />
				<button class="btn btn-info" type="submit">검색</button>
				<button class="btn btn-success" data-toggle="modal"
					data-target="#exampleModalCenter" type="button">가입</button>
			</nav>
		</form>
		<table class="table table-hover table-striped">
			<thead>

				<tr class="table-success text-center">
					<th>회원번호</th>
					<th>회원명</th>
					<th>아이디</th>
					<th>비밀번호</th>
					<th>권한</th>
					<th>포인트</th>
				</tr>
			</thead>
			<tbody id="memList">
			</tbody>
		</table>

	</div>
	<div class="modal fade" id="exampleModalCenter" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalCenterTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">회원가입</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
		<form id="frm02" class="form"  method="post">
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="회원번호 입력" name="mno">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="회원명 입력" name="name">
	      </div>
	     </div>
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="아이디 입력" name="id">
	     	<input type="hidden" id="ckNo" value="N"/>
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="비밀번호 입력" name="pwd">
	      </div>
	     </div>
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="권한 입력" name="auth">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="포인트 입력" name="point">
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