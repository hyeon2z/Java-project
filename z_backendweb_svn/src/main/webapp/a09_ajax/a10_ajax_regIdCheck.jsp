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
		$("#checkIdBtn").click(function(){
			var idVal = $("[name=id]").val()
			//alert(idVal)
			$.ajax({
				url:"z10_checkData.jsp",
				/*
				{"hasMember":${dao.ckMemberId(param.id)}}
				{"hasMenber":true/false}
				*/
				data:"id="+idVal,
				dataType:"json",  // 문자열json데이터를 객체형으로 변환
				success:function(rs){
					// rs = {"hasMenber":true}
					console.log(rs)
					alert("등록여부:"+rs.hasMember)
					
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
			/*
			ex) 처리가 완료된 분들은 PreparedStmtDao에 login()기능메서드 활용
			   로그인 폼을 만들고, ajax로 로그인 성공여부를 처리해보세요..
			   
			*/
			
		})
	});
</script>
</head>

<body>
	<div class="jumbotron text-center">
		<h2>회원등록</h2>

	</div>
	<%-- 
		
    --%>
	<div class="container">
		<form id="frm01" class="form" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input placeholder="아이디입력" name="id" class="form-control mr-sm-2" /> 
				<button class="btn btn-info" 
					id="checkIdBtn" type="button">등록여부확인</button>
				<input type="hidden" id="ckId" value="N"/>
				<%-- 최종적으로 회원등록시, 아이디입력을 통해 통록여부 확인해서
					유효한 id 입력시에 Y로 값이 변경되고, 해당 값일때만
					회원등록 처리 가능.. --%>	
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
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</table>

	</div>
	<div class="modal fade" id="exampleModalCenter" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalCenterTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">타이틀</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="frm02" class="form" method="post">
						<div class="row">
							<div class="col">
								<input type="text" class="form-control" placeholder="사원명 입력"
									name="ename">
							</div>
							<div class="col">
								<input type="text" class="form-control" placeholder="직책명 입력"
									name="job">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>