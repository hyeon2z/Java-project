<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
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

	<jsp:useBean id="dao" class="user.UserDao" />
	<jsp:useBean id="users" class="user.Users" />
	
	<c:set var="userId" value="${sessionScope.userId}" />
	
	<c:set var="user" value="${dao.getUser(userId)}" />
	
	
	 
	<script>
		$(document).ready(function() {
			$("form").on("keypress", function(e) {
				if (e.keyCode == 13) { //  enter키의 keycode는 13
					e.preventDefault() // enter키의 기본 동작을 중단 처리
				}
			})
			$("#contactForm [name=name]").attr("readonly",true)
			$("#contactForm [name=userId]").attr("readonly",true)
			
			$("#delBtn").click(function(){
				$.ajax({
					url:"userAjax/delUser.jsp",
					data:$("#contactForm").serialize(),
					dataType:"json",
					success:function(data){
						if(confirm("회원탈퇴 하시겠습니까?")){
							if(data.delUser>0){
								alert("회원탈퇴가 완료되었습니다.")
								window.location.href = 'logOut.jsp';
							}else{
								alert("회원탈퇴 오류")
							}
						}
					},
					error:function(err){console.log(err)}
				})
			})
			
			// 닉네임 변경 중복체크
			$("#userName").val("${user.userName}");
			
			$("#unBtn").click(function(){
			    var userNameValue = $("#contactForm [name=userName]").val(); // 사용자가 입력한 값 가져오기

			    if(userNameValue === "${user.userName}"){
			        $("#p01").text("변경사항이 없습니다.").css("color", "red");
			    } else {
			        $.ajax({
			            url: "userAjax/ckUn.jsp",
			            data: "userName=" + userNameValue,
			            dataType: "json",
			            success: function(rs) {
			                if(userNameValue === "") {
			                    $("#p01").text("닉네임을 입력해주세요").css("color", "red");
			                    $("[name=unCk]").val("N");
			                } else {
			                    if (rs.ckUserName) {
			                        $("#p01").text("사용중인 닉네임입니다. 다른 닉네임을 입력해주세요").css("color", "red");
			                        $("[name=userName]").val("").focus();
			                        $("[name=unCk]").val("N");
			                    } else {
			                        $("#p01").text("입력하신 닉네임은 사용이 가능합니다.").css("color", "black");
			                    }
			                }
			            },
			            error: function(err) {
			                console.log(err);
			            }
			        });
			    }
			});
			
			
			// 이메일 중복체크
			$("#email").val("${user.email}");
			
			$("#emailBtn").click(function(){
			    var emailValue = $("#contactForm [name=email]").val(); 

			    if(emailValue === "${user.email}"){
			        $("#p03").text("변경사항이 없습니다.").css("color", "red");
			    } else {
			        $.ajax({
			            url: "userAjax/ckEmail.jsp",
			            data: "email=" + emailValue,
			            dataType: "json",
			            success: function(rs) {
			                if(emailValue === "") {
			                    $("#p03").text("이메일을 입력해주세요").css("color", "red");
			                    $("[name=emailCk]").val("N");
			                } else {
			                    if (rs.ckEmail) {
			                        $("#p03").text("사용중인 이메일입니다. 다른 이메일을 입력해주세요").css("color", "red");
			                        $("[name=email]").val("").focus();
			                        $("[name=emailCk]").val("N");
			                    } else {
			                        $("#p03").text("입력하신 이매일은 사용이 가능합니다.").css("color", "black");
			                    }
			                }
			            },
			            error: function(err) {
			                console.log(err);
			            }
			        });
			    }
			});
		
			// 공백유효성, 비밀번호 일치 여부 판단
			 $("#uptBtn").click(function () {
	                var errorMessages = [];

	                if (!$.trim($("[name=name]").val())) {
	                    errorMessages.push("이름을 입력하세요.");
	                }

	                if (!$.trim($("[name=password]").val())) {
	                    errorMessages.push("비밀번호를 입력하세요.");
	                }

	                if (!$.trim($("[name=password01]").val())) {
	                    errorMessages.push("비밀번호를 재입력해주세요.");
	                }

	                if ($.trim($("[name=password01]").val()) !== $.trim($("[name=password]").val())) {
	                    errorMessages.push("비밀번호가 일치하지 않습니다.");
	                }

	                if (!$.trim($("[name=address]").val())) {
	                    errorMessages.push("주소를 입력하세요.");
	                }
	             

	                if (!$.trim($("[name=phoneNumber]").val())) {
	                    errorMessages.push("핸드폰번호를 입력하세요.");
	                }

	                // 오류가 있을 경우 메시지를 alert 창으로 표시
	                if (errorMessages.length > 0) {
	                    var errorMessage = errorMessages.join("\n");
	                    alert(errorMessage);
	                    return false; // 폼 전송을 막음
	                }else{
	                	if($("[name=emailCk]").val()!="Y" || $("[name=unCk]").val()!="Y"){
	    					alert("중복체크를 진행해주세요")
	    					return;
	    				}
	    				if(confirm("수정하시겠습니까?")){
	    					$.ajax({
	    						url:"userAjax/uptUser.jsp",
	    						data:$("#contactForm").serialize(),
	    						dataType:"json",
	    						success:function(rs){
	    							var rcnt = rs.uptCnt
	    							if(rcnt>0){
	    								alert("수정 성공")
	    								$("#contactForm")[0].reset()
	    								window.location.href = "index.jsp";
	    							}else{
	    								alert("수정 실패")
	    							}
	    							
	    						},
	    						error:function(err){
	    							console.log(err)
	    						}
	    					})				
	    				}
	                }

	                
	            });
		
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
					<h1 class="mb-0 bread">마이페이지</h1>
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
							<div style="width: 800px; margin-left: 10%">

								<form method="POST" id="contactForm" name="contactForm"
									class="contactForm">
									<div class="row">

										<div class="col-md-12">
											<div class="form-group" style="margin-left: 12px;">
												<label class="label" for="name" style="font-size: 18px;">이름</label>
												<input type="text" class="form-control" name="name"
													id="name" value="${user.name}" required>
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group" style="margin-left: 12px;">
												<label class="label" for="userId" style="font-size: 18px;">아이디</label>
												<div style="display: flex; align-items: center;">
													<input type="text" class="form-control" name="userId"
														id="userId" placeholder="ID" value="${user.userId}"
														required>
												</div>
											</div>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="username" style="font-size: 18px;">닉네임</label>
											<div style="display: flex; align-items: center;">
												<input type="text" class="form-control" name="userName"
													id="userName" style="width: 500px;" placeholder="USERNAME"
													required>
													<input type="button" value="중복확인"
													class="btn btn-primary" id="unBtn"
													style="background: #FFC35A; border-color: #FFC35A; margin-left: 5%; width: 200px; font-size: 18px;">
												<input type="hidden" value="Y" name="unCk" />

											</div>
												<p id="p01"></p>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="password" style="font-size: 18px;">비밀번호</label>
											<input type="text" class="form-control" name="password" value="${user.password}"
												id="password" placeholder="PASSWORD" required>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="password01" style="font-size: 18px;">비밀번호
												재입력</label> <input type="password" class="form-control" value="${user.password}"
												 id="password01" placeholder="PASSWORD" name="password01"
												required>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="email" style="font-size: 18px;">이메일</label>
											<div style="display: flex; align-items: center;">
												<input type="email" class="form-control" name="email" 
													id="email" style="width: 500px;" placeholder="email"
													required>
													<input type="button" value="중복확인"
													class="btn btn-primary" id="emailBtn"
													style="background: #FFC35A; border-color: #FFC35A; margin-left: 5%; width: 200px; font-size: 18px;">
												<input type="hidden" value="Y" name="emailCk" />
											</div>
												<p id="p03"></p>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="address" style="font-size: 18px;">주소</label>
											<input type="text" class="form-control" name="address"
													id="userId" placeholder="address" value="${user.address}" required>							
																							
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="phoneNumber"
												style="font-size: 18px;">전화번호</label> <input type="tel"
												class="form-control" name="phoneNumber" id="phoneNumber" value="${user.phoneNumber}"
												placeholder="PHONE NUMBER" required>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="petStatus" style="font-size: 18px;">반려동물
												여부</label> 
												<div style="display: flex; align-items: center;">
												<select class="form-control" name="petStatus" style="width: 500px;" 
												id="petStatus" required>
												<option value="${user.petStatus}">${user.petStatus}</option>
												<option value="N">N</option>
												<option value="Y">Y</option>

											</select>
											<div style="display:flex;">
											<input type="button" value="등록"
													class="btn btn-primary" id="insPet"
													style="background: #FFC35A; border-color: #FFC35A; margin-left: 5%; width: 130px; font-size: 18px;">
											<input type="button" value="조회"
													class="btn btn-primary" id="getPet"
													style="background: #FFC35A; border-color: #FFC35A; margin-left: 5%; width: 130px; font-size: 18px;">
											</div>
												</div>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="subStatus" style="font-size: 18px; ">구독상태
												</label> 
												<div style="display: flex; align-items: center;">
												<select class="form-control" name="subStatus" style="width: 500px;"
												id="subStatus" required>
												<option value="${user.subStatus}">${user.subStatus}</option>
												<option value="N">N</option>
												<option value="Y">Y</option>

											</select>
											<div style="display:flex;">
											<input type="button" value="구독"
													class="btn btn-primary" id="subBtn"
													style="background: #FFC35A; border-color: #FFC35A; margin-left: 5%; width: 130px; font-size: 18px;">
											<input type="button" value="해지"
													class="btn btn-primary" id="fireSun"
													style="background: #FFC35A; border-color: #FFC35A; margin-left: 5%; width: 130px; font-size: 18px;">
											</div>
												<input type="hidden" value="N" name="unCk" />
												</div>
										</div>
									</div>
										<input type="hidden" value="user" name="role" />
									<br><br>	
									<div class="col-md-12">
										<div class="form-group">
											<input type="button" value="수정저장" class="btn btn-primary" id="uptBtn"
												style="background: #FFC35A; border-color: #FFC35A; width:100%; font-size: 18px;" >
										</div>
									</div>
									<br>	
									<div class="col-md-12">
										<div class="form-group">
											<input type="button" value="회원탈퇴" class="btn btn-primary" id="delBtn"
												style="background: red; border-color: #FFC35A; width:100%; font-size: 18px;" >
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