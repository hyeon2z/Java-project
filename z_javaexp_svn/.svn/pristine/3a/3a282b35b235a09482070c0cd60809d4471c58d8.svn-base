package javaexp.z02_homework.a01_kjh;

import java.util.ArrayList;
import java.util.Scanner;

public class A1006_miniprogram2 {

	public static void main(String[] args) {
		// 학생 성적관리 시스템
		StudentManagementSystem st1 = new StudentManagementSystem();
		st1.studentInfoAdd();
		st1.studentGradeAdd();
		
		st1.studentGradePrint();
		st1.studentGradeAvr();
		
		st1.studentGradeChange();
		
		st1.studentGradePrint();
		st1.studentGradeAvr();
		
		st1.studentGradeDelete();
		st1.studentGradePrint();
	}

}

class StudentManagementSystem {
	private ArrayList<String> StudentInfo = new ArrayList<String>();
	private ArrayList<Integer> StudentGrade = new ArrayList<Integer>();
	private ArrayList<String> StudentSubject = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	public StudentManagementSystem() {}
		
	public void studentInfoAdd() {

		
	}
	
	public void studentGradeAdd() {
		System.out.print("학생의 정보를 입력하세요 : ");
		String inputStudent;
		inputStudent = sc.nextLine();
		StudentInfo.add(inputStudent);
		while(true) {
			System.out.print("\n과목을 입력하세요(입력을 종료 시 Q 입력) : ");
			String inputSubject;
			inputSubject = sc.nextLine();
				
			if(inputSubject.equals("Q") || inputSubject.equals("q") ) {
				System.out.println("\n" + inputStudent + "학생의 성적입력을 종료합니다\n");
				break;
			}else {
				StudentSubject.add(inputSubject);
			}while(true) {
				try {
					System.out.print(inputSubject + " 과목의 성적을 입력하세요 : ");
					int inputGrade;
					inputGrade = Integer.parseInt(sc.nextLine());
					if(inputGrade < 0 || inputGrade > 100) {
						System.out.println("성적은 0~100 까지 입력가능합니다.");
					}else {
						StudentGrade.add(inputGrade);
						break;
					}
				}catch(NumberFormatException e) {
					System.out.println("숫자를 입력해야 합니다.");
				}
			
			
			}
		
		}
}
	
	public void studentGradePrint() {
		System.out.println("\n##학생의 정보##\n");
		for(int cnt1 = 0; cnt1 < StudentInfo.size(); cnt1++) {
			System.out.println("학생의 이름 : " + StudentInfo.get(cnt1));
			System.out.println("\n==== 성적표 ====\n");
			for(int cnt2 = 0; cnt2 < StudentSubject.size(); cnt2++) {
				System.out.println((cnt2+1) + "." + StudentSubject.get(cnt2) + " : " + StudentGrade.get(cnt2) + "점");
			}	
		}
			
	}
	
	public void studentGradeAvr() {
		int studentTot = 0;
		for(int cnt = 0; cnt < StudentGrade.size(); cnt ++) {
			studentTot += StudentGrade.get(cnt);
		}
		
		System.out.println("학생의 평균점수는 : " + studentTot/StudentSubject.size() + "점 입니다.\n");
	}
	
	public void studentGradeChange() {
		int subjectNum = 0;
		int gradeNum = 0;
		System.out.print("성적을 변경할 과목의 번호를 입력하세요 : ");
		subjectNum = Integer.parseInt(sc.nextLine());
		
		System.out.print("변경할 점수를 입력 : ");
		gradeNum = Integer.parseInt(sc.nextLine());
		
		StudentGrade.set((subjectNum-1), gradeNum);
	}
	
	public void studentGradeDelete() {
		int removeNum = 0;
		System.out.print("삭제할 과목의 번호를 입력하세요 : ");
		removeNum = Integer.parseInt(sc.nextLine());
		
		StudentGrade.remove((removeNum-1));
		StudentSubject.remove((removeNum-1));
	}
	
}