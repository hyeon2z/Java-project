<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 
5) **숫자 짝/홀 판별 **: 숫자면 짝수인지 홀수인지 판별하고
출력하는 JSP 페이지 만들기.
 -->
<%
String numberStr = request.getParameter("number");
int number = 0;
String result = "";
while(numberStr!=null){
	if(numberStr.matches("-?\\d+(\\.\\d+)?")){
		number = Integer.parseInt(numberStr);
		if(number%2!=0){
			result = "홀수입니다.";
		}else{
			result = "짝수입니다.";
		}
	
	}else{
		result = "숫자만 입력해야 합니다.";
	}
	break;
}

%>
<body>
<h2>홀/짝 판별</h2>
	<form>
		<input type = "text" name = "number"/><br>
		<input type = "submit" value = "판별"/>
	</form>
<h2>결과</h2>	
<%=result %>
</body>
</html>