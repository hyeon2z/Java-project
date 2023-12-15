package javaexp.a04_process;

public class A03_if_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		# if else if
		1. 기본 형식
			if(조건1){
				
			}else if(조건2){
				조건1을 제외하고 조건2일 때..
			}else if(조건3){
			
			}else{
				
			}
		 * */
		int moodValue = (int)(Math.random()*10+1); // 1~10까지 기분의 수치(10이 가장 좋은 기분)
		System.out.println("기분의 점수:"+moodValue);
		if(moodValue>=9) {
			System.out.println("기분이 아주 좋아요!!");
		}else if(moodValue>=7) { // 7,8  주의) 9이상은 제외(else)
			System.out.println("기분이 좋아요!");
		}else if(moodValue>=5) {
			System.out.println("기분이 보통이예요");
		}else if(moodValue>=3) {
			System.out.println("기분이 조금 우울해요");
		}else {
			System.out.println("많이 우울해요. "
					+ "친구나 가족과 이야기해보세요");
		}
		String animal = "강아지";
		if(animal.equals("강아지")) {
			System.out.println("멍멍!");
		}else if( animal.equals("고양이") ){
			System.out.println("야옹!!");
		}else if( animal.equals("소")) {
			System.out.println("음매!!");
		}else if( animal.equals("닭")) {
			System.out.println("꼬끼오!!");
		}else {
			System.out.println("알 수 없는 소리입니다!!");
		}
		// ex) 보유한 연료량 500L ~ 10000L 임의 연료량
		// 6000L 태양까지 여행가능
		// ~5000L 화성
		// ~2000L 금성
		// ~1000L 달
		// 우주여행 불가(그외)	
		int fuel = (int)(Math.random()*9500+500);
		System.out.println("보유한 연료량:"+fuel+"L");
		if(fuel>=6000) {
			System.out.println("태양까지 우주여행");
		}else if(fuel>=5000) {
			System.out.println("화성까지 우주여행");
		}else if(fuel>=2000) {
			System.out.println("금성까지 우주여행");
		}else if(fuel>=1000){
			System.out.println("달까지 우주여행");
		}else {
			System.out.println("우주여행 불가");
		}
		
		
		
	}

}
