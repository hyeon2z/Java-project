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
# ajax에서 json데이터의 처리
1. 웹프로그램에서 데이터 전송의 속도 이슈로 많이 개발자들이 고민을 하고 처리해왔다.
2. 초창기에는 text를 그대로 전송해서 처리하거나,
3. text의 데이터를 구분자를 두어 split()메서드를 이용해서 처리하거나,
4. html을 코드를 전송해서 화면에 입력하는 형식을 처리
5. xml 형식을 만들어 처리하였다.
6. 위 같은 방식으로 효과적으로 데이터를 비동기적으로 가져왔는데,
	서버와 클라이언트 간의 넷트워 부하를 초래하는 등 많은 문제를 야기 시켰다.
7. 이 때, 최대한 간단한 형식으로 핵심 데이터를 전달하는 방식을 고안하게 되었는데,
8. 이것이 json 형식이다. javascript object notation 형식으로 
9. 필요한 핵심데이터를 전송하고, 그외 화면구성은 client단에서 처리하는 방식으로
10. 현재는 가장 많이 활용되는 방식이다.
11. 형식
	{"문자속성":"속성값", "숫자속성":속성값, "bool속성":속성값}
	네트웍상에 전송할 수 있는 json 형식
	ex) {"name":"홍길동","age":25, "isAult":true}
12. 위 형식으로 문자열로 전송을 하면, 클라이언트에서  문자열을 객체화하는
	eval()이나, JSON.parse()를 활용한다.
	jquery에서는 dataType:"json"을 설정하면 자동으로 객체로 변환하여
	success:function(data){ data: 객체화됨 }로 받아들어 처리한다.
	마지막을 객체로 받은 내용을 DOM객체를 호출하여 append(), html(), text()
	메서드를 이용해서 화면에 출력 처리한다.
	
13. json 형식의 유형
	1) 일반 객체
		{속성1:속성값, 속성2:속성2갑,...}
		ex) var p = { name:"홍길동", age:25, loc:'서울'}
	2) 배열형 객체
		[
			{속성1:속성1값, 속성2:속성2값,...},
			{속성1:속성1값, 속성2:속성2값,...},
			{속성1:속성1값, 속성2:속성2값,...}
		]	
		


		






 

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
		
		$("h2").click(function(){
			log("로그인")
			$.ajax({
				url:"z08_jsonData.jsp",
				
				dataType:"text",
				success:function(data){
					
					alert(data)
					console.log(data)
					console.log(typeof(data))
					// 문자열(string)을 객체화 처리
					var p01 = JSON.parse(data);
					console.log(typeof(p01))
					console.log(p01)
				},
				error:function(err){
					console.log(err)
				}
			})
		})
		var cnt=1;
		$("#regBtn, h3").click(function(){
			//alert( $("#frm01").serialize() )
			$.ajax({
				url:"z09_jsonProduct.jsp",
				data:$("#frm01").serialize(),
				dataType:"json", // 자동으로 객체형으로 변환되어 처리된다.
				success:function(prod){
					console.log(prod)
					console.log(typeof(prod))
					//alert("물건명:"+product.name)
					var addRow="<tr><td>"+(cnt++)+"</td><td>"
						+prod.name+"</td><td>"
						+prod.price+"</td><td>"
						+prod.cnt+"</td><td>"
						+prod.tot+"</td></tr>"
					$("#prodList tbody").append(addRow)
					// 입력된 form 하위 요소들 초기화 처리
					$("#frm01").each(function(){
						this.reset()
					})
					// 물건명 입력에 focusing 처리..
					$("[name=name]").focus()
					
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
		<h2>json데이터 가져오기</h2>
		<h3>물건정보 로딩</h3> <%-- z09_jsonProduct.jsp로 설정.. --%>
	</div>
	<div class="container">
		<form id="frm01" class="form" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input placeholder="물건명" name="name" class="form-control mr-sm-2" /> 
				<input placeholder="가격" name="price" class="form-control mr-sm-2" />
				<input placeholder="갯수" name="cnt" class="form-control mr-sm-2" />
				<button class="btn btn-info" id="regBtn" type="button">물건정보등록</button>
				<button class="btn btn-success" data-toggle="modal"
					data-target="#exampleModalCenter" type="button">등록</button>
			</nav>
		</form>
		<table id="prodList" class="table table-hover table-striped">
			<col width="20%">
			<col width="20%">
			<col width="20%">
			<col width="20%">
			<col width="20%">
			<thead>

				<tr class="table-success text-center">
					<th>번호</th>
					<th>물건명</th>
					<th>가격</th>
					<th>갯수</th>
					<th>총계</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>

	</div>
</body>
</html>