<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.io.File"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<!-- 상단바 -->
	<jsp:include page="module_top.jsp" flush="true" />
	<script>
		$(document).ready(function() {
			$("form").on("keypress", function(e) {
				if (e.keyCode == 13) { //  enter키의 keycode는 13
					e.preventDefault() // enter키의 기본 동작을 중단 처리
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
								class="ion-ios-arrow-forward"></i></a></span> <span>MyPage<i
							class="ion-ios-arrow-forward"></i></span>
					</p>
					<h1 class="mb-0 bread">이미지 확인</h1>
				</div>
			</div>
		</div>
	</section>

	<section class="ftco-section" style="background-color: white;">
		<div class="container">
			<%
			String saveDirectory = "C:/b01_javaexp/workspace/BBcare/src/main/webapp/BBcare/upload/";///application.getRealPath("C:/b01_javaexp/workspace/backendweb/src/main/webapp/Uploads/");
			System.out.println("업로드 경로");
			System.out.println(saveDirectory);
			int maxPostSize = 1024 * 100000; /* 1MB */
			String encoding = "UTF-8";
			String fileName = "";
			try {
				MultipartRequest mr = new MultipartRequest(request, saveDirectory, maxPostSize, encoding);
				fileName = mr.getFilesystemName("attachedFile");
				File oldFile = new File(saveDirectory + File.separator + fileName);
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("errorMessage", "파일 업로드 오류");
			}
			%>
			<%=fileName%>업로드<br> <img src="${path}/Uploads/<%=fileName%>"
				width="300" height="200">
			<%
			session.setAttribute("fileName", fileName);
			%>
			
			<script>
			  var dataToStore = "upload/<%= fileName %>";
			  console.log(dataToStore);
			  localStorage.setItem('myData', dataToStore);
			</script>
		</div>
	</section>
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