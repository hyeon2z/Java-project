package javaexp.z02_homework.a16_jsr;

import java.util.ArrayList;
import java.util.Scanner;

public class A1006_StudentM {

	//java                   3. **학생 성적 관리 시스템**:
	//  - 학생 정보 및 성적 입력, 수정, 삭제, 조회 기능
	//  - 평균, 등급 계산 기능
	public static void main(String[] args) {

		StudentCare studentCare = new StudentCare();
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("######학생 성적 관리 시스템######");
			System.out.println("| 1.성적입력 | 2.모든 학생 정보 | 3.수정 | 4.조회 | 5.삭제 | 6.종료 |");
			System.out.print("번호를 입력해주세요>>");
			int num = input.nextInt();
			switch (num) {
			case 1:
				studentCare.saveStudent();
				break;
			case 2:
				studentCare.studentInfo();
				break;
			case 3:
				studentCare.modify();
				break;
			case 4:
				studentCare.search();
				break;
			case 5:
				studentCare.delete();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("옵션에 있는 번호를 입력해주세요!");
				break;
			}
		}

	}
}

class Student2{
	private int no;
	private String name;
	private int kor;
	private int math;
	private int eng;

	public void setName(String name) {
		this.name=name;
	}
	public void setNo(int no) {
		this.no=no;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public void setMath(int math) {
		this.math=math;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public int getKor() {
		return kor;
	}
	public int getMath() {
		return math;
	}
	public int getEng() {
		return eng;
	}
	public int tot() {
		return kor+eng+math;
	}
	public double avg() {
		return tot()/3;
	}
}
class StudentCare{
	ArrayList<Student2> arr=new ArrayList<>();
	Scanner input = new Scanner(System.in);
	public void saveStudent() {
		Student2 student=new Student2();
		System.out.print("학생 이름:");
		student.setName(input.next());
		System.out.print("학생 번호:");
		student.setNo(input.nextInt());
		System.out.print("학생 국어점수:");
		student.setKor(input.nextInt());
		System.out.print("학생 수학점수:");
		student.setMath(input.nextInt());
		System.out.print("학생 영어점수:");
		student.setEng(input.nextInt());
		arr.add(student);
		System.out.println("학생 등록 완료!!");
	}
	public void modify() {
		System.out.print("수정할 학생의 이름을 입력하세요:");
		String reName=input.next();
		boolean flag=true;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).getName().equals(reName)) {
				flag=false;
				System.out.println("어떤 과목을 수정할까요?:1.국어 2.수학 3.영어");
				int reScore=input.nextInt();
				if(reScore==1) {
					System.out.print("학생 국어점수 변경:");
					int reKor=input.nextInt();
					arr.get(i).setKor(reKor);
					System.out.println("정상적으로 수정했습니다.");
				}else if(reScore==2) {
					System.out.print("학생 수학점수 변경:");
					int reMath=input.nextInt();
					arr.get(i).setMath(reMath);
					System.out.println("정상적으로 수정했습니다.");
				}else if(reScore==3) {
					System.out.print("학생 영어점수 변경:");
					int reEng=input.nextInt();
					arr.get(i).setEng(reEng);
					System.out.println("정상적으로 수정했습니다.");
				}else {
					System.out.println("옵션에 있는 번호를 입력하세요.");
				}
				break;
			}
		}
		if(flag) {
			System.out.println("해당 학생이 없습니다.");
		}
	}
	public void search() {
		System.out.print("조회할 학생의 이름을 입력하세요");
		String reName=input.next();
		boolean flag=true;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).getName().equals(reName)) {
				flag=false;
				System.out.println("이름:"+arr.get(i).getName());
				System.out.println("번호:"+arr.get(i).getNo());
				System.out.println("국어점수:"+arr.get(i).getKor());
				System.out.println("수학점수:"+arr.get(i).getMath());
				System.out.println("영어점수:"+arr.get(i).getEng());
				System.out.println("총점:"+arr.get(i).tot());
				System.out.println("평균:"+arr.get(i).avg());
				break;
			}
		}
		if (flag) {
			System.out.println("해당 학생이 없습니다.");
		}
	}
	public void delete() {
		System.out.print("삭제할 학생의 이름을 입력하세요:");
		String reName=input.next();
		boolean flag=true;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).getName().equals(reName)) {
				flag=false;
				arr.remove(i);
				System.out.println(reName+" 학생이 삭제되었습니다.");
				break;
			}
		}
		if(flag) {
			System.out.println("해당 학생이 없습니다.");
		}
	}
	public void studentInfo() {
		System.out.println("###############학생 정보 출력###############");
		System.out.println("| 이름 | 번호 | 국어점수 | 수학점수 | 영어점수 | 총점 | 평균 |");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("| "+arr.get(i).getName()+" | "+arr.get(i).getNo()
					+" |  "+arr.get(i).getKor()+"  |  "+arr.get(i).getMath()
					+"  |  "+arr.get(i).getEng()+"  |  "+arr.get(i).tot()+"  |  "+arr.get(i).avg()+" |");
		}

	}
}