<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.io.File" 
    import="java.text.SimpleDateFormat"
    import="java.util.Date"
    import="backendweb.z01_vo.*"
    import="backendweb.d01_dao.*"
    import="community.vo.Board"
    import="community.BoardDao"
 	import="com.oreilly.servlet.MultipartRequest"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<%
//UserDao dao = new UserDao();
String userId = "";
String role = "";
String username = "";

if (session != null) {
	userId = (String) session.getAttribute("userId");
	role = (String) session.getAttribute("role");
	username = (String) session.getAttribute("userName");
	if (userId == null || role.equals("user") == false) { // 유저 로그인 상단바
	%>
	<script>
		alert("로그인해주세요.");
		location.href = "/login.jsp";
	</script>
	<%
		out.close(); //
	}
}
else {
	%>
	<script>
		alert("로그인해주세요.");
		location.href = "/login.jsp";
	</script>
	<%
		out.close(); //
}

BoardDao dao = new BoardDao();

// 전송받은 값들을 변수에 대입 
String title = "";
String content = "";
String noStr = null;
int no = 0;

Date date = new Date();
String saveDirectory = "/Users/a1234/Downloads/b03_javaexp/workspace/BBcare/src/main/webapp/BBcare/upload/";///application.getRealPath("C:/b01_javaexp/workspace/backendweb/src/main/webapp/Uploads/");
System.out.println("업로드 경로");
System.out.println(saveDirectory);
int maxPostSize = 1024 * 100000; /* 1MB */
String encoding = "UTF-8";
String fileName = "";
try {
	MultipartRequest mr = new MultipartRequest(request, saveDirectory, maxPostSize, encoding);
	fileName = mr.getFilesystemName("img");
	title = mr.getParameter("title");
	content = mr.getParameter("content");
	noStr = mr.getParameter("no");
	if(noStr!=null) no = Integer.parseInt(noStr);

	File oldFile = new File(saveDirectory + File.separator + fileName);
} catch (Exception e) {
	e.printStackTrace();
	request.setAttribute("errorMessage", "파일 업로드 오류");
}	

Board data = dao.getPet(no);
// 메뉴 입력
try {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String formattedDate = dateFormat.format(date);
	java.sql.Date sqlDate = java.sql.Date.valueOf(formattedDate);
	
	if(fileName == null || fileName.equals("")) {
		fileName = data.getImg();
	}
	
	Board ins = new Board();
	ins.setNo(no);
	//ins.setName(username);
	ins.setId(userId);
	//ins.setTime(sqlDate);
	ins.setTitle(title);
	ins.setContent(content);
	ins.setImg(fileName);
	//ins.setLikes(0);
	//ins.setClick(0);
	
	dao.updateBoard(ins);
}
catch (Exception e) {
	System.out.println(e);
} 
finally {
}
%>
<script>
alert("글이 수정되었습니다.");
location.href = "Board_view.jsp?no=<%=no%>";
</script>