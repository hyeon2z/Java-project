<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
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
<!--  <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script> alert
-->

  </head>
  <body>
    <!-- 상단바 -->
  	<jsp:include page="module_top.jsp" flush="true"/>
  	
    <section class="hero-wrap hero-wrap-2" style="background-image: url('images/bg_2.jpg');" data-stellar-background-ratio="0.5">
      <div class="overlay"></div>
      <div class="container">
        <div class="row no-gutters slider-text align-items-end">
          <div class="col-md-9 ftco-animate pb-5">
          	<p class="breadcrumbs mb-2"><span class="mr-2"><a href="index.html">Home <i class="ion-ios-arrow-forward"></i></a></span> <span>Report<i class="ion-ios-arrow-forward"></i></span></p>
            <h1 class="mb-0 bread">신고처리</h1>
          </div>
        </div>
      </div>
    </section>
<script>
$(document).ready(function(){
		// enter키 입력시, submit()방지 코드
		$("form").on("keypress",function(e){
			if(e.keyCode==13){   //  enter키의 keycode는 13
				e.preventDefault() // enter키의 기본 동작을 중단 처리
			}
		})	

/*

 
            $("#alertStart").click(function () {
                const Toast = Swal.mixin({
                    toast: true,
                    position: 'center-center',
                    showConfirmButton: false,
                    timer: 3000,
                    timerProgressBar: true,
                    didOpen: (toast) => {
                        toast.addEventListener('mouseenter', Swal.stopTimer)
                        toast.addEventListener('mouseleave', Swal.resumeTimer)
                    }
                })

                Toast.fire({
                    icon: 'success',
                    title: 'toast 알림이 정상적으로 실행 되었습니다.'
                })
            });
*/		
		search()
		$("#schBtn").click(function(){
			search()
		})
		$("[name=status]").change(function(){
        search();
    	})
    	$("#reportList").on('click', 'button', function(){
    		var reportID = $(this).data("reportid"); 
    		var status = $(this).data("status");
		    if(confirm("해당 신고의 처리상태를 업데이트 합니까?")) {
		    	$.ajax({
		            url: "adminAjax/reportUpt.jsp",
		            data:"status="+status+"&reportID="+reportID,
		            dataType: "json",
		            success: function(data) {
						console.log(data)
		                if(data.uptCnt > 0){
		                    alert("성공적으로 처리 되었습니다.");
		                    search();
		                } else {
		                    alert("이미 처리가 완료 된 신고입니다.");
		                }
		            },
		            error: function(err){
		                console.log(err);
		            }
		        })
		    }
		})
	});
	function search(){
		//alert( $("#frm01").serialize() )
		$.ajax({
			url:"adminAjax/reportList.jsp",
			data:$("#searchForm").serialize(),
			dataType:"json", // 문자열 json데이터 ==> 객체형으로 변환
			success:function(reportList){
				console.log(reportList)
				var reportHTML =""
				$(reportList).each(function(idx, report){
					reportHTML +="<tr><td>"+report.ReportID+"</td>"
					reportHTML +="<td>"+report.ReportedContentID+"</td>"
					reportHTML +="<td>"+report.ContentType+"</td>"
					reportHTML +="<td>"+report.ReporterUserID+"</td>"
					reportHTML +="<td>"+report.ReportedUserID+"</td>"
					reportHTML +="<td>"+report.ReportDate+"</td>"
					reportHTML +="<td>"+report.ReportReason+"</td>"
					reportHTML +="<td>"+report.Status+"</td>"
					reportHTML +="<td><button class='btn btn-primary' style='font-size: 14px; background: #FFC35A; border-color: #FFC35A;' data-status='기각' data-reportid='" + report.ReportID + "'>기각</button></td>"
					reportHTML +="<td><button class='btn btn-primary' style='font-size: 14px; background: #FFC35A; border-color: #FFC35A;' data-status='처리완료' data-reportid='" + report.ReportID + "'>처리</button></td></tr>"
				})
				$("#reportList").html(reportHTML) // 회원관리와 동일한 방법의 출력
			},
			error:function(err){
				console.log(err)
			}
		})
	}
</script>
    <!-- 신고 관리 섹션 -->
<section class="ftco-section">
    <div class="container">
    <form id="searchForm">
        <div class="row justify-content-center">
            <div class="col-md-8 text-center mb-5">
                <h2 class="heading-section">유저 신고 관리</h2>
            </div>
                
                    <select name = "status" class="form-control">
                        <option value="">전체</option>
                        <option value="처리대기">처리대기</option>
                        <option value="기각">기각</option>
                        <option value="처리완료">처리완료</option>
                    </select>
                
        </div>
        <br><br>
        </form>
        <div class="row">
            <div class="col-md-12">
                <!-- 신고 목록 테이블 -->
                <style>
                    table.table-center {
                        width: 100%; /* 테이블 너비를 부모 컨테이너에 맞춤 */
                        max-width: 100%; /* 최대 너비 설정 */
                    }
                    table.table-center th,
                    table.table-center td {
                        text-align: center;
                        vertical-align: middle;
                        font-size: 16px
                    }
                        @media screen and (max-width: 600px) {
                        table.table-center th,
                        table.table-center td {
                            font-size: 14px; /* 화면 크기가 600px 이하일 때 폰트 크기 조정 */
                        }
                    }

                </style>
                
                <table class="table table-bordered table-center" style="flex-wrap: wrap;">
                	<colgroup>
                        <col width="5%">
                        <col width="7%">
                        <col width="7%">
                        <col width="10%">
                        <col width="10%">
                        <col width="10%">
                        <col width="21%">
                        <col width="10%">
                        <col width="10%">
                        <col width="10%">
                    </colgroup>
                    <thead>
                        <tr>
                            <th id = "alertStart">No</th>
                            <th>ID</th>
                            <th>유형</th>
                            <th>신고자ID</th>
                            <th>피신고자ID</th>
                            <th>신고날짜</th>
                            <th>신고이유</th>
                            <th>처리상태</th>
                            <th colspan="2">처리하기</th>
                                                        
                        </tr>
                    </thead>
                    <tbody id = "reportList">
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    
</section>


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