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
<%--
[1단계:개념] 1. jsp:useBean 속성의 의미를 기본 예제를 통해서 설명하세요
웹 프로그래밍에서 데이터 표현을 목적으로 사용한다.
<jsp:useBean id = "선언하는 useBean의 이름" class = "패키지명.클래스이름(경로)" 
	scope = "page|request|session|application">
	
[1단계:개념] 2. property란 무엇인지? jsp:setProperty/jsp:getProperty를 통해서 설명하세요
<jsp:setProperty name = "useBean 아이디명" property = "프로퍼티명" value = "할당값"
 ==> 해당 setProperty는 p01.setName("김길동") 과 같고
<jsp:getProperty name = "useBean 아이디명" property = "프로퍼티명"
 ==> 해당 getProperty는 p01.getName() 과 같음.

[1단계:확인] 3. 실습예제(아래 내용을 class와 form을 추가하여 처리하세요)
	1) useBean 태그를 사용하여 Order 객체의 orderId와 orderDate 속성을 출력하는 코드를 작성하세요
		
		  <c:set var = "now" value="<%=new Date() %>"/>
		<jsp:useBean id="order01" class="backendweb.z01_vo.Order"/>
		<jsp:setProperty property="orderId" name="order01" value="주문1"/>
		<jsp:setProperty property="orderDate" name="order01" value = "${now}"/>
		<jsp:getProperty property="orderId" name="order01"/>
		<jsp:getProperty property="orderDate" name="order01"/>
		
	2) useBean과 getProperty를 사용해 사용자의 이메일 주소를 표시하는 페이지를 만드세요.
	   <table class="table table-hover table-striped">
	    <thead>
	      <tr class="table-success text-center">
	        <th>사용자 이름</th>
	        <th>사용자 이메일</th>
	      </tr>
	      <jsp:useBean id="user01" class = "backendweb.z01_vo.User"/>
	      <jsp:setProperty property="name" name="user01" value = "홍길동"/>
	      <jsp:setProperty property="email" name="user01" value = "gildong@naver.com"/>
	    </thead>	
	    <tbody>
	    	<tr>
	    		<td>${user01.name}</td>
	    		<td>${user01.email}</td>
	    	</tr>
	    </tbody>
		</table> 
		 
	3) 사칙연산을 수행하는 간단한 계산기를 구현하세요(form,vo,useBean 출력)
		<form id="frm01" class="form"  method="post">
		  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
			    <input type = "number" placeholder="숫자입력" name="num1"  class="form-control mr-sm-2" />
			    <input placeholder="연산자 입력" name="oper"  class="form-control mr-sm-2" />
			    <input type = "number" placeholder="숫자입력" name="num2"  class="form-control mr-sm-2"/>
			    <button class="btn btn-info" type="submit">계산</button>
			    <button class="btn btn-success" 
			    	data-toggle="modal" data-target="#exampleModalCenter"
			        type="button">등록</button>
		 	</nav>
		</form>
		   <table class="table table-hover table-striped">
		    <thead>
		      <tr class="table-success text-center">
		        <th>결과</th>
		      </tr>
		      <jsp:useBean id="calcul" class = "backendweb.z01_vo.Calculator"/>
		      <jsp:setProperty property="*" name="calcul"/>
		    </thead>	
		    <tbody>
		    	<tr>
		    	<c:if test="${calcul.oper=='+'}">
		    	<td>${calcul.num1+calcul.num2}</td>
		    	</c:if>
		    	<c:if test="${calcul.oper=='-'}">
		    	<td>${calcul.num1-calcul.num2}</td>
		    	</c:if>
		    	<c:if test="${calcul.oper=='*'}">
		    	<td>${calcul.num1*calcul.num2}</td>
		    	</c:if>
		    	<c:if test="${calcul.oper=='/'}">
		    		<c:if test="${calcul.num2!=0}">
		    			<td>${calcul.num1/calcul.num2}</td>
		    		</c:if>
		    		<c:if test="${calcul.num2==0}">
		    			<td><script>
		    				alert("0으로 나눌수 없음")
		    			</script></td>
		    		</c:if>
		    	</c:if>
		    	</tr>
		    </tbody>
			</table>

