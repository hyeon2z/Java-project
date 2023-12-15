package javaexp.z02_homework.a06_psj;

public class A1012 {

	public static void main(String[] args) {
		Food f1 = new Pizza();
		f1.taste();
		Food f2 = new Potato();
		f2.taste();
		Food f3 = new Samgyupsal();
		f3.taste();
		
		System.out.println();
		Exp2 e2 = new Hi();
		e2.show();
		
		FishingWay fw1 = new Park();
		fw1.goFishing();
	}
}
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
//		추상클래스는 필드나 추상메서드의 이름만 정의해놓고 body를 구현안함 
//		그리고 추상클래스를 extends하는 일반클래스에서 재정의를 꼭꼭해야한다.


//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//				좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
abstract class Food{
	String name;
	void eat() {
		System.out.println(name+"을 먹다");
	}
	abstract void taste();
}

class Pizza extends Food{
	void taste() {
		name="피자";
		eat();
		System.out.println("ㄹㅇ 맛도리");
	}
}

class Potato extends Food{
	void taste() {
		name="감자";
		eat();
		System.out.println("짭조름하게 맛좋고");
	}
}
class Samgyupsal extends Food{
	void taste() {
		name="삼겹살";
		eat();
		System.out.println("든든합니다");
	}
}
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
interface Exp2{
	String a = "안녕하세요"; // 필드 선언 및 초기화필요
	void show(); // 메서드 이름만 선언해놓음
}
class Hi implements Exp2{
	@Override
	public void show() { // 선언했던 메서드 꼭 구현해야함
		System.out.println(a+"= Hello");
	}
}
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//				addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
interface FishingWay{
	void goFishing();
}
class Park implements FishingWay{
	FishingWay fw;
	public void goFishing() {
		System.out.println("Park 낚시하러가요");
	}	
	void addFishingSkill(FishingWay fw) {
		this.fw = fw;
		fw.goFishing();
	}
}

//				# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//				1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//				2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//				3. 수업 시간 집중하였는가?
//		        4. 내일 프로젝트 주제(사이트 확인) / 코드연습병행여부 전달.

abstract class Exp1{
	int a;
	public abstract void show();
}
class NormalC extends Exp1{
	public void show(){
		System.out.println("안녕");
	}
}
