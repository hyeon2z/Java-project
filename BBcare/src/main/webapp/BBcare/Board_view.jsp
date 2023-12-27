<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="community.vo.*"%>
<%@page import="community.*"%>
<%@page import="community.BoardDao"%>
<%@page import="community.vo.Board"%>
<%
BoardDao dao = new BoardDao();

int no = 0;
String noStr = request.getParameter("no");
if (noStr != null)
	no = Integer.parseInt(noStr);

Board data = dao.getPet(no); // 게시글 가져오기

dao.hit(no); // 조회수 올리기 

String userId = "";
if (session != null) { // 로그인된 회원의 아이디 가져오기
	userId = (String) session.getAttribute("userId");
}
%>
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
<style>
table {
	border: none;
	margin: 0 auto;
	width: 20%;
}

.button-container {
	text-align: center;
	margin-top: 10px;
}

.button {
	display: inline-block;
	margin: 0 10px;
	width: 150px;
	background-color: #FFC314;
	color: white;
	font-size: 16px;
	border: 1px solid;
	padding: 10px 20px;
	text-decoration: none;
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
<body>
	<!-- 상단바 -->
	<jsp:include page="module_top.jsp" flush="true" />

	<section class="hero-wrap hero-wrap-2"
		style="background-image: url('images/bg_2.jpg');"
		data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div class="row no-gutters slider-text align-items-end">
				<div class="col-md-9 ftco-animate pb-5">
					<p class="breadcrumbs mb-2">
						<span class="mr-2"><a href="index.html">Home <i
								class="ion-ios-arrow-forward"></i></a></span> <span>Gallery <i
							class="ion-ios-arrow-forward"></i></span>
					</p>
					<h1 class="mb-0 bread">Gallery</h1>
				</div>
			</div>
		</div>
	</section>
	<br>
	<br>

	<br>
	<br>
	<!-- 폼 으로 인풋 을 감쌈, action =값들을 전송할 주소 -->
	<form id="frm" method="post" action="Board_delete_ok.jsp">
		<input type="hidden" name="no" value="<%=data.getNo()%>">
		<table width="2000px">
			<colgroup>
				<col width="180px" />
				<col />
			</colgroup>
			<!-- 	<tr><th>순서</th><td><input type="number" name="no"/></td></tr> -->
			<tr>
				<th>제목</th>
				<td><%=data.getTitle()%></td>
			</tr>
			<tr>
				<th></th>
				<td><img src="./upload/<%=data.getImg()%>" width="700px">
				</td>
			</tr>
			<tr>
				<th></th>
				<td><%=data.getContent()%></td>
			</tr>
			<tr>
				<th>
				
				<td>
					<button type="button" id="likeButton" onclick="likeButtonClick()()">
						<img src="upload/다운로드.jpeg"
							style="max-width: 25px; max-height: 25px;" 
					>
					</button> <span id="likeCount"><%=data.getLikes()%></span><td>
				</th>
			</tr>
			<tr>
				<th colspan="2"><br> <!-- 등록하기 서브밋을 하면 폼이 동작하면서 값들을 전 -->
					<div class="button-container">
						<a href="Board.jsp" class="button">목록보기</a>
						

						<%
						if (userId.equals(data.getId())) { // 게시글을 등록한 회원 아이디와 로그인한 아이디가 같을 경우 버튼 표시
						%>
						<a href="Board_modify.jsp?no=<%=data.getNo()%>" class="button">수정하기</a>
						<button type="button" id="btn-delete" class="button">삭제하기</button>
						<%
						}
						%>
					</div></th>
			</tr>

		</table>


	</form>
	<br>
	<br>
	<script>
		$("#btn-delete").click(function() {
			if (confirm("삭제할까요?")) {
				$("#frm").submit();
			}
		});

		 function likeButtonClick() {
		        var likeCountElement = document.getElementById('likeCount');
		        var likeImageElement = document.getElementById('likeImage');
		        
		        // 클라이언트 측에서 좋아요 수를 증가시키고 로컬 스토리지에 저장
		        likeCountElement.innerText = parseInt(likeCountElement.innerText) + 1;
		        
		        // 이미지 크기를 조절
		        likeImageElement.style.maxWidth = '25px';
		        likeImageElement.style.maxHeight = '25px';
		    }

		    // 페이지 로드 시 초기값을 로컬 스토리지에서 가져와 설정
		    window.onload = function() {
		        var likeCountElement = document.getElementById('likeCount');
		        var storedLikes = localStorage.getItem('likes');
		        if (storedLikes !== null) {
		            likeCountElement.innerText = storedLikes;
		        }
		    };

		    // 페이지 unload 시 좋아요 수를 로컬 스토리지에 저장
		    window.onunload = function() {
		        var likeCountElement = document.getElementById('likeCount');
		        localStorage.setItem('likes', likeCountElement.innerText);
		    };
	</script>

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
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
	<script src="js/google-map.js"></script>
	<script src="js/main.js"></script>



</body>
</html>