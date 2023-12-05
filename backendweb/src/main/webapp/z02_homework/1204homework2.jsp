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
		<%-- 
	
		--%>	
	});
</script>
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