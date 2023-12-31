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
  <h2>숫자 맞추기 게임</h2>

</div>
<%-- 
[1단계:개념] 1. c:set을 통하여 일반변수와 객체형 변수의 데이터를 할당하는 기본 형식을 설명하세요
[1단계:개념] 2. 조건문의 형식을 예제에 따라 기술하세요
[1단계:확인] 3. 구매금액에 따른 할인율을 c:set으로 설정하여 최종금액을 출력하세요.
[1단계:확인] 4. 설정값이 없을 때, 임의의 1~100사이 숫자를 정하고, 해당 문제에 대한 hint로 크다/적다를 표시하여 최종 맞추었을 때, @@회 정답을 표시하세요~ 
		c:set, c:choose c:if문 활용.
 # 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유
3. 수업 시간 긍적적으로 집중하였는가?  		


1. **c:set을 이용한 일반 변수와 객체형 변수 데이터 할당**
   - `c:set` 태그는 JSP에서 변수에 값을 할당할 때 사용됩니다. 일반 변수에 값이나 문자열을 할당할 때는 단순히 변수 이름과 값을 지정하면 됩니다.
   - 객체형 변수에는 객체 또는 객체의 속성에 값을 할당할 수 있습니다.
   - 예시:
     ```jsp
     <c:set var="simpleVar" value="Hello World" />
     <c:set target="${myBean}" property="propertyName" value="Value" />
     ```

2. **조건문 형식**
   - JSP에서는 `c:if` 또는 `c:choose`, `c:when`, `c:otherwise` 태그를 사용하여 조건문을 구현합니다.
   - 예시:
     ```jsp
     <c:if test="${condition}">
        // 조건이 참일 때 실행될 코드
     </c:if>

     <c:choose>
        <c:when test="${condition1}">
            // 첫 번째 조건이 참일 때 실행될 코드
        </c:when>
        <c:when test="${condition2}">
            // 두 번째 조건이 참일 때 실행될 코드
        </c:when>
        <c:otherwise>
            // 위 조건들이 모두 거짓일 때 실행될 코드
        </c:otherwise>
     </c:choose>
     ```

3. **구매 금액에 따른 할인율 계산**
   - 여기서는 `c:set`을 사용하여 구매 금액에 따른 할인율을 설정하고, 최종 금액을 계산하여 출력하는 로직을 구현할 수 있습니다.
   - 예시:
     ```jsp
     <c:set var="purchaseAmount" value="10000" />
     <c:set var="discountRate" value="${purchaseAmount > 5000 ? 0.1 : 0.05}" />
     <c:set var="finalAmount" value="${purchaseAmount - (purchaseAmount * discountRate)}" />
     최종 금액은 ${finalAmount} 입니다.
     ```

4. **임의의 숫자 맞추기 게임**
--%>
<%--
${empty 변수} : 변수 == null ||  변수.equals("")
${not empty 변수} : 변수 !=  null && !변수.equals("")

 --%>
<c:choose>
	<c:when test="${empty sessionScope.ranNum }">
		<c:set var="cnt" value="0" scope="session"/>
		<c:set var="ranNum" 
			value="${Math.floor(Math.random() * 100 + 1)}" 
			scope="session" />
	</c:when>
	<c:otherwise>
		<c:set var="cnt" value="${cnt+1}"  scope="session"/>
		<c:choose>
			<c:when test="${ranNum == param.num}">
				<c:set var="msg" value="축하합니다."  />
				<c:set var="ranNum" value="${ranNum}"  />
				
				<c:remove var="ranNum" scope="session"/>
				
				<%-- jstl에서 변수는 모두 다 전역변수로, 조건문이나
					반복문에서 하단 블럭에 설정하더라도 어디서든지 호출
					가능하다. --%>
				
			</c:when>
			<c:when test="${ranNum > param.num}">
				<c:set var="msg" value="보다 큰 수를 입력하세요"  />
			</c:when>
					
			<c:otherwise>
				<c:set var="msg" value="보다 작은 수를 입력하세요"  />
			</c:otherwise>
		</c:choose>		
	</c:otherwise>
</c:choose>

<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="숫자를 입력(1~100)" name="num" value="${param.num}" class="form-control mr-sm-2" />
	    <button class="btn btn-info" type="submit">확인</button>
 	</nav>
	</form>
   <table class="table table-hover table-striped">
   	<col width="25%">
   	<col width="25%">
   	<col width="25%">
   	<col width="25%">
    <thead>
    
      <tr class="table-success text-center">
        <th>도전횟수</th>
        <th>입력값</th>
        <th>정답여부</th>
        <th>hint</th>
      </tr>
    </thead>	
    <tbody>
    	<tr>
    		<td>${cnt}</td>
    		<td>${param.num}</td>
    		<td>${param.num == ranNum?"정답":"오답" }</td>
    		<td>${msg}</td></tr>
    </tbody>
	</table>    
    
</div>
</body>
</html>