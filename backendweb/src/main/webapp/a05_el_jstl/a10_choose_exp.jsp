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
</head>

<body>
<div class="jumbotron text-center">
  <h2>타이틀</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name = "product" placeholder="물건명 입력" class="form-control mr-sm-2" />
	    <input name = "price" placeholder="가격 입력" class="form-control mr-sm-2" />
	    <input name = "cnt" placeholder="개수 입력" class="form-control mr-sm-2" />
	    <button class="btn btn-info" type="submit">구매금액 확인하기</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
	<c:set var = "tot" value = "${param.price*param.cnt}"/>
	<c:set var = "grade" value = "가격과 갯수를 입력하세요"/>
	<c:if test="${not empty param.price and not empty param.cnt}">
		<c:choose>
    		<c:when test = "${tot >= 30000}"><c:set var="grade" value="VIP"/></c:when>
    		<c:when test = "${tot > 100000}"><c:set var="grade" value="MVP"/></c:when>
			<c:otherwise><c:set var="grade" value="일반고객"/></c:otherwise>
    	</c:choose>
	</c:if>
   <table class="table table-hover table-striped">
   	<col width="33%">
   	<col width="33%">
   	<col width="34%">
    <thead>
    
      <tr class="table-success text-center">
        <th>물건명</th>
        <th>총계</th>
        <th>고객등급</th>
      </tr>
    </thead>	
    <tbody>
    	<tr><td>
		${param.product}    	
    		</td>
    		<td>
		${tot}
    		</td>
    		<td>
    	${grade }
    		</td>
    	</tr>
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