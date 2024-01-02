<%@page import="chat.vo.Chat"%>
<%@page import="java.util.List"%>
<%@page import="user.Users"%>
<%@page import="user.UserDao"%>
<%@page import="chat.ChatDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" type="image/x-icon" href="images/BBcare.jpg">
<title>뽀봉케어</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
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

<%
UserDao dao = new UserDao();

if (session != null) {
	String userId = (String) session.getAttribute("userId");
	String role = (String) session.getAttribute("role");
	String username = dao.getUserName(userId);
	session.setAttribute("userName", username);
	String sub = dao.checkSub(userId);
	if (userId != null && role.equals("user") && sub.equals("Y")) {
%>


</head>
<style>
#firstDiv {
	text-align: center;
}

#test {
	width: 300px;
	height: 400px;
	overflow: auto;
	margin: 0 auto;
}

.chat {
	border: 1px solid;
	margin: 2px;
	background-color: #FFC35A;
	color: black;
}
button:hover {
    border: 1px solid #FFF7D7;
    color: #FFF7D7;
}
button {
    background: #FFC35A;
    border: 1px solid #FFC35A;
    color: #fff;
}
button:not(:disabled):not(.disabled) {
    cursor: pointer;
}
.<%=userId%>{
	background-color: #FFF7D7;
}
</style>
<script>
	$(document).ready(function() {
		showChat()
		setInterval(function() {
			console.log("실행")
			showChat()
		}, 3000);
		
		$("form").on("keypress", function(e) {
            if (e.keyCode == 13) { //  enter키의 keycode는 13
				if ($("[name=chat]").val() != "" && $("[name=chat]").val() != null) {
               		saveChat()
				}
            }
         })
			
	})
	
	function showChat() {
		$.ajax({
			url : "showChat.jsp",
			data : $("#chatForm").serialize(),
			dataType : "html",
			success : function(chatHtml) {
				$("#test").html(chatHtml)
				
			}
			
		})
	}
	
	function clickChatName(userId) {
		console.log("클릭함" + userId)
		window.open("detailUserChat.jsp?userId=" + userId, "유저정보", "width=400, height=200, left=200, top=150");
	}
	
	function clickSaveChat() {
		if ($("[name=chat]").val() != "" && $("[name=chat]").val() != null) {
			saveChat()
		}
	}
	
	function saveChat() {
		console.log("채팅저장")
		console.log($("[name=chat]").val())
		
		$.ajax({
			url : "saveChat.jsp",
			data : $("#chatForm").serialize(),
			dataType : "json",
			success : function() {
				$("[name=chat]").val("").focus()
				showChat()
			}
		})
	}
</script>

<body>
	<!-- 상단바 -->
	<jsp:include page="module_top.jsp" flush="true" />

	<div id="firstDiv">
		<div>
			<h2>상담 채팅</h2>
		</div>
		<div id="test"></div>
		<form id="chatForm" onsubmit="return false;">
			<input name="chat" autocomplete='off' /> <input name="user01"
				value="<%=userId%>" type="hidden" /> <input name="user02"
				value="admin" type="hidden" />
			<button type="button" onclick="clickSaveChat()">전송</button>
		</form>

	</div>
	<%
	} else if (userId != null && role.equals("admin")) {
	%>
	<!-- 어드민일때 / 채팅보낸 유저 목록들 띄우게 -->
</head>
<style>
#firstDiv {
	text-align: center;
}

#test {
	width: 300px;
	height: 400px;
	overflow: auto;
	margin: 0 auto;
}

#chat {
	margin: 3px;
	border: 1px solid;
	cursor: pointer;
}

