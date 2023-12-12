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
		console.log("# 프로그램 시작 #")
		$("h2").click(function(){
			console.log("# 이벤트 :")
			var xhr = new XMLHttpRequest()
			//alert(xhr) //  확인 후, 주석
			xhr.open("get","z04_book.jsp",true)
			console.log("# 진행1:")
			xhr.onreadystatechange=function(){
				console.log("# 진행2:"+xhr.readyState)
				// 상태값조건
				if(xhr.readyState==4 && xhr.status==200){
					console.log("# 진행3:")
					// 최대한 간단하 코드로 수행 여부 확인
					//alert(xhr.responseText)
					$("tbody").append("<tr><td>"+xhr.responseText+
							"</td></tr>")
					
				}
				// responseText
			}
			console.log("# 진행4:")
			xhr.send()
			console.log("# 진행5:")
			
			
		})
		console.log("# 프로그램 끝 #")
	});
	
</script>
</head>

<body>
	<div class="jumbotron text-center">
		<h2>도서가져오기 클릭</h2>

	</div>
	<%-- 
	ex) 도서 가져오기 비동기 처리..
	z04_book.jsp 데이터 가져와서 테이블에
	추가 처리..
		
    --%>

		<table class="table table-hover table-striped">
			<thead>
				<tr class="table-success text-center">
					<th>도서명</th>
				</tr>
			</thead>
			<tbody>
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