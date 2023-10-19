package javaexp.a01_start;

import java.util.*;

public class A06_0913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("# 학생 3명의 성적#");
		System.out.println("민수\t100점\n준우\t95점\n진우\t90점");
		System.out.print(args[0]);
		System.out.print(", ");
		System.out.print(args[1]);
		System.out.print(", ");
		System.out.println(args[2]);
		System.out.println("물건의 이름, 가격, 개수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String inform = sc.nextLine();
		System.out.println("입력한 내용은");
		System.out.println(inform);
	}

}