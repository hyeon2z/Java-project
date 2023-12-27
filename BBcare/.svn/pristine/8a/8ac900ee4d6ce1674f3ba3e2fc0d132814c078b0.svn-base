<%@page import="user.UserDao"%>
<%@page import="user.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<link rel="shortcut icon" type="image/x-icon" href="images/BBcare.jpg">
<title>뽀봉케어</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<link
	href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800&display=swap"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="css/animate.css">

<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">


<link rel="stylesheet" href="css/bootstrap-datepicker.css">
<link rel="stylesheet" href="css/jquery.timepicker.css">

<link rel="stylesheet" href="css/flaticon.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<jsp:include page="module_top.jsp" flush="true" />


	<%
    UserDao dao = new UserDao();
    
    String userId = request.getParameter("userId");
    if(userId == null) userId = "";
    // 비밀번호 재설정 페이지에서 사용할 session 저장
    session.setAttribute("userIdbyFindId", userId);

    String email = request.getParameter("email");
    if(email == null) email = "";
    
    if (email != null && !email.isEmpty() && userId != null && !userId.isEmpty()) {
        boolean getPwd = dao.FindPwd(userId, email);
        if (getPwd) {  
        	 out.println("<script>window.location.href='uptPwd.jsp';alert('비밀번호 재설정 페이지로 이동합니다.');</script>");
            
        } else {
            out.println("<script>alert('해당 이메일과 아이디의 가입 정보가 없습니다.');</script>");
        }
    }
