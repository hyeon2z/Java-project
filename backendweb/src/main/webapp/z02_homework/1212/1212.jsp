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
[1단계:개념] 1. json이란 무엇인지? 회원기준으로 객체를 선언하고, 설명하세요
	json은 데이터를 저장하고 전달하기 위한 간단한 형식이다.
	핵심데이터를 전송하고, 화면구성은 client단에서 처리하여 부하가 적다.
	var mem = {name:"길동", age:20, loc:"인천"}
	
[1단계:개념] 2. json 형식에서 일반 js에서의 선언과 네트웍상 전송시 형식의 차이점을 기술하세요
일반 js에서 선언할 땐 "" , '' 둘 다 사용이 가능하지만
네트워크상 전송시 ''는 사용이 불가능 하다. 반드시 ""를 사용해야함.

[1단계:개념] 3. 문자열 json를 객체형으로 변환해주는 방식이 3가지 언급하였다. 
각각 기본 예제를 기준으로 메서드를 기술하세요.
1) var p01 = JSON.parse(data);

2) data:"id="+idVal,
	dataType:"json"
	
3) var jsonStr = '{"name": "길동", "age": 25}';
	var obj = eval("(" + jsonStr + ")");

[1단계:확인] 4. jquery ajax를 이용하여  
z10_json.jsp(좋아하는 커피종류, 가격, 판매위치)를 지정하고, 호출하여 출력하세요
		$("h2").click(function(){
			$.ajax({
				url:"z10_json.jsp",
				data:$("form").serialize(),
				dataType:"json",
				success:function(data){
					alert(data.type + data.price + data.loc)
				},
				error:function(err){
					console.log(err)
				}
			})
		})
		
		{"type":"카페라떼", "price":5000, "loc":"스타벅스"}

[1단계:확인] 5. jquery ajax를 이용하여  form형식으 
매개변수를 전달(도서명,출판사)하여 z11_json.jsp(도서명, 출판사)를 처리하고, 
		하단에 테이블형식으로 추가되게 하세요
		$("#bookBtn").click(function(){
			$.ajax({
				url:"z11_json.jsp",
				type:"get",
				data:$("form").serialize(),
				dataType:"text",
				success:function(data){
					console.log(data)
					$(".tbody").append(data)
				},
				error:function(err){
					console.log(err)
				}
			})
		})
		
		<table class="table table-hover table-striped">
			<col width="50%">
			<col width="50%">
			<thead>

				<tr class="table-success text-center">
					<th>책이름</th>
					<th>출판사</th>
				</tr>
			</thead>
			<tbody class = "tbody">
			</tbody>
		</table>
		
		<tr><td>${param.bname}</td><td>${param.comp}</td></tr>
		
[2단계:확인] 6. [전공자/도전마인드]dao(MemberDao/Member getMember(int mno)를 활용하여 
입력한 사원번호를 통해 사원정보를 가져오는 처리를 z12_memJson.jsp에 하고,
		해당, json데이터를 가져와서 화면에 출력하게 하세요.

		$("#memBtn").click(function(){
			$.ajax({
				url:"z12_memJson.jsp",
				type:"get",
				data:$("form").serialize(),
				dataType:"text",
				success:function(data){
					console.log(data)
					$(".tbody").append(data)
				},
				error:function(err){
					console.log(err)
				}
			})
		})

<jsp:useBean id="dao" class="backendweb.d01_dao.MemberDao"/>
<jsp:useBean id="mem" class="backendweb.z01_vo.Member"/>
<jsp:setProperty property="*" name="mem"/>
<c:set var="m" value="${dao.getMember(param.mno)}"/>
   
<tr><td>${m.mno}</td><td>${m.name}</td><td>${m.id}</td><td>${m.pwd}</td><td>${m.auth}</td><td>${m.point}</td></tr>

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
		$("#memBtn").click(function(){
			$.ajax({
				url:"z12_memJson.jsp",
				type:"get",
				data:$("form").serialize(),
				dataType:"text",
				success:function(data){
					console.log(data)
					$(".tbody").append(data)
				},
				error:function(err){
					console.log(err)
				}
			})
		})
	});
</script>
</head>

<body>
	<div class="jumbotron text-center">
		<h2>타이틀</h2>

	</div>
	<%-- 
		
    --%>
	<div class="container">
		<form id="frm01" class="form" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input placeholder="회원번호" name="mno" class="form-control mr-sm-2" />
				<button id = "memBtn" class="btn btn-info" type="button">검색</button>
				<button class="btn btn-success" data-toggle="modal"
					data-target="#exampleModalCenter" type="button">등록</button>
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
			<tbody class = "tbody">
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