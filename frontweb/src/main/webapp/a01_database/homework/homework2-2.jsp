<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 
2)[생각보다 난이도 높음] **간단한 계산기**: 
두 숫자와 연산자(+, -, *, /)를 입력받아 결과를 출력하는 JSP 페이지 만들기.
 -->
<%
String number1Str = request.getParameter("number1");
String number2Str = request.getParameter("number2");
String operator = request.getParameter("operator");
int number1 = 0;
int number2 = 0;
int result = 0;
String err1 = "분모에 0은 올수없음";
while(number1Str!=null && number2Str!=null && operator!=null){
	if(number1Str.matches("-?\\d+(\\.\\d+)?") && number2Str.matches("-?\\d+(\\.\\d+)?")){
		number1 = Integer.parseInt(number1Str);
		number2 = Integer.parseInt(number2Str);
	}
	if(operator.matches(".*[+\\-*/].*")){
		if(operator.equals("+")){
			result = number1 + number2;
		}else if(operator.equals("-")){
			result = number1 - number2;
		}else if(operator.equals("*")){
			result = number1 * number2;
		}else{
			if(number2!=0){
				result = number1 / number2;		
			}else{
				out.println(err1);
			}
		}	
	}
	break;
}
%>
<body>
<form>
	첫번째 숫자 : <input type = "text" name = "number1"/>
	두번째 숫자 : <input type = "text" name = "number2"/>
	연산자 : <input type = "text" name = "operator"/>
	<input type = "submit" value = "계산"/>
</form>

<h2>계산결과</h2>
<%=result %>
	
</body>
</html>