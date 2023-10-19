package javaexp.a10_api;

import java.util.ArrayList;

public class A06_WrapperClass {

	public static void main(String[] args) {
		/*
		# Wrapper 클래스
		1. 기본데이터유형을 사용하다보면 여러 형태로 변환이 필요하거나
		    기능적으로 처리해야 하는 경우가 많다. type이 기본 유형으로 되다보니
		    형변환이 일어나지 않으면 이러한 기능에 대한 한계가 발생한다.
		2. 이 때, 자바 api에서는 기본 데이터유형과 연결되는 객체 유형을 만들어
		    필요에 따라 제공되는 메서드를 이용해서
		    여러가지 데이터 유형 변경, 치환 기능을 처리할 수 있게 하는데
		    이것이 Wrapper 클래스 라고 한다.
		3. 형태(기본유형과 연결)
		    byte => Byte
		    char => Character(*)
		    ..
		    int => Integer(*)
		    ..
		    double => Double
		    boolean => Boolean
		 */
		int num01 = 25; // 기본 데이터 유형
		// 기본 데이터 유형을 Wrapper클래스(객체)로 만듦
		Integer num01Ob = Integer.valueOf(num01);
		// 이렇게 객체로 만들면 여러가지 기능 메서드 활용 가능
		System.out.println(num01Ob.byteValue());
		System.out.println(num01Ob.hashCode());
		System.out.println(num01Ob.MAX_VALUE);
		// 이와 같이 기본데이터유형을 기능메서드를 이용하기 위해
		// 객체로 변환하는 것을 Boxing이라고 한다.
		// 이렇게 객체를 이용해서 여러가지 기능을 처리하다가
		// 최종적인 데이터를 다시 기본유형에 할당하여 처리하는 것을 UnBoxing이라고 한다.
		int num02 = num01Ob.intValue();
		System.out.println("언박싱된 num02 : " + num02);
		// 위 코드를 기반으로 char유형과 double유형의 데이터를 할당하고
		// Boxing과 UnBoxing처리를 해보세요
		char ch01 = 'a';
		double db01 = 1.5;
		
		Character ch01Ob = Character.valueOf(ch01);
		Double db01Ob = Double.valueOf(db01);
		
		System.out.println(ch01Ob.MAX_VALUE);
		System.out.println(db01Ob.MAX_VALUE);
		
		char ch02 = ch01Ob.charValue();
		double db02 = db01Ob.doubleValue();
		
		System.out.println(ch01 + " " + ch02);
		System.out.println(db01 + " " + db02);
		/*
		# Auto Boxing/Auto UnBoxing
		1. 기본 데이터 유형을 보다 간편하게 객체형 또는 다시 객체를 기본 데이터 유형으로 변경하는 처리가 필요로 하는데
		    이것을 Auto라고 붙여서 사용한다.
		2. Auto Boxing
		    Wrapper클래스 = 기본데이터;
		    이렇게 기본데이터를 기능 메서드 사용없이 객체에 바로 할당하는 것을
		    AutoBoxing이라고 한다
		 */
		Integer intOb = 30; // 바로 데이터 boxing
		System.out.println(intOb.compareTo(40));
		// 객체.compareTo(객체)로 두 값을 비교하여
		// 적으면 -1 같으면 0 많으면 1 이었으나,
		// 바로 AutoBoxing이 일어나서 해당 문구 처리가 가능하다
		System.out.println(intOb.compareTo(30));
		System.out.println(intOb.compareTo(20));
		int num03 = intOb;
		// 객체도 다시 원래대로 기본유형으로 할당하여 사용할 수 있다.
		// ex) Byte, Boolean으로 AutoBoxing과 AutoUnBoxing 처리되게 하세요
		Byte btOb = 10;
		btOb.floatValue();
		Boolean blOb = true;
		Boolean result = blOb.parseBoolean("false");
		Byte bt01 = btOb;
		Boolean bl01 = blOb;
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		// 구성요소인 Integer에 기본 데이터 할당, autoBoxing 된다
		numList.add(30);
		numList.add(40);
		numList.add(50);
		int num05 = numList.get(1);
		// 구성요소에 Integer로 된 내용을 기본 데이터유형으로 할당/AutoUnBoxing 처리
		System.out.println(num05);
		
	}

}
