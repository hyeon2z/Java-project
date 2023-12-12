<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*" import="backendweb.z01_vo.*"%>
<%@page import="admin.vo.*"%>
<%@page import="admin.*"%>
<%@page import="admin.MenuDao"%>
<%@page import="admin.vo.Menu"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
MenuDao dao = new MenuDao();
int no;
String noStr = request.getParameter("noStr");
if(noStr!=null) no = Integer.parseInt(noStr);
String category = request.getParameter("category");
if(category==null) category = "";
String name = request.getParameter("name");
if(name==null) name = "";
String drink_type = request.getParameter("drink_type");
if(drink_type==null) drink_type = "";
String detail = request.getParameter("detail");
if(detail==null) detail = "";

%>


<c:set var="path" value="${pageContext.request.contextPath }" />
<fmt:requestEncoding value="utf-8" />
<!DOCTYPE html>
<html lang="zxx">
<style>
table {
  border: none;
  width: 70%;
  align-content: center;
  color: #742D18;
  margin: 0 auto;

}

.btn {
  display: block;
  margin: 0 10px;
  width: 250px;
  background-color: #333;
  color: white;
  font-size: 16px;
  border-radius: 5px;
  border: 1px solid #333;
  padding: 10px 20px;
}

.data>td{padding : 10px;}
</style>
<head>
<meta charset="UTF-8">
<meta name="description" content="Male_Fashion Template">
<meta name="keywords" content="Male_Fashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">


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
</head>
<style>
a.primary-btn {
	float: right;
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
				<a href="#">Sign in</a> <a href="#">FAQs</a>
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
			<a href="#" class="search-switch"><img src="img/icon/search.png"
				alt=""></a> <a href="#"><img src="img/icon/heart.png" alt=""></a>
			<a href="#"><img src="img/icon/cart.png" alt=""> <span>0</span></a>
			<div class="price">$0.00</div>
		</div>
		<div id="mobile-menu-wrap"></div>
		<div class="offcanvas__text">
			<p>Free shipping, 30-day return or refund guarantee.</p>
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
				                        <p style = "margin-right:10%; text-transform:uppercase; display:inline-block; letter-spacing:2px; font-size:14px; color:#7A2D1B;">
				                        환영합니다! <%= userId %>님</p>
				                       
				                        <a href="admin_main.jsp" style="color: #7A2D1B">메인으로</a>
				                        
				                        <a href="logout.jsp" style="color: #7A2D1B">로그아웃</a>
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
					<a href="./admin_main.jsp"><img src="img/onelogo.png" alt=""></a>
					
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<nav class="header__menu mobile-menu"
						style="margin-left: 20%; margin-right: 20% width:60%;">
						<ul>
							<li ><a href="admin_list.jsp" style="color:#7A2D1B">메뉴관리</a></li>
                            <li ><a href="admin_member.jsp" style="color:#7A2D1B">회원관리</a></li>
                            <li ><a href="admin_sal.jsp" style="color:#7A2D1B">매출관리</a></li>
                            <!-- <li ><a href="admin_notice.jsp" style="color:#7A2D1B">공지사항 관리</a></li> -->
                            <li ><a href="board.jsp" style="color:#7A2D1B">커뮤니티</a></li>
                           

						</ul>
					</nav>
				</div>

			</div>
			<div class="canvas__open">
				<i class="fa fa-bars"></i>
			</div>

		</div>
    </header>
	<!-- Header Section End -->

	<!-- 메뉴 리스트  -->
	<script src="/frontweb/com/jquery-3.6.0.js"></script>
	<script>

</script>

	<!-- Search Begin -->
		<div class="search-model">
		<div class="h-100 d-flex align-items-center justify-content-center">
			<div class="search-close-switch">+</div>
			<form class="search-model-form">
				<input type="text" id="search-input" placeholder="Search here.....">
			</form>
		</div>
	</div>

<body>
	<br><br>
	 <table class="t" >
	    	<col width="5%">
		   	<col width="10%">
		   	<col width="20%">
		   	<col width="10%">
		   	<col width="20%">
		   	<col width="40%">
		   	<col width="5%">
		 <tr>
			<th>NO</th>
			<th>카테고리</th>
			<th>음료명</th>
			<th>음료타입</th>
			<th>금액</th>
			<th>음료설명</th>
			<th></th>
		</tr>
		<%
		no = 0;
		for(Menu menu : dao.getMenuList()){ %>
		<tr class ="data" >
			<td><%=++no%></td>
			<td><%=menu.getCategory()%></td>
			<td><%=menu.getName()%></td>
			<td><%=menu.getDrink_type()%></td>
			<td><%=menu.getPrice()%>원</td>
			<td><%=menu.getDetail()%></td>
			<td>
			
			<div style="display: flex; justify-content: center;">
			
				<a href="admin_update.jsp?no=<%=menu.getNo()%>" 
				style="display: #7A2D1B; margin: 0 10px; 
				width: 100px; background-color: #7A2D1B; 
				color: white; font-size: 16px; border: 1px solid black; 
				padding: 10px 20px;"
				class="btn">Update</a>
			
				<button type="button" class="btn delete" 
				style="display: #7A2D1B; margin: 0 10px; 
				width: 100px; background-color: #7A2D1B; color: white; font-size: 16px; border: 1px solid black; padding: 10px 20px;"
				onClick="menu_delete(<%=menu.getNo()%>)">Delete</button>
				
			</div>
		
	
		
		
		<%}%>
	</td>
		</tr>
	</table>

	<br><br>
	<div style="display: flex; justify-content: center;">
		<a href="admin_Insert.jsp" class="btn"
		style="display: #7A2D1B; margin: 0 10px; 
				width: 100px; background-color: #7A2D1B; color: white; font-size: 16px; border: 1px solid black; padding: 10px 20px;"
		>Add</a>
		<!--  
		
		<button type="submit"
		onclick="location.href='admin_update.jsp'"
			style="display: block; margin: 0 10px; width: 250px; background-color: black; color: white; font-size: 16px; border: 1px solid black; padding: 10px 20px;">
		Update</button>
		
		<button type="submit"
		onclick="location.href='admin_delete.jsp'"
			style="display: block; margin: 0 10px; width: 250px; background-color: black; color: white; font-size: 16px; border: 1px solid black; padding: 10px 20px;">
		Delete</button>
		-->
		</div>
<br><br><br><br><br>

<script>
function menu_delete(no) {
	if(confirm("해당 메뉴를 삭제할까요?")) {
		location.href = "admin_delete_ok.jsp?no=" + no;
	}
}
</script>

</body>
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