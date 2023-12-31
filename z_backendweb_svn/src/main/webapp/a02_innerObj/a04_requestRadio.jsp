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
  <h2 data-toggle="modal" data-target="#exampleModalCenter">타이틀</h2>

</div>
<div class="container">
	<form id="frm01" class="form"  method="post">
		<select name="dname" class="form-control mr-sm-2">
			<option value="">전체</option>
			<option>인사</option>
			<option>회계</option>
			<option>재무</option>
			<option>기획</option>
		</select>
		
		<select name="fruits" multiple="multiple" class="form-control mr-sm-2">
			<option>사과</option>
			<option>바나나</option>
			<option>딸기</option>
			<option>키위</option>
		</select>
	
	     선택과목(1개):<br>
		<div class="form-check-inline">
		  <label class="form-check-label">
		    <input type="radio" class="form-check-input" name="subject" value="java">JAVA
		  </label>
		</div>
		<div class="form-check-inline">
		  <label class="form-check-label">
		    <input type="radio" class="form-check-input" name="subject" value="javascript">javascript
		  </label>
		</div>
		<div class="form-check-inline disabled">
		  <label class="form-check-label">
		    <input type="radio" class="form-check-input" name="subject" value="jsp">jsp
		  </label>
		</div>
	    
	    
	    <button class="btn btn-info" type="submit">선택전송</button>
	</form>
	<%
	String dname = request.getParameter("dname");
	if(dname ==null) dname= "";
	String [] fruits = request.getParameterValues("fruits");
	StringBuffer sbfruits = new StringBuffer();
	if(fruits != null){
		for(String fruit:fruits){
			sbfruits.append(fruit+" ");
		}
	}
	String subject = request.getParameter("subject");
	if(subject==null) subject ="";
	%>
   <table class="table table-hover table-striped">
   	<col width="10%">
   	<col width="50%">
   	<col width="15%">
   	<col width="15%">
   	<col width="10%">
    <thead>
    
      <tr class="table-success text-center">
        <th>부서</th>
        <th>과일</th>
        <th>과목</th>

      </tr>
    </thead>	
    <tbody>dname sbfruits subject
    	<tr><td><%=dname%></td><td><%=sbfruits%></td><td><%=subject%></td>
    	</tr>

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