%>
	<script>
		$(document).ready(function() {
			$("form").on("keypress", function(e) {
				if (e.keyCode == 13) {
					e.preventDefault();
				}
			})
		})
	</script>


	<section class="hero-wrap hero-wrap-2"
		style="background-image: url('images/bg_2.jpg'); background-color: transparent;"
		data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div class="row no-gutters slider-text align-items-end">
				<div class="col-md-9 ftco-animate pb-5">
					<p class="breadcrumbs mb-2">
						<span class="mr-2"><a href="index.jsp">Home <i
								class="ion-ios-arrow-forward"></i></a></span> <span>FindPassWord<i
							class="ion-ios-arrow-forward"></i></span>
					</p>
					<h1 class="mb-0 bread">비밀번호 찾기</h1>
				</div>
			</div>
		</div>
	</section>
	<section class="ftco-section" style="background-color: white;">
		<div class="container">
			<div class="row justify-content-center"></div>
			<div class="row justify-content-center">
				<div class="col-md-12">
					<div class="wrapper">

						<div class="col-md-7">
							<div style="width: 800px; margin-left: 20%">
								<div class="col-md-12">
									<div class="form-group">
										<br>
										<br> <a href="index.jsp"><img src="images/BBcare.jpg"
											style="width: 40%; height: 40%; align: center; display: block; margin-left: auto; margin-right: auto;"></a>

									</div>
								</div>
								<form method="POST" id="contactForm" name="contactForm"
									class="contactForm">
									<div class="row">

										<div class="col-md-12">
											<div class="form-group" style="margin-left: 12px;">

												<br> <label class="label" for="userId"
													style="font-size: 18px;">아이디</label> <input type="text"
													class="form-control" name="userId" id="userId"
													placeholder="아이디 입력" required>
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group" style="margin-left: 12px;">

												<br> <label class="label" for="email"
													style="font-size: 18px;">이메일</label> <input type="email"
													class="form-control" name="email" id="email"
													placeholder="이메일 입력" required>
											</div>
										<div class="col-md-12">
											<div class="form-group" style="margin-left: 12px;">
												<br>
												<br> <a href="find_Id.jsp" style="margin-left: 70%"> <span
													id="p02">아이디를 잃어버리셨나요?</span>
												</a>
											</div>
										</div>
									</div>

									<div class="col-md-12">
										<div class="form-group">
											<br>
											<br> <input type="submit" value="비밀번호 찾기"
												class="btn btn-primary" id="findPwdBtn"
												style="background: #FFC35A; border-color: #FFC35A; width: 100%; font-size: 18px;">
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</section>
	<footer class="footer">
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-lg-3 mb-4 mb-md-0">
					<h2 class="footer-heading">Petsitting</h2>
					<p>A small river named Duden flows by their place and supplies
						it with the necessary regelialia.</p>
					<ul class="ftco-footer-social p-0">
						<li class="ftco-animate"><a href="#" data-toggle="tooltip"
							data-placement="top" title="Twitter"><span
								class="fa fa-twitter"></span></a></li>
						<li class="ftco-animate"><a href="#" data-toggle="tooltip"
							data-placement="top" title="Facebook"><span
								class="fa fa-facebook"></span></a></li>
						<li class="ftco-animate"><a href="#" data-toggle="tooltip"
							data-placement="top" title="Instagram"><span
								class="fa fa-instagram"></span></a></li>
					</ul>
				</div>
				<div class="col-md-6 col-lg-3 mb-4 mb-md-0">
					<h2 class="footer-heading">Latest News</h2>
					<div class="block-21 mb-4 d-flex">
						<a class="img mr-4 rounded"
							style="background-image: url(images/image_1.jpg);"></a>
						<div class="text">
							<h3 class="heading">
								<a href="#">Even the all-powerful Pointing has no control
									about</a>
							</h3>
							<div class="meta">
								<div>
									<a href="#"><span class="icon-calendar"></span> April 7,
										2020</a>
								</div>
								<div>
									<a href="#"><span class="icon-person"></span> Admin</a>
								</div>
								<div>
									<a href="#"><span class="icon-chat"></span> 19</a>
								</div>
							</div>
						</div>
					</div>
					<div class="block-21 mb-4 d-flex">
						<a class="img mr-4 rounded"
							style="background-image: url(images/image_2.jpg);"></a>
						<div class="text">
							<h3 class="heading">
								<a href="#">Even the all-powerful Pointing has no control
									about</a>
							</h3>
							<div class="meta">
								<div>
									<a href="#"><span class="icon-calendar"></span> April 7,
										2020</a>
								</div>
								<div>
									<a href="#"><span class="icon-person"></span> Admin</a>
								</div>
								<div>
									<a href="#"><span class="icon-chat"></span> 19</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-6 col-lg-3 pl-lg-5 mb-4 mb-md-0">
					<h2 class="footer-heading">Quick Links</h2>
					<ul class="list-unstyled">
						<li><a href="#" class="py-2 d-block">Home</a></li>
						<li><a href="#" class="py-2 d-block">About</a></li>
						<li><a href="#" class="py-2 d-block">Services</a></li>
						<li><a href="#" class="py-2 d-block">Works</a></li>
						<li><a href="#" class="py-2 d-block">Blog</a></li>
						<li><a href="#" class="py-2 d-block">Contact</a></li>
					</ul>
				</div>
				<div class="col-md-6 col-lg-3 mb-4 mb-md-0">
					<h2 class="footer-heading">Have a Questions?</h2>
					<div class="block-23 mb-3">
						<ul>
							<li><span class="icon fa fa-map"></span><span class="text">203
									Fake St. Mountain View, San Francisco, California, USA</span></li>
							<li><a href="#"><span class="icon fa fa-phone"></span><span
									class="text">+2 392 3929 210</span></a></li>
							<li><a href="#"><span class="icon fa fa-paper-plane"></span><span
									class="text">info@yourdomain.com</span></a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row mt-5">
				<div class="col-md-12 text-center">

					<p class="copyright">
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						Copyright &copy;
						<script>
							document.write(new Date().getFullYear());
						</script>
						All rights reserved | This template is made with <i
							class="fa fa-heart" aria-hidden="true"></i> by <a
							href="https://colorlib.com" target="_blank">Colorlib.com</a>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					</p>
				</div>
			</div>
		</div>
	</footer>




	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen">
		<svg class="circular" width="48px" height="48px">
			<circle class="path-bg" cx="24" cy="24" r="22" fill="none"
				stroke-width="4" stroke="#eeeeee" />
			<circle class="path" cx="24" cy="24" r="22" fill="none"
				stroke-width="4" stroke-miterlimit="10" stroke="#F96D00" /></svg>
	</div>

	<script src="js/jquery-migrate-3.0.1.min.js"></script>

	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/jquery.waypoints.min.js"></script>
	<script src="js/jquery.stellar.min.js"></script>
	<script src="js/jquery.animateNumber.min.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/jquery.timepicker.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/scrollax.min.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
	<script src="js/google-map.js"></script>
	<script src="js/main.js"></script>



</body>
</html>