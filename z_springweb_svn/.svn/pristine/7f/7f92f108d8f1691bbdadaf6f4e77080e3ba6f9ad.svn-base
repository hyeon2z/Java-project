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
[1단계:개념] 2. autowire 옵션의 속성별로 내용을 기본 예제로 설명하세요.
[1단계:확인] 3. 컨테이너에 1:1연관관계 객체 Note와 Pen을 만들어서, autowire 옵션중 byName으로 설정하여 호출하세요.
[1단계:확인] 4. 컨테이너에 특정 package(z04_vo)에 객체를 설정(@Component)하고, 해당 객체를 호출하여 처리하세요.
[1단계:확인] 5. 컨테이너에 특정 package(z05_vo)에 객체를 설정(@Controller,@Service)하고, 자동 autowiring해당 객체를 호출하여 처리하세요.

 # 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00)/과제제출 인원과 사유
3. 수업 시간 긍적적으로 집중하였는가?  

이 질문들은 Spring Framework에서 사용되는 `Autowiring` 개념과 관련된 것으로 보입니다. 각각의 질문에 대해 자세히 설명하겠습니다.

### 1. Autowiring이란 무엇인가?

`Autowiring`은 Spring Framework에서 제공하는 기능으로, 개발자가 수동으로 빈(bean) 의존성을 설정하지 않아도 Spring 컨테이너가 자동으로 의존성을 주입해주는 과정을 말합니다. 이를 통해 개발자는 복잡한 의존성 관리를 신경 쓰지 않고, 비즈니스 로직에 더 집중할 수 있습니다.

### 2. Autowire 옵션의 속성별 내용과 기본 예제

Spring에서는 다양한 autowiring 모드를 제공합니다:

- **no**: Autowiring을 사용하지 않음.
- **byName**: 빈의 이름을 사용하여 자동으로 연결.
- **byType**: 빈의 타입을 사용하여 자동으로 연결.
- **constructor**: 생성자를 통한 의존성 주입.

**예제:**
```java
// byName 예제
public class MyClass {
    private Dependency dependency;

    // dependency는 빈의 이름으로 자동 주입됨
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
}

<beans>
    <bean id="myClass" class="com.example.MyClass" autowire="byName" />
    <bean id="dependency" class="com.example.Dependency" />
</beans>
```

### 3. 1:1 연관관계 객체 Note와 Pen을 만들어서, autowire 옵션 중 byName으로 설정하여 호출

**예제:**
```java
public class Note {
    // 필드 선언
}

public class Pen {
    // 필드 선언
}

<beans>
    <bean id="note" class="com.example.Note" />
    <bean id="pen" class="com.example.Pen" autowire="byName" />
</beans>
```
`Pen` 클래스에서 `Note` 객체를 필요로 한다면, `Pen` 클래스 내에 `Note` 타입의 필드를 `note`라는 이름으로 선언합니다.

### 4. 특정 패키지(z04_vo)에 객체를 설정(@Component)하고 해당 객체 호출

특정 패키지 내의 클래스에 `@Component` 어노테이션을 사용하면 Spring 컨테이너가 자동으로 해당 클래스의 인스턴스를 빈으로 등록합니다. 클래스 예제:

```java
package z04_vo;

import org.springframework.stereotype.Component;

@Component
public class SomeClass {
    // 클래스 구현
}
```

### 5. 특정 패키지(z05_vo)에 객체를 설정(@Controller, @Service)하고, 자동 autowiring하여 해당 객체 호출

`@Controller`와 `@Service` 어노테이션은 각각 웹 요청을 처리하는 컨트롤러와 비즈니스 로직을 처리하는 서비스 클래스에 사용됩니다. 자동 autowiring을 통해 이들 사이의 의존성을 주입할 수 있습니다.

```java
package z05_vo;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class MyController {
    private MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }
}

package z05_vo;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    // 서비스 로직 구현
}
```

		
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