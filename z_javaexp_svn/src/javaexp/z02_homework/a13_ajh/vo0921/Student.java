package javaexp.z02_homework.a13_ajh.vo0921;

public class Student {
	private int studentNumber;
    private String name;
    private double grade;
	public Student(int studentNumber, String name, double grade) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.grade = -1.0;
	}
	public void setGrade1(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
            System.out.println(name + " 학생의 성적이 입력되었습니다.");
        } else {
            System.out.println("유효하지 않은 성적입니다. 0부터 100 사이의 값을 입력하세요.");
        }
    }
    public double getGrade1() {
        return grade;
    }
    public void printInfo() {
        System.out.println("학번: " + studentNumber);
        System.out.println("이름: " + name);
        if (grade >= 0) {
            System.out.println("성적: " + grade);
        } else {
            System.out.println("성적: 성적이 입력되지 않았습니다.");
        }
    }
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
    

}
