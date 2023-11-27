package javaexp.z02_homework.a12_ljh.project.vo;

import java.util.Scanner;

public class Charactor {
	private String name;
	private String gender;
	private String cloth;
	private String weapon;
	private String job;
	
	Scanner sc = new Scanner(System.in);
	
	public Charactor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		System.out.print("닉네임을 입력하세요: ");
		this.name = sc.nextLine();
		System.out.println();
	}

	public String getGender() {
		return gender;
	}

	public void setGender() {
		System.out.print("성별을 정해주세요 (남/여): ");
		this.gender = sc.nextLine();
		while(!(gender.equals("남") || gender.equals("여"))) {
			System.out.println("\n성별은 남/여 중 하나를 골라야 합니다.");
			System.out.print("성별을 정해주세요 (남/여): ");
			this.gender = sc.nextLine();
		}
		System.out.println();
	}

	public String getCloth() {
		return cloth;
	}

	public void setCloth() {
		System.out.println("옷을 골라주세요 (갑옷/천): ");
		this.cloth = sc.nextLine();
		while(!(cloth.equals("갑옷") || cloth.equals("천"))) {
			System.out.println("\n옷은 갑옷/천 중 하나를 골라야 합니다.");
			System.out.print("옷을 골라주세요 (갑옷/천): ");
			this.cloth = sc.nextLine();
		}
		System.out.println();
	}
	
	public String getWeapon() {
		return weapon;
	}

	public void setWeapon() {
		System.out.println("무기를 골라주세요 (검/몽둥이/손도끼): ");
		this.weapon = sc.nextLine();
		while(!(weapon.equals("검") || weapon.equals("몽둥이") || weapon.equals("손도끼"))) {
			System.out.println("\n무기는 검/몽둥이/손도끼 중 하나를 골라야 합니다.");
			System.out.print("무기를 골라주세요 (검/몽둥이/손도끼): ");
			this.weapon = sc.nextLine();
		}
		System.out.println();
	}
	
	public String getJob() {
		return job;
	}

	public void setJob() {
		System.out.println("직업을 골라주세요 (전사/궁수/마법사/도적): ");
		this.job = sc.nextLine();
		while(!(job.equals("전사") || job.equals("궁수") || job.equals("마법사") || job.equals("도적"))) {
			System.out.println("\n직업은 전사/궁수/마법사/도적 중 하나를 골라야 합니다.");
			System.out.print("직업을 골라주세요 (검/몽둥이/손도끼): ");
			this.job = sc.nextLine();
		}
		System.out.println();
	}

	public void showChar() {
		System.out.println("**캐릭터 생성이 완료되었습니다!**\n");
		System.out.println("[캐릭터 정보]");
		System.out.println("닉네임: " + name);
		System.out.println("성별: " + gender);
		System.out.println("옷: " + cloth);
		System.out.println("직업: " + job);
		System.out.println();
		
	}
	
}
