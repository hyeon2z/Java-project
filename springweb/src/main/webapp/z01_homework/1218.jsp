<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="backendweb.z01_vo.*"
    import="backendweb.d01_dao.*"
    
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<%--
[1단계:개념] 1. 아래의 단계별 요청값 처리의 속성을 기본에제를 통해 설명하세요
		1) 요청값 1개 처리
	@RequestMapping("exp1.do")
	public String exp1(@RequestParam("name") String name) {
		return "WEB-INF\\views\\a01_start\\exp1.jsp";
	}
	Param 요청값으로 name을 지정해서 exp1.jsp 로 넘긴다
	
		2) 요청값이 없을 때를 대비하여 요청값 1개 처리
	@RequestMapping("exp2.do")
	public String exp2(@RequestParam(value="name", defaultValue="")
										String name){
		return "WEB-INF\\views\\a01_start\\exp2.jsp";
	}
	Param 값이 들어간다 해놓고 보내지 않았을 시 오류가 뜨기때문에
	기본 defaultValue 값으로 빈칸을 지정해놓는다.
		
		3) 요청값 2개이상 처리
	@RequestMapping("exp3.do")
	public String exp3(@RequestParam(value = "name", defaultValue="") String name,
						@RequestParam(value="price", defaultValue = "0") int price,
						@RequestParam(value="cnt", defaultValue="0") int cnt) {
		return "WEB-INF\\views\\a01_start\\exp3.jsp";
	}	
	요청값을 2개 이상 보내려면 요청값 1개 보내는 양식에서 추가로 더 작성하면 여러개 보낼 수 있다.
		
		4) 요청배열의 처리
	@RequestMapping("exp4.do")
	public String exp4(@RequestParam("mname") String[] mnames) {
		// 여러개의 데이터를 입력할 때 사용하는 형태
		System.out.println("#배열형 데이터#");
		for(String mname:mnames) {
			System.out.println(mname);
		}
		return "WEB-INF\\views\\a01_start\\exp4.jsp";
	}
	배열을 요청값으로 보내기 위해서 String[] 배열명 으로 선언 해 두고,
	요청값으로 배열에 저장 하고 싶은만큼 작성하면 됨.
	
[1단계:개념] 2. 요청객체의 처리시, 일반 요청값과의 차이점을 예제로 설명하세요
	@RequestMapping("regPhone.do")
	public String regPhone(Phone pnum01) {
		return "WEB-INF\\views\\a01_start\\a11_regPhone.jsp";	
	}
일반 요청값은 요청값 받는 페이지에서 param.변수명 으로 받아야 하는데,
객체로 보내면 받는 페이지에서 pnum01.변수명 으로 받을수 있다.

[1단계:확인] 3. 아래내용을 화면단에 출력하세요
		1) 사용자가 도시 이름을 입력하면 해당 도시의 날씨 정보(도시3개 날씨3개 조건처리)를 반환하는 API를 만드세요.
	@RequestMapping("city.do")
	public String city(Model d) {
		d.addAttribute("city", new String[] {"서울", "베이징", "도쿄"});
		d.addAttribute("weather", new String[] {"눈", "맑음", "비"});
		return "WEB-INF\\views\\homework\\city.jsp";
	}
	
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <select name = "city">
	    	<option value="0">${city[0]}</option>
	    	<option value="1">${city[1]}</option>
	    	<option value="2">${city[2]}</option>
	    </select>
	    <button class="btn btn-info" type="submit">날씨 검색</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
   <table class="table table-hover table-striped">
    <thead>
    
      <tr class="table-success text-center">
        <th>도시</th>
        <th>날씨</th>
      </tr>
    </thead>	
    <tbody>
    	<tr>
    		<td>${city[param.city]}</td>
   		<c:choose>
	    	<c:when test="${param.city == 0}">
	    		<td>${weather[2]}</td>
	    	</c:when>
	    	<c:when test="${param.city == 1}">
	    		<td>${weather[1]}</td>
	    	</c:when>
	    	<c:when test="${param.city == 2}">
	    		<td>${weather[0]}</td>
	    	</c:when>
    	</c:choose>
    	</tr>
    </tbody>
	</table>
	
		2) 사용자가 이름, 이메일, 비밀번호를 입력하여 회원 가입을 할 수 있는 API를 만드세요.
	@RequestMapping("member.do")
	public String member(@RequestParam(value = "name", defaultValue = "") String name,
						@RequestParam(value = "email", defaultValue = "") String email,
						@RequestParam(value = "pwd", defaultValue = "") String pwd) {

		return "WEB-INF\\views\\homework\\member.jsp";
	}
	
	<form id="frm01" class="form"  method="post">
  	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	    <input name="name" class="form-control mr-sm-2" placeholder="이름 입력" />
	    <input name="email" class="form-control mr-sm-2" placeholder="이메일 입력" />
	    <input name="pwd" class="form-control mr-sm-2" placeholder="비밀번호 입력" />
	    <button class="btn btn-info" type="submit">회원가입</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
   <table class="table table-hover table-striped">
   	<col width="10%">
   	<col width="50%">
   	<col width="15%">
   	<col width="15%">
   	<col width="10%">
    <thead>
    
      <tr class="table-success text-center">
        <th>이름</th>
        <th>이메일</th>
        <th>비밀번호</th>
      </tr>
    </thead>	
    <tbody>
    <c:if test="${not empty param.name and not empty param.email and not empty param.pwd}">
    	<script>
    	alert("회원가입 성공")
    	</script>
    	<tr>
    		<td>${param.name }</td>
    		<td>${param.email }</td>
    		<td>${param.pwd }</td>
    	</tr>
    </c:if>
    </tbody>
	</table>
		
		3) 여러 개의 투표 항목이 주어지고, 사용자는 투표를 할 수 있는 API를 만드세요. 
		      각 사용자는 한 항목에 대해 한 번만 투표 또는 다중 투표를 할 수 있게 만드세요
	@RequestMapping("vote.do")
	public String vote(Model d) {
		d.addAttribute("dinner", new String[] {"햄버거", "치킨", "김치찌개", "칼국수"});
		return "WEB-INF\\views\\homework\\dinner.jsp";
		
	}
	
	<div class="container">
	<form id="frm01" class="form"  method="post">
  	<nav>
  	<label>
	    <input type="checkbox" value = "${dinner[0]}" name ="din"/>${dinner[0]}
	</label>
  	<label>
	    <input type="checkbox" value = "${dinner[1]}" name ="din"/>${dinner[1]}
	</label>
  	<label>
	    <input type="checkbox" value = "${dinner[2]}" name ="din"/>${dinner[2]}
	</label>
  	<label>
	    <input type="checkbox" value = "${dinner[3]}" name ="din"/>${dinner[3]}
	</label>
	    <input class="form-control mr-sm-2" placeholder="내용" />
	    <button class="btn btn-info" type="submit">Search</button>
	    <button class="btn btn-success" 
	    	data-toggle="modal" data-target="#exampleModalCenter"
	        type="button">등록</button>
 	</nav>
	</form>
   <table class="table table-hover table-striped">
   	<thead>
    
      <tr class="table-success text-center">
        <th>저녁메뉴</th>
      </tr>
    </thead>	
    <tbody>
    	<tr>
    	<c:forEach var = "d" items="${paramValues.din}">
    		<td>${d}</td>
    	</c:forEach>
    	</tr>
    </tbody>
	</table>    
    
