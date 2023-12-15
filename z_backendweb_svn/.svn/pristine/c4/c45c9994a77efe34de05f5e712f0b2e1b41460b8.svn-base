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
[1단계:개념] 1. request객체가 가지고 있는 서버전송 정보 메서드의 기능에 대하여 출력하세요
[1단계:확인] 2. 요청값 VO객체 예제로 조사자명과 선호하는 음식 종류, 평점 선택하게 하고, 결과를 서버에 저장하는 설문조사 페이지 만들기.
[1단계:개념] 3. request.getParameterValues()가 일반 type="text"와 type="checkbox"일 때, 간단한 예제로 차이점을 기술하세요.
[1단계:확인] 4. 아래 내용을 checkbox와 radio를 이용하여 요청값을 처리하여 결과를 출력하세요.
	1) 피자 주문 시스템: 사용자가 여러 토핑을 선택할 수 있는 체크박스를 사용하여 피자를 주문하는 JSP 페이지를 만드세요. 각 토핑은 추가 비용을 가지고 있으며, 
				최종 가격을 계산하여 보여줍니다.
	2) 설문 조사 양식: 다양한 주제에 대한 사용자의 선호도를 묻는 라디오 버튼 기반 설문 조사를 만드세요. 각 질문은 여러 선택지를 가지며, 사용자는 하나만 선택할 수 있습니다.
	3) 영화 장르 선택기: 사용자가 선호하는 영화 장르를 select박스로 멀티선택하고, 그에 따라 추천 영화 목록을 보여주는 페이지를 작성하세요.


이 요청들은 JSP(Java Server Pages)와 웹 프로그래밍의 기본적인 개념을 이해하는 데 도움이 됩니다. 각각에 대한 설명을 아래와 같이 제공하겠습니다.

### 1. Request 객체의 서버 전송 정보 메서드

`HttpServletRequest` 객체는 클라이언트의 요청과 관련된 정보와 작업을 캡슐화합니다. 여기에는 클라이언트와 서버 간의 데이터 전송에 관련된 여러 메서드가 포함됩니다:

- `getParameter(String name)`: 클라이언트가 전송한 데이터 중 지정된 이름(name)의 값을 반환합니다. 주로 텍스트 입력 필드의 데이터를 가져올 때 사용합니다.
- `getParameterValues(String name)`: 동일한 이름으로 전송된 여러 값(예: 체크박스)을 문자열 배열로 반환합니다.
- `getParameterNames()`: 요청에 포함된 모든 파라미터의 이름을 반환합니다.
- `getHeader(String name)`: HTTP 요청 헤더의 값을 반환합니다.
- `getHeaders(String name)`: 지정된 이름의 모든 헤더 값을 반환합니다.
- `getHeaderNames()`: 모든 헤더 이름을 반환합니다.
- `getMethod()`: 클라이언트 요청의 HTTP 메서드(예: GET, POST)를 반환합니다.
- `getRequestURL()`: 클라이언트가 요청한 URL을 StringBuffer 객체로 반환합니다.
- `getRequestURI()`: 클라이언트가 요청한 URI를 반환합니다.

### 2. 요청값 VO 객체 예제: 설문조사 페이지 만들기

설문조사 페이지를 만들 때, 사용자로부터 이름, 선호하는 음식 종류, 평점을 선택하게 하여 이 정보를 서버에 저장합니다. 이를 위해 다음과 같은 단계를 따릅니다:

1. **VO(Value Object) 클래스 정의**: 사용자의 이름, 선호하는 음식 종류, 평점을 저장할 VO 클래스를 정의합니다.
2. **HTML Form 생성**: 사용자 입력을 받기 위한 HTML 폼을 만듭니다. 이 폼에는 텍스트 입력 필드(이름), 체크박스(음식 종류), 라디오 버튼(평점)이 포함됩니다.
3. **JSP 페이지 작성**: 사용자가 폼을 제출하면, JSP 페이지에서 `HttpServletRequest` 객체를 사용하여 사용자의 입력을 받아 VO 객체에 저장합니다.
4. **결과 처리 및 저장**: VO 객체의 데이터를 서버에 저장하고, 사용자에게 설문 결과를 표시합니다.

### 3. request.getParameterValues()의 사용

`request.getParameterValues()` 메서드는 동일한 이름으로 전송된 여러 값을 처리할 때 사용됩니다. `type="text"`와 `type="checkbox"`의 사용 예시는 다음과 같습니다:

- **Text Field (type="text")**: 일반적으로 단일 값을 반환합니다. 예를 들어, 사용자가 입력한 이름을 가져올 때 사용합니다.
  
  ```java
  String name = request.getParameter("name");
  ```

