package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Account;
import a01_diexp.z01_vo.Car;
import a01_diexp.z01_vo.Food;

public class DIHome10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컨테이너 경로
		String path = "a01_diexp\\dih10.xml";
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		// 2. DL(Dependency Lookup) 객체를 찾는 처리
		Car c01 = ctx.getBean("c01", Car.class);
		System.out.println(c01.getColor());
		System.out.println(c01.getBrand());
		System.out.println(c01.getYear());
		
		Account ac01 = ctx.getBean("ac01", Account.class);
		ac01.setBalance(1000000);
		ac01.setDeposit(10000);
		ac01.setWithdraw(20000);
		System.out.println(ac01.getBalance());
		System.out.println(ac01.getDeposit());
		System.out.println(ac01.getWithdraw());
		
		// 3. 자원해제
		ctx.close();
		System.out.println("종료@!!");
	}

}
