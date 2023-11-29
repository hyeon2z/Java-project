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
[1단계:개념] 1. 웹어플리케이션의 구성요소와 전송처리 순서를 기술하세요.
[1단계:개념] 2. 웹서버 호출시 사용되는 url(http://www.google.com/search?hl=en&q=jsp&aq=f)의 의미를 기술하세요.
[1단계:개념] 3. JSP와 Servlet의 차이점은 무엇인가요?
   - 두 기술의 주요 차이점을 설명하세요.
[1단계:개념] 4. JSP의 주요 구성 요소는 무엇인가요?
   - JSP 페이지를 구성하는 요소들에 대해 설명하세요.
[1단계:개념] 5. JSP에서 스크립트릿(Script)이란 3가지가 무엇인지? 그 종류와 기본 코드를 기술하세요
[1단계:개념] 6. JSP 디렉티브(Directive)의 종류와 기능은 무엇인가요?
   - JSP 디렉티브의 예시와 그들의 역할을 설명하세요.
[1단계:확인] 7. dao를 이용해서 부서정보를 출력하는 화면을 만드세요.

# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유
3. 수업 시간 긍적적으로 집중하였는가?

# 아래 내용을 간단한 예제로 확인해보고, 본인이 어떤 부분에 취약한지를
정리해 전달 부탁드립니다.
1단계 페이지이동을 할 수 있는가?
	1) a href=""
	2) location.href=""
	3) form action=""
		 submit
2단계 페이지이동과 요청값 처리
	1) a href="페이지명?요청키=요청값"
	2) location.href="페이지명?요청키=요청값"
	3) form action="페이지명"
		  <input name="요청키" value="요청값"
		  <input type="submit"		  		 
3. 요청값 받기 : request.getParameter("요청키")
	1) 다른 페이지에서 action=""
	2) 같은 페이지에서 action=""
	3) 문자열 데이터 초기값 처리
	4) 숫자형 데이터 초기값 처리
	5) 요청값을 객체로 만들기.	
4. 요청값 전달을 Dao모듈과 연동해서 처리..
  

### 1. 웹어플리케이션의 구성요소와 전송처리 순서
웹어플리케이션은 일반적으로 클라이언트, 서버, 데이터베이스로 구성됩니다. 전송 처리 순서는 다음과 같습니다:
1. **클라이언트 요청**: 사용자가 브라우저를 통해 웹 페이지에 접근하면 HTTP 요청을 서버에 전송합니다.
2. **서버 처리**: 웹 서버는 요청을 받아 처리 로직을 실행합니다. 이때 서블릿, JSP 등이 사용될 수 있습니다.
3. **데이터베이스 상호작용**: 필요한 경우, 서버는 데이터베이스와 상호작용하여 데이터를 조회하거나 수정합니다.
4. **응답 반환**: 처리 결과를 클라이언트에게 HTTP 응답으로 전송합니다.
5. **클라이언트에서의 결과 표시**: 브라우저는 서버로부터 받은 응답을 해석하여 사용자에게 결과를 표시합니다.

### 2. URL의 의미
`http://www.google.com/search?hl=en&q=jsp&aq=f` URL의 구성 요소는 다음과 같습니다:
- `http://`: 프로토콜 (HTTP 사용)
- `www.google.com`: 도메인 이름 (Google의 서버 주소)
- `/search`: 리소스 경로 (검색 서비스에 대한 경로)
- `?hl=en&q=jsp&aq=f`: 쿼리 스트링 (여러 파라미터 포함; 예: `hl=en`은 언어 설정을 의미)

### 3. JSP와 Servlet의 차이점
- **JSP (Java Server Pages)**: HTML 내에 Java 코드를 삽입하여 동적 웹 페이지를 생성합니다. 주로 프레젠테이션 로직에 초점을 맞춥니다.
- **Servlet**: 자바를 사용하여 웹 서버에서 실행되는 백엔드 프로그램입니다. 주로 데이터 처리, 비즈니스 로직 구현에 사용됩니다.

### 4. JSP의 주요 구성 요소
JSP 페이지의 주요 구성 요소는 다음과 같습니다:
- **디렉티브(Directive)**: 페이지 설정 정보를 제공합니다.
- **스크립틀릿(Scriptlet)**: 실제 Java 코드가 들어가는 부분입니다.
- **표현식(Expression)**: 데이터를 출력할 때 사용됩니다.
- **선언(Declaration)**: 변수나 메소드를 선언하는 데 사용됩니다.
- **JSP 액션(Action)**: JSP 페이지 내에서 특정 작업을 수행합니다.

### 5. JSP에서 스크립트릿(Scriptlet)
JSP에서 사용하는 스크립트릿의 3가지 종류는 다음과 같습니다:
1. **스크립트릿(Scriptlet)**: `<% Java 코드 %>` 형태로, 서버 측에서 실행되는 Java 코드를 작성합니다.
2. **표현식(Expression)**: `<%= 표현 %>` 형태로, 값을 출력할 때 사용됩니다.
3. **선언(Declaration)**: `<%! 선언 %>` 형태로, JSP 페이지 내에서 메소드나 변수를 선언할 때 사용됩니다.

### 6. JSP 디렉티브(Directive)의 종류와 기능
- **페이지 디렉티브(Page Directive)**: `<%@ page ... %>` 형태로, 페이지에 관련된 여러 설정을 정의합니다.


- **인클루드 디렉티브(Include Directive)**: `<%@ include ... %>` 형태로, 다른 파일의 내용을 현재 페이지에 포함시킵니다.
- **태그 라이브러리 디렉티브(Taglib Directive)**: `<%@ taglib ... %>` 형태로, 사용자 정의 태그 또는 태그 라이브러리를 페이지에 연결합니다.

### 7. DAO를 이용한 부서 정보 출력 화면
이 문제는 실제 코딩 작업을 요구하는 실습 문제입니다. 다음 단계를 따라 부서 정보를 출력하는 화면을 만들 수 있습니다:
1. **DAO (Data Access Object) 클래스 작성**: 데이터베이스에서 부서 정보를 조회하는 메소드를 포함합니다.
2. **JSP 페이지 생성**: 사용자에게 보여줄 부서 정보를 출력하는 JSP 페이지를 만듭니다.
3. **DAO 객체 사용**: JSP 페이지 내에서 DAO 객체를 생성하고, 해당 객체의 메소드를 호출하여 데이터베이스에서 부서 정보를 가져옵니다.
4. **결과 출력**: 가져온 부서 정보를 JSP 페이지에서 사용자에게 표시합니다.
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