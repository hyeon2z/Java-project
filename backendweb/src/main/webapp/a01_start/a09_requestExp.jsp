<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.BSPlayer"
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
  <h2 data-toggle="modal" data-target="#exampleModalCenter">타율계산</h2>

</div>
<%--
# 입력값을 받은 내용을 객체로 사용하는 이유는 해당 데이터를 한꺼번에
 매개변수로 객체로 전송하기 위하여 사용한다.
 --%>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name = "player" type = "text" class="form-control mr-sm-2" placeholder="선수이름" />
	    <input name = "batCnt" type = "number" class="form-control mr-sm-2" placeholder="타석입력(숫자)" />
	    <input name = "antaCnt" type = "number" class="form-control mr-sm-2" placeholder="안타수 입력(숫자)" />
	    <button class="btn btn-info" type="submit">타율확인</button>
 	</nav>
	</form>
	<%--
	name 값을 설정하고, 요청값을 받아서 하단에 타율을 출력
	 --%>
	 <%
	 String player = request.getParameter("player");
	 if(player==null) player="";
	 
	 String batCntStr = request.getParameter("batCnt");
	 double batCnt = 0;
	 if(batCntStr==null) batCntStr = "0";
	 batCnt = Double.parseDouble(batCntStr);
	 
	 String antaCntStr = request.getParameter("antaCnt");
	 double antaCnt = 0;
	 if(antaCntStr==null) antaCntStr = "0";
	 antaCnt = Double.parseDouble(antaCntStr);
	
	 double batAvr = 0;
	 if(antaCnt!=0 || batCnt!=0){
		 batAvr = antaCnt / batCnt;
			  
	 }
	 /*
	 class BSPlayer
	     private String player;
	     private double batCnt;
	     private double antaCnt;
	 */
	 BSPlayer bp = new BSPlayer(player,batCnt,antaCnt);
	 
	 %>
   <table class="table table-hover table-striped">
    <thead>
      <tr class="table-success text-center">
        <th>선수명</th>
        <th>타석</th>
        <th>안타수</th>
        <th>타율</th>
      </tr>
    </thead>	
    <tbody>
    	<tr>
    	<td><%=bp.getPlayer() %></td>
    	<td><%=bp.getBatCnt()%></td>
    	<td><%=bp.getAntaCnt()%></td>
    	<td><%=bp.getHitRatio()%></td></tr>
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