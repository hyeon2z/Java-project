<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"
    import="backendweb.d01_dao.*"
    import="java.net.URLEncoder"
    import="java.net.URLDecoder"
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
  <h2>쿠키 삭제</h2>

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
   <table class="table table-hover table-striped">
   	<col width="50%">
   	<col width="50%">
    <thead>
    
      <tr class="table-success text-center">
        <th>쿠키 키</th>
        <th>쿠키 값</th>
      </tr>
    </thead>
    <tbody>
    	<%
    	Cookie [] cookies = request.getCookies();
    	for(Cookie c : cookies){
    		if(!c.getName().equals("JSESSIONID")){
    			String name = URLDecoder.decode(c.getName(), "UTF-8");
    		%>
    	<%-- java 코드를 매개변수 함수로 넘길 때,
    	문자열일 때, 반드시 ''사이로 전달하여야 한다..(주의
    	 --%>
    	<tr ondblclick="delCookie('<%=name%>')">
    		<td><%=name%></td>
    		<td><%=URLDecoder.decode(c.getValue(),"UTF-8") %></td>
    	</tr>		
    	<%
    		}
    	}
    	%>	
    </tbody>
    <script>
    	function delCookie(key){
    		if(confirm(key+"쿠키를 삭제하시겠습니까?")){
    			location.href="a10_deleteCookie.jsp?key="+key;
    		}
    	}
    </script>
	</table>
	<a href="a05_cookie_encoding.jsp">쿠키 등록하러 가기</a>    
</div>
<%--
ex) a07_memberReg_cookie.jsp 회원의 아이디와 패스워드를 쿠키값으로 등록
    등록 성공 회원(쿠키)리스트 확인
    a08_memberShow_cookie.jsp
    등록 회원리스트 확인.
 --%>
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