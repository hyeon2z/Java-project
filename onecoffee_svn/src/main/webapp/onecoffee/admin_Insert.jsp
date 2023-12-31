<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" import="backendweb.z01_vo.*"%>
<%@page import="admin.vo.Menu"%>
<%@page import="admin.*"%>
<%@page import="admin.vo.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<!DOCTYPE html>
<html lang="zxx">

<style>
table {
	border: none;
	margin: 0 auto;
	width: 20%;
}

button {
	display: #7A2D1B;
	position: absolute;
	left: 50%;
	margin: 0px;
	width: 120px;
	background-color: #7A2D1B;
	color: white;
	font-size: 16px;
	border: 1px solid black;
	padding: 10px 20px;
	
}

table td, table th {
	border: none;
	color: #742D18;
}

input {
	color: #7A2D1B;
	margin-top: 2px;
	margin-bottom: 2px;
	width: 250px;
	border: none;
	/*background-color: transparent;*/
	background-color: background-color: #f5f5f5;
}
</style>
<head>
<meta charset="UTF-8">
<meta name="description" content="Male_Fashion Template">
<meta name="keywords" content="Male_Fashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Male-Fashion | Template</title>

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
</head>
<style>
a.primary-btn {
	float: right;
}
</style>
<body>


	<!-- Header Section Begin -->
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
						if (userId != null) {
					%>
					<div class="col-lg-6 col-md-5">
						<div class="header__top__right">
							<div class="header__top__links" style="margin: 0; width: 100%;">
								<p
									style="margin-right: 10%; text-transform: uppercase; display: inline-block; letter-spacing: 2px; font-size: 14px; color: #7A2D1B;">
									환영합니다!
									<%=userId%>님
								</p>

								<a href="admin_main.jsp" style="color: #7A2D1B">메인으로</a> <a
									href="logout.jsp" style="color: #7A2D1B">로그아웃</a>
							</div>
						</div>
					</div>
					<%
					} else {
					%>
					<div class="col-lg-6 col-md-5">
						<div class="header__top__right">
							<div class="header__top__links">
								<a href="login.jsp" style="color: #7A2D1B">로그인</a> <a
									href="createID.jsp" style="color: #7A2D1B">회원가입</a>
							</div>
						</div>
					</div>
					<%
					}
					}
					%>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3">
					<div class="header__logo">
						<a href="./index.html"><img src="img/onelogo.png" alt=""></a>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<nav class="header__menu mobile-menu"
						style="margin-left: 20%; margin-right: 20% width:60%;">
						<ul>

							<li><a href="admin_list.jsp" style="color: #7A2D1B">메뉴관리</a></li>
							<li><a href="admin_member.jsp" style="color: #7A2D1B">회원관리</a></li>
							<li><a href="admin_sal.jsp" style="color: #7A2D1B">매출관리</a></li>
							<!-- <li ><a href="admin_notice.jsp" style="color:#7A2D1B">공지사항 관리</a></li> -->
							<li><a href="board.jsp" style="color: #7A2D1B">커뮤니티</a></li>


						</ul>
					</nav>
				</div>

			</div>
			<div class="canvas__open">
				<i class="fa fa-bars"></i>
			</div>

		</div>
	</header>
	<!-- Header Section End -->

	<!-- 메뉴 리스트  -->
	<script src="/frontweb/com/jquery-3.6.0.js"></script>


	<!-- Search Begin -->
	<div class="search-model">
		<div class="h-100 d-flex align-items-center justify-content-center">
			<div class="search-close-switch">+</div>
			<form class="search-model-form">
				<input type="text" id="search-input" placeholder="Search here.....">
			</form>
		</div>
	</div>
	<!-- Search End -->
<body>
	<br>
	<h2 align="center" style="color: #7A2D1B">메뉴 등록</h2>
	<br>
	<!-- 폼 으로 인풋 을 감쌈, action =값들을 전송할 주소 -->
	<form method="post" action="./admin_insert_ok.jsp">
		<table>
			<col width="60%">
			<!-- 	<tr><th>순서</th><td><input type="number" name="no"/></td></tr> -->
			<tr>
				<th>카테고리</th>
				<td><input type="text" placeholder="카테고리를 입력하세요"
					name="category" /></td>
			</tr>
			<tr>
				<th>음료명</th>
				<td><input type="text" placeholder="음료명을 입력하세요" name="name" /></td>
			</tr>
			<tr>
				<th>타입</th>
				<td><input type="text" placeholder="타입을 입력하세요"
					name="drink_type" /></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="number" placeholder="가격을 입력하세요" name="price" /></td>
			</tr>
			<tr>
				<th>설명</th>
				<td><input type="text" placeholder="음료에 대한 설명을 입력하세요"
					name="detail" /></td>
			</tr>

			<tr>
				<th><br> <!-- 등록하기 서브밋을 하면 폼이 동작하면서 값들을 전 -->
					<button type="submit" style="border-radius: 5px">등록하기</button></th>
			</tr>

		</table>


	</form>
</body>

</html>