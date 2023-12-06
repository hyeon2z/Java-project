<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" import="backendweb.z01_vo.*"%>
<%@page import="admin.vo.*"%>
<%@page import="admin.*"%>
<%@page import="admin.MenuDao"%>
<%@page import="admin.vo.Menu"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
MenuDao dao = new MenuDao();
int no;
String noStr = request.getParameter("noStr");
if(noStr!=null) no = Integer.parseInt(noStr);
String category = request.getParameter("category");
if(category==null) category = "";
String name = request.getParameter("name");
if(name==null) name = "";
String drink_type = request.getParameter("drink_type");
if(drink_type==null) drink_type = "";
String detail = request.getParameter("detail");
if(detail==null) detail = "";

%>


<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<!DOCTYPE html>
<html lang="zxx">
<style>
table {
	border: none;
}

table td, table th {
	border: none;
}
</style>
<head>
<meta charset="UTF-8">
<meta name="description" content="Male_Fashion Template">
<meta name="keywords" content="Male_Fashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">


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
			<p>Free shipping, 30-day return or refund guarantee.</p>
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
			            <% } else { %>
			            	<div class="col-lg-6 col-md-5">
			                    <div class="header__top__right">
			                    	<div class="header__top__links">    
					                    <a href="login.jsp" style="color:#7A2D1B">로그인</a>
		                                <a href="createID.jsp" style="color:#7A2D1B">회원가입</a>
		                            </div>
                                </div>
			                </div>
			                    <script>
							        alert("로그인이 필요한 기능입니다.");
							        window.location.href = "login.jsp";
							    </script>
			            <% } 
			            }		%>
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
						 <li ><a href="user_menu.jsp" style="color:#7A2D1B">메뉴소개</a></li>
                            <li ><a href="contact.jsp" style="color:#7A2D1B">매장안내</a></li>
                            <li ><a href="selectMenu.jsp" style="color:#7A2D1B">주문하기</a></li>
                            <li ><a href="board.jsp" style="color:#7A2D1B">커뮤니티</a></li>
                           

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
	<script>

</script>

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
	<script>


function goPage(no) {
	location.href = "/admin_menu_detail.jsp?no=" + no;
}
</script>
<body>
	<br>
	<h2 align="center"></h2>
	<table class="customers" width="60%" border align="center">
		<tr>
			<th>NO</th>
			<th>카테고리</th>
			<th>음료명</th>
			<th>음료타입</th>
			<th>금액</th>
			<th>음료설명</th>
		</tr>
		<% for(Menu menu : dao.getMenuList()){ %>
		<tr ondblclick="goPage(<%=menu.getNo()%>)">
			<td><%=menu.getNo()%></td>
			<td><%=menu.getCategory()%></td>
			<td><%=menu.getName()%></td>
			<td><%=menu.getDrink_type()%></td>
			<td><%=menu.getPrice()%></td>
			<td><%=menu.getDetail()%></td>
		</tr>
		<%}%>

	</table>

	

</body>
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