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
<%--
#  객체 설정하여 처리
1. 각 session scope 변수뿐만 아니라 객체도 설정할 수 있다.
2. 형식
	1) 설정하기 
	pageContext.setAttribute("객체명", new 객체());
	2) 가져오기
		객체명 참조명 = (객체타입)pageContext.getAttribute("객체명");
		참조명.메서드();
		${객체명.property명}
		
	ps) property명 객체의 set/get메서드에 대한 호출명으로 getXXX()메서드인경우
	${객체명.XXX}로 set/get을 뺀 메서드명(property명)으로 el의 경우 
	호출이 가능하다.	
	

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
<%
pageContext.setAttribute("p01", new Person("홍길동",25,"서울"));
pageContext.setAttribute("mem", new Member(1000, "홍길동", "himan", "7777", "관리자",1000));
%>
<body>
<div class="jumbotron text-center">
  <h2>객체 처리</h2>
  <h3>${mem.id}</h3> 
  <%-- el을 활용하면 객체 할당 없이 바로 사용 객체가 없더라도 
  nullpointer예외발생 하지 않는 장점이 있다.--%>
<%
Person p01 = (Person)pageContext.getAttribute("p01");
Member m01 = (Member)pageContext.getAttribute("mem");
%>  
	<h3>아이디:<%=m01.getId()%>, ${mem.id}</h3>
	<h3>이름:<%=m01.getName()%>, ${mem.name}</h3>
	<h3>권한:<%=m01.getAuth()%>, ${mem.auth}</h3>
	<h3>포인트:<%=m01.getPoint()%>, ${mem.point}</h3>
	<%-- 주의 ) property는 속성(필드)가 아니고, 메서드의 get/set에서
				 해당 이름만 뽑아서 첫자를 소문자로 처리한 것이다.
				 getName() ==> Name() ==> Name ==> name(property) --%>
	<h3>이름:<%=p01.getName()%>, ${p01.name}</h3>
	<h3>나이:<%=p01.getAge()%>, ${p01.age}</h3>
	<h3>사는곳:<%=p01.getLoc()%>, ${pageScope.p01.loc}</h3>
								<%-- scope범위 구분시.. --%>
	<%-- ex) Member 객체 설정 및 호출, el태그로도 호출 처리하세요. --%>
</div>
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