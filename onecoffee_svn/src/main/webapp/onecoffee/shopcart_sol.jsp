<%@page import="order_sol.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" import="backendweb.z01_vo.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<!DOCTYPE html>
<html lang="zxx">
<style>
.sol03 {
	flex: 0 0 100%;
	max-width: 100%;
}
</style>
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
			<div class="price"></div>
		</div>
		<div id="mobile-menu-wrap"></div>
		<div class="offcanvas__text">
			<p></p>
		</div>
	</div>
	<!-- Offcanvas Menu End -->

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
			                    	<div class="header__top__links" style = "margin:0; width:100%;">
				                        <p style = "margin-right:10%; text-transform:uppercase; display:inline-block; letter-spacing:2px; font-size:14px; color:#7A2D1B;">환영합니다! <%= userId %>님</p>
				                        <a href="mypage.jsp" style="color:#7A2D1B; margin-right:3%">마이페이지</a>
				                        <a href="logout.jsp" style="color:#7A2D1B">로그아웃</a>
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
	</header>
	<!-- Header Section End -->
	<%
	Orderdao dao = new Orderdao();

	// checkbox check 된 것만 삭제기능
	String noStr[] = request.getParameterValues("selectedMenus");
	if (noStr != null) {
		for (String menuNo : noStr) {
			try {
		int no = Integer.parseInt(menuNo);
		dao.deleteCart(no);
			} catch (NumberFormatException e) {
			}
		}
	}
	
	// 픽업주문와 매장주문 중 클릭하면 submit으로 값 전달 + 세션저장
	String btnValue = request.getParameter("btnValue");
	session.setAttribute("btnValue",btnValue);
	%>
	<!-- Breadcrumb Section Begin -->
<body>
<br><br><br><br>
			<form>
<div class="row">
			<div style="padding-left: 100px; display: flex; margin-left: 20%; width: 100%; ">
				<button type="submit" class="btn btn-outline-dark" name="btnValue" value="픽업주문"
				 id="btnCheckData" style="width: 30%; background:#7A2D1B; color:#ECE0DE;" >
				픽업주문
					</button>

				&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="submit"class="btn btn-outline-dark" name="btnValue" value="매장주문"
				style="width: 30%; background:#7A2D1B; color:#ECE0DE;">매장주문</button>
			</div>
			
		</div>
			</form>
	
	<!-- Shopping Cart Section Begin -->
	<section class="shopping-cart spad" style="backgorund: #FFF8F8;">
		<div class="container">
			<br> <br>
			<h2>장바구니</h2>
			<br> <br>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>선 택</th>
						<th>대분류</th>
						<th>소분류</th>
						<th>음료명</th>
						<th>가 격</th>
						<th>갯 수</th>
					</tr>
				</thead>
				<tbody>
					<form>
						<%
						int totalPrice = 0;
						int totalCnt = 0;
						// 장바구니 테이블 출력 메서드
						List<Cart> cartList = dao.getCartList();
						for (Cart c01 : cartList) {
							totalCnt += c01.getCnt();
							totalPrice += c01.getCnt() * c01.getPrice();
							session.setAttribute("total", totalPrice);
							// 총계 session으로 저장 -> 결제페이지에서도 사용
						%>
						<tr>
							<td><input type="checkbox" name="selectedMenus" class="chk"
								value="<%=c01.getNo()%>"></td>
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
		</div>
		<div class="row">
			<div
				style="padding-left: 100px; display: flex; margin-left: 35%; width: 100%;">

				<button type="button" class="btn btn-outline-dark" id="btnCheckData" style="background:#7A2D1B; color:#ECE0DE;"
				 onclick="location.href='selectMenu.jsp'">
					주문 페이지</button>

				&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="submit" onclick="location.href='shopcart_sol.jsp'"
					class="btn btn-outline-dark" style="background:#7A2D1B; color:#ECE0DE;">메뉴 삭제</button>
			</div>
			</form>

		</div>
		<br>
		<div class="cart__total" style="width: 60%; margin-left: 19%">
			<h6>Cart total</h6>
			<ul>
				<li>Total <span>${total}</span></li>
			</ul>
			<a href="PaymentInfo.jsp" class="primary-btn" style="background:#7A2D1B; color:#ECE0DE;">결제하기</a>
		</div>

	</section>
	<!-- Shopping Cart Section End -->



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
	<script src="js/jquery-3.3.1.min.js"></script>
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