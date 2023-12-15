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
int kor, eng, math; kor = eng = math = 0;
String stname = request.getParameter("stname");
String korStr = request.getParameter("kor");
String engStr = request.getParameter("eng");
String mathStr = request.getParameter("math");
if(stname==null) stname = "";
if(korStr!=null) kor = Integer.parseInt(korStr);
if(engStr!=null) eng = Integer.parseInt(engStr);
if(mathStr!=null) math = Integer.parseInt(mathStr);
int tot = kor + eng + math;
int avg = tot/3;
%>
<form>
	학생명:<input type="text" name="stname" value="<%=stname%>"/><br>
	국어:<input type="text" name="kor" value="<%=kor%>"/><br>
	영어:<input type="text" name="eng" value="<%=eng%>"/><br>
	수학:<input type="text" name="math" value="<%=math%>"/><br>
	<input type="submit" value="성적처리" /><br>
</form>
<h2><%=stname %>의 성적</h2>
<h3>총점:<%=tot %></h3>
<h3>평균:<%=avg %></h3>
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