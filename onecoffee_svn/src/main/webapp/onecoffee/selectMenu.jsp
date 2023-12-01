<%@page import="order_sol.Orderdao"%>
<%@page import="order_sol.Menu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<html lang="zxx">
<style>
.sol02{
	flex: 0 0 100%;
    max-width: 100%;
    margin-left :0%;
}
</style>
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Male_Fashion Template">
    <meta name="keywords" content="Male_Fashion, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>ONE COFFEE</title>

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
            <div class="price"></div>
        </div>
        <div id="mobile-menu-wrap"></div>
        <div class="offcanvas__text">
            <p></p>
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
                    <div class="col-lg-6 col-md-5">
                        <div class="header__top__right">
                            <div class="header__top__links">
                                <a href="index01.jsp" style="color:#7A2D1B">로그아웃</a>
                               
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-3">
                    <div class="header__logo">
                        <a href="index02.jsp"><img src="img/onelogo.png" alt=""></a>
                    </div>
                </div>
                 <div class="col-lg-6 col-md-6">
                    <nav class="header__menu mobile-menu" 
                     style="margin-left:20%; margin-right:20%; width:60%; ">
                        <ul>
                            <li ><a href="#" style="color:#7A2D1B">메뉴소개</a></li>
                            <li ><a href="#" style="color:#7A2D1B">매장안내</a></li>
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
	<%
	String category = request.getParameter("category");
	if(category==null) category="";
	System.out.println(category);
	
	String drink_Type = request.getParameter("drink_Type");
	if(drink_Type==null) drink_Type="";
	System.out.println(drink_Type);
	
	String name = request.getParameter("name");
	if(name==null) name="";
	
	Orderdao dao = new Orderdao();
	int cnt = 1;
	int idx=1;
	idx++;
	
	%>
	<script>
	var cnt = <%=cnt%>
	 $document.ready(function(){
	        $("[name=category]").val('<%= category %>');
	        $("[name=drink_Type]").val('<%= drink_Type %>');
	        /*
	        $(".plus").click(function(){
	        	cnt += 1;
	            $("#<%=idx%>").text(cnt);
	        });
	        $(".minus").click(function(){
	        	cnt -= 1;
	            $("#<%=idx%>").text(cnt);
	        });
	        */
	    });
	</script>
    <!-- Shop Section Begin -->
    <section class="shop spad">
        <div class="container">
            <div class="row">
                <div class="sol">
                    <div class="shop__sidebar">
                        <div class="shop__sidebar__search">
                            <form action="#" style="display : flex; margin-left:35%;">
                                <select name="category" style="width : 100px;">
                                <option value="" >전체</option>
                                <option value="커피" >커피</option>
                                <option value="프라푸치노" >프라푸치노</option>
                                <option value="티" >티</option>
                                <option value="우유" >우유</option>
                                <option value="쥬스" >쥬스</option>
                                </select>
                                <select name="drink_Type" style="width : 100px;">
                                <option value="">전체</option>
                                <option value="hot">HOT</option>
                                <option value="ice">ICE</option>
                                </select>
                                <input type="text" placeholder="음료명 입력..." style="width: 700px;" name="name" value="<%=name%>">
                                <button type="submit"><span class="icon_search"></span></button>
                            </form>
                        </div>
                        
                        </div>
                    </div>
                </div>
                </div>
                <div class="col-lg-9">
                    <div class="shop__product__option">
                        <div class="row">
                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="shop__product__option__left" style="margin-left:30%;">
                                    <p ></p>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6">
                                <div class="shop__product__option__right">
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                    </div>
                    <div class="row">
                        <div class="sol02">
                            <div class="product__item">
                   <div class="container">
					  <table class="table table-borderless" style="width=100%; ">
					    <thead>
					      <tr>
					        <th><input type="checkbox"></th>
					        <th>대분류</th>
					        <th>소분류</th>
					        <th>이 름</th>
					        <th>가 격</th>
					        <th>설 명</th>
					        <th>수 량</th>
					      </tr>
					    </thead>
					    <tbody>
					      <tr>
					        
					        <%for(Menu m01 : dao.getMenuList(new Menu(category,drink_Type,name))) {%>
					        <td><input type="checkbox"></td>
					        <td><%=m01.getCategory() %></td>
					        <td><%=m01.getDrink_Type() %></td>
					        <td><%=m01.getName() %></td>
					        <td><%=m01.getPrice() %></td>
					        <td><%=m01.getDetail() %></td>
					        <td><a onclick="cntdown(this)"><img  src="img/Bminus.png" style="width:10px; height:10px" class="plus" id="<%=idx%>"></a><span class="cntcls"><%=cnt%></span><img src="img/Bplus.png" onclick="cntup(this)" style="width:10px; height:10px" class="minus" id="<%=idx%>"/></td>
					      </tr>
					      <%} %>
					    </tbody>
					    <script>
					    	function cntup(obj){
					    		
					    		console.log( $(obj) )
					    		console.log( "#####" )
					    		
					    		console.log( $(obj).prev().text())
					    		//console.log( "#####" )
					    		
					    		//alert($(obj).html())
					    		//alert($(obj).next().attr("class"))
					    		//console.log($(obj).next())
					    		//console.log($(obj).next().next().next())
								//alert($(obj).next().text());
					    		var cnt = parseInt($(obj).prev().text())
					    		$(obj).prev().text(++cnt);
					    		
					    		
					    	}
					    	function cntdown(obj){
					    		//alert($(obj).prev().text())
					    		var cnt = parseInt($(obj).next().text())
					    		$(obj).next().text(--cnt);					    		
					    	}					    	
					    	
					    </script>
					  </table>
					</div>       
					      
					<div style="padding-left: 100px;display:flex;margin-left:35%; width:100%;">
                    <form style="padding-left=30%;">
                     <button type="submit" class="btn btn-outline-dark">Add To Cart</button>
                    </form>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <button type="button" onclick="location.href='cart.jsp'" class="btn btn-outline-dark">Go To Cart</button>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Shop Section End -->

   

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