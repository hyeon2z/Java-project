package javaexp.z02_homework.a14_cms.miniProject;

public class Play {
	
	public void play() {
	System.out.println("컴퓨터와 함께하는 숫자야구를 시작합니다!!");
	RandomNumber r1 = new RandomNumber();
	UserInput u1 = new UserInput();
	Compare c1 = new Compare();
	int [] cArray = new int [3]; 
	cArray = r1.makeRandomNum(); //정답을 넣어 둘 배열
	System.out.println();
	int [] pArray = new int[3];
	do {
		u1.inputPlayerNuber();
		pArray = u1.getPlayerArray();
		u1.showPlayerArray();
		c1.isCorrected(pArray, cArray);
		System.out.println("ball의 수는 :" + c1.getBall() + "\tStrike 수는 " + c1.getStrike());
		
	}while(!c1.isAllCorrect());
	System.out.println("정답입니다.");
	r1.showRandomArray();
	

	}

}
