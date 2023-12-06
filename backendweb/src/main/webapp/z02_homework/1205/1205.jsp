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
[1단계:개념] 1. c:forEach의 기본형식을 일반 카운트와 배열형데이터를 나누어서 예제와 함께 설명하세요
<c:forEach var = "i" begin = "3" end = "30" step = "3">
    <td>${i}</td>
</c:forEach>

<%
pageContext.setAttribute("member", new String[]{"철수","민수","영희","미란"});
%>
   <table class="table table-hover table-striped">
    <thead>
    
      <tr class="table-success text-center">
        <th>count</th>
        <th>회원명</th>
      </tr>
    </thead>	
    <tbody>
    <c:forEach var = "member" items="${member}" varStatus="sts">
    	<tr>
    		<td>${sts.count }</td>
    		<td>${member }</td>
    	</tr>
    </c:forEach>
	</table>
	
[1단계:확인] 2. 아래 내용을 <c:forEach><c:if>를 사용
	1) <c:forEach>를 사용하여 1부터 20까지의 숫자를 출력하되, 홀수일 때는 '홀수', 짝수일 때는 '짝수'라고 표시하세요."	
	    
	    <c:forEach var = "num1" begin = "1" end = "20">
	    <c:set var = "type" value = "홀수"/>
	    <c:if test="${num1%2==0}">
	    	<c:set var = "type" value = "짝수"/>
	    </c:if>
	    	<tr>
		    	<td>${num1}</td>
		    	<td>${type}</td>
	    	</tr>
	    </c:forEach>
	    
	2) 구구단을 테이블로 출력하세요
	    <c:forEach var = "num1" begin = "1" end = "9">
    		<c:forEach var = "num2" begin = "1" end = "9">
		    	<c:set var = "gugu" value = "${num1}X${num2}"/>
		    		<tr>
			    		<td>${gugu}</td>
			    		<td>${num1*num2}</td>
		    		</tr>
    		</c:forEach>
    	</c:forEach>
    	
	3) 현재 달의 1일부터 마지막 날까지를 테이블 사용하여 타이틀은 요일 표시하여 날짜를 출력하세요.
		<table class="table table-hover table-striped">
		   	<thead>		    
		      <tr class="table-success text-center">
		        <th>일</th>
		        <th>월</th>
		        <th>화</th>
		        <th>수</th>
		        <th>목</th>
		        <th>금</th>
		        <th>토</th>
		      </tr>
		    </thead>	
		    <tbody>
		    	<tr>
		    	<c:forEach var = "num" begin = "1" end = "5">
		    		<th></th>
		    	</c:forEach>
		    	<c:forEach var = "date" begin = "1" end = "31">
		        	<c:if test="${date%7==3}"><tr></c:if>
		    		<th>${date}</th>
		    		<c:if test="${date%7==2}"></tr></c:if>
		    	</c:forEach>
		    </tbody>
		</table>	
		
[1단계:개념] 3. DB연동 후, <c:forEach> 처리하는 모듈 처리 순서를 기술하세요.
1. DB처리 모듈 생성
2. form 화면 처리
3. request객체로 DB 처리호출/요청값 처리
4. <c:forEach>를 통한 리스트데이터 출력

[1단계:확인] 4. <c:forEach>  사원정보 ename과 job으로 검색처리하여 출력하는 화면을 구현하세요
<%
PreparedStmtDao dao = new PreparedStmtDao();

String ename = request.getParameter("ename");
if(ename==null) ename="";

String job = request.getParameter("job");
if(job==null) job="";

request.setAttribute("empList", dao.getEmpList(new Emp(ename, job)));
%>

<table class="table table-hover table-striped">
   	<thead>
    
      <tr class="table-success text-center">
        <th>사원번호</th>
        <th>사원명</th>
        <th>직책</th>
        <th>관리자번호</th>
        <th>입사일</th>
        <th>급여</th>
        <th>보너스</th>
        <th>부서번호</th>
      </tr>
    </thead>	
    <tbody>
    <c:forEach var = "emp" items="${empList}">
    	<tr>
    		<td>${emp.empno}</td>
    		<td>${emp.ename}</td>
    		<td>${emp.job}</td>
    		<td>${emp.mgr}</td>
    		<td>${emp.hiredate}</td>
    		<td>${emp.sal}</td>
    		<td>${emp.comm}</td>
    		<td>${emp.deptno}</td>
    	</tr>
    </c:forEach>
    </tbody>
	</table>

[1단계:개념] 5. <fmt:formatNumber>, <fmt:formatDate>의 
속성과 속성값을 기본 예제를 통해서 기술하세요
<fmt:formatNumber value = "숫자데이터" 속성 = "속성값"/>

type : number(일반숫자), currency(통화), percent(%표시)
pattern : 사용자 정의 숫자 포맷을 지정
    - 속성값으로 설정 할 수 있는 포맷형식
        "###,##.##" : 천단위 구분 기호로 숫자포맷. 소숫점 이하 두 자리까지 표현한다.
        "000.0000" : 숫자 앞에 빈자리가 있으며 0으로 채우고, 소숫점 이하 네 자리까지 표현
        "$#.##0.00" : 통화 포맷을 사용하여 금액을 표시한다.
currencySymbol : 통화단위를 지정하여 표현할 때 사용
ex) <fmt:formatNumber value = "${price}" type = "percent"/>

<fmt:formatDate value = "날짜형데이터"
	type="date, time, full"
	dateStyle="full , short"
	timeStyle="full , short"
	pattern="z a h:mm"/>
위 형식들로 날짜형 데이터를 원하는 방식으로 출력할 떄 사용된다.
ex) <fmt:formatDate value="${now}" type="time" dateStyle="short"/>
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
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="사원이름" name="ename"  class="form-control mr-sm-2" />
	    <input placeholder="직책" name="job"  class="form-control mr-sm-2"/>
	    <button class="btn btn-info" type="submit">검색</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
<%--

	 


--%>
<%
PreparedStmtDao dao = new PreparedStmtDao();

String ename = request.getParameter("ename");
if(ename==null) ename="";

String job = request.getParameter("job");
if(job==null) job="";

request.setAttribute("empList", dao.getEmpList(new Emp(ename, job)));
%>
<div class="container">
   <table class="table table-hover table-striped">
   	<thead>
    
      <tr class="table-success text-center">
        <th>사원번호</th>
        <th>사원명</th>
        <th>직책</th>
        <th>관리자번호</th>
        <th>입사일</th>
        <th>급여</th>
        <th>보너스</th>
        <th>부서번호</th>
      </tr>
    </thead>	
    <tbody>
    <c:forEach var = "emp" items="${empList}">
    	<tr>
    		<td>${emp.empno}</td>
    		<td>${emp.ename}</td>
    		<td>${emp.job}</td>
    		<td>${emp.mgr}</td>
    		<td>${emp.hiredate}</td>
    		<td>${emp.sal}</td>
    		<td>${emp.comm}</td>
    		<td>${emp.deptno}</td>
    	</tr>
    </c:forEach>
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