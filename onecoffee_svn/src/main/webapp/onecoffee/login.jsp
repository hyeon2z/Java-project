<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="login.*"
    import="login.vo.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
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
    <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
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
        /* 새로운 스타일 추가 */
        .login-section {
            padding: 150px 0; /* 상단 여백을 늘림 */
            background-color: #f9f9f9;
        }

        .login-form {
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            margin: 0 auto;
            margin-top: -50px; /* 공간을 더 늘림 */
            border: none; /* 테두리 제거 */
        }

        .login-form h2 {
            font-size: 24px;
            color: #333;
            margin-bottom: 30px;
            text-align: center;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group label {
            display: block;
            font-weight: 600;
            margin-bottom: 10px;
            color: #555;
        }

        .form-control {
            width: calc(100% - 20px);
            padding: 10px;
            border: 1px solid #ddd; /* 테두리 다시 추가 */
            border-radius: 5px;
            transition: border-color 0.3s;
            background-color: #f2f2f2; /* 배경색 추가 */
            margin-bottom: 10px; /* 간격 조절 */
            display: inline-block; /* 너비 계산을 위해 추가 */
        }

        .form-control:focus {
            outline: none; /* 포커스 효과 제거 */
            border-color: #3498db;
        }

        .btn-primary {
            background-color: #7A2D1B;
            color: #ECE0DE;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            display: block;
            margin: 0 auto;
        }

        .btn-primary:hover {
            background-color: #E74C3C;
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
                <a href="#">Sign in</a>
                <a href="#">FAQs</a>
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
            <a href="#" class="search-switch"><img src="img/icon/search.png" alt=""></a>
            <a href="#"><img src="img/icon/heart.png" alt=""></a>
            <a href="#"><img src="img/icon/cart.png" alt=""> <span>0</span></a>
            <div class="price">$0.00</div>
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
			            <% } else { %>
			            	<div class="col-lg-6 col-md-5">
			                    <div class="header__top__right">
			                    	<div class="header__top__links">    
					                    <a href="login.jsp" style="color:#7A2D1B">로그인</a>
		                                <a href="createID.jsp" style="color:#7A2D1B">회원가입</a>
		                            </div>
                                </div>
			                </div>
			            <% } 
			            }		%>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-3">
                    <div class="header__logo">
                        <a href="./index02.jsp"><img src="img/onelogo.png" alt="ONE COFFEE"></a>
                    </div>
                </div>
                 <div class="col-lg-6 col-md-6">
                    <nav class="header__menu mobile-menu" 
                     style="margin-left:20%; margin-right:20%; width:60%; ">
                        <ul>
                            <li ><a href="#" style="color:#7A2D1B">메뉴소개</a></li>
                            <li ><a href="contact.jsp" style="color:#7A2D1B">매장안내</a></li>
                            <li ><a href="selectMenu.jsp" style="color:#7A2D1B">주문하기</a></li>
                            <li ><a href="board.jsp" style="color:#7A2D1B">커뮤니티</a></li>
                           
                        </ul>
                    </nav>
                </div>
                
            </div>
            <div class="canvas__open"><i class="fa fa-bars"></i></div>
        </div>
    </header>
    <!-- Header Section End -->
<%
String id = request.getParameter("id") == null? "" : request.getParameter("id");

String pwd = request.getParameter("pwd") == null? "" : request.getParameter("pwd");

LoginDao loginDao = new LoginDao();

if(!id.equals("") && !pwd.equals("")){
	if (loginDao.isAdmin(id, pwd)) { // 관리자 페이지로 이동
	    response.sendRedirect("admin_main.jsp");
		session.setAttribute("User", id);
		
	} else if(loginDao.userAccess(id, pwd)) { // 유저 로그인
	    response.sendRedirect("index02.jsp");
		session.setAttribute("User", id);
		
	} else {
		out.println("<script>alert('로그인 실패. 아이디와 비밀번호를 확인하세요.');</script>");
	}
}

%>
<section class="login-section">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-6 col-md-8">
                <div class="login-form">
                    <h2>로그인</h2>
                    <form action="#" method="POST">
						<div class="form-group" style="display: flex; align-items: center; margin-bottom: 5px;">
						    <label for="username" style="color: #7A2D1B; margin-right: 139.5px; margin-bottom: 0;">아이디</label>
						    <a href="findID.jsp" style="color: #7A2D1B; margin: 0; font-size: 12px;">아이디를 잃어버리셨나요?</a>
						</div> 
						<div class="form-group">
						    <input name="id" type="text" class="form-control" id="username" name="username" required>
						</div>
						<div class="form-group" style="display: flex; align-items: center; margin-bottom: 5px;">
						    <label for="password" style="color: #7A2D1B; margin-right: 120px; margin-bottom: 0;">비밀번호</label>
						    <a href="findPWD.jsp" style="color: #7A2D1B; margin: 0; font-size: 12px;">비밀번호를 잃어버리셨나요?</a>
						</div>
						<div class="form-group">
						    <input name="pwd" type="password" class="form-control" id="password" name="password" required>
						</div>
                        <button type="submit" class="btn btn-primary">로그인</button>
                    </form>
                    <!-- "아이디 찾기" 링크 추가 -->
                    
                    
                    <!-- "비밀번호 찾기" 링크 추가 -->
                    
                </div>
            </div>
        </div>
    </div>
</section>


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