<%@page import="order_sol.Member"%>
<%@page import="board.MemberDAO"%>
<%@page import="board.Board"%>
<%@page import="java.util.List"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<!DOCTYPE html>
<html lang="zxx">
<head>
<meta charset="UTF-8">
<meta name="description" content="Male_Fashion Template">
<meta name="keywords" content="Male_Fashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>게시글 등록</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
<script src="jquery-3.1.1.js"></script>
<script>
	function goMain() {
		location.href = 'board.jsp'
	}
</script>
</head>
<body>
	<!-- 메뉴바 -->
	<header class="header">
		<div class="header__top">
			<div class="container">
				<div class="row">
					<div class="col-lg-6 col-md-7">
						<div class="header__top__left">
							<p></p>
						</div>
					</div>
					<%
					if (session != null) {
						String userId = (String) session.getAttribute("User");
						if (userId != null && !userId.equals("admin")) {
					%>
					<div class="col-lg-6 col-md-5">
						<div class="header__top__right">
							<div class="header__top__links" style="margin: 0; width: 100%;">
								<p
									style="margin-right: 10%; text-transform: uppercase; display: inline-block; letter-spacing: 2px; font-size: 14px; color: #7A2D1B;">
									환영합니다!
									<%=userId%>님
								</p>
								<a href="mypage.jsp" style="color: #7A2D1B; margin-right: 3%">마이페이지</a>
								<a href="logout.jsp" style="color: #7A2D1B">로그아웃</a>
							</div>
						</div>
					</div>
					<%
					} else if(userId != null && userId.equals("admin")){ %>
						<div class="col-lg-6 col-md-5">
		                    <div class="header__top__right">
		                    	<div class="header__top__links" style = "margin:0; width:100%;">
			                        <p style = "margin-right:10%; text-transform:uppercase; display:inline-block; letter-spacing:2px; font-size:14px; color:#7A2D1B;">
			                        환영합니다! <%= userId %>님</p>
			                        <a href="logout.jsp" style="color: #7A2D1B">로그아웃</a>
			                    </div>
		                    </div>
		                </div>
					<% } else {
					%>
					<div class="col-lg-6 col-md-5">
						<div class="header__top__right">
							<div class="header__top__links">
								<a href="login.jsp" style="color: #7A2D1B">로그인</a> <a
									href="createID.jsp" style="color: #7A2D1B">회원가입</a>
							</div>
						</div>
					</div>
					<script>
				        alert("로그인이 필요한 기능입니다.");
				        window.location.href = "login.jsp";
				    </script>
					<%
					}
					}
					%>
				</div>
			</div>
		</div>
		<% if (session != null) {
			String userId = (String) session.getAttribute("User");
			if (userId != null && userId.equals("admin"))	{
		%>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3">
					<div class="header__logo">
						<a href="./admin_main.jsp"><img src="img/onelogo.png" alt=""></a>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<nav class="header__menu mobile-menu"
						style="margin-left: 20%; margin-right: 20% width:60%;">
						<ul>
							<li ><a href="admin_list.jsp" style="color:#7A2D1B">메뉴관리</a></li>
                            <li ><a href="admin_member.jsp" style="color:#7A2D1B">회원관리</a></li>
                            <li ><a href="admin_sal.jsp" style="color:#7A2D1B">매출관리</a></li>
                            <!-- <li ><a href="admin_notice.jsp" style="color:#7A2D1B">공지사항 관리</a></li> -->
                            <li ><a href="board.jsp" style="color:#7A2D1B">커뮤니티</a></li>
                           

						</ul>
					</nav>
				</div>

			</div>
			<div class="canvas__open">
				<i class="fa fa-bars"></i>
			</div>

		</div>
		<% } else { %>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3">
					<div class="header__logo">
						<a href="./index02.jsp"><img src="img/onelogo.png"
							alt="ONE COFFEE"></a>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<nav class="header__menu mobile-menu"
						style="margin-left: 20%; margin-right: 20%; width: 60%;">
						<ul>
							<li><a href="user_menu.jsp" style="color: #7A2D1B">메뉴소개</a></li>
							<li><a href="contact.jsp" style="color: #7A2D1B">매장안내</a></li>
							<li><a href="selectMenu.jsp" style="color: #7A2D1B">주문하기</a></li>
							<li><a href="board.jsp" style="color: #7A2D1B">커뮤니티</a></li>
						</ul>
					</nav>
				</div>
			</div>
			<div class="canvas__open">
				<i class="fa fa-bars"></i>
			</div>
		</div>
		<% } } %>
	</header>
	<%
	String boardNumStr = request.getParameter("boardNum");
	String title = request.getParameter("title");
	BoardDAO boardDao = new BoardDAO();
	String userId = (String) session.getAttribute("User");
	MemberDAO memberDao = new MemberDAO();
	int userNum = memberDao.getMemIdById(userId);
	int boardNum = -1;
	if (boardNumStr != null) {
		boardNum = Integer.parseInt(boardNumStr);
	}
	
	Board board = boardDao.getBoardByNumAndTitle(boardNum, title);
	
	%>
		<div class="container">
		<div style="text-align: center; padding: 10px;">
			<form>
				<input name="title" type="text" value="<%= board.getTitle() %>"
					style="width: 100%; height: 50px; border : none; font-size: 20px;
						background-color: #FFEFEB; outline: none;">
				<div>
					<textarea name="text" rows="20" cols="20"
						style="width: 100%; height: 500px;margin-top: 10px; font-size: 15px; border: none;
							background-color: #FFEFEB; resize: none;
							outline: none;"><%= board.getText() %></textarea>
				</div>
				<input type="submit" value="수정" onclick="updateBoard()"
					style="color:#7A2D1B; background-color: #FFEFEB; border: none;
						padding: 10px 30px;"/> 
				<input type="button" onclick="goMain()" value="게시판 목록" 
					style="color:#7A2D1B; background-color: #FFEFEB; border: none;
					padding: 10px 30px;"/>
			</form>
		</div>
		</div>
</body>
</html>