- **Checkbox (type="checkbox")**: 여러 값을 배열로 반환합니다. 예를 들어, 사용자가 선택한 여러 음식 종류를 가져올 때 사용합니다.
  
  ```java
  String[] foods = request.getParameterValues("foods");
  ```

### 4. Checkbox와 Radio를 이용한 요청값 처리 예제

아래는 JSP를 사용하여 각각의 요구사항을 처리하는 기본적인 코드 예시입니다. 이 예시들은 간단한 HTML 폼과 JSP 스크립트를 활용하여 요구사항을 구현합니다.

### 1. 피자 주문 시스템

**HTML Form (pizzaOrder.html)**

```html
<form action="processPizzaOrder.jsp" method="post">
    <h2>피자 토핑 선택</h2>
    <input type="checkbox" name="topping" value="Pepperoni"> 페퍼로니<br>
    <input type="checkbox" name="topping" value="Mushrooms"> 버섯<br>
    <input type="checkbox" name="topping" value="Olives"> 올리브<br>
    <!-- 여기에 추가 토핑 선택지를 추가할 수 있습니다 -->
    <input type="submit" value="주문하기">
</form>
```

**JSP 처리 페이지 (processPizzaOrder.jsp)**

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>피자 주문 결과</title>
</head>
<body>
<%
    String[] toppings = request.getParameterValues("topping");
    int totalPrice = 10000; // 기본 가격 설정

    if (toppings != null) {
        for (String topping : toppings) {
            totalPrice += 1000; // 각 토핑에 대해 추가 비용 계산
        }
    }

    out.println("<h2>주문 내역</h2>");
    out.println("선택한 토핑: ");
    if (toppings != null) {
        for (String topping : toppings) {
            out.println(topping + " ");
        }
    } else {
        out.println("없음");
    }
    out.println("<br>총 가격: " + totalPrice + "원");
%>
</body>
</html>
```

### 2. 설문 조사 양식

**HTML Form (survey.html)**

```html
<form action="processSurvey.jsp" method="post">
    <h2>선호하는 색상은?</h2>
    <input type="radio" name="color" value="Red"> 빨강<br>
    <input type="radio" name="color" value="Blue"> 파랑<br>
    <input type="radio" name="color" value="Green"> 초록<br>
    <!-- 여기에 추가 질문을 추가할 수 있습니다 -->
    <input type="submit" value="제출하기">
</form>
```

**JSP 처리 페이지 (processSurvey.jsp)**

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>설문 결과</title>
</head>
<body>
<%
    String color = request.getParameter("color");

    out.println("<h2>설문 결과</h2>");
    out.println("선택한 색상: " + color);
%>
</body>
</html>
```

### 3. 영화 장르 선택기

**HTML Form (movieGenre.html)**

```html
<form action="processMovieGenre.jsp" method="post">
    <h2>선호하는 영화 장르 선택</h2>
    <select name="genre" multiple>
        <option value="Action">액션</option>
        <option value="Romance">로맨스</option>
        <option value="Comedy">코미디</option>
        <!-- 여기에 추가 장르를 추가할 수 있습니다 -->
    </select>
    <input type="submit" value="장르 선택">
</form>
```

**JSP 처리 페이지 (processMovieGenre.jsp)**

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>영화 장르 선택 결과</title>
</head>
<body>
<%
    String[] genres = request.getParameterValues("genre");

    out.println("<h2>선택한 장르</h2>");
    if (genres != null) {
        for (String genre : genres) {
            out.println(genre + "<br>");
        }
    } else {
        out.println("선택한 장르가 없습니다.");
    }

    // 여기

에서 선택된 장르에 따라 추천 영화 목록을 생성하고 표시할 수 있습니다.
%>
</body>
</html>
```

위의 예시들은 기본적인 JSP 페이지 처리를 보여줍니다. 실제 응용 프로그램에서는 데이터 검증, 보안, 데이터베이스 연동 등 추가적인 고려사항이 필요합니다.


# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유
3. 수업 시간 긍적적으로 집중하였는가?  
4. 과제 내용 중, 자세한 풀이 필요한 내용/의문 내용 요청.
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
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input class="form-control mr-sm-2" placeholder="제목" />
	    <input class="form-control mr-sm-2" placeholder="내용" />
	    <button class="btn btn-info" type="submit">Search</button>
 	</nav>
	</form>
   <table class="table table-hover table-striped">
   	<col width="10%">
   	<col width="50%">
   	<col width="15%">
   	<col width="15%">
   	<col width="10%">
    <thead>
    
      <tr class="table-success text-center">
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회</th>
      </tr>
    </thead>	
    <tbody>
    	<tr><td></td><td></td><td></td><td></td><td></td></tr>
    	<tr><td></td><td></td><td></td><td></td><td></td></tr>
    	<tr><td></td><td></td><td></td><td></td><td></td></tr>
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