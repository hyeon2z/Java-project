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
[1단계:개념] 1. 아래 각, 기능의 하는 이유와 역할을 기술하세요
		$("#ckNo").val("Y")
		    - 중복인지 아닌지를 체크하는 hidden 속성란을 만들어서, 중복인지 체크하게되면
		    기본으로 N이 되어있던 값을 Y로 바꿔줌으로써 중복체크검사 유무판별
		    
		$("#frm02")[0].reset()
		    - 입력된 폼을 초기화시키는 코드
		    
		$("#frm02 [name=deptno]").attr("readonly",true)
		    - name 값이 deptno 인 곳을 수정불가능하게 읽기전용 속성으로 바꿔주는 코드
		    
		$(deptList).each(function(idx, dept){ })
			- deptList를 jQuery로 변환한것을 each 메소드를 통해
			deptList의 첫번쨰요소 0 부터 마지막요소까지 dept객체로 반환하게 한다.
			deptList에 있는 dept요소들을 차례로 나열할 떄 사용

[1단계:개념] 2. gson lib은 어떤 처리를 해주는 객체인가? 해당 내용을 설명하고 처리하는 방법을 기술하세요.
		java객체를 JSON 포맷으로 변환하거나, JSON 문자열을 java객체로 변환할 때 사용된다.
		${gson.toJson(dao.getEmp(param.empno))} <- (dao.getEmp(param.empno)) 코드를 JSON 형식으로 변환 

[1단계:개념] 3. 특정한 버튼의 이벤트와 입력값에 의한 ajax처리할 때, 각 $.ajax({속성:속성값}) 속성과 속성값은 어떤 것이 있는지 기본 예제를 통해서 정리하세요
		

[1단계:확인] 4. 아래 내용을 gson lib를 활용하여 단계별로 진행하자.
              1) z51_Person.jsp에 요청값으로 Person객체를 useBean으로 선언하고, 이름, 나이, 사는곳을 할당하여
		   gson.toJson(p01)로 데이터를 출력해보자.
              2) z52_ListPerson.jsp에 Person객체 List에 할당하고, gson.toJson(list)로 
	      	  배열형 데이터를 출력하자.
              3) z53_ListDept.jsp로 요청값으로 부서위치, 부서명으로 전송하여 dao의 기능 메서드로 검색 리스트를 출력하세요.
	      4) z54_DetailEmp.jsp로 요청값으로 사원번호를 넘겨서 json형식으로 하나의 사원정보를 json으로 출력하세요.
	      5) z55_deleteEmp.jsp로 요청값으로 사원번호를 넘겨서 {"delEmpCnt",0/1} 형식으로 삭제하고 삭제결과를 출력하세요.
[1단계:개념] 5. $.ajax({속성}) 속성과 속성값이 위 처리되는 위 jsp에 사용하는 변수와 어떤 연관 관계를 설명하세요
[1단계:확인] 6. 오늘한 부서정보 상세/수정/삭제기반으로 사원정보를 상세/수정/삭제 처리해보자.
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