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
  <h2 data-toggle="modal" data-target="#exampleModalCenter">피자 주문 시스템</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<div class="form-check-inline">
 	 <label class="form-check-label">
    	<input type="checkbox" class="form-check-input" value="0" name="toping">베이컨 1000원
  	</label>
</div>
<div class="form-check-inline">
  <label class="form-check-label">
    <input type="checkbox" class="form-check-input" value="1" name="toping">페퍼로니 1500원
  </label>
</div>
<div class="form-check-inline">
  <label class="form-check-label">
    <input type="checkbox" class="form-check-input" value="2" name="toping">파인애플 2000원
  </label>
</div>
	    <button class="btn btn-info" type="submit">주문 (기본피자 10000원)</button>
	</form>
   <table class="table table-hover table-striped">
   	<col width="100%">
    <thead>
    <%
    String[] topingStr = request.getParameterValues("toping");
    int[] toping = null;
    if(topingStr!=null) {
    	toping = new int[topingStr.length];
    	for(int idx = 0;idx<topingStr.length;idx++){
    		toping[idx]=Integer.parseInt(topingStr[idx]);
    	}
    }
    int[] prices = new int[3];
    prices[0] = 1000;
    prices[1] = 1500;
    prices[2] = 2000;
    String[] topings = {"베이컨","페퍼로니","파인애플"};
    int tot = 10000;
    %>
      <tr class="table-success text-center">
        <th>주문</th>
       
      </tr>
    </thead>	
    <tbody>
    
    	<tr><td>
    	<%if(topingStr!=null){
    	for(int val:toping){%>
    	<%=topings[val]%>     	
    	<%tot += prices[val];
    	} %>
    	이 들어간 피자 주문 가격은 <%=tot %>원
    	
    	<%}%>
    		
    	</td></tr>
    	
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