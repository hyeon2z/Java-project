package javaexp.z02_homework.a16_jsr;

public class A1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
[1단계:개념] 1. html태그에서 &XXX; 를 사용하는 이유는 무엇인가? 예제를 통해 설명하세요.
	1) 특수 문자를 표현하기 위해서
		 &amp;는 & 문자를 표현하고, &lt;는 < 문자를 표현합니다.
	2) 이스케이핑을 위해서 : 특수 문자를 일반 문자로 변환하는 과정을 말한다.
		 HTML 태그에서 <br> 태그를 사용하려면 &lt;br&gt;로 작성해야 합니다. 그렇지 않으면,
		 브라우저는 <br>을 태그로 인식하지 못하고, 그대로 화면에 출력하게 된다.
[1단계:확인] 2. 아래와 같이 기능버튼에 따라 출력되게, 처리하세요.
	      안녕하세요
	      공백
	      줄바꿈처리
	      ----------(사선)
	      <p></p>
	      위 명령을 클릭시마다, 화면에 위 명령내용 출력 및 처리 출력
	      <body>
			<h2>안녕하세요</h2>
			<input type="button" value="공백" onclick="addnbsp()">
			<input type="button" value="줄바꿈처리" onclick="addBr()">
			<input type="button" value="실선 처리" onclick="addU()">
			<input type="button" value="&lt;P&gt;" onclick="addP()">
		  </body>
			<script>
				var h2Ob = document.querySelector("h2")
				function addNbsp(){h2Ob.innerHTML+='♥&nbsp;'}
				function addBr(){h2Ob.innerHTML+="<br>★"}
				function addU(){h2Ob.innerHTML="<u>"+h2Ob.innerHTML+"</u>"}
				function addP(){h2Ob.innerHTML="<p>"+h2Ob.innerHTML+"</p>"}
			</script>
[1단계:개념] 3. img의 속성을 기술하고, 좋아하는 풍경이미지를 동적으로 크졌다 작아졌다 변경되었다하게 처리하세요.
	1) img의 속성
		- src: 이미지의 URL을 지정하는 속성입니다. 이 속성은 필수 속성
		- alt: 이미지에 대한 대체 텍스트를 지정하는 속성
		- width: 이미지의 너비를 지정하는 속성
		- height: 이미지의 높이를 지정하는 속성
		- align: 이미지의 정렬을 지정하는 속성
		- border: 이미지의 테두리를 지정하는 속성
		- hspace: 이미지의 왼쪽과 오른쪽에 여백을 지정하는 속성
		- vspace: 이미지의 위쪽과 아래쪽에 여백을 지정하는 속성
		- ismap: 이미지를 지도로 사용하는지 여부를 지정하는 속성
		- longdesc: 이미지에 대한 자세한 설명을 제공하는 URL을 지정하는 속성
	<body>
	    <img src="https://i.pinimg.com/1200x/d6/f8/d0/d6f8d00acee746031ef3998a7eb012d5.jpg"
	    alt="사진 주소 변경됨" width="360" height="500">
	    <input type="button" value="작게 만들기" onclick="imgSm()">
	    <input type="button" value="크게 만들기" onclick="imgBg()">
	</body>
	<script>
		var imgObj = document.querySelector('img')
	    function imgBg(){imgObj.width+=20;imgObj.height+=20;}
		function imgSm(){imgObj.width-=20;imgObj.height-=20;}
	</script>
[1단계:확인] 4. 주사위 이미지(1~6)를 복사해서 현재 폴드에 넣고, 클릭시 마다 주사위의 번호가 바뀌게 처리하세요.
	<body>
	    <img src="dice/1.png" width="150" height="200" alt="dice">
	    <input type="button" value="주사위 굴리기" onclick="rollDice()">
	    <input type="button" value="게임종료" onclick="stop()">
	</body>
	<script>
		var imgObj = document.querySelector('img')
	    var imgs=["1.png","2.png","3.png","4.png","5.png","6.png"]
	    var idx=Math.floor(Math.random() * 6);
	    var game=true;
	    function rollDice(){
	        if(game){
	            idx=Math.floor(Math.random() * 6);
	            imgObj.src = "dice/" + imgs[idx];
	        }else{
	            alert("게임이 종료되었습니다.");
	        }
	    }
	    function stop(){
	        game=false;
	    }
	   
	</script>
[1단계:개념] 5. 블럭태그와 인라인 태그의 차이점을 기본예제와 함께 기술하세요.
	1) 블록 태그
		블록 태그는 항상 새 줄에서 시작하고 브라우저는 자동으로 요소 앞뒤에 약간의 공백(여백)을 추가한다.
		- 항상 새 줄에서 시작한다.
		- 브라우저는 자동으로 요소 앞뒤에 약간의 공백을 추가한다.
		- 부모 요소의 너비를 차지한다.
		- 내부에 블록 태그와 인라인 태그를 포함할 수 있다.
	2) 인라인 태그
		인라인 태그는 필요한 만큼만 너비를 차지한다.
		- 필요한 만큼만 너비를 차지한다.
		- 브라우저는 자동으로 요소 앞뒤에 공백을 추가하지 않는다.
		- 부모 요소의 너비를 차지하지 않는다.
		- 내부에 인라인 태그만 포함할 수 있다.
*/

	}

}
