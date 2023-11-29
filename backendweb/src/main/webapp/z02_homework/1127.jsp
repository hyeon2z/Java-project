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
웹 브라우저 <-> 웹서버 <-> 웹어플리케이션 서버 <-> 데이터베이스
웹브라우저와 웹 서버간에는
요청호출 - 웹 브라우저가 웹 서버에 서비스 실행 요구
결과출력 - 웹 서버는 결과를 웹 브라우저에 html 코드로 보낸다.

[1단계:개념] 2. 웹서버 호출시 사용되는 url(http://www.google.com/search?hl=en&q=jsp&aq=f)의 의미를 기술하세요.
프로토콜://호스트명:포트/경로/파일명.확장자?쿼리스트링
구글은 도메인주소로 고유 ip주소로 변경처리되고

localhost는 테스트용으로 현재 컴퓨터 웹 서버와 클라이언트가 같이 있어서
실행할때, loopback ip주소(127.0.0.1)로 사용되는 키워드

[1단계:개념] 3. JSP와 Servlet의 차이점은 무엇인가요?
   - 두 기술의 주요 차이점을 설명하세요.
서블릿은 실행 코드 방식의 특징이 있고
jsp는 스크립트 코드 방식의 특징이 있습니다.

[1단계:개념] 4. JSP의 주요 구성 요소는 무엇인가요?
   - JSP 페이지를 구성하는 요소들에 대해 설명하세요.
       1. 디렉티브 : jsp 위쪽에 페이지 속성을 지정하는 부분
       2. 스크립트:스크립트릿 - <% %> 자바 코드를 포함할 때 사용
          표현식 - <%= %> 변수나 계산식 결과 출력 시 사용
          선언부 - <%! %> 메서드나 변수를 선언할 때 사용
       3. 표현언어 - ${  }jsp에서 java 코드없이 데이터 표현 및 접근 시 사용된다.
       4. 기본 객체 - request, response, session, application 등이 있다
       5. 정적데이터 - <p> 처럼 HTML, 텍스트 등 정적데이터 포함할때 사용
       6. 표준액션태그
       7. 커스텀태그, 표준태그라이브러리
       
[1단계:개념] 5. JSP에서 스크립트릿(Script)이란 3가지가 무엇인지? 그 종류와 기본 코드를 기술하세요
<% String name = "홍길동"; %>
<%= name %>
<%! public int minus(int num1, int num2){
		return num1 - num2;
	}
 %>

[1단계:개념] 6. JSP 디렉티브(Directive)의 종류와 기능은 무엇인가요?
   - JSP 디렉티브의 예시와 그들의 역할을 설명하세요.
   <%@ import = "java.util">
   page : jsp 페이지에서 정보 지정, 문서 타입, 출력, 버퍼의 크기, 에러페이지 등 정보 지정
   - contentType : jsp가 생성할 문서의 타입을 지정
   - import : jsp 페이지에서 사용할 자바 클래스를 지정
   - session : jsp 페이지가 세션을 사용할 지의 여부를 지정
   - info : jsp페이지에 대한 설명을 입력한다.
   - errorPage : 에러가 발생할 때, 보여줄 페이지를 지정
   - isErrorPage : 에러 페이지인지의 여부를 지정
   taglib : 사용할 태그 라이브러리를 지정
   include : 다른 문서를 포함 처리
   
[1단계:개념] 7. dao를 이용해서 부서정보를 출력하는 화면을 만드세요.

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