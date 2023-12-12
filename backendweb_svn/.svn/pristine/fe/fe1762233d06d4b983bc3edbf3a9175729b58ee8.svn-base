package backendweb.z01_vo;
// backendweb.z01_vo.Calculator
public class Calculator {
//	num01, num02, cal
	private int num01;
	private int cal;
	private int num02;
	public Calculator() {
	}
	public Calculator(int num01, int cal, int num02) {
		this.num01 = num01;
		this.cal = cal;
		this.num02 = num02;
	}
	public String getCalStr() {
		String[] calS = {"+","-","×","÷"};
		// cal의 index값이 0~3까지 나오므로 이에 대한 문자열 데이터 처리
		return calS[cal];
	}
	public int getTot() {
		int[] tot = {num01+num02,num01-num02,num01*num02,
					 num02==0?0:num01/num02};
		return tot[cal];
	}
	public int getNum01() {
		return num01;
	}
	public void setNum01(int num01) {
		this.num01 = num01;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getNum02() {
		return num02;
	}
	public void setNum02(int num02) {
		this.num02 = num02;
	}
	
	
}
