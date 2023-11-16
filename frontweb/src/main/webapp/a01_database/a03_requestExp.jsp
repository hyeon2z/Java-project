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
String product = request.getParameter("product");
String priceStr = request.getParameter("price");
String cntStr = request.getParameter("cnt");
// 문자열은 초기값이 null일 때, 공백으로 변환
if(product==null) product="";
// 숫자형은 숫자형 데이터를 선언하고, 숫자값이 들어 올 때 형변환처리
int price = 0;
if(priceStr!=null) price = Integer.parseInt(priceStr);
int cnt = 0;
if(cntStr!=null) cnt = Integer.parseInt(cntStr);
%>
<form>
	물건명 : <input type = "text" name = "product" value="<%=product%>"/><br>
	가격 : <input type = "text" name = "price" value="<%=price%>"/><br>
	개수 : <input type = "text" name = "cnt" value="<%=cnt%>"/><br>
	<input type = "submit" value = "구매"/>
</form>
<h2>구매한 정보</h2>

물건명 : <%=product %><br>
가격 : <%=price %><br>
개수 : <%=cnt %><br>
총계 : <%=price*cnt %><br>

</body>
</html>