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
  <h2>회원정보</h2>
		<%-- 
ex) 등록 시 로딩되는 모달창의 form name을 변경해서 회원 버튼클릭 시,
    usebean과 perperty를 이용해서 테이블 리스트에 회원등록 정보를 출력하세요.
		--%>	
</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input value="${param.nameSch}" name = "nameSch" class="form-control mr-sm-2" placeholder="검색할 이름" />
	    <input value="${param.authSch}" name = "authSch" class="form-control mr-sm-2" placeholder="검색할 권한" />
	    <button class="btn btn-info" type="submit">Search</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
   <table class="table table-hover table-striped">
    <thead>
    <%--
    1. Member 클래스의 property 확인
    2. form의 name값 할당
    3. jsp:useBean Member 클래스 선언
    4. jsp:setProperty 선언
    5. 테이블에 ${mem.mno}... 등 형식으로 출력
     --%>
     
    <jsp:useBean id="m01" class = "backendweb.z01_vo.Member"/>
    <jsp:useBean id="dao" class = "backendweb.d01_dao.MemberDao"/>
    
    <jsp:setProperty property="*" name="m01"/>
    <c:if test="${not empty m01.id}">
    	<script>
    		var regCnt = "${dao.insertMember(m01)}"
    		alert(regCnt=="0"?"등록실패":"등록성공")
    	</script>
    </c:if>
      <tr class="table-success text-center">
        <th>사원번호</th>
        <th>사원명</th>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>권한</th>
        <th>포인트</th>
      </tr>
    </thead>	
    <tbody>
    <c:forEach var = "m" items = "${dao.getMemberList(param.nameSch, param.authSch)}">
    	<tr>
    		<td>${m.mno}</td>
    		<td>${m.name}</td>
    		<td>${m.id}</td>
    		<td>${m.pwd}</td>
    		<td>${m.auth}</td>
    		<td>${m.point}</td>
    	</tr>
    </c:forEach>
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
	        <input type="text" class="form-control" placeholder="사원번호 입력" name="mno">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="사원명 입력" name="name">
	      </div>
	     </div>
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="아이디 입력" name="id">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="비밀번호 입력" name="pwd">
	      </div>
	     </div>
	     <div class="row">
	      <div class="col">
	        <input type="text" class="form-control" placeholder="사원권한 입력" name="auth">
	      </div>
	      <div class="col">
	        <input type="text" class="form-control" placeholder="포인트 입력" name="point">
	      </div>
	     </div>
	    </form> 
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" onclick = '$("#frm02").submit();' class="btn btn-primary">회원 등록처리</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>