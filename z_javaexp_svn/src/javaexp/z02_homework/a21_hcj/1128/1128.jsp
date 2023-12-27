<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<%--
[1단계:개념] 1. request객체가 가지고 있는 서버전송 정보 메서드의 기능에 대하여 출력하세요
			1) getRemoteAddr()
				웹 서버에 연결한 클라이언트의 ip 주소를 구한다. 게시판이나
				방명록 등에서 글 작성의 ip주소가 자동으로 입력되기도 하는데,
				이 때 입력되는 ip주소가 바로 이 메서드를 사용하여 구한 것이다.
			2) getMethod()
				웹 브라우저가 정보를 전송할 때 사용한 방식을 구한다.
				form의 method="get/post"
			3) getRequestURI()
				웹 브라우저가 요청한 url에서 경로를 구한다.
			4) getContextPath()
			jsp페이지가 속한 웹 어플리케이션의 컨텍스트 경로를 구한다.
			5) getServerName()
				연결할 때 사용한 서버 이름을 구한다.
			6) getServerPort()
				서버가 실행중인 포트 번호를 구한다.
[1단계:확인] 2. 요청값 VO객체 예제로 조사자명과 선호하는 음식 종류, 평점 선택하게 하고, 결과를 서버에 저장하는 설문조사 페이지 만들기.
			
[1단계:개념] 3. request.getParameterValues()가 일반 type="text"와 type="checkbox"일 때, 간단한 예제로 차이점을 기술하세요.
			<input type="text" name="fruit"/>
			<input type="text" name="fruits"/><input type="text" name="fruit"/>
			<%
			String fruit = request.getParameter("fruit");
			String[] fruits = request.getParameterValues("fruits");// 같은 이름이 여러개일때 배열로 받음
			%>
				<input type="checkbox" value="피자" name="foods"/>피자
				<input type="checkbox" value="치킨" name="foods"/>치킨
			<%
				String[] foods = request.getParameterValues("foods");// 체크박스 또한 같은 이름이 여러개일때 value값을 배열로 받음
			%>				
[1단계:확인] 4. 아래 내용을 checkbox와 radio를 이용하여 요청값을 처리하여 결과를 출력하세요.
	1) 피자 주문 시스템: 사용자가 여러 토핑을 선택할 수 있는 체크박스를 사용하여 피자를 주문하는 JSP 페이지를 만드세요. 각 토핑은 추가 비용을 가지고 있으며, 최종 가격을 계산하여 보여줍니다.
	2) 설문 조사 양식: 다양한 주제에 대한 사용자의 선호도를 묻는 라디오 버튼 기반 설문 조사를 만드세요. 각 질문은 여러 선택지를 가지며, 사용자는 하나만 선택할 수 있습니다.
	3) 영화 장르 선택기: 사용자가 선호하는 영화 장르를 select박스로 멀티선택하고, 그에 따라 추천 영화 목록을 보여주는 페이지를 작성하세요.

# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분 없음
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유 1명 지각 열차고장으로인한 열차지연
3. 수업 시간 긍적적으로 집중하였는가?   네

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
		<%-- 
		
		--%>	
	});
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2 data-toggle="modal" data-target="#exampleModalCenter">타이틀</h2>

</div>
<h2>1번</h2>
1) getRemoteAddr():<%=request.getRemoteAddr() %><br>
2) getMethod():<%=request.getMethod() %><br>
3) getRequestURI():<%=request.getRequestURI() %><br>
4) getContextPath():<%=request.getContextPath() %><br>
5) getServerName():<%=request.getServerName() %><br>
6) getServerPort():<%=request.getServerPort() %><br>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input class="form-control mr-sm-2" placeholder="제목" />
	    <input class="form-control mr-sm-2" placeholder="내용" />
	    <button class="btn btn-info" type="submit">Search</button>
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
    	<tr><td></td><td></td><td></td><td></td><td></td></tr>
    	<tr><td></td><td></td><td></td><td></td><td></td></tr>
    	<tr><td></td><td></td><td></td><td></td><td></td></tr>
    </tbody>
	</table>    
    
</div>
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">타이틀</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
		<form id="frm02" class="form"  method="post">
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="사원명 입력" name="ename">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="직책명 입력" name="job">
	      </div>
	     </div>
	    </form> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>