.chat {
	border: 1px solid;
	margin: 2px;
	background-color: #FFC35A;
	color: black;
}
.<%=userId%> {
	background-color: #FFF7D7;
}
button:hover {
    border: 1px solid #FFF7D7;
    color: #FFF7D7;
}
button {
    background: #FFC35A;
    border: 1px solid #FFC35A;
    color: #fff;
}
button:not(:disabled):not(.disabled) {
    cursor: pointer;
}
</style>
<script>
	var re;
	$(document).ready(function() {
		/* showChatList() */
		getList()
		
		$("form").on("keypress", function(e) {
			if (e.keyCode == 13) { //  enter키의 keycode는 13
				if ($("[name=chat]").val() != "" && $("[name=chat]").val() != null) {
					saveChat()
				}
			}
		})
		
		/* $(".chatName").click(function() {
			console.log("클릭함")
		}) */
		
		<%-- $(".<%= userId %>").css("color", "green") --%>
		/* $("#chat").click(function () {
        	alert("클릭함")
        }) */
	})
	function clickChatName(userId) {
		console.log("클릭함" + userId)
		window.open("detailUserChat.jsp?userId=" + userId, "유저정보", "width=400, height=230, left=200, top=150");
	}
	
	function scroll() {
		$('#test').scrollTop($('#test')[0].scrollHeight)
	}
	
	function getList() {
		clearInterval(re)
		showChatList()
		re = setInterval(function() {
			console.log("실행")
			showChatList()
		}, 3000);
	}
	
	function reports() {
		window.open("userReport.jsp?userId=" + $("[name=user02]").val(), "신고", "width=560, height=500, left=100, top=50")
	}
	
	function clickList(userName) {
		$("[name=user02]").val(userName)
		clearInterval(re)
		showChat()
		re = setInterval(function() {
			console.log("실행")
			showChat()
		}, 3000);
		
	}
	
	function showChatList() {
		$.ajax({
			url : "showChatList.jsp",
			data : $("#chatForm").serialize(),
			dataType : "html",
			success : function(chatHtml) {
				$("#test").html(chatHtml)
				$("#chatForm").css("display", "none")
				$("#listBtn").css("display", "none")
				$("#reportsBtn").css("display", "none")
				
			}
			
		})
	}
	
	function showChat() {
		$.ajax({
			url : "showChat.jsp",
			data : $("#chatForm").serialize(),
			dataType : "html",
			success : function(chatHtml) {
				$("#test").html(chatHtml)
				$("#chatForm").css("display", "")
				$("#listBtn").css("display", "")
				$("#reportsBtn").css("display", "")
			}
		})
	}
	
	function clickSaveChat() {
		if ($("[name=chat]").val() != "" && $("[name=chat]").val() != null) {
			saveChat()
		}
	}
	
	function saveChat() {
		console.log("채팅저장")
		console.log($("[name=chat]").val())
		$.ajax({
			url : "saveChat.jsp",
			data : $("#chatForm").serialize(),
			dataType : "json",
			success : function() {
				$("[name=chat]").val("").focus()
				
			}
		})
		
	}
</script>

<body>
	<!-- 상단바 -->
	<jsp:include page="module_top.jsp" flush="true" />

	<div id="firstDiv">
		<div>
			<h2>상담 채팅</h2>
		</div>
		<button type="button" id="reportsBtn" onclick="reports()">신고</button>
		<button type="button" id="listBtn" onclick="getList()">리스트로</button>
		<div id="test"></div>
		<div id="test2"></div>
		<form id="chatForm" onsubmit="return false;">
			<input name="chat" autocomplete='off' /> <input name="user01"
				value="<%=userId%>" type="hidden" /> <input name="user02"
				value="admin" type="hidden" />
			<button type="button" onclick="clickSaveChat()">전송</button>
		</form>

	</div>

	<%
	} else if (userId != null && role.equals("user") && sub.equals("N")) {
	%>
	<script>
	alert("구독 후 이용 가능합니다.")
	location.href="index.jsp"
	</script>

	<%
	} else {
	%>
	<script>
		alert("로그인 후 이용 가능합니다.")
		location.href="index.jsp"
		</script>
	<%
	}
	}
	%>


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