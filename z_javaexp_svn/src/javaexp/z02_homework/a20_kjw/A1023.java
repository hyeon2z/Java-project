package javaexp.z02_homework.a20_kjw;

public class A1023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
[1단계:개념] 1. html태그에서 &XXX; 를 사용하는 이유는 무엇인가? 예제를 통해 설명하세요.
html태그에서 &xxx;등의 형태를 엔티티라고 부르며 예약어들의 모임이다.
이것으로 특수문자,기능등을 사용할 수 있는데 특수문자등의 일부문자들을 html에서 사용하는경우를 html은 태그로 인식하는 경우가 있기때문에
공백을 포함한 특수문자 및 예약어등을 나타내기위해 엔티티형태를 따른다.ex)" "(x),&nbsp;(o),"<>"(x),&lt;,&gt;(O)
[1단계:확인] 2. 아래와 같이 기능버튼에 따라 출력되게, 처리하세요.
	      안녕하세요
	      공백
	      줄바꿈처리
	      ----------(사선)
	      <p></p>
	      위 명령을 클릭시마다, 화면에 위 명령내용 출력 및 처리 출력
	      <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>




<span>안녕하세요</span>
<input type="button"value="안녕하세요" onclick="addins()">
<input type="button"value="공백" onclick="addins1()">
<input type="button"value="------------" onclick="addins2('-------')">
<input type="button"value="줄바꿈" onclick="addbr()">

<script>
	var h1Ob = document.querySelector("span")
	function addins(){ h1Ob.innerHTML +=h1Ob.innerHTML}
	function addins1(){ h1Ob.innerHTML = "&nbsp"+h1Ob.innerHTML+"&nbsp"}
	function addins2(){ h1Ob.innerHTML = "<hr>"+h1Ob.innerHTML+"</hr>"}
	function addbr(){ h1Ob.innerHTML = "<br>"+h1Ob.innerHTML+"</br>"}
</script>
</html>
	      
	      
[1단계:개념] 3. img의 속성을 기술하고, 좋아하는 풍경이미지를 동적으로 크졌다 작아졌다 변경되었다하게 처리하세요.
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
 <img src="https://i.namu.wiki/i/VoAQatfOH0UOyi8qJ5saI54yuSdyww8VUrnC_8fFm1TUzDQDT0Iq9Tgeo8CGpZDXk_RZthEV82UHs40cMu94Ns0oH7go7uhnH1ArxBL67DMjEob1a2B_fZfBJfYxc73wvPvRb0J_YBOk7f07H_mreg.webp">
 <h2 onclick="largeImg()">사진 키우기</h2>
<h2 onclick="smallImg()">사진 줄이기</h2>
<h2 onclick="changeImg()">사진 바꾸기</h2>

<script>
	var imgObj = document.querySelector("img")
	var imgs=["banana.png"]
	var idx=0;
		function largeImg(){ imgObj.width+=20;imgObj.height+=20;
            
        }
		function smallImg(){ imgObj.width-=20;imgObj.height-=20;}
        function changeImg(){ imgObj.src="media/"+imgs[idx++%2]}	
</script>
</html>
[1단계:확인] 4. 주사위 이미지(1~6)를 복사해서 현재 폴드에 넣고, 클릭시 마다 주사위의 번호가 바뀌게 처리하세요.
[1단계:개념] 5. 블럭태그와 인라인 태그의 차이점을 기본예제와 함께 기술하세요.


# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
3. 수업 시간 집중하였는가?	
	*/

	}

}
