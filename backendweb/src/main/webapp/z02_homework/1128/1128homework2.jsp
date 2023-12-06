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

<body>
<div class="jumbotron text-center">
  <h2 data-toggle="modal" data-target="#exampleModalCenter">피자주문</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	  		<select name = "topings" size="2"
  	    	multiple="multiple" class="form-control mr-sm-2">
  	    	<option>올리브</option>
  	    	<option>페퍼로니</option>
  	    	<option>치즈</option>
  	    </select>
  	    <button class="btn btn-info" type="submit">선택완료</button>
	</form>
	<%
	String[] topings = request.getParameterValues("topings");
	StringBuffer sbtops = new StringBuffer();
	int price = 10000;
	if(topings!=null){
		for(String toping:topings){
			sbtops.append(toping);
		}
	}
	String toping = sbtops.toString();
	switch(toping){
	case "올리브":
		price += 1000;
		break;
	case "페퍼로니":
		price += 2500;
		break;
	case "치즈":
		price += 2000;
		break;
	case "올리브페퍼로니":
		price += 3500;
		break;
	case "올리브치즈":
		price += 3000;
		break;
	case "페퍼로니치즈":
		price += 4500;
		break;
	case "올리브페퍼로니치즈":
		price += 5500;
		break;
	}
	%>
   <table class="table table-hover table-striped">
   	
    <thead>
    
      <tr class="table-success text-center">
        <th>가격</th>
      </tr>
    </thead>	
    <tbody>
    	<tr><td><%=price %></td></tr></tbody>
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