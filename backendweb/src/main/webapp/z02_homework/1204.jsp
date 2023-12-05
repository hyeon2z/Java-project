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
	
	});
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2>타이틀</h2>

</div>
<%-- 
[1단계:개념] 1. c:set을 통하여 일반변수와 객체형 변수의 데이터를 할당하는 기본 형식을 설명하세요
기본 변수 : <c:set var = "변수명" value = "값" scope="page|request|session|application"/>
객체 변수 : <c:set var = "변수명" value = "<%=new 생성자('초기값')%> scope = page,request,session.../>
[1단계:개념] 2. 조건문의 형식을 예제에 따라 기술하세요
<c:if test = "${조건식}">
	true 일 때 처리할 process
</c:if>
<c:choose>
    <c:when test = "${조건1}">
        조건1에 해당하는 내용</c:when>
    <c:when test = "${조건2}">
        조건1을 제외하고 조건2에 해당하는 내용</c:when>
    <c:when test = "${조건3}">
        나열된 조건을 제외하고 조건3에 해당하는 내용</c:when>
    <c:other>
        위 나열된 조건이 아닐 때
        </c:other>
</c:choose>

[1단계:확인] 3. 구매금액에 따른 할인율을 c:set으로 설정하여 최종금액을 출력하세요.	
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name = "price" class="form-control mr-sm-2" placeholder="물건금액" />
	    <input name = "cnt" class="form-control mr-sm-2" placeholder="개수" />
	    <button class="btn btn-info" type="submit">최종금액 확인</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
	<c:set var = "tot" value = "${param.price * param.cnt }"></c:set>
	<c:set var = "discount" value = "0"></c:set>
	<c:if test = "${not empty param.price and not empty param.cnt }">
		<c:choose>
		    <c:when test = "${tot < 30000}">
		    <c:set var = "discount" value = "0.05"></c:set></c:when>
		    <c:when test = "${tot > 100000}">
		    <c:set var = "discount" value = "0.2"></c:set></c:when>
		    <c:otherwise><c:set var = "discount" value = "0.1"></c:set></c:otherwise>
		</c:choose>
	</c:if>
   <table class="table table-hover table-striped">
   	<col width="50%">
   	<col width="50%">
    <thead>
    
      <tr class="table-success text-center">
        <th>적용된 할인율</th>
        <th>최총 금액</th>
      </tr>
    </thead>	
    <tbody>
    	<tr><td>${(discount * 100)}%</td><td>${tot * (1-discount)}</td></tr>
	</table>    
    
</div>

[1단계:확인] 4. 설정값이 없을 때, 임의의 1~100사이 숫자를 정하고, 
해당 문제에 대한 hint로 크다/적다를 표시하여 최종 맞추었을 때, @@회 정답을 표시하세요~ 
		c:set, c:choose c:if문 활용.	
		
<%

if (session.getAttribute("number") == null) {
    int number = (int) (Math.random() * 100) + 1;
    session.setAttribute("number", number);
}
if (session.getAttribute("cnt") == null){
	int cnt = 0;
	session.setAttribute("cnt", cnt);
}

%>
</head>

<body>
<div class="jumbotron text-center">
  <h2>숫자퀴즈</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name = "answer" type = "number" class="form-control mr-sm-2" placeholder="1~100 숫자입력" />
	    <button class="btn btn-info" type="submit">제출</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
	    <c:set var="result" value="숫자를 입력"/>
        <c:set var="number" value="${sessionScope.number}"/>
        <c:set var="cnt" value="${sessionScope.cnt}"/>
    	<c:choose>
            <c:when test="${number == param.answer}">
                <c:set var="result" value="정답!! ${cnt}회 시도" scope="session"/>
                <%session.invalidate();%>
            </c:when>
            <c:when test="${number > param.answer}">
                <c:set var="result" value="정답보다 큰 수 입니다." />
                <c:set var="cnt" value="${cnt + 1}" scope="session"/>
            </c:when>
            <c:when test="${number < param.answer}">
                <c:set var="result" value="정답보다 작은 수 입니다."/>
                <c:set var="cnt" value="${cnt + 1}" scope="session"/>
            </c:when>
        </c:choose>
    
	
	
   <table class="table table-hover table-striped">
    <thead>
    
      <tr class="table-success text-center">
        <th>결과</th>
        <th>정답</th>
        <th>횟수</th>
    </thead>	
    <tbody>
    	<tr><td>${result}</td><td>${number}</td><td>${cnt}</td></tr></tbody>
	</table>
--%>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="제목" name=""  class="form-control mr-sm-2" />
	    <input placeholder="내용" name=""  class="form-control mr-sm-2"/>
	    <button class="btn btn-info" type="submit">Search</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
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