package backendweb.z01_vo;

public class Calculator {
	private int num1;
	private int num2;
	private String oper;
	private String plus;
	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}
	private String minus;
	private String multi;
	private String divide;
	private int cal;
	public Calculator(int num1, int num2, int cal) {
		this.num1 = num1;
		this.num2 = num2;
		this.cal = cal;
	}
	public String getCalStr() {
		String[] calS = {"+","-","*","/"};
		// cal의 index값이 0~3까지 나오므로 이에 대한 문자열 데이터 처리
		return calS[cal];
	}
	public int getTot() {
		int[] tot = {num1+num2, num1-num2, num1*num2, num2==0?0:num1/num2};
		return tot[cal];
	}
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public Calculator(int num1, int num2, String oper, String plus, String minus, String multi, String divide) {
		this.num1 = num1;
		this.num2 = num2;
		this.oper = oper;
		this.plus = plus;
		this.minus = minus;
		this.multi = multi;
		this.divide = divide;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getPlus() {
		return plus;
	}
	public void setPlus(String plus) {
		this.plus = plus;
	}
	public String getMinus() {
		return minus;
	}
	public void setMinus(String minus) {
		this.minus = minus;
	}
	public String getMulti() {
		return multi;
	}
	public void setMulti(String multi) {
		this.multi = multi;
	}
	public String getDivide() {
		return divide;
	}
	public void setDivide(String divide) {
		this.divide = divide;
	}
}
