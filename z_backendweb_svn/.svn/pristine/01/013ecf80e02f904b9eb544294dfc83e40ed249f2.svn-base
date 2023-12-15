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
[1단계:확인] 2. 회원리스트 dao를 확인하고, ajax로 회원리스트를 조회하는 화면을 구현하세요
[1단계:개념] 3. ajax로 모달창을 이용한 데이터 등록 처리 순서와 핵심 코드를 기술하세요.
[1단계:확인] 4. 물건등록 버튼 클릭시, 물건명/가격/갯수를 등록 모달창을 로딩하고, 해당 데이터를 입력시, 해당정보를 
		입력한 정보를 {"name":"사과","price",3000, "cnt",5} 형식으로 출력하는 jsp를 만들고, 그것을
		ajax로 출력하는 jsp를 구현해보세요.
[1단계:확인] 5. 회원등록 dao를 확인하고, ajax로 회원아이디 중복 체크 후, 회원등록하는 처리를 모달창으로 처리해보세요.

 # 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유
3. 수업 시간 긍적적으로 집중하였는가?  

이 질문들은 웹 개발과 관련된 구체적인 과제들을 포함하고 있습니다. 각 질문에 대해 개념적인 설명과 함께 구현 방법을 제공하겠습니다.

### 1. Form 입력에서 Default 이벤트
- **개념**: 웹에서 폼(form) 입력과 관련된 default 이벤트는 일반적으로 폼 제출(submit) 이벤트를 의미합니다. 사용자가 폼을 제출할 때, 웹 브라우저는 페이지를 새로 고침하거나 새 페이지로 이동합니다.
- **장점/단점**:
  - **장점**: 사용자 입력을 서버로 쉽게 전송할 수 있습니다.
  - **단점**: 페이지 새로고침 또는 이동으로 인해 사용자 경험이 중단될 수 있습니다.
- **해결 방법**: JavaScript를 사용하여 폼 제출 이벤트의 기본 동작을 방지(`event.preventDefault()`)하고, AJAX를 이용해 서버에 데이터를 비동기적으로 전송할 수 있습니다.

### 2. 회원리스트 DAO 확인 및 AJAX로 조회
- **DAO**: 데이터 액세스 오브젝트(Data Access Object)는 데이터베이스의 데이터에 접근하는 객체입니다. 회원리스트 DAO는 회원 데이터를 관리합니다.
- **구현**: AJAX를 사용하여 회원리스트를 비동기적으로 조회하고, 결과를 웹 페이지에 동적으로 표시합니다. JavaScript로 XMLHttpRequest 객체를 생성하고, 서버로 요청을 보내는 코드를 작성합니다.

### 3. AJAX와 모달창을 이용한 데이터 등록 처리
- **순서**:
  1. 사용자가 데이터 등록을 위한 버튼 클릭
  2. 모달창 표시
  3. 사용자가 모달창에서 데이터 입력
  4. '등록' 버튼 클릭 시, AJAX 요청으로 데이터 서버에 전송
- **핵심 코드**: JavaScript와 AJAX를 사용하여 모달창에서 입력받은 데이터를 서버에 비동기적으로 전송하고, 성공/실패 응답에 따라 사용자에게 피드백을 제공합니다.

### 4. 물건 등록 및 AJAX를 이용한 출력
- **과제**: 물건 등록 버튼 클릭 시 모달창을 통해 물건명, 가격, 갯수를 입력 받고, 이를 JSON 형식(`{"name":"사과","price":3000, "cnt":5}`)으로 출력하는 JSP 페이지를 구현합니다.
- **AJAX 구현**: 사용자가 모달창에서 데이터를 입력하고 제출하면, 이 정보를 AJAX를 통해 서버로 전송하고, 서버에서 처리한 결과를 비동기적으로 페이지에 표시합니다.

### 5. 회원등록 DAO 확인 및 AJAX를 이용한 중복 체크 및 등록
- **과제**: 회원등록 과정에서 AJAX를 사용하여 입력된 회원 ID의 중복 여부를 체크하고, 중복되지 않을 경우 모달창을 통해 회원을 등록하는 기능을 구현합니다.
- **구현**: JavaScript와 AJAX를 사용하여 사용자가 입력한 ID를 서버에 비동기적으로 전송하고, 서버는 해당 ID의 중복 여부를 확인한 후 응답을 보냅니다. 중복이 아닐 경우, 모달창에서 나머지 회원 정보를 입력받아 등록 처리합니다.


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
				<input placeholder="제목" name="" class="form-control mr-sm-2" /> <input
					placeholder="내용" name="" class="form-control mr-sm-2" />
				<button class="btn btn-info" type="submit">Search</button>
				<button class="btn btn-success" data-toggle="modal"
					data-target="#exampleModalCenter" type="button">등록</button>
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