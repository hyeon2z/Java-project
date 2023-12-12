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
[1단계:개념] 1. ajax의 동기처리 기본형식을 예제를 통해서 설명하세요

	$(document).ready(function(){
		$("h2").click(function(){
		    var xhr = new XMLHttpRequest(); <- XMLHttpRequest 객체 생성
		    xhr.open("get", "data.jsp", false); <- get/post여부, 자원위치, 비동기여부
		    xhr.send() <- 요청값 호출
		    alert("서버의 자원 받은 결과:" + xhr.responseText)
		    $("h3").text(xhr.responseText) <- 결과문자열을 화면에 특정 위치에 출력
		})
	});
		    
[1단계:개념] 2. ajax의 동기와 비동기의 개념적 차이점과 js에서 코드부분의 차이점을 기술하세요.

동기처리는 데이터를 가지고 오는동안 페이지는 멈춘 채 기다리는 방식이고
비 동기 처리는 데이터를 가지고 오는동안에도 페이지는 멈추지않고 동작하는 방식
xhr.open 에서 맨마지막 false가 오면 동기처리이고 true가 오면 비 동기 처리이다.
xhr.onreadystatechange를 통해 xhr의 상태값이 바뀌게 되면 작동하는 function을 설정하여
readyState가 4이고 status가 200 일 때 데이터를 출력하게 한다.	

[1단계:확인] 3. ajax를 동기형식으로 data.jsp에서 물품리스트(사과,바나나,딸기)를 처리하여, 물건리스트호출시, 서버에 있는 물품리스트를 가져오는 처리하세요.

<script type="text/javascript">
	$(document).ready(function(){
		$("h2").click(function(){
			var xhr = new XMLHttpRequest();
			xhr.open("get","data.jsp",false);
			xhr.send()
			var fruits = xhr.responseText.split(",")
			var addHTML = ""
			fruits.forEach(function(name, idx){
				addHTML += "<tr>"
				addHTML += "<td>"+(idx+1)+"</td>"
				addHTML += "<td>"+name+"</td>"
				addHTML += "</tr>"
			})
			$("h2").html(addHTML)
		})
	});
</script>
<h2>리스트 호출</h2>

[1단계:확인] 4. ajax를 비동기형식으로 요청값을 도서명, 가격, 할인율를 넘기면 
결과값으로 해당 도서명과 할인율에 따른 계를 alert()창으로 가져오는 처리를 하세요.

<script type="text/javascript">
	$(document).ready(function(){
		$("[id=infBtn]").click(function(){
			var xhr = new XMLHttpRequest();
			var bname = $("[name=bname]").val()
			var price = $("[name=price]").val()
			var discount = $("[name=discount]").val()
			xhr.open("get","data.jsp?bname="+bname+"&price="+price+"&discount="+discount,true);
			xhr.onreadystatechange=function(){
				if(xhr.readyState==4 && xhr.status==200){
					alert(xhr.responseText)
				}
			}
			xhr.send()
			
		})
	});
</script>

도서명:${param.bname}<br>
가격:${param.price}<br>
할인율:${param.discount }<br>
계:${param.price*(1-param.discount)}

[1단계:개념] 5. jquery ajax의 기본형식을 기술하세요.

$.ajax({
    url:요청자원의명,
    type:'get/post',
    data:'name=홍길동', 또는 $("form").serialize(), <- 요청값 처리
    dataType:"json/text/xml", <- 결과값 형식 지정
    success:function(data){ <- 성공하였을 때 결과값
    	data : 서버에서 전송된 결과값을 받을 수 있다.
    },
    error:function(err){
    	console.log(err) <- 에러 처리 결과값
    }

[1단계:확인] 6. jquery ajax로 입력한 선수의 이름과 타석과 안타를 서버에서 
요청결과로 @@@의 타율을 @@를 화면에 출력되게 하세요.

<script type="text/javascript">
	$(document).ready(function(){
		$("#bbBtn").click(function(){
			$.ajax({
				url:"data.jsp",
				type:"get",
				data:$("form").serialize(),
				dataType:"text",
				success:function(data){
					$("tbody").append(data)
				},
				error:function(err){
					console.log(err)
				}
			})
		})
	});
</script>

	<div class="container">
		<form id="frm01" class="form" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input placeholder="선수이름" name="pname" class="form-control mr-sm-2" /> 
				<input placeholder="타석수" name="pa" class="form-control mr-sm-2" />
				<input placeholder="안타수" name="anta" class="form-control mr-sm-2" />
				<button id = "bbBtn" class="btn btn-info" type="button">타율계산</button>
			</nav>
		</form>
		<table class="table table-hover table-striped">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<col width="25%">
			<thead>

				<tr class="table-success text-center">
					<th>선수명</th>
					<th>타석수</th>
					<th>안타수</th>
					<th>타율</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>

	</div>
	
<tr><td>${param.pname}</td><td>${param.pa}</td><td>${param.anta}</td><td>${param.anta/param.pa}</td></tr>



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

</head>

<body>
	<div class="jumbotron text-center">
		<h2>타율계산기</h2>

	</div>
	<%-- 
    --%>

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