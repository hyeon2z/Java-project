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
String num01Str = request.getParameter("num01");
int num01 = 0;
if(num01Str!=null)
num01 = Integer.parseInt(num01Str);


String num02Str = request.getParameter("num02");
int num02 = 0;
if(num02Str!=null)
num02 = Integer.parseInt(num02Str);

String calcul = request.getParameter("calcul");
if(calcul==null) calcul="";

int result = 0;
while(true){
	switch(calcul){
		case "+":
			result = num01 + num02;
			break;
		case "-":
			result = num01 - num02;
			break;
		case "*":
			result = num01 * num02;
			break;
		case "/":
			if(num02!=0){
				result = num01 / num02;
				break;
			}else{
				break;
			}
	}
	break;
}
pageContext.setAttribute("result", result);

%>
<body>
<div class="jumbotron text-center">
  <h2>타이틀</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name = "num01" class="form-control mr-sm-2" placeholder="숫자 입력" />
	    <input name = "calcul" class="form-control mr-sm-2" placeholder="연산식 입력" />
	    <input name = "num02" class="form-control mr-sm-2" placeholder="숫자 입력" />
	    <button class="btn btn-info" type="submit">계산</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
   <table class="table table-hover table-striped">
    <thead>
    
      <tr class="table-success text-center">
        <th>계산결과</th>
      </tr>
    </thead>	
    <tbody>
    	<tr><td><%=pageContext.getAttribute("result")%></td></tr></tbody>
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