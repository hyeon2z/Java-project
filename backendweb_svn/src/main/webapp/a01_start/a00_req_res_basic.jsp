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
1단계 페이지이동을 할 수 있는가?
	1) a href=""
	2) location.href=""
	3) form action=""
		 submit
2단계 페이지이동과 요청값 처리
	1) a href="페이지명?요청키=요청값"
	2) location.href="페이지명?요청키=요청값"
	3) form action="페이지명"
		  <input name="요청키" value="요청값"
		  <input type="submit"		  		 
3. 요청값 받기 : request.getParameter("요청키")
	1) 다른 페이지에서 action=""
	2) 같은 페이지에서 action=""
	3) 문자열 데이터 초기값 처리
	4) 숫자형 데이터 초기값 처리
	5) 요청값을 객체로 만들기.	
4. 요청값 전달을 Dao모듈과 연동해서 처리..

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
	1) a href=""
	2) location.href=""
	3) form action=""
		 submit		
		--%>	
	});
	function goPage(){
		location.href="a00_req_res_basic_rev.jsp";
	}
	function goPage2(){
		location.href="a00_req_res_basic_rev.jsp?greet=hello";
	}	
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2>1단계 페이지 이동</h2>
  <a href="a00_req_res_basic_rev.jsp">기본 link로 이동</a>
  <h3 onclick="goPage()">js 명령어로 이동</h3>
  <form action="a00_req_res_basic_rev.jsp">
  	<input type="submit" value="폼으로 이동"/>
  </form>
  <h2>2단계 페이지 이동(요청값)</h2>
  <a href="a00_req_res_basic_rev.jsp?greet=hello">기본 link로 이동</a>
  <h3 onclick="goPage2()">js 명령어로 이동</h3>
  <form action="a00_req_res_basic_rev.jsp">
  	<input type="text" name="greet" value="hello"/>
   	<input type="submit" value="폼으로 이동"/>
  </form> 
   
</div>
<div class="container">
	<h2>3단계 같은 페이지에서 요청값 처리(action 속성 생략)</h2>
	<%--
	a00_req_res_basic.jsp?bev=아이스+라떼
	# 문제발생...
	 --%>
	<form id="frm01" class="form"  method="get">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name="bev" class="form-control mr-sm-2" 
	    	placeholder="주문할음료 입력" />
	    <input name="price" type="number" class="form-control mr-sm-2" 
	    	placeholder="가격을 입력" />
	    	
	    <button class="btn btn-info" type="submit">주문</button>
 	</nav>
	</form>
   <table class="table table-hover table-striped">
   	<col width="50%"><col width="50%">
    <thead>
      <tr class="table-success text-center">
      	<%
      	// 요청값 형식 ?key=val   request.getParameter("key");
      	String bev = request.getParameter("bev");
      	System.out.println("나와라 제발.."+bev);
      	log("#### 나와라 제발.."+bev);
      	if(bev==null) bev = ""; // 같은 페이지 요청값에서 반드시 처리
      	String priceStr = request.getParameter("price");
      	log("##### 가격1:"+priceStr);
      	if(priceStr==null) priceStr="0";// 같은 페이지 요청값에서 반드시 처리
      	log("##### 가격2:"+priceStr);
      	int price = Integer.parseInt(priceStr);
      	log("##### 가격3:"+price);
      	%>
        <th><%=bev%>,<%=bev.equals("아이스 아메리카노")%></th>
        <th><%=price%>,<%=price+1000%></th>
      </tr>
    </thead>	
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