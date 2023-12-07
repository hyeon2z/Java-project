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
# useBean을 활용한 요청값 처리
1. 아래와 같은 요청값이 있을 때, setProperty구조만 잘 되어 있으면 요청값이 처리가 된다.

2. 기본 요청값 처리 예시
    페이지?name=홍길동&age=25
    
    String name = request.getParameter("name");
    if(name==null) name="";
    
    String ageStr = request.getParameter("age");
    if(ageStr==null) ageStr = "0";
    
    int age = Integer.parseInt(ageStr);
    
    Person p01 = new Person(name, age);
    session.setAttribute("p01", p01);
    
    ==>
    
    <jsp:useBean id = "p01" class = "XXX.vo.Person" scope = "session"/>
    <jsp:setProperty name = "p01" property = "*"/>
    
    <jsp:setProperty name = "p01" property = "name"/>
    <jsp:setProperty name = "p01" property = "age"/>
    
    요청값이 위 형식으로 처리될 때, class 선언 시 setName이 있고, setAge가 있으면
    그 메서드명과 함께 데이터 유형이 해당 데이터유형에 맞게 선언된어 있다면 bean객체에 할당이 된다.
    주의) 숫자형인 경우 반드시 숫자형태의 데이터를 요청값으로 설정하여야 한다.
    ${p01.name} ==> 홍길동
    ${p01.age} ==> 25

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
  <h2>UseBean을 활용한 요청값 처리</h2>
	<%-- form에 name과 age를 입력 후 submit 처리하면,
		?name=홍길동&age=25 형식으로 전달이 된다.
	
	class를 구성 시
	    setName의 문자열을 받는 메서드 선언
	    setAge의 문자열을 받는 메서드 선언
	    
		 --%>
	
	<jsp:useBean id="p01" class = "backendweb.z01_vo.Person"/>
	<jsp:setProperty property="name" name="p01"/>
	<jsp:setProperty property="age" name="p01"/>
	<h2>요청값으로 전송되었을 때, 받는 값</h2>
	<h3>이름 : ${p01.name}</h3>
	<h3>나이 : ${p01.age }</h3>
	
	<jsp:useBean id="d01" class = "backendweb.z01_vo.Dept"/>
	<jsp:setProperty property="deptno" name="d01"/>
	<jsp:setProperty property="dname" name="d01"/>
	<jsp:setProperty property="loc" name="d01"/>
	
	<jsp:useBean id="f01" class = "backendweb.z01_vo.Food"/>
	<jsp:setProperty property="name" name="f01"/>
	<jsp:setProperty property="cnt" name="f01"/>
	<jsp:setProperty property="price" name="f01"/>
	
	<h3>부서번호 : ${d01.deptno}</h3>
	<h3>부서명 : ${d01.dname}</h3>
	<h3>부서위치 : ${d01.loc}</h3>
	
	<h3>음식명 : ${f01.name }</h3>
	<h3>주문갯수 : ${f01.cnt }</h3>
	<h3>가격 : ${f01.price }</h3>
	<h3>총계 : ${f01.cnt*f01.price}</h3>
</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name = "name" class="form-control mr-sm-2" placeholder="이름" />
	    <input name = "age" class="form-control mr-sm-2" placeholder="나이" />
	    <input name = "deptno" class="form-control mr-sm-2" placeholder="부서번호" />
	    <input name = "dname" class="form-control mr-sm-2" placeholder="부서명" />
	    <input name = "loc" class="form-control mr-sm-2" placeholder="부서위치" />
	    <input name = "name" class="form-control mr-sm-2" placeholder="음식명" />
	    <input name = "cnt" class="form-control mr-sm-2" placeholder="주문개수" />
	    <input name = "price" class="form-control mr-sm-2" placeholder="가격" />
	    <button class="btn btn-info" type="submit">Search</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
	<%-- ex) 기존 클래스 이용해서 요청값 Bean 객체 호출처리 Dept 부서번호, 부서명, 부서위치
	
		ex2) 주문할 음식명, 주문갯수, 가격 class Food 추가해서 처리
	 --%>
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