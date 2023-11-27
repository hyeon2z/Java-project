<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	font-family: AppleSDGothicNeo-Regular, "Malgun Gothic", "맑은 고딕", dotum,
		"돋움", sans-serif;
	font-size: 13px
}

.sch_area {
	position: relative;
	width: 1025px;
	height: 78px;
	margin: 0 auto
}

.hp_logo {
	position: relative;
	left: 0;
	top: 15px
}

.hp_gnb {
	width: 100%;
	height: 43px;
	position: relative;
	clear: both;
	background-color: #496abc
}

.gnb_doc_v4 {
	width: 1025px;
	height: 43px;
	margin: 0 auto;
	background-color: #496abc
}

.gnb_doc_v4 li {
	float: left
}

.gnb_doc_v4 li a {
	display: block;
	font-size: 14px;
	font-weight: bold;
	height: 43px;
	letter-spacing: -1px;
	line-height: 43px;
	text-align: center;
	color: white;
}

.gnb_doc_v4 .link_gnb1 {
	background-position: 0 -76px;
	width: 141px;
}

.gnb_doc_v4 .link_gnb2 {
	background-position: -141px -76px;
	width: 67px
}

.gnb_doc_v4 .link_gnb3 {
	background-position: -209px -76px;
	width: 47px
}

.gnb_doc_v4 .link_gnb4 {
	background-position: -256px -76px;
	width: 82px
}

.gnb_doc_v4 .link_gnb5 {
	background-position: -338px -76px;
	width: 57px
}

.gnb_doc_v4 .link_gnb6 {
	background-position: -395px -76px;
	width: 70px
}

.gnb_doc_v4 .link_gnb7 {
	background-position: -465px -76px;
	width: 81px
}

.gnb_doc_v4 .link_gnb8 {
	background-position: -546px -76px;
	width: 45px
}

.gnb_doc_v4 .link_gnb9 {
	background-position: -591px -76px;
	width: 70px
}

.gnb_doc_v4 .link_gnb10 {
	background-position: -661px -76px;
	width: 81px
}

.gnb_doc_v4 .link_gnb11 {
	background-position: -742px -76px;
	width: 70px
}

.gnb_doc_v4 .link_gnb12 {
	background-position: -812px -76px;
	width: 75px
}

.gnb_doc_v4 .link_gnb13 {
	background-position: -888px -76px;
	width: 58px
}

div, ul, ol, li {
	margin: 0;
	padding: 0;
	border: 0;
	list-style: none;
}

input:focus, textarea:focus, button:focus {
	outline: none;
}

.snbwrap_v4 {
	position: absolute;
	top: 6px;
	right: 0;
	margin: 0;
	font-size: 12px;
}

.snbwrap_v4 ul {
	float: left
}

.snbwrap_v4 li {
	float: left;
	font-size: 12px;
	margin: 5px 0 0 7px
}

.snbwrap_v4 li a, .snbWrap_v4 li a:link, .snbWrap_v4 li a:hover,
	.snbWrap_v4 li a:visited {
	color: #606060
}

a:hover {
	text-decoration: underline
}

a:link {
	text-decoration: none
}

.gnb_doc_v4 .on .link_gnb1 {
	background-position: 0 -129px;
	width: 141px
}

.ma_cate_v4 {
	position: relative;
	margin-top: 20px;
	padding-bottom: 17px;
	border-bottom: 2px solid #495164
}

#container_v4 {
	position: relative;
	width: 1025px;
	margin: 0 auto 0 auto;
	text-align: left
}

#container_v4:after {
	display: block;
	clear: both;
	content: ''
}

.ma_cate_v4 {
	position: relative;
	margin-top: 20px;
	padding-bottom: 17px;
	border-bottom: 2px solid #495164
}

.ma_cate_v4:after {
	display: block;
	clear: both;
	content: ''
}

.ma_cate_v4 strong {
	float: left;
	display: block;
	width: 134px;
	margin-left: 28px;
	margin-top: 1px
}

.ma_cate_v4>ul>li {
	clear: both;
	padding-top: 11px;
	margin-bottom: 27px;
	text-align: left;
	border-top: 1px solid #ebebeb
}

*:first-child+html .ma_cate_v4>ul>li {
	margin-bottom: 5px
}

.ma_cate_v4>ul>li:first-child {
	border: none
}

.ma_cate_v4 ul ul li {
	float: left;
	padding: 0 8px 0 10px;
}

.ma_cate_v4 ul ul li:first-child {
	background-image: none;
	padding-left: 0
}

