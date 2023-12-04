<%@ page language="java" contentType="text/html; charset=UTF-8"
    %>
<%
String name = "사과";
int price = 5000;
int cnt = 5;

int calcul = price*cnt;

//Dept d = new Dept(10, "인사", "제주");
%>

<script>
function calcul(){
	var price = <%=price%>;
	var cnt = <%=cnt%>;
	
	var result = price*cnt;
	$("h2").text(result);
}
</script>