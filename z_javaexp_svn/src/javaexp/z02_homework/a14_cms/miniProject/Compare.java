package javaexp.z02_homework.a14_cms.miniProject;
import java.util.ArrayList;
//사용자 숫자와 컴퓨터 숫자를 비교하기
import java.util.List;


public class Compare {
	public Compare() {} ; // 생성자
	private int strikeCnt = 0;
	private int ballCnt = 0 ;
	
	//strike 수가 3이면 종료
	public void isCorrected(int [] pArray, int [] cArray) {
		int strike = 0;
		int ball = 0;
		for(int i=0; i<3; i++) {
			if(pArray.length>3)
				break;
			for(int j=0; j<3; j++) {
				if(pArray[i]==cArray[j]) {
					if(i==j) strike++;
					else ball++;
				}
			}
			strikeCnt = strike;
			ballCnt = ball;
		}
		
	}
	public boolean isAllCorrect() {
		return (strikeCnt>=3);
	}
	
	
	
			
	public int getBall() {
		return ballCnt;
	}
	public int getStrike() {
		return strikeCnt;
	}
	

}