.ma_cate_v4 .cate_more {
	padding: 23px 0 0 162px
}

.ma_cate_v4 a {
	color: #343434
}

.left_ma_v4 {
	float: left;
	width: 180px;
	margin: 20px 30px 0 0
}

.total_data_v4 {
	border: 1px solid #d1d1d1;
	padding: 22px 0 0 0;
	text-align: left
}

.total_data_v4 .data_sum {
	text-align: center;
	margin-bottom: 18px;
	margin-left: -3px;
}

.total_data_v4 .data_sum img {
	vertical-align: middle;
	padding: 0 0.7px
}

.total_data_v4 .data_num_w {
	border-top: 1px solid #e8e8e8;
	padding-top: 18px
}

.other_tit h3 {
	display: block;
	font-size: 12px;
	height: 16px;
	line-height: 17px;
	overflow: hidden;
	width: 96px
}

.other_tit h3.tit1_v4 {
	background-position: 0 -644px;
	margin-bottom: 14px
}

.other_tit h3.tit2_v4 {
	background-position: 0 -691px;
	margin-bottom: 11px
}

.other_tit h3.tit3_v4 {
	display: block;
	height: 34px;
	width: 104px;
	margin: 0 auto 13px auto
}

.other_tit h3.tit4_v4 {
	display: block;
	height: 19px;
	width: 121px;
	margin: 0 auto 11px auto
}

.ma_cont2_v4 {
	float: left;
	width: 100%;
	margin-top: 0
}

.m_cont3_v4 .lst_sgall_v4 li {
	height: 205px
}

.m_cont3_v4 {
	float: left;
	width: 100%
}

.wrap_tab_v4 {
	height: 31px;
	border-bottom: 1px solid #838791;
	font-size: 12px;
}

.wrap_tab_v4 .list_tab {
	border-left: 1px solid #d1d1d1;
	margin: 0
}

.wrap_tab_v4 .list_tab li {
	float: left;
	text-align: center;
	margin-left: -1px;
	font-weight: bold;
	border: 1px solid #d1d1d1;
	border-bottom: 0 none;
	background-color: #f8f8f8
}

.wrap_tab_v4 .list_tab .link_tab {
	overflow: hidden;
	height: 14px;
	font-size: 12px;
	line-height: 14px;
	color: #606060;
	text-decoration: none
}

.wrap_tab_v4 .list_tab .on {
	position: relative;
	height: 29px;
	padding-left: 1px;
	margin: 0 0 -1px -1px;
	padding-bottom: 0;
	border: 1px solid #3a5596;
	background-color: #496abc
}

.wrap_tab_v4 .list_tab .on .link_tab {
	font-weight: bold;
	color: #fff
}

.wrap_tab_v4 .list_tab li a span {
	display: inline-block;
	padding: 0 18px 0 18px;
	height: 30px;
	line-height: 29px;
	font-size: 13px;
}

.lst_data_w+ul li {
	display: block;
}

.lst_data_w .doc_list {
	height: 150px;
	border: 1px solid yellow;
}
</style>
<script src="jquery-3.1.1.js"></script>
<script></script>


