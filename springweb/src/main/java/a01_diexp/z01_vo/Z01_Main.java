package a01_diexp.z01_vo;

import java.util.ArrayList;
import java.util.List;

public class Z01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HandPhone h1 = new HandPhone("010-5555-9999", "SKT");
	    HPUser hu1 = new HPUser("홍길동");
	    hu1.usePhone();
	    //hu1.setHandPhone(h1);
	    hu1.usePhone();
	    
	    Car c1 = new Car("그렌저", 3500, 250);
	    CarDriver cd1 = new CarDriver("운전자1");
	    cd1.driving();
	    cd1.setCar(c1);
	    cd1.driving();
	    
	    List<Product> addList = new ArrayList<>();
	    addList.add(new Product("사과",2000,2));
	    addList.add(new Product("바나나",4000,5));
	    addList.add(new Product("딸기",12000,2));
	    addList.add(new Product("오렌지",2200,5));
		
	    ShoppingMall sm = new ShoppingMall("온라인 청과몰");
	    sm.setPlist(addList);
	    sm.showProductInfo();
	}

}