</div>
		
		4) 사용자가 식당의 ID, 예약 날짜 및 시간, 인원 수를 입력하여 예약을 할 수 있는 API를 만드세요.
		    - 예약 가능한 시간과 인원 수에 제한을 두어, 불가능한 예약 요청에 대해선 거절 메시지를 반환하세요.
어려워서 못하겠습니다 ㅠ.

 --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/a00_com/bootstrap.min.css">
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css">
<style>
td {
	text-align: center;
}
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/bootstrap.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script
	src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api"
	type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("form").on("keypress", function(e) {
			if (e.keyCode == 13) { //  enter키의 keycode는 13
				e.preventDefault() // enter키의 기본 동작을 중단 처리
			}
		})
	});
</script>
</head>

<body>
	<div class="jumbotron text-center">
		<h2>투표!!</h2>

	</div>
	<%-- 
		
    --%>
	<div class="container">
<form id="frm02" class="form" method="post">
    <div class="container">
        <div class="row mb-3">
            <div class="col-md-4">
                <label for="choice1" class="form-label">시도지사</label>
                <select name="choice1" class="form-select">
                    <option value="0">선택하세요</option>
                    <option value="1">갑당 김주립</option>
                    <option value="2">을당 강정책</option>
                    <option value="3">병당 백최고</option>
                </select> 
            </div>
            <div class="col-md-4">
                <label class="form-label">교육감</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" name="choice2" value="김주립" id="kimJurip">
                    <label class="form-check-label" for="kimJurip">김주립</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" name="choice2" value="강정책" id="kangJungChak">
                    <label class="form-check-label" for="kangJungChak">강정책</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" name="choice2" value="송세라" id="songSera">
                    <label class="form-check-label" for="songSera">송세라</label>
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" name="choice2" value="이슬기" id="leeSeulGi">
                    <label class="form-check-label" for="leeSeulGi">이슬기</label>
                </div>
            </div>
            <div class="col-md-4">
                <label class="form-label">시도의원</label>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" name="choice3" value="갑당 김영철" id="kimYoungChul">
                    <label class="form-check-label" for="kimYoungChul">갑당 김영철</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" name="choice3" value="을당 이소라" id="leeSoRa">
                    <label class="form-check-label" for="leeSoRa">을당 이소라</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" name="choice3" value="병당 이진실" id="leeJinShil">
                    <label class="form-check-label" for="leeJinShil">병당 이진실</label>
                </div>
                <div class="form-check">
                    <input type="checkbox" class="form-check-input" name="choice3" value="정당 오세라" id="ohSeRa">
                    <label class="form-check-label" for="ohSeRa">정당 오세라</label>
                </div>
            </div>                
        </div>
        <div class="row">
            <div class="col">
                <button class="btn btn-primary" type="submit">선택</button>
            </div>
        </div>
    </div>
</form>

		<table class="table table-hover table-striped">
			<thead>

				<tr class="table-success text-center">
					<th>시도지사</th>
					<th>교육감</th>
					<th>시도의원</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${vote.choice1Str }</td>
					<%-- get property의 확실한 증거 get property => get 생략--%>
					<td>${vote.choice2 }</td>
					<td>
						<c:forEach var="cho" items="${vote.choice3}">
							${cho}&nbsp;
						</c:forEach>
					</td>
				</tr>
			</tbody>
		</table>

	</div>
	<div class="modal fade" id="exampleModalCenter" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalCenterTitle"
		aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLongTitle">타이틀</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="frm02" class="form" method="post">
						<div class="row">
							<div class="col">
								<input type="text" class="form-control" placeholder="사원명 입력"
									name="ename">
							</div>
							<div class="col">
								<input type="text" class="form-control" placeholder="직책명 입력"
									name="job">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>