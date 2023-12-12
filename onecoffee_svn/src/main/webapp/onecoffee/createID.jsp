<%@page import="java.awt.event.FocusAdapter"%>
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
    <title>ONE COFFEE 회원가입</title>

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

<%
String name = request.getParameter("name") == null? "" : request.getParameter("name");
String id = request.getParameter("id") == null? "" : request.getParameter("id");
String pwd = request.getParameter("pwd") == null? "" : request.getParameter("pwd");
String pwd2 = request.getParameter("pwd2") == null? "" : request.getParameter("pwd2");
String phone = request.getParameter("phone") == null? "" : request.getParameter("phone");
String address = request.getParameter("address") == null? "" : request.getParameter("address");
String pwdAnswer = request.getParameter("pwdAnswer") == null? "" : request.getParameter("pwdAnswer");

boolean idExist = false;
boolean isInsert = false;
String alertMessage = null;

if (request.getMethod().equalsIgnoreCase("post")) {
    if (id.isEmpty() || name.isEmpty() || pwd.isEmpty() ||
    		pwd2.isEmpty() || phone.isEmpty() || address.isEmpty()) {
        alertMessage = "입력되지 않은 정보가 있습니다.";
        
    } else {
        CreateMemDao dao = new CreateMemDao();
        idExist = dao.idExist(id);

        if(idExist){
            alertMessage = "이미 사용중인 아이디입니다. 다른 아이디를 입력해주세요.";
        } else if (!pwd.equals(pwd2)) {
            alertMessage = "비밀번호가 일치하지 않습니다. 다시 입력해주세요.";
        } else {
            dao.CreateAccount(new CreateAccount(name, id, pwd, phone, address, pwdAnswer));
            isInsert = true;
        }
    }
}
%>
<% if (alertMessage!=null) { %>
    <script>
        alert("<%= alertMessage %>");
        history.back();
    </script>
<% } %>

<% if (isInsert) { %>
    <script>
        alert("회원가입이 완료되었습니다.");
        window.location.href = "index02.jsp";
    </script>
<% } %>
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
				                        <a href="logout.jsp" style="color:#7A2D1B; margin-right:3%">마이페이지</a>
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

    <!-- Checkout Section Begin -->
    <section class="checkout spad">
        <div class="container">
            <div class="checkout__form">
                <form action="#" method = "post">
                    <div class="row">
                        <div class="col-lg-8 col-md-6">
                            
                            <h6 class="checkout__title">회원가입</h6>
                            <div class="checkout__input">
                                <p>이름<span>*</span></p>
                                <input type="text" name = "name">
                            </div>
                            <div class="checkout__input">
                                <p>아이디<span>*</span></p>
                                <input type="text" name = "id">
                            </div>
                            <div class="checkout__input">
                                <p>비밀번호<span>*</span></p>
                                <input name = "pwd" type="password" placeholder="비밀번호" class="checkout__input__add">
                                <input name = "pwd2" type="password" placeholder="비밀번호 확인">
                            </div>
                            <div class="checkout__input">
                                <p>전화번호<span>*</span></p>
                                <input name = "phone"type="text">
                            </div>
                            <div class="checkout__input">
                                <p>주소<span>*</span></p>
                                <input name = "address" type="text">
                            </div>
                            <div class="checkout__input">
                                <p>비밀번호 찾기 질문 선택<span>*</span></p>
                                <select>
                                	<option>태어난 도시는?</option>
                                	<option>가장 친한친구 이름은?</option>
                                	<option>아버지의 이름은 무엇인가?</option>
                                </select>
                            </div><br><br>
                            
                            <div class="checkout__input">
                                <p>정답<span>*</span></p>
                                <input name = "pwdAnswer" type="text">
                            </div>
                            <div class="checkout__input__checkbox">
                                <label for="acc">
                                    개인정보 이용동의
                                    <input class = check type="checkbox" id="acc">
                                    <span class="checkmark"></span>
                                </label>
                            </div>
                            <div class="checkout__input__checkbox">
                                <label for="diff-acc">
                                    마케팅 수신동의
                                    <input class = check type="checkbox" id="diff-acc">
                                    <span class="checkmark"></span>
                                </label>
                            </div>
                            <button type="submit" class="site-btn">가입하기</button>
                        </div>
                        
                    </div>
                </form>
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