<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// 요청값 : null ? 문자열로 처리된다.

// 초기 null에 대한 처리 
String pname = request.getParameter("pname");
String priceStr = request.getParameter("price");
String cntStr = request.getParameter("cnt");
// 문자열은 초기값이 null일 때, 공백으로 변환
if(pname==null) pname= "";
// 숫자형은 숫자형 데이터를 선언하고, 숫자값이 들어 올 때, 형변환 처리.
int price = 0;
if(priceStr!=null) price= Integer.parseInt(priceStr);
int cnt = 0;
if(cntStr!=null) cnt= Integer.parseInt(cntStr);
%>
<form>
	물건명:<input type="text" name="pname" value="<%=pname%>"/><br>
	가격:<input type="text" name="price" value="<%=price%>"/><br>
	갯수:<input type="text" name="cnt" value="<%=cnt%>"/><br>
	<input type="submit" value="구매"/><br>
</form>
<h2>구매정보</h2>

물건명:<%=pname %><br>
가격:<%=price %><br>
갯수:<%=cnt %><br>
총계:<%=price*cnt %><br>
<%-- 
a04_student.jsp
	학생명:[   ]
	국어:[0  ]
	영어:[0  ]
	수학:[0  ]
	[성적처리]
		
	@@@의 성적
	총점: @@@
	평균: @@@

 --%>
</body>
</html>