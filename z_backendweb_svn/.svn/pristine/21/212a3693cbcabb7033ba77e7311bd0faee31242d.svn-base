<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<%--
[1단계:개념] 1. response.sendRedirect()와 a href의 차이점을 예제를 통해서 기술하세요
[1단계:확인] 2. response.sendRedirect()를 이용하여, 입력한 점수에 따른 평가 페이지를 다르게 처리하세요
[1단계:개념] 3. session scope의 범위에 대하여 설명하세요.
[1단계:개념] 4. session scope 일반변수/객체 할당하는 형식을 기본 코드 예제와 함께 기술하세요
[1단계:확인] 5. session scope의 범위별 설정 예제 문제
	1) Page Scope 사용하기: 단일 JSP 페이지에서만 사용되는 임시 계산 변수를 page 범위로 선언하고 사용하는 예제를 작성하세요.
	2) Request Scope 데이터 전달: 하나의 JSP 페이지에서 다른 JSP 페이지로 데이터를 전달하는 과정에서 request 범위를 사용하는 예제를 작성하세요.
		ex) 요청값의 물건가격과 갯수로 전달하고 request범위로 총계를 할당하여, 최종페이지에  총계출력
	3) Session Scope 로그인 관리: 사용자 로그인 정보를 session 범위를 사용하여 관리하는 로그인 및 로그아웃 기능을 구현하는 예제를 작성하세요.
	4) Application Scope의 공유 데이터: 웹 애플리케이션의 모든 사용자에게 공유되는 설정 정보를 application 범위로 관리하는 예제를 작성하세요.
	5) Session Scope와 쇼핑 카트: 온라인 쇼핑 사이트에서 session 범위를 사용하여 사용자별 쇼핑 카트를 관리하는 예제를 작성하세요.



이러한 요청에는 웹 개발과 관련된 여러 개념과 실습 예제가 포함되어 있습니다. 각 질문에 대해 차례대로 설명하겠습니다.

### 1. `response.sendRedirect()`와 `<a href>`의 차이점

- **`response.sendRedirect()`**:
  - 서버 측에서 사용됩니다.
  - 이 메서드는 클라이언트(브라우저)에게 다른 페이지로 이동하라는 명령을 전달합니다.
  - URL이 변경되며, 새 요청이 서버에 발생합니다.
  - 예시: 사용자가 로그인 후 홈페이지로 리디렉션되는 경우.

- **`<a href>`**:
  - HTML의 일부로 클라이언트 측에서 사용됩니다.
  - 사용자가 링크를 클릭하면 지정된 URL로 이동합니다.
  - 주로 사용자의 상호작용을 필요로 합니다.
  - 예시: 웹 페이지에 있는 "자세히 보기" 링크.

### 2. `response.sendRedirect()`를 이용한 점수에 따른 페이지 처리

```java
// 예를 들어, 사용자가 폼을 통해 점수를 제출했다고 가정합니다.
int score = Integer.parseInt(request.getParameter("score"));

if (score >= 90) {
    response.sendRedirect("highScore.jsp");
} else if (score >= 50) {
    response.sendRedirect("mediumScore.jsp");
} else {
    response.sendRedirect("lowScore.jsp");
}
```

### 3. 세션 범위(Session Scope) 설명

- 세션 범위는 한 사용자의 브라우저 세션에 걸쳐 데이터를 저장합니다.
- 사용자가 브라우저를 열고 닫을 때까지 유지됩니다.
- 주로 사용자별 정보(예: 로그인 세션)를 관리하는 데 사용됩니다.

### 4. 세션 스코프에 일반 변수/객체 할당

```java

// 세션에 변수 할당
session.setAttribute("username", "user1");

// 세션에 객체 할당
User user = new User("user1", "password");
session.setAttribute("user", user);
```

### 5. 세션 스코프의 범위별 설정 예제

1. **Page Scope 사용 예제**:
    ```jsp
     Page 범위 변수 
    <% int tempCalculation = 100 * 2; %>
    ```

2. **Request Scope 데이터 전달 예제**:
    ```jsp
     첫 번째 페이지 
    <% 
    int price = Integer.parseInt(request.getParameter("price"));
    int quantity = Integer.parseInt(request.getParameter("quantity"));
    int total = price * quantity;
    request.setAttribute("total", total);
    %>
    <jsp:forward page="finalPage.jsp" />

     최종 페이지 (finalPage.jsp) 
    Total: <%= request.getAttribute("total") %>
    ```

3. **Session Scope 로그인 관리 예제**:
    ```java
    // 로그인 시
    HttpSession session = request.getSession();
    session.setAttribute("loggedIn", true);

    // 로그아웃 시
    session.invalidate();
    ```

4. **Application Scope의 공유 데이터 예제**:
    ```java
    // ServletContext 객체를 사용
    getServletContext().setAttribute("sharedData", "공유된 정보");
    ```

5. **Session Scope와 쇼핑 카트 예제**:
    ```java
    HttpSession session = request.getSession();
    List<Item> cart = (List<Item>) session.getAttribute("cart");
    if (cart == null) {
        cart = new ArrayList<Item>();
        session.setAttribute("cart", cart);
    }
    // 상품 추가
    cart.add(new Item("상품1", 1000));
    ```

이러한 예제들은 웹 개발, 특히 Java의 서블릿과 JSP를 사용하여 다양한 범위의 데이터 관리를 수행하는 기

본적인 방법들을 보여줍니다.

# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유
3. 수업 시간 긍적적으로 집중하였는가?  

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
  <h2>타이틀</h2>

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