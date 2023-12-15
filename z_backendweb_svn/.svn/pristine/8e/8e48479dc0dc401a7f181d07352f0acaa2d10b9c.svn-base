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
# ajax의 요청값 처리
1. ajax도 서버단에 요청값을 처리할 수 있다.
2. 그 요청값에 따른 결과를 다르게 처리한다.
3. 기본 처리형식
	1) xhr.open("get/post", "요청페이지?key="+val,true);
		호출하는 페이지에 요청값을 전달하고, 그 페이지에서 요청값에 따라서
		결과를 xhr.response에서 받아서 화면에 처리할 수 있다.

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
		console.log("##0: 시작")
		$("#result").click(function(){
			var xhr = new XMLHttpRequest();
			//alert(xhr)
			console.log("#요청값 처리(이벤트)#")
			console.log("##1:")
			var grade = $("[name=grade]").val();
			console.log("##2:"+grade)
			var cnt = $("[name=cnt]").val();
			console.log("##3:"+cnt)
			/// z05_gugu.jsp?grade=5&cnt=30
			xhr.open("get","z05_gugu.jsp?grade="+grade+"&cnt="+cnt,
					true);
			console.log("##4:")
			xhr.onreadystatechange=function(){
				console.log("##5:")
				if(xhr.readyState==4 && xhr.status==200){
					console.log("##6:"+xhr.responseText)
					//alert(xhr.responseText)
					$("h3").text(xhr.responseText)
				}
			}
			console.log("##7:이벤트처리 끝")
			xhr.send()
			console.log("##8:이벤트처리 끝")
			
		})
		console.log("##9: 종료")
	});
</script>
</head>

<body>
	<div class="jumbotron text-center">
		<h2>ajax요청값 호출!</h2>
		<h3></h3>
	</div>
	<%-- 
		
    --%>
	<div class="container">
		<form id="frm01" class="form" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input placeholder="단수입력" name="grade" class="form-control mr-sm-2" /> <input
					placeholder="곱할수입력" name="cnt" class="form-control mr-sm-2" />
				<button class="btn btn-info" id="result" 
					type="button">구구단 결과</button>
				
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