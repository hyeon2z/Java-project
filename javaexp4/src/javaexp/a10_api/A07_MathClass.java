package javaexp.a10_api;

import java.util.Random;

public class A07_MathClass {

	public static void main(String[] args) {
		/*
		# Math 클래스
		1. 자바에서 연산이나 기본적인 데이터를 처리할 때
		    복잡한 로직으로 처리해야 하는 경우가 있다.
		    예를 들어 최대값, 최소값, 올림/반올림 등 수학적인 계산과 형변환을 필요로 하는 것을 말한다.
		    
		2. 이러한 부분을 보다 간단하게 메서드를 통해 지원하는 것이 Math클래스 이다.
		
		3. Math클래스의 기능메서드는 static이라서 객체 생성없이
		    Math.XXX() 형식으로 바로 사용할 수 있다.
		 */
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.abs(-5) : " + Math.abs(-5));
		System.out.println("Math.abs(5) : " + Math.abs(5));
		System.out.println("Math.ceil(5.2) : " + Math.ceil(5.2));
		System.out.println("Math.round(5.25) : " + Math.round(5.6));
		System.out.println("Math.floor(5.9) : " + Math.floor(5.9));
		System.out.println("Math.max(3,2) : " + Math.max(3,2));
		System.out.println("Math.min(4,7) : " + Math.min(4,7));
		Random r = new Random();
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt(5));
		System.out.println(r.nextDouble(10));
		
		// ex) 위 Math내용을 이용하여
		// 1~10까지 두 개의 수를 임의로 발생시켜
		// 둘 중에 더 큰수와 작은 수를 출력하세요
		
		int num1 = (int)(Math.random()*10 +1);
		int num2 = (int)(Math.random()*10 +1);
		System.out.println("더 큰수 : " + Math.max(num1, num2) + "\n작은 수 : "  + Math.min(num1, num2));
		
	}

}
