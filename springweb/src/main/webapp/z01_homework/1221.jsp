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
	
	});
</script>
</head>

<body>
<div class="jumbotron text-center">
  <h2>타이틀</h2>

</div>
<%-- 
[1단계:개념] 1. autowiring이란 무엇인가?
	Java 설정 클래스에서 Bean 관계를 명시적으로 정의 하지 않아도,
	각 객체들의 연동관계가 자동으로 연동처리 되는 것을 말한다.
	
[1단계:개념] 2. autowire 옵션의 속성별로 내용을 기본 예제로 설명하세요.
	no : 자동 주입이 되지 않는 설정이다. (default)
	<bean id="car" class="해당클래스"/>
	<bean id="carDriving" class="해당클래스"/>
	로 각각 선언한 뒤 car 에 set프로퍼티로 각각 선언 한 뒤
	carDriving에 set프로퍼티로 car id를 대입하면 처리가 된다.
	
	byType : 객체와 set property 기준으로 해당 객체를 할당하는 메서드와
	객체가 있다면 자동으로 주입된다.
	<bean id="car" class="XXXX.Car"/>   
	<bean id="carDriver" class="XXX.CarDriver" autowire="byType"/>
	CarDriver 클래스 안에 public void setCar(Car car) 로 선언되어 있다면
	자동으로 해당 Car car 에 주입되어 처리가 가능.
	
	위 해당사항이 중복으로 여러개 있을 경우
	
	byName : 객체와 set property 기준으로 해당 객체를 할당하는 메서드와 객체가
	    위 byType과 같이 여러개 같은 type으로 선언되어 있다면
	    bean의 id 명이 set property가 같을 때
	    자동으로 할당되는것을 말함. (type + property 명)
	<bean id = "car1" class = "XXXX.Car"/>
	<bean id="carDriver" class = "XXXX.CarDriver" autowire="byName"/>
	
[1단계:확인] 3. 컨테이너에 1:1연관관계 객체 Note와 Pen을 만들어서, autowire 옵션중 byName으로 설정하여 호출하세요.
	<bean id="pen01" class="a01_diexp.z01_homework_vo.Pen"
      	c:type="네임펜" c:color="파랑색"/>
      <bean id="pen02" class="a01_diexp.z01_homework_vo.Pen"
      	c:type="네임펜" c:color="파랑색"/>
      <bean id="note01" class="a01_diexp.z01_homework_vo.Note"
      	c:name="도화지" autowire="byName"/>
	
	Pen pen01 = ctx.getBean("pen01", Pen.class);
		Note note01 = ctx.getBean("note01", Note.class);
		System.out.println("컨테이너 객체 : " + pen01);
		System.out.println("컨테이너의 객체 호출:"+note01);
		
		note01.doScatch();
		
[1단계:확인] 4. 컨테이너에 특정 package(z04_vo)에 객체를 설정(@Component)하고, 해당 객체를 호출하여 처리하세요.
	<context:component-scan base-package="a01_diexp.z04_vo"></context:component-scan>
	
	Movie movie = ctx.getBean("movie", Movie.class);
	System.out.println("컨테이너 객체 : " + movie);	
	movie.setName("영화제목");
	System.out.println(movie.getName());

[1단계:확인] 5. 컨테이너에 특정 package(z05_vo)에 객체를 설정(@Controller,@Service)하고, 
	자동 autowiring해당 객체를 호출하여 처리하세요.
	  <context:component-scan base-package="a01_diexp.z05_vo">
      <context:include-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
      <context:include-filter type="annotation" expression="org.springframework.stereotype.Service"/>
      <context:include-filter type="annotation" expression="org.springframework.stereotype.Repository"/>
      </context:component-scan>
	
		Pen pen = ctx.getBean("pen", Pen.class);
		Note note = ctx.getBean("note", Note.class);
		System.out.println("컨테이너 객체 : " + pen);
		System.out.println("컨테이너 객체 : " + note);
		
		pen.setColor("빨강");
		pen.setType("색연필");
		note.setName("스케치북");
		note.doScatch();


--%>
<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input placeholder="제목" name=""  class="form-control mr-sm-2" />
	    <input placeholder="내용" name=""  class="form-control mr-sm-2"/>
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