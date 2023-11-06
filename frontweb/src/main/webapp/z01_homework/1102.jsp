<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
[1단계:개념] 1. iframe의 주요속성을 기본 예제를 통해서 기술하세요.
페이지 안에 다른 페이지를 특정 크기를 통해 만들어서 화면을 구성할 때 사용된다.
페이지 내에 여러가지 페이지를 포함할 수 있고, link를 클릭하면 특정 iframe 페이지를 변경해서
메뉴와 페이지이동을 한 페이지 내에서 처리할때 활용됨.

기본 구조)
<iframe src = "포함페이지" width = "넓이" height = "높이"></iframe>

[1단계:확인] 2. z01_top.html(최상위), z02_left.html(왼쪽메뉴), z03_main.html(오른쪽메인메뉴) 파일을 만들고,
              z01_top.html에 계층형 프레임구조를 만들어, 왼쪽메뉴 리스트를 클릭시, 오른쪽 메인메뉴들이 출력되게 하세요


[1단계:확인] 3. a href의 target의 의미를 예제를 통하여 기술하세요.
a href에서 target은 name을 지정해 놓은 프레임에 a href로 지정한 주소를 출력하는 것이다.
ex) <iframe src = "" name = "ex01"></iframe>
<a href = "z01_top.html" target="ex01"></a> = ex01프레임에 z01_top.html을 출력

[1단계:개념] 4. 요청값전달방식(2단계)의 페이지?key=val의 의미를 기술하고, 이것을 처리하는 패턴 3가지를 기술하세요.
key는 서버에 데이터를 보낼때 저장되는 id값을 의미하고
value는 아이디값에 해당하는 실제 데이터를 의미한다.
1. a href = "z01_send.jsp?id=id01&pwd=7777"
2. location.href = "z01_send.jsp?id=id01&pwd=7777"
3. form action = "z01_send.jsp"
<XXX name = 'id' value = 'himan'>
<XXX name = 'pwd' value = '7777'>

[1단계:확인] 5. 물건명:[   ], 가격:[   ], 갯수:[   ] [구매] 폼 페이지(z04_buyForm.html) 만들어, 구매를 클릭시,
              z05_buyProductInfo.jsp에서 입력한 구매 정보가 출력되게 하세요.

# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
3. 수업 시간 집중하였는가? 

 --%>
</body>
</html>