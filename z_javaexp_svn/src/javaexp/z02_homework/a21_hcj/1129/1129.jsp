<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<%

%>
<%--
[1단계:개념] 1. response.sendRedirect()와 a href의 차이점을 예제를 통해서 기술하세요
		response.sendRedirect() 는 요청값을 받은 서버단안에서 페이지 이동 결정..
		<select onchange='$("#frm01").submit()' name="pageName" class="form-control mr-sm-2">
	    	<option value="">이동할페이지 선택</option>
	    	<option value="A.jsp">관리자페이지</option>
	    	<option value="B.jsp">일반사용자페이지</option>
	    </select>
	    response.sendRedirect(pageName)
	    response.sendRedirect() 웹 서버 측에서 웹 브라우저에게 어떤 페이지로 이동하라고 지정
		
[1단계:확인] 2. response.sendRedirect()를 이용하여, 입력한 점수에 따른 평가 페이지를 다르게 처리하세요
		
[1단계:개념] 3. session scope의 범위에 대하여 설명하세요.
		브라우저 단위 같은 브라우저에서는 값이 공유되고 다른 브라우저로 같은 페이지를 켰을때는
		값이 공유가 되지않는다 
		같은브라우저라도 해당브라우저를 전부닫고 값을 보내는 페이지는 안거치바로 바로 
		요청값이 필요한 페이지를 실행시 값을 받아오지 못함
[1단계:개념] 4. session scope 일반변수/객체 할당하는 형식을 기본 코드 예제와 함께 기술하세요
	session.setAttribute("name","홍길동");
	session.setAttribute("p01",new Object());
	
[1단계:확인] 5. session scope의 범위별 설정 예제 문제
	1) Page Scope 사용하기: 단일 JSP 페이지에서만 사용되는 임시 계산 변수를 page 범위로 선언하고 사용하는 예제를 작성하세요.
	<%
	pageContext.setAttribute("name","홍길동");
	%>
	<%=pageContext.getAttribute("name")%>
	또는 el
	${name}
	2) Request Scope 데이터 전달: 하나의 JSP 페이지에서 다른 JSP 페이지로 데이터를 전달하는 과정에서 request 범위를 사용하는 예제를 작성하세요.
		ex) 요청값의 물건가격과 갯수로 전달하고 request범위로 총계를 할당하여, 최종페이지에  총계출력
		request.setAttribute("prod",new Product("사과",1500,3));
		
		
		RequestDispatcher rd = request.getRequestDispatcher("전달할 페이지");
		rd.forward(request,response);
		
		--최종페이지--
		
		<%
		Product p01 = (Product)request.getAttribute("prod");
		if(p01!=null){
		%>
		<h3><%=p01.getName()%></h3>
		<h3><%=p01.getPrice()%></h3>
		<h3><%=p01.getCnt()%></h3>
		<h3>${prod.price * prod.cnt}</h3>
		<%}else{ %>
		<h3>상품없음</h3>
		
		<%}%>
		
		
		
		
	3) Session Scope 로그인 관리: 사용자 로그인 정보를 session 범위를 사용하여 관리하는 로그인 및 로그아웃 기능을 구현하는 예제를 작성하세요.
	
	
	4) Application Scope의 공유 데이터: 웹 애플리케이션의 모든 사용자에게 공유되는 설정 정보를 application 범위로 관리하는 예제를 작성하세요.
	
	
	5) Session Scope와 쇼핑 카트: 온라인 쇼핑 사이트에서 session 범위를 사용하여 사용자별 쇼핑 카트를 관리하는 예제를 작성하세요.
	

1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분 없음
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유 :수업시간 늦음 홍충재:화장실 칸수가 기다리는 시간이 김
3. 수업 시간 긍적적으로 집중하였는가?  네

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
  <h2>타이틀</h2>
  <%
	pageContext.setAttribute("name","홍길동");
	%>
	<%=pageContext.getAttribute("name")%>
	또는 el
	${name}

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input class="form-control mr-sm-2" placeholder="제목" />
	    <input class="form-control mr-sm-2" placeholder="내용" />
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