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
[1단계:개념] 1. ajax의 동기처리 기본형식을 예제를 통해서 설명하세요
[1단계:개념] 2. ajax의 동기와 비동기의 개념적 차이점과 js에서 코드부분의 차이점을 기술하세요.
[1단계:확인] 3. ajax를 동기형식으로 data.jsp에서 물품리스트(사과,바나나,딸기)를 처리하여, 물건리스트호출시, 서버에 있는 물품리스트를 가져오는 처리하세요.
[1단계:확인] 4. ajax를 비동기형식으로 요청값을 도서명, 가격, 할인율를 넘기면 결과값으로 해당 도서명과 할인율에 따른 계를 alert()창으로 가져오는 처리를 하세요.
[1단계:개념] 5. jquery ajax의 기본형식을 기술하세요.
[1단계:확인] 6. jquery ajax로 입력한 선수의 이름과 타석과 안타를 서버에서 요청결과로 @@@의 타율을 @@를 화면에 출력되게 하세요.

이 질문들은 Ajax와 jQuery를 사용한 웹 프로그래밍의 기본적인 개념과 실제 적용 방법에 대해 다룹니다. 각각의 문제에 대해 설명하겠습니다.

### 1. Ajax의 동기 처리 기본 형식 예제

Ajax의 동기 처리는 서버로부터 응답을 받을 때까지 다른 작업을 수행하지 않고 대기하는 방식입니다. 기본적인 동기 Ajax 요청의 예는 다음과 같습니다.

```javascript
function synchronousAjax() {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'data.jsp', false); // 세 번째 인자가 false이면 동기 방식
    xhr.send(null);

    if (xhr.status === 200) {
        console.log(xhr.responseText);
    } else {
        console.error('Error:', xhr.statusText);
    }
}
```

### 2. Ajax의 동기와 비동기 개념적 차이점

- **동기(Synchronous)**: 요청을 보낸 후, 해당 요청에 대한 응답을 받을 때까지 기다립니다. 응답을 받기 전까지 다른 작업을 수행할 수 없습니다.
- **비동기(Asynchronous)**: 요청을 보낸 후 응답을 기다리지 않고 다른 작업을 수행할 수 있습니다. 응답은 이벤트나 콜백 함수를 통해 처리됩니다.

JavaScript 코드 차이점:
- 동기: `XMLHttpRequest`의 `open` 메소드에 세 번째 인자로 `false`를 설정합니다.
- 비동기: `XMLHttpRequest`의 `open` 메소드에 세 번째 인자로 `true`를 설정하거나 생략합니다(기본값이 `true`).

### 3. 동기 방식으로 물품 리스트 가져오기

```javascript
function getItemsSynchronously() {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'data.jsp', false);
    xhr.send(null);

    if (xhr.status === 200) {
        console.log(xhr.responseText); // 물품 리스트 출력
    }
}
```

### 4. 비동기 방식으로 도서 정보 처리

```javascript
function getBookInfoAsynchronously(bookName, price, discountRate) {
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
            alert(xhr.responseText); // 계산된 결과를 alert 창으로 표시
        }
    };
    xhr.open('GET', `bookInfo.jsp?name=${bookName}&price=${price}&discountRate=${discountRate}`, true);
    xhr.send(null);
}
```

### 5. jQuery Ajax 기본 형식

```javascript
$.ajax({
    url: 'some-url',
    method: 'GET',
    dataType: 'json',
    success: function(data) {
        console.log(data);
    },
    error: function(jqXHR, textStatus, errorThrown) {
        console.error('Error:', textStatus, errorThrown);
    }
});
```

### 6. jQuery Ajax로 선수 타율 계산

```javascript
function calculateBattingAverage(playerName, atBats, hits) {
    $.ajax({
        url: 'server-url',
        method: 'GET',
        data: {
            name: playerName,
            atBats: atBats,
            hits: hits
        },
        success: function(data) {
            $('#result').text(`${playerName}의 타율은 ${data.average}`);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.error('Error:', textStatus, errorThrown);
        }
    });
}
```

이 예제들은 기본적인 Ajax 요청 처리 방법을 보여줍니다. 실제 적용에서는 서버 측 구현, URL, 파라미터 등에 따라 코드가 달라질 수 있습니다.

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