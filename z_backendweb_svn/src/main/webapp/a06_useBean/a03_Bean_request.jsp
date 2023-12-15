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
1. 아래와 같은 요청값이 있을 때, setProperty구조만 잘 되어 있으면,
	요청값이 처리가 된다.
2. 기본 요청값 처리 예시1
	페이지?name=홍길동&age=25
	
	String name = request.getPararmeter("name");
	if(name==null) name="";
	String ageStr = request.getParameter("age");
	if(ageStr==null) ageStr = "0";
	int age = Integer.parseInt(ageStr);
	Person p01 = new Person(name,age);
	session.setAttribute("p01",p01);
	==>
	<jsp:useBean id="p01" class="XXX.vo.Person" scope="session"/>
	<jsp:setProperty name="p01" property="*" />
	
	
	
	<jsp:setProperty name="p01" property="name"/>	
	<jsp:setProperty name="p01" property="age"/>
	
	요청값이 위 형식으로 처리할 때, class선언시, setName이 있고,
	setAge가 있으면, 그 메서드명과 함께 데이터 유형이 해당 데이터유형에
	맞게 선언되어 있으면 bean객체에 할당이 된다.
	주의 숫자형인 경우 반드시 숫자형태의 데이터를 요청값으로 설정하여야 한다.
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
	
	});
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2>UseBean을 활용한 요청값 처리</h2>
  <%-- form에 name과 age를 입력 후 submit 처리하면, 
  	?name=홍길동&age=25 형식으로 전달이 된다. 
  class를 구성시
  	setName의 문자열을 받은 메서드 선언	
  	setAge의 숫자를 받은 메서드 선언	
  	
  	--%>
  <jsp:useBean id="p01" class="backendweb.z01_vo.Person"/>	
  <jsp:setProperty property="name" name="p01"/>	
  <jsp:setProperty property="age" name="p01"/>
  <h2>요청값으로 전송되었을 때, 받는 값</h2>	
  <h3>이름:${p01.name}</h3>	
  <h3>나이:${p01.age}</h3>	

</div>
<%-- 
		
--%>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="이름" name="name"  class="form-control mr-sm-2" />
	    <input placeholder="나이" name="age"  class="form-control mr-sm-2"/>
	    <button class="btn btn-info" type="submit">Search</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
	<%-- ex1) 기존 클래스 이용해서 요청값 Bean 객체 호출 처리 Dept
			부서번호, 부서명, 부서위치			 --%>
	<form>	 
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="부서번호" name="deptno"  class="form-control mr-sm-2" />
	    <input placeholder="부서명" name="dname"  class="form-control mr-sm-2"/>
	    <input placeholder="부서위치" name="loc"  class="form-control mr-sm-2"/>
	    <button class="btn btn-info" type="submit">부서정보전송</button>
 	</nav>
	</form>	
	<jsp:useBean id="dept" class="backendweb.z01_vo.Dept"/>
	<jsp:setProperty property="deptno" name="dept"/>
	<jsp:setProperty property="dname" name="dept"/>
	<jsp:setProperty property="loc" name="dept"/>
	<h2>부서번호:${dept.deptno}</h2>
	<h2>부서명:${dept.dname}</h2>
	<h2>부서위치:${dept.loc}</h2>
	<form>
	<%--  ex2) 주문할 음식명, 주문갯수, 가격 class Food 추가해서 처리 
	fname ordercnt price
	--%>
	<jsp:useBean id="food" class="backendweb.z01_vo.Food"/>
	<jsp:setProperty property="fname" name="food"/>
	<jsp:setProperty property="ordercnt" name="food"/>
	<jsp:setProperty property="price" name="food"/>
	<h2>주문!!</h2>
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="음식명" name="fname"  class="form-control mr-sm-2" />
	    <input placeholder="주문갯수" name="ordercnt"  class="form-control mr-sm-2"/>
	    <input placeholder="가격" name="price"  class="form-control mr-sm-2"/>
	    <button class="btn btn-info" type="submit">음식 주문</button>
 	</nav>
	</form>
	<h3>주문 음식명:${food.fname}</h3>
	<h3>주문 음식 가격:${food.price}</h3>
	<h3>주문 음식 갯수:${food.ordercnt}</h3>
		
		
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