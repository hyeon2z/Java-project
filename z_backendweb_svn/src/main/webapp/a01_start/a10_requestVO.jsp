<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import = "backendweb.z01_vo.QuestBook"
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
  <h2 data-toggle="modal" data-target="#exampleModalCenter">방명록작성</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name="name" class="form-control mr-sm-2" placeholder="이름입력" />
	    <input name="money"  type="number"placeholder="축의금입력"  class="form-control mr-sm-2" />
	    <input name="msg" placeholder="방명록입력"  class="form-control mr-sm-2" />
	    <button class="btn btn-info" type="submit">Search</button>
 	</nav>
	</form>
	<%
	String name = request.getParameter("name");
	if(name==null) name="";
	String moneyStr = request.getParameter("money");
	if(moneyStr==null) moneyStr="0";
	int money = Integer.parseInt(moneyStr);
	String msg = request.getParameter("msg");
	if(msg==null) msg = "";
	QuestBook qb = new QuestBook(name,money,msg);
	%>
	<%--
	class QuestBook{
		private String name;
		private int money;
		private String msg;
		
	}
	
	
	결혼축하방명록
	이름:[    ]
	축의금:[    ]
	내용:[    ] [등록]
	
	==> 이름과 축의금, 내용을 입력하여 등록하면
	요청값을 문자, 숫자, 문자로 받아서 객체 GuestBook 에 할당하고,
	출력되게 하세요.
	1. 화면구성
		name="요청키"
	2. 요청값을 처리
		String name = request.getParameter("name");
		if(name==null) name="";	
	3. 객체를 위한 클래스 선언
	4. 객체 import
		객체 생성 : 생성자를 통해서 요청값 데이터 할당.
	5. 객체의 메서드를 통해서 출력..	
	
	
	
	 --%>
	
   <table class="table table-hover table-striped">
   	<col width="50%">
   	<col width="50%">
    <thead>
      <tr class="text-center">
        <th class="table-success">이름</th><td><%=qb.getName()%></td>
      </tr>
      <tr class="text-center">
        <th class="table-success">축의금</th><td><%=qb.getMoney()%></td>
      </tr>
      <tr class="text-center">
        <th class="table-success">방명록</th><td><%=qb.getMsg()%></td>
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