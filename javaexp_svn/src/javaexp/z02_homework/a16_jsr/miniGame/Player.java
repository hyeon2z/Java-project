package javaexp.z02_homework.a16_jsr.miniGame;

public class Player {
	private String name;
	private int age;
	private String number;
	private int coin;
	private int point;
	private int level=1;
	
	public int getLevel() {
		return level;
	}

	public void levelUp(){
		if (point<1000) {
			level=1;
			System.out.println("누적 "+point+"점, Level:"+level);
		}else if (point<2000) {
			level=2;
			System.out.println("누적 "+point+"점, Level:"+level);
		}else if (point<3000) {
			level=3;
			System.out.println("누적 "+point+"점, Level:"+level);
		}else {
			level=4;
			System.out.println("누적 "+point+"점, Level:"+level);
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin += coin;
		System.out.println(coin+"원이 충전되었습니다.");
		System.out.println("잔액: "+getCoin()+"원");
	}

	public int minusCoin(int coin) {
		if (coin>this.coin) {
			System.out.println("게임 머니를 충전해 주세요...");	
			return -1;
		}else {
			this.coin -= coin;
			System.out.println("("+coin+"원이 차감되었습니다)");
			return 0;
		}
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point += point;
		if(point<0) {
			System.out.println(point+"점 차감ㅠㅠ");
		}else {
			System.out.println("+"+point+"점 획득!");
		}
	}
	public void playerInfo() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("번호:"+number);
		System.out.println("point:"+point);
		System.out.println("coin:"+coin);
		System.out.println("level:"+level);
	}
	
	

}
