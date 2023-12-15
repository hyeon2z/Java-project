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
// 범위에 따라 같은 이름으로 처리..
pageContext.setAttribute("name", "홍길동");
request.setAttribute("name", "김길동");
session.setAttribute("name", "신길동");
application.setAttribute("name", "오길동");
//page scope로 저장 처리
pageContext.setAttribute("age", 25);
//ex)  page scope로 물건명, 가격, 갯수를 설정하고, 아래에 출력하세요
pageContext.setAttribute("pname", "사과");
pageContext.setAttribute("price", 2000);
pageContext.setAttribute("cnt", 5);
%>
<body>
<div class="jumbotron text-center">
	<h2>${pageScope.name}</h2>
	<h2>${requestScope.name}</h2>
	<h2>${sessionScope.name}</h2>
	<h2>${applicationScope.name}</h2>
	
  <h2 data-toggle="modal" data-target="#exampleModalCenter">page scope</h2>
  <h3>물건명:<%=pageContext.getAttribute("pname") %>,
  		${pname}, ${pageScope.pname}(페이지scope), 
  		${requestScope.pname}(request scope)</h3>		
  	<%-- 범위를 명시적으로 구분하여야 할 때는 ${범위scope.변수} --%>
  <h3>가격:<%=pageContext.getAttribute("price")%>, ${pageScope.price }</h3>		
  <h3>갯수:<%=pageContext.getAttribute("cnt")%>, ${pageScope.cnt }</h3>		
  <h3>name:<%=pageContext.getAttribute("name")%>, ${name}</h3>
  <h3>age:<%=pageContext.getAttribute("age")%>, ${age}</h3>
  <h3>age+10:<%=(Integer)pageContext.getAttribute("age") + 10%>, 
  		${age+10}</h3>

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