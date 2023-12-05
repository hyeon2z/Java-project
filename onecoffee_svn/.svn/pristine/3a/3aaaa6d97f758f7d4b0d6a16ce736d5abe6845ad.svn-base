<%@page import="order_sol.Cart"%>
<%@page import="order_sol.Orderdao"%>
<%@page import="java.awt.event.FocusAdapter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" import="login.*"
	import="login.vo.*"%>
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
<title>ONE COFFEE</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<script src="js/jquery-3.3.1.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>

<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Offcanvas Menu Begin -->
	<div class="offcanvas-menu-overlay"></div>
	<div class="offcanvas-menu-wrapper">
		<div class="offcanvas__option">
			<div class="offcanvas__links">
				<a href="#">Sign in</a> <a href="#">FAQs</a>
			</div>
			<div class="offcanvas__top__hover">
				<span>Usd <i class="arrow_carrot-down"></i></span>
				<ul>
					<li>USD</li>
					<li>EUR</li>
					<li>USD</li>
				</ul>
			</div>
		</div>
		<div class="offcanvas__nav__option">
			<a href="#" class="search-switch"><img src="img/icon/search.png"
				alt=""></a> <a href="#"><img src="img/icon/heart.png" alt=""></a>
			<a href="#"><img src="img/icon/cart.png" alt=""> <span>0</span></a>
			<div class="price">$0.00</div>
		</div>
		<div id="mobile-menu-wrap"></div>
		<div class="offcanvas__text">
			<p></p>
		</div>
	</div>
	<!-- Offcanvas Menu End -->

	<%
	String plusPointStr = request.getParameter("plusPoint");
	int plusPoint = 0;
	if (plusPointStr != null)
		plusPoint = Integer.parseInt(plusPointStr);

	request.setAttribute("plusPoint", plusPoint);
	%>
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
								<a href="logout.jsp" style="color: #7A2D1B; margin-right: 3%">마이페이지</a>
								<a href="logout.jsp" style="color: #7A2D1B">로그아웃</a>
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
						<a href="./index02.jsp"><img src="img/onelogo.png"
							alt="ONE COFFEE"></a>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<nav class="header__menu mobile-menu"
						style="margin-left: 20%; margin-right: 20%; width: 60%;">
						<ul>
							<li><a href="#" style="color: #7A2D1B">메뉴소개</a></li>
							<li><a href="#" style="color: #7A2D1B">매장안내</a></li>
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
	</header>
	<!-- Header Section End -->
	<%
	int idx = 100;
	idx++;
	%>

	<!-- Checkout Section Begin -->
	<section class="checkout spad">
		<div class="container">
			<div class="checkout__form">
				<form action="#" method="post">
					<div class="row">
						<div class="col-lg-8 col-md-6">

							<h6 class="checkout__title">주문정보확인</h6>
							<div class="checkout__input">
								<p>아이디</p>
								<input type="text" name="name" value="${User}">
							</div>
							<div class="checkout__input">
								<p>픽업방식</p>
								<input type="text" name="id" value="${btnValue}">
							</div>
							<div class="checkout__input">
								<p>주문번호</p>
								<input name="pwd" type="text" value="A<%=idx%>"
									class="checkout__input__add">
							</div>

							<div class="checkout__input">
								<p>주문메뉴</p>
							</div>
							<table
								style="background: white; border-collapse: collapse; width: 100%; border: 0.5px solid #E1E1E1;">
								<tbody>
									<%
									Orderdao dao = new Orderdao();
									List<Cart> cartList = dao.getCartList();
									for (Cart c01 : cartList) {
									%>

									<tr>
										<td><%=c01.getCategory()%></td>
										<td><%=c01.getDrink_type()%></td>
										<td><%=c01.getName()%></td>
										<td><%=c01.getPrice()%></td>
										<td><%=c01.getCnt()%></td>

									</tr>
									<%
									}
									%>

								</tbody>
							</table>
							<br>
							<%
							String userId = (String) session.getAttribute("User");
							//dao.plusPoint(plusPoint, userId);
							%>

							<script>
								$(document).ready(function() {
									$("form").submit(function() {
							<%=dao.plusPoint(plusPoint, userId)%>
								})
								})
							</script>
							<form>
								<div class="checkout__input">

									<div class="checkout__input">
										<p>결제 금액</p>
										<input name="plusPoint" type="text" value="${total-point}"
											class="checkout__input__add">
									</div>
									<div class="checkout__input">
										<p>적립된 포인트</p>
										<input name="plusPoint" type="text"
											value="${(total-point)*0.05}" class="checkout__input__add">
									</div>
									<br>


								</div>
						</div>
				</form>
				<div
					style="padding-left: 100px; display: flex; margin-left: 35%; width: 100%;">

					<button type="button" class="btn btn-outline-dark"
						onclick="location.href='index02.jsp'" id="btnCheckData"
						style="background: #7A2D1B; color: #ECE0DE;">메인페이지 이동</button>

				</div>
			</div>
		</div>
	</section>
	<!-- Checkout Section End -->

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

	<!-- Js Plugins -->

	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/jquery.countdown.min.js"></script>
	<script src="js/jquery.slicknav.js"></script>
	<script src="js/mixitup.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/main.js"></script>
</body>

</html>