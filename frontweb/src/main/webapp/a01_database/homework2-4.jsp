<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 
4) **숫자 덧셈 vs 문자열 결합**: 두 입력값을 받아, 숫자일 경우 합을,
문자열일 경우 결합된 문자열을 출력하는 페이지 만들기.
hint) str.matches("-?\\d+(\\.\\d+)?") 활용(숫자형일 때,true)
 -->
<%
String text1Str = request.getParameter("text1");
String text2Str = request.getParameter("text2");
int text1Int = 0;
int text2Int = 0;
int result1 = 0;
String result2 = "";

if(text1Str != null && text2Str != null){
	if(text1Str.matches("-?\\d+(\\.\\d+)?") && text2Str.matches("-?\\d+(\\.\\d+)?")){
		text1Int = Integer.parseInt(text1Str);
		text2Int = Integer.parseInt(text2Str);
		result1 = text1Int + text2Int;
	}else{
		result2 = text1Str + text2Str;
	}	
}

%>
<body>
<form>
	첫번째 입력 : <input type = "text" name = "text1"><br>
	두번째 입력 : <input type = "text" name = "text2"><br>
	<input type = "submit" value = "더하기">
</form>
<h2>결과</h2>
결과 1 : <%=result1 %><br>
결과 2 : <%=result2 %>
</body>
</html>