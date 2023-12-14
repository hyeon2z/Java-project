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
[1단계:개념] 1. json이란 무엇인지? 회원기준으로 객체를 선언하고, 설명하세요
[1단계:개념] 2. json 형식에서 일반 js에서의 선언과 네트웍상 전송시 형식의 차이점을 기술하세요
[1단계:개념] 3. 문자열 json를 객체형으로 변환해주는 방식이 3가지 언급하였다. 각각 기본 예제를 기준으로 메서드를 기술하세요.
[1단계:확인] 4. jquery ajax를 이용하여  z10_json.jsp(좋아하는 커피종류, 가격, 판매위치)를 지정하고, 호출하여 출력하세요
[1단계:확인] 5. jquery ajax를 이용하여  form형식으 매개변수를 전달(도서명,출판사)하여 z11_json.jsp(도서명, 출판사)를 처리하고, 
		하단에 테이블형식으로 추가되게 하세요
[2단계:확인] 6. [전공자/도전마인드]dao(MemberDao/Member getMember(int mno)를 활용하여 입력한 사원번호를 통해 사원정보를 가져오는 처리를 z12_memJson.jsp에 하고,
		해당, json데이터를 가져와서 화면에 출력하게 하세요.
		
		
		이 질문들은 JSON과 jQuery를 사용한 AJAX 요청 및 응답 처리에 관한 것입니다. 이에 대한 답변을 드리겠습니다.

### 1. JSON 이란 무엇인지? 회원 기준으로 객체를 선언하고, 설명하세요.

JSON (JavaScript Object Notation)은 경량의 데이터 교환 형식입니다. 이는 사람이 읽고 쓰기 쉽고, 기계가 분석하고 생성하기 쉬운 텍스트 형식입니다. JSON은 자바스크립트 객체의 구조를 사용하여 데이터를 표현합니다.

예를 들어, 회원 데이터를 JSON 객체로 선언할 수 있습니다:

```json
{
  "memberId": "user123",
  "name": "홍길동",
  "email": "user123@example.com",
  "age": 30
}
```

이 JSON 객체는 회원의 아이디, 이름, 이메일, 나이를 표현합니다.

### 2. JSON 형식에서 일반 JS에서의 선언과 네트워크상 전송시 형식의 차이점을 기술하세요.

일반 자바스크립트에서 JSON을 선언할 때는 객체 리터럴 문법을 사용합니다. 이는 자바스크립트 코드 내에서 객체를 직접적으로 표현합니다. 예를 들어:

```javascript
let user = {
  name: "홍길동",
  age: 30
};
```

반면에, 네트워크를 통해 전송할 때는 JSON 데이터를 문자열 형식으로 변환합니다. 이를 "직렬화(serialization)"라고 합니다. 예를 들어, 위의 `user` 객체를 JSON 문자열로 변환하면 다음과 같습니다:


```javascript( object ==> 문자열로 변환)
let jsonString = JSON.stringify(user);
```

### 3. 문자열 JSON을 객체형으로 변환해주는 방식이 3가지 언급하였다. 각각 기본 예제를 기준으로 메서드를 기술하세요.

1. **`JSON.parse()` 메서드**: 이는 JSON 문자열을 자바스크립트 객체로 변환합니다. 예를 들어:

   ```javascript
   let jsonString = '{"name":"홍길동", "age":30}';
   let user = JSON.parse(jsonString);
   ```

2. **jQuery의 `$.parseJSON()`**: jQuery를 사용할 때는 `$.parseJSON()` 함수를 사용하여 JSON 문자열을 객체로 변환할 수 있습니다. 예:

   ```javascript
   let jsonString = '{"name":"홍길동", "age":30}';
   let user = $.parseJSON(jsonString);
   ```

3. **자바스크립트 `eval()` 함수**: 이 방법은 보안상의 이유로 권장되지 않습니다. `eval()`은 문자열을 자바스크립트 코드로 실행합니다. 예:

   ```javascript
   let jsonString = '{"name":"홍길동", "age":30}';
   let user = eval("(" + jsonString + ")");
   ```
4. jquery
	dataType:"json",
	success:function(data){
		data : json 객체로 변환되어 사용가능..
	}   

### 4. jQuery AJAX를 이용하여 z10_json.jsp 호출하여 출력하세요.

```javascript
$.ajax({
  url: 'z10_json.jsp',
  type: 'GET',
  dataType: 'json',
  success: function(data) {
    console.log('좋아하는 커피 종류: ' + data.coffeeType);
    console.log('가격: ' + data.price);
    console.log('판매 위치: ' + data.location);
  }
});
```

### 5. jQuery AJAX를 이용하여 form 매개변수 전달하여 z11_json.jsp 처리하고, 테이블 형식으로 추가하세요.

```javascript
$("#formId").submit(function(e) {
  e.preventDefault();
  $.ajax({
    url: 'z11_json.jsp',
    type: 'POST',
    data: $(this).serialize(),
    dataType: 'json',
    success: function(data) {
      $('#tableId').append('<tr><td>' + data.bookName + '</td><td>' + data.publisher + '</td></tr>');
    }
  });
});
```

### 6. dao(MemberDao/Member getMember(int mno))를 활용하여 z12_memJson.jsp에서 처리하고 출력하세요.

```javascript
$.ajax({
  url: 'z12_memJson.jsp',
  type: 'GET',
  data: { mno: 입력한사원번호 },
  dataType: 'json',
  success: function(data) {
    console.log('사원 이름: ' + data.name);
    console.log('사원 부서: ' + data.department);
    // 이하 화면에 출력하는 로직
  }
});
```

이 예제들은 각각의 요구 사항에 맞추어 기본적인 구조를 제공합니다. 실제 적용 시에는 세부적인 요구 사항과 환경에 맞게 코드를 조정해야 할 수 있습니다.

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
	
	});
</script>
</head>

<body>
	<div class="jumbotron text-center">
		<h2>타이틀</h2>

	</div>
	<%-- 
		
    --%>
	<div class="container">
		<form id="frm01" class="form" method="post">
			<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
				<input placeholder="제목" name="" class="form-control mr-sm-2" /> <input
					placeholder="내용" name="" class="form-control mr-sm-2" />
				<button class="btn btn-info" type="submit">Search</button>
				<button class="btn btn-success" data-toggle="modal"
					data-target="#exampleModalCenter" type="button">등록</button>
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
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</tbody>
		</table>

	</div>
	<div class="modal fade" id="exampleModalCenter" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalCenterTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">타이틀</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="frm02" class="form" method="post">
						<div class="row">
							<div class="col">
								<input type="text" class="form-control" placeholder="사원명 입력"
									name="ename">
							</div>
							<div class="col">
								<input type="text" class="form-control" placeholder="직책명 입력"
									name="job">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>