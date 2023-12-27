<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="community.vo.*"%>
<%@page import="community.*"%>
<%@page import="community.BoardDao"%>
<%@page import="community.vo.Board"%>	
<%

if (session != null) {
	String userId = (String) session.getAttribute("userId");
	String role = (String) session.getAttribute("role");
	String username = (String) session.getAttribute("userName");
	if (userId == null || role.equals("user") == false) { // 유저 로그인 상단바
	%>
	<script>
		alert("로그인해주세요.");
		location.href = "login.jsp";
	</script>
	<%
		out.close(); //
	}
}
else {
	%>
	<script>
		alert("로그인해주세요.");
		location.href = "login.jsp";
	</script>
	<%
		out.close(); //

}




BoardDao dao = new BoardDao();

String name = request.getParameter("name");
if(name==null) name = "";
String title = request.getParameter("title");
if(title==null) title = "";
String img = request.getParameter("img");
if(img==null) img = "";
String likes = request.getParameter("likes");
if(likes==null) likes = "";
String click = request.getParameter("click");
if(click==null) click = "";

int no = 0;
String noStr = request.getParameter("no");
if(noStr!=null) no = Integer.parseInt(noStr);


%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <link rel="shortcut icon" type="image/x-icon" href="images/BBcare.jpg">
	<title>뽀봉케어</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">
    <link rel="stylesheet" href="css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/jquery.timepicker.css">
    <link rel="stylesheet" href="css/flaticon.css">
    <link rel="stylesheet" href="css/style.css">
  </head>
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
	background-color: #FFC314;
	color: white;
	font-size: 16px;
	border: 1px solid ;
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
  </style>
  <body>
    <!-- 상단바 -->
  	<jsp:include page="module_top.jsp" flush="true"/>
  	
    <section class="hero-wrap hero-wrap-2" style="background-image: url('images/bg_2.jpg');" data-stellar-background-ratio="0.5">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text align-items-end">
          <div class="col-md-9 ftco-animate pb-5">
          	<p class="breadcrumbs mb-2"><span class="mr-2"><a href="index.html">Home <i class="ion-ios-arrow-forward"></i></a></span> <span>Gallery <i class="ion-ios-arrow-forward"></i></span></p>
            <h1 class="mb-0 bread">Gallery</h1>
          </div>
        </div>
      </div>
    </section>
<br><br>

	<br>
	<br>
	<!-- 폼 으로 인풋 을 감쌈, action =값들을 전송할 주소 -->
	<form method="post" enctype="multipart/form-data"  action="./Board_insert_ok.jsp">
		<table>
			<col width="60%">
			<!-- 	<tr><th>순서</th><td><input type="number" name="no"/></td></tr> -->
			<tr>
				<th>제목</th>
				<td><input type="text" placeholder="제목 입력하세요"
					name="title" /></td>
			</tr>
			<tr>
				<th>이미지</th>
				<td><input type="file" placeholder="이미지를 업로드 하세요" name="img" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea placeholder="내용을 입력하세요"
					name="content"></textarea></td>
			</tr>

			<tr>
				<th><br> <!-- 등록하기 서브밋을 하면 폼이 동작하면서 값들을 전 -->
					<button type="submit" style="border-radius: 5px">작성하기</button></th>
			</tr>

		</table>


	</form>
<br><br>
	
    <footer class="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-6 col-lg-3 mb-4 mb-md-0">
						<h2 class="footer-heading">Petsitting</h2>
						<p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>
						<ul class="ftco-footer-social p-0">
              <li class="ftco-animate"><a href="#" data-toggle="tooltip" data-placement="top" title="Twitter"><span class="fa fa-twitter"></span></a></li>
              <li class="ftco-animate"><a href="#" data-toggle="tooltip" data-placement="top" title="Facebook"><span class="fa fa-facebook"></span></a></li>
              <li class="ftco-animate"><a href="#" data-toggle="tooltip" data-placement="top" title="Instagram"><span class="fa fa-instagram"></span></a></li>
            </ul>
					</div>
					<div class="col-md-6 col-lg-3 mb-4 mb-md-0">
						<h2 class="footer-heading">Latest News</h2>
						<div class="block-21 mb-4 d-flex">
              <a class="img mr-4 rounded" style="background-image: url(images/image_1.jpg);"></a>
              <div class="text">
                <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about</a></h3>
                <div class="meta">
                  <div><a href="#"><span class="icon-calendar"></span> April 7, 2020</a></div>
                  <div><a href="#"><span class="icon-person"></span> Admin</a></div>
                  <div><a href="#"><span class="icon-chat"></span> 19</a></div>
                </div>
              </div>
            </div>
            <div class="block-21 mb-4 d-flex">
              <a class="img mr-4 rounded" style="background-image: url(images/image_2.jpg);"></a>
              <div class="text">
                <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about</a></h3>
                <div class="meta">
                  <div><a href="#"><span class="icon-calendar"></span> April 7, 2020</a></div>
                  <div><a href="#"><span class="icon-person"></span> Admin</a></div>
                  <div><a href="#"><span class="icon-chat"></span> 19</a></div>
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
                <li><span class="icon fa fa-map"></span><span class="text">203 Fake St. Mountain View, San Francisco, California, USA</span></li>
                <li><a href="#"><span class="icon fa fa-phone"></span><span class="text">+2 392 3929 210</span></a></li>
                <li><a href="#"><span class="icon fa fa-paper-plane"></span><span class="text">info@yourdomain.com</span></a></li>
              </ul>
            </div>
					</div>
				</div>
				<div class="row mt-5">
          <div class="col-md-12 text-center">

            <p class="copyright"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib.com</a>
  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
          </div>
        </div>
			</div>
		</footer>

    
  

  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>
  <script src="js/jquery.min.js"></script>
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
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
  <script src="js/google-map.js"></script>
  <script src="js/main.js"></script>


    
  </body>
</html>