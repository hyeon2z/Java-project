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
	
	});
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2>쿠키만들기1</h2>
  <%
  response.addCookie(new Cookie("menu01","pizza"));
  %>
  <a href="a04_showCookie.jsp">쿠키값확인 하러가기</a>
</div>
	<%-- 쿠키의 키와 값.. 
	
	ex)  a03_makeCookie.jsp 쿠키만들기  
			menu01   pizza 로 쿠키의 키와 값을 만들고
		 a04_showCookie.jsp 에서 쿠키를 확인하세요.
		 1단계) 위와 같이 무조건 쿠키값 설정(영문)
		 2단계) 요청값을 쿠키값 설정.(영문)
		 
		 
	--%>
<%
	String name = request.getParameter("name");
	String val = request.getParameter("val");
	if(name!=null && val!=null){
		response.addCookie(new Cookie(name, val));
		// 자바 코드에 의해서 script가 나올지 나오지 않을지를 결정 가능.
%>
		<script>
			alert("쿠키 생성!")
			// 자바의 변수할당 데이터를 자바스크립트로 할당 가능..
			var name = "<%=name%>";
			<%--
			javascript의 조건에 의해 자바를 변경하는 건 불가능하다.
			if(name=="himan"){
				<%=val%> = "1000";
			}
			--%>
			
			
		</script>		
<%		
	}
%>	
<div class="container">
	<h2>쿠키만들기2(요청값-영문만!)</h2>
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="쿠키키입력" name="name"  class="form-control mr-sm-2" />
	    <input placeholder="쿠키값입력" name="val"  class="form-control mr-sm-2"/>
	    <button class="btn btn-info" type="submit">쿠키생성</button>
 	</nav>
	</form>
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