[1단계:확인] 4. useBean dao 처리 예제를 기반으로 부서정보리스트와 부서정보등록을 useBean을 통해서 처리하세요.

   <table class="table table-hover table-striped">
    <thead>
      <jsp:useBean id="d01" class = "backendweb.z01_vo.Dept"/>
      <jsp:useBean id="dao" class = "backendweb.d01_dao.PreparedStmtDao"/>
      <jsp:setProperty property="*" name="d01"/>
      <c:if test="${not empty d01.dname}">
		<script>
			var insCnt = "${dao.insertDept(d01)}"
			alert(insCnt=="0"?"등록실패":"등록성공")
		</script>      
      </c:if>
      <tr class="table-success text-center">
        <th>부서번호</th>
        <th>부서명</th>
        <th>부서위치</th>
      </tr>
    </thead>	
    <tbody>
    <c:forEach var="d" items="${dao.getDeptList(param.dnameSch, param.locSch)}">
    	<tr>
    		<th>${d.deptno}</th>
    		<th>${d.dname }</th>
    		<th>${d.loc }</th>
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
	        <input type="text" class="form-control" placeholder="부서번호 입력" name="deptno">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="부서명 입력" name="dname">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="부서위치 입력" name="loc">
	      </div>
	     </div>
	    </form> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" onclick='$("#frm02").submit();' class="btn btn-primary">등록하기</button>
      </div>
    </div>
  </div>
</div>

[1단계:개념] 5. 쿠키와 세션의 차이점을 기술(개념과 코드)하세요.
정보를 서버에 보관해서 사용하는 것을 세션이라고 하고
서버에 보관되는 메모리의 부담을 줄이기 위해 클라이언트에 저장하는 것을 쿠키라고 함.

session.setAttribute("cookie01", "test") <- 세션에 저장

Cookie c1 = new Cookie("cookie01", "test"); <- 쿠키 생성
response.addCookie(c1); <- 클라이언트로 보내기

 --%>
<div class="jumbotron text-center">
  <h2>사용자 정보</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="부서명 입력" name="dnameSch"  class="form-control mr-sm-2" />
	    <input placeholder="부서위치 입력" name="locSch"  class="form-control mr-sm-2" />
	    <button class="btn btn-info" type="submit">검색</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
	<%--
[1단계:확인] 4. useBean dao 처리 예제를 기반으로 부서정보리스트와 부서정보등록을 useBean을 통해서 처리하세요.
	 --%>
   <table class="table table-hover table-striped">
    <thead>
      <jsp:useBean id="d01" class = "backendweb.z01_vo.Dept"/>
      <jsp:useBean id="dao" class = "backendweb.d01_dao.PreparedStmtDao"/>
      <jsp:setProperty property="*" name="d01"/>
      <c:if test="${not empty d01.dname}">
		<script>
			var insCnt = "${dao.insertDept(d01)}"
			alert(insCnt=="0"?"등록실패":"등록성공")
		</script>      
      </c:if>
      <tr class="table-success text-center">
        <th>부서번호</th>
        <th>부서명</th>
        <th>부서위치</th>
      </tr>
    </thead>	
    <tbody>
    <c:forEach var="d" items="${dao.getDeptList(param.dnameSch, param.locSch)}">
    	<tr>
    		<th>${d.deptno}</th>
    		<th>${d.dname }</th>
    		<th>${d.loc }</th>
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
	        <input type="text" class="form-control" placeholder="부서번호 입력" name="deptno">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="부서명 입력" name="dname">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="부서위치 입력" name="loc">
	      </div>
	     </div>
	    </form> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" onclick='$("#frm02").submit();' class="btn btn-primary">등록하기</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>