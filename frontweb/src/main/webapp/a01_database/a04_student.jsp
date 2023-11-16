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
a04_student.jsp
	학생명:[  ]
	국어:[  ]
	영어:[  ]
	수학:[  ]
	[성적처리]
	
	@@@의 성적
	총점 : @@@
	평균 : @@@
 --%>
 <%
String stuname = request.getParameter("stuname");
String korStr = request.getParameter("kor");
String engStr = request.getParameter("eng");
String mathStr = request.getParameter("math");
if(stuname==null) stuname="학생";
int kor = 0;
if(korStr!=null) kor = Integer.parseInt(korStr);
int eng = 0;
if(engStr!=null) eng = Integer.parseInt(engStr);
int math = 0;
if(mathStr!=null) math = Integer.parseInt(mathStr);
%>
<form>
	학생명 : <input type = "text" name = "stuname" value = "<%=stuname %>"/><br>
	국어 : <input type = "text" name = "kor" value = "<%=kor %>"/><br>
	영어 : <input type = "text" name = "eng" value = "<%=eng %>"/><br>
	수학 : <input type = "text" name = "math" value = "<%=math %>"/><br>
	<input type = "submit" value = "성적처리"/><br>
</form>

<h2><%=stuname%>의 성적</h2>
총점 : <%=kor+eng+math%>
평균 : <%=(kor+eng+math)/3 %>

</body>
</html>