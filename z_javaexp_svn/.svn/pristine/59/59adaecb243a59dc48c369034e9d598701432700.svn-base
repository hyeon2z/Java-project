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
		<div class="form-group">
	  <label for="sel1">영화 장르 선택</label>
	  <select class="form-control" id="sel1" name="genre" multiple="multiple">
	    <option value="0">코미디</option>
	    <option value="1">로맨스</option>
	    <option value="2">스릴러</option>
	    <option value="3">판타지</option>
	  </select>
	</div>
	    <button class="btn btn-info" type="submit">Search</button>
 	
	</form>
   <table class="table table-hover table-striped">
   	<col width="100%">
   	<%
   	String[] genreStr = request.getParameterValues("genre");
	int[] genre =null;
	if(genreStr!=null){
		genre = new int[genreStr.length];
		for(int idx=0;idx<genreStr.length;idx++){
			genre[idx] = Integer.parseInt(genreStr[idx]);
		}
	}
	String[] moviegenre= {"코미디","로맨스","스릴러","판타지"};
	String[] recommend = new String[4];
	recommend[0] = "거미집, 롯트시티, 돈룩업, 머더 미스터리2";
	recommend[1] = "20세기 소녀, 엘리멘탈, 헤어질결심";
	recommend[2] = "크리에이터, 더 킬러, 발레리나";
	recommend[3] = "스즈메 문단속, 인어공주, 이터널스";
   	%>
   	
    <thead>
    
      <tr class="table-success text-center">
        <th>추쳔영화</th>
    
      </tr>
    </thead>	
    <tbody>
    	<tr><td>
    	<%if(genreStr!=null){
    		for(int val : genre){%>
    			<%=moviegenre[val]%>장르의 추천영화
    			<%=recommend[val]%><br>
    		<%}
    	}%>
    	
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