</head>
<body>
	<div class="sch_area">
		<h1 class="hp_logo">
			<a href="https://www.happycampus.com/" onclick=""><img
				src="hp_logo.png" alt="HAPPYCAMPUS"></a>
		</h1>
	</div>
	<div role="navigation" class="hp_gnb">
		<ul class="gnb_doc_v4">
			<li class="on" style="background-color: rgb(47, 47, 73);"><a
				class="link_gnb1" href=""><span>문서광장 홈</span></a></li>
			<li><a class="link_gnb2" href=""><span>리포트</span></a></li>
			<li><a class="link_gnb3" href=""><span>논문</span></a></li>
			<li><a class="link_gnb4" href=""><span>자기소개서</span></a></li>
			<li><a class="link_gnb5" href=""><span>이력서</span></a></li>
			<li><a class="link_gnb6" href=""><span>시험자료</span></a></li>
			<li><a class="link_gnb7" href=""><span>방송통신대</span></a></li>
			<li><a class="link_gnb8" href=""><span>서식</span></a></li>
			<li><a class="link_gnb9" href=""><span>ppt테마</span></a></li>
			<li><a class="link_gnb10" href=""><span>기업보고서</span></a></li>
			<li><a class="link_gnb11" href=""><span>전문자료</span></a></li>
			<li><a class="link_gnb12" href=""><span>표지/속지</span></a></li>
			<li><a class="link_gnb13" href=""><span>노하우</span></a></li>
		</ul>

	</div>
	<div id="container_v4" style="width: 1025px;">
		<div class="ma_cate_v4">
			<ul>
				<li style="display: block;"><strong><a href=""><img
							src="image/Plaza/m_cate_tit1.gif"></a></strong>
					<ul>
						<li><a href="" title="경영/경제">경영/경제</a></li></li>
				<li><a href="" title="공학/기술">공학/기술</a></li>
				</li>
				<li><a href="" title="교육학">교육학</a></li>
				</li>
				<li><a href="" title="농/수산학">농/수산학</a></li>
				</li>
				<li><a href="" title="독후감/창작">독후감/창작</a></li>
				</li>
				<li><a href="" title="법학">법학</a></li>
				</li>
				<li><a href="" title="사회과학">사회과학</a></li>
				</li>
				<li><a href="" title="생활/환경">생활/환경</a></li>
				</li>
				<li><a href="" title="예체능">예체능</a></li>
				</li>
				<li><a href="" title="의/약학">의/약학</a></li>
				</li>
				<li><a href="" title="인문/어학">인문/어학</a></li>
				</li>
				<li><a href="" title="자연과학">자연과학</a></li>
				</li>
				<li><a href="" title="창업">창업</a></li>
				</li>
			</ul>
			</li>
			<li class="c_list display_block" style="display: block;"><strong><a
					href="/kndata/paper/" title="논문"><img
						src="image/Plaza/m_cate_tit2.gif" alt="논문"></a></strong>
				<ul>
					<li><a href="/kndata/paper/439" title="인문학">인문학</a></li>
					<li><a href="/kndata/paper/440" title="사회과학">사회과학</a></li>
					<li><a href="/kndata/paper/441" title="자연과학">자연과학</a></li>
					<li><a href="/kndata/paper/442" title="공학">공학</a></li>
					<li><a href="/kndata/paper/443" title="의약학">의약학</a></li>
					<li><a href="/kndata/paper/444" title="농수해양학">농수해양학</a></li>
					<li><a href="/kndata/paper/445" title="예술체육학">예술체육학</a></li>
					<li><a href="/kndata/paper/446" title="학위논문">학위논문</a></li>
				</ul></li>
			</ul>
		</div>

		<div class="left_ma_v4">
			<div class="total_data_v4">
				<div class="other_tit">
					<h3 class="tit4_v4">총 판매중인 문서 수</h3>
				</div>
				<div class="data_sum">개</div>
				<div class="data_num_w">
					<div class="other_tit">
						<h3 class="tit3_v4">신규 판매회원 수(최근 1달)</h3>
					</div>
					<div class="data_sum">
						명</span>
					</div>
				</div>

			</div>

		</div>
		<div class="ma_cont2_v4">
			<div class="m_cont3_v4">


							
			
			
				<div class="wrap_tab_v4" style="margin-bottom: 20px">
					<ul class="list_tab">
						<li id="recent_data_1_li"><a class="link_tab" href="#"
							onclick="$('div[id^=recent_data]').hide();$('#recent_data_1').show();$('li[id^=recent_data]').removeClass('on');$('#recent_data_1_li').addClass('on');return false;"><span>리포트</span></a></li>
						<li id="recent_data_2_li" class="on"><a class="link_tab"
							href="#"
							onclick="$('div[id^=recent_data]').hide();$('#recent_data_2').show();$('li[id^=recent_data]').removeClass('on');$('#recent_data_2_li').addClass('on');return false;"><span>논문</span></a></li>
						<li id="recent_data_3_li"><a class="link_tab" href="#"
							onclick="$('div[id^=recent_data]').hide();$('#recent_data_3').show();$('li[id^=recent_data]').removeClass('on');$('#recent_data_3_li').addClass('on');return false;"><span>서식</span></a></li>
					</ul>
				</div>
				<%
				for (int tab = 1; tab <= 3; tab++) {
				%>
				<div id="recent_data_<%=tab%>" style="display: block">
					<div class="lst_data_w">
						<ul>
							<%
							for (int idx = 0; idx < 10; idx++) {
							%>
							<li>
								<div class="doc_list">
									<div
										style='width: 100px; height: 100%; border: 1px solid green; overflow: hidden; float: left'>
										<img src='hp_logo.png' style=''>
									</div>
									<div
										style='width: 100%; height: 100%; padding-left: 20px; border: 1px solid red'>h</div>
								</div>
							</li>
							<%
							}
							%>
						</ul>
					</div>
				</div>
				<%
				}
				%>
			</div>
		</div>
	</div>
</body>
</html>