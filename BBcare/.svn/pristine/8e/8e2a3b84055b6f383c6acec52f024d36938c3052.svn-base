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
	<jsp:setProperty name="users" property="*" />
	
	
	
	 
	<script>
		$(document).ready(function() {
			$("form").on("keypress", function(e) {
				if (e.keyCode == 13) { //  enter키의 keycode는 13
					e.preventDefault() // enter키의 기본 동작을 중단 처리
				}
			})
			
			// 아이디 중복체크
			$("#idBtn").click(function() {
				var userIdValue = $("[name=userId]").val();
				$.ajax({
					url : "userAjax/ckId.jsp",
					data : "userId=" + userIdValue,
					dataType : "json",
					success : function(rs) {
						if(userIdValue==""){
							$("#p01").text("아이디를 입력해주세요").css("color", "red");
						}else{
							if (rs.ckUserId) {
								$("#p01").text("이미 가입된 아이디가 있습니다. 다른 아이디를 입력해주세요").css("color", "red");
								//alert("이미 가입된 아이디가 있습니다.\n 다른 아이디를 입력해주세요")
								$("[name=userId]").val("").focus()
							} else {
								$("#p01").text("입력하신 아이디는 사용이 가능합니다.").css("color", "black");
								//alert("입력하신 아이디는 사용이 가능합니다.")
								$("[name=idCk]").val("Y")
							}
						}
						}
						,
					error : function(err) {
						console.log(err)
					}
				})
			})
		
			
			//닉네임 중복체크
			$("#unBtn").click(function() {
					var userNameValue = $("[name=userName]").val();
					$.ajax({
						url : "userAjax/ckUn.jsp",
						data : "userName=" + userNameValue,
						dataType : "json",
						success : function(rs) {
							if(userNameValue==""){
								$("#p02").text("닉네임을 입력해주세요").css("color", "red");
							}else{
								if (rs.ckUserName) {
									$("#p02").text("사용중인 닉네임입니다. 다른 닉네임을 입력해주세요").css("color", "red");
									//alert("이미 가입된 아이디가 있습니다.\n 다른 아이디를 입력해주세요")
									$("[name=userName]").val("").focus()
								} else {
									$("#p02").text("입력하신 닉네임은 사용이 가능합니다.").css("color", "black");
									//alert("입력하신 아이디는 사용이 가능합니다.")
									$("[name=unCk]").val("Y")
								}
							}
							}
							,
						error : function(err) {
							console.log(err)
						}
					})
					})
				
				// 이메일 중복체크
				$("#emailBtn").click(function() {
				var emailValue = $("[name=email]").val();
				$.ajax({
					url : "userAjax/ckEmail.jsp",
					data : "email=" + emailValue,
					dataType : "json",
					success : function(rs) {
						if(emailValue==""){
							$("#p03").text("이메일을 입력해주세요").css("color", "red");
						}else{
							if (rs.ckEmail) {
								$("#p03").text("이미 가입된 이메일이 있습니다. 다른 이메일을 입력해주세요").css("color", "red");
								//alert("이미 가입된 아이디가 있습니다.\n 다른 아이디를 입력해주세요")
								$("[name=email]").val("").focus()
							} else {
								$("#p03").text("입력하신 이메일은 사용이 가능합니다.").css("color", "black");
								//alert("입력하신 아이디는 사용이 가능합니다.")
								$("[name=emailCk]").val("Y")
							}
						}
						}
						,
					error : function(err) {
						console.log(err)
					}
				})
				
			})
		
			// 회원가입
			/*
			
			$("#regBtn").click(function(){
				//alert( $("#frm02").serialize() )
				if($("[name=idCk]").val()!="Y" || $("[name=emailCk]").val()!="Y" || $("[name=unCk]").val()!="Y"){
					alert("중복체크를 진행해주세요")
					return;
				}
				if(confirm("등록하시겠습니까?")){
					$.ajax({
						url:"userAjax/insertUser.jsp",
						data:$("#contactForm").serialize(),
						dataType:"json",
						success:function(rs){
							var rcnt = rs.insertUser
							if(rcnt>0){
								alert("등록 성공")
								
								$("#contactForm")[0].reset()
								
							}else{
								alert("등록 실패")
							}
							
						},
						error:function(err){
							console.log(err)
						}
					})				
				}
				
			})  
			*/
			
			// 공백 유효성 검사
			 $("#regBtn").click(function () {
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
	                	if($("[name=idCk]").val()!="Y" || $("[name=emailCk]").val()!="Y" || $("[name=unCk]").val()!="Y"){
	    					alert("중복체크를 진행해주세요")
	    					return;
	    				}
	    				if(confirm("가입하시겠습니까?")){
	    					$.ajax({
	    						url:"userAjax/insertUser.jsp",
	    						data:$("#contactForm").serialize(),
	    						dataType:"json",
	    						success:function(rs){
	    							var rcnt = rs.insertUser
	    							if(rcnt>0){
	    								alert("가입 성공")
	    								$("#contactForm")[0].reset()
	    								window.location.href = "index.jsp";
	    							}else{
	    								alert("가입 실패")
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
								class="ion-ios-arrow-forward"></i></a></span> <span>sign up <i
							class="ion-ios-arrow-forward"></i></span>
					</p>
					<h1 class="mb-0 bread">회원가입</h1>
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
													id="name" placeholder="NAME" required>
											</div>
										</div>
										<div class="col-md-12">
											<div class="form-group" style="margin-left: 12px;">
												<label class="label" for="userId" style="font-size: 18px;">아이디</label>
												<div style="display: flex; align-items: center;">
													<input type="text" class="form-control" name="userId"
														id="userId" style="width: 500px;" placeholder="ID"
														required> <input type="button" value="중복확인"
														class="btn btn-primary" id="idBtn"
														style="background: #FFC35A; border-color: #FFC35A; margin-left: 5%; width: 200px; font-size: 18px;">
													<input type="hidden" value="N" name="idCk" />
												</div>
												<p id="p01"></p>
											</div>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="username" style="font-size: 18px;">닉네임</label>
											<div style="display: flex; align-items: center;">
												<input type="text" class="form-control" name="userName"
													id="userName" style="width: 500px;" placeholder="USERNAME"
													required> <input type="button" value="중복확인"
													class="btn btn-primary" id="unBtn"
													style="background: #FFC35A; border-color: #FFC35A; margin-left: 5%; width: 200px; font-size: 18px;">
												<input type="hidden" value="N" name="unCk" />

											</div>
												<p id="p02"></p>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="password" style="font-size: 18px;">비밀번호</label>
											<input type="password" class="form-control" name="password"
												id="password" placeholder="PASSWORD" required>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="password01" style="font-size: 18px;">비밀번호
												재입력</label> <input type="password" class="form-control"
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
													required> <input type="button" value="중복확인"
													class="btn btn-primary" id="emailBtn"
													style="background: #FFC35A; border-color: #FFC35A; margin-left: 5%; width: 200px; font-size: 18px;">
												<input type="hidden" value="N" name="emailCk" />
											</div>
												<p id="p03"></p>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="address" style="font-size: 18px;">주소</label>
										<div style="display: flex; align-items: center;">
												<input type="text" id="sample6_postcode" class="form-control" placeholder="우편번호" style="width: 500px;">
											<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"  
											class="btn btn-primary" style="background: #FFC35A; border-color: #FFC35A; margin-left: 5%; width: 200px; font-size: 18px;"><br>
										</div>
											<input type="text" id="sample6_address" class="form-control" placeholder="주소" name="address" ><br>
											<input type="text" id="sample6_detailAddress" class="form-control" placeholder="상세주소" name="address02" >
											
									
											
											<input type="text" id="sample6_extraAddress" class="form-control" placeholder="참고항목">
											
											
											<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
											<script>
											    function sample6_execDaumPostcode() {
											        new daum.Postcode({
											            oncomplete: function(data) {
											                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
											
											                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
											                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
											                var addr = ''; // 주소 변수
											                var extraAddr = ''; // 참고항목 변수
											
											                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
											                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
											                    addr = data.roadAddress;
											                } else { // 사용자가 지번 주소를 선택했을 경우(J)
											                    addr = data.jibunAddress;
											                }
											
											                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
											                if(data.userSelectedType === 'R'){
											                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
											                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
											                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
											                        extraAddr += data.bname;
											                    }
											                    // 건물명이 있고, 공동주택일 경우 추가한다.
											                    if(data.buildingName !== '' && data.apartment === 'Y'){
											                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
											                    }
											                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
											                    if(extraAddr !== ''){
											                        extraAddr = ' (' + extraAddr + ')';
											                    }
											                    // 조합된 참고항목을 해당 필드에 넣는다.
											                    document.getElementById("sample6_extraAddress").value = extraAddr;
											                
											                } else {
											                    document.getElementById("sample6_extraAddress").value = '';
											                }
											
											                // 우편번호와 주소 정보를 해당 필드에 넣는다.
											                document.getElementById('sample6_postcode').value = data.zonecode;
											                document.getElementById("sample6_address").value = addr;
											                // 커서를 상세주소 필드로 이동한다.
											                document.getElementById("sample6_detailAddress").focus();
											            }
											        }).open();
											    }
											</script>
																							
																							
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="phoneNumber"
												style="font-size: 18px;">전화번호</label> <input type="tel"
												class="form-control" name="phoneNumber" id="phoneNumber"
												placeholder="PHONE NUMBER" required>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<label class="label" for="petStatus" style="font-size: 18px;">애완동물
												여부</label> <select class="form-control" name="petStatus"
												id="petStatus" required>
												<option value="N">N</option>
												<option value="Y">Y</option>

											</select>
										</div>
									</div>
									<input type="hidden" value="N" name="subStatus" /> <input
										type="hidden"  name="subDate" /> 
										<input type="hidden" value="user" name="role" />
									<div class="col-md-12">
										<div class="form-group">
											<input type="button" value="가입하기" class="btn btn-primary" id="regBtn"
												style="background: #FFC35A; border-color: #FFC35A; width:100%; font-size: 18px;" >
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