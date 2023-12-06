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
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
<script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>

    <%
    Orderdao dao = new Orderdao();
    String userId = (String) session.getAttribute("User");
    String plusPointStr = request.getParameter("plusPoint");
	System.out.println(plusPointStr);
    
	if (plusPointStr != null) {
        try {
        	double doubleplusPoint = Double.parseDouble(plusPointStr);
        	int plusPoint = (int)doubleplusPoint;
        	dao.plusPoint(plusPoint, userId);
        } catch (NumberFormatException e) {
        	System.out.println(e.getMessage());
        }
    }
    %>
    <script>
    $(document).ready(function(){
    	$("#close").click(function(){
    		window.close();
    	})
    	
    })
    </script>
    <!-- Checkout Section Begin -->
    <section class="checkout spad">
        <div class="container">
            <div class="checkout__form">
                <form action="addPoint.jsp" method="post">
                    <div class="row">
                        <div class="col-lg-8 col-md-6">
                            <h6 class="checkout__title">포인트 적립</h6>
                            <div class="checkout__input">
                                <p>결제 금액</p>
                                <input type="text" name="totalPrice" value="${total-point}">
                            </div>
                            <div class="checkout__input">
                                <p>현재 포인트</p>
                                <input type="text" name="point"
                                    value="<%=dao.getPoint(userId)%>">
                            </div>
                            <div class="checkout__input">
                                <p>적립 포인트</p>
                                <input type="text" name="plusPoint"
                                    value="${(total-point)*0.05}">
                            </div>
                            <br> <br> 
                            <button type="submit" class="site-btn">확인</button>
                            <button class="site-btn" id="close" onclick="close()" >페이지닫기</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </section>
    <!-- Checkout Section End -->

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