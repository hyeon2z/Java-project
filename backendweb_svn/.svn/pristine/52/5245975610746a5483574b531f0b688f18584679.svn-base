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
<%--
# out 기본 객체
1. jsp 페이지가 생성하는 모든 내용은 out 기본 객체를 통해서 client단에 
	전송할 수 있다. (출력이라기 보다 client단에 html을 만들어서 전송)
	==> (전송받은 내용을 브라우저에서 해석하여 출력)
2. 복잡한 if-else, for, while문을 사용할 때, out기본 객체 사용하면 편리하다.
	1) scriptlet, expression와 적절하게 혼용해서 사용하면
		효과적일 때가 있다.
3. 처리 메서드
	1) out.print("코드내용") : 데이터를 출력
	2) out.println("코드내용") : 데이터를 출력하고 줄바꿈 처리까지 한다.
	3) out.newLine() : 줄바꿈처리한다.

 --%>
<body>
<div class="jumbotron text-center">
  <h2>out 객체 활용</h2>
  <h3>script로만 처리</h3>
  <%for(int cnt=0;cnt<=10;cnt++){ %>
  		<%=cnt%>,
  <%} %><br>
  <h3>out 객체 활용</h3>
  <%
  	for(int cnt=0;cnt<=10;cnt++){
  		out.print(cnt+", ");
  	}
  %><br>
  
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
	<%--
	ex)  4X4테이블 생성 out 객체 활용
	
		<tr>
			<td>1</td><td>2</td><td>3</td><td>4</td>
		</tr>
		<tr>
			<td>5</td><td>6</td><td>7</td><td>8</td>
		</tr>
				
	
	 --%>
   <table class="table table-hover table-striped">
   	<col width="25%">
   	<col width="25%">
   	<col width="25%">
   	<col width="25%">
    <tbody>
    	<%
    	for(int cnt=1;cnt<=16;cnt++){
    		// 조건문:  hint %(나머지 연산자 활용)
    		// cnt 1,5,9,13
    		if(cnt%4==1) out.print("<tr>");
    		out.print("<td>"+cnt+"</td>");
    		// 조건문
    		// cnt 4,8,12,16
    		if(cnt%4==0) out.print("</tr>");
    	}
    	%>
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