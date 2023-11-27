package javaexp.z02_homework.a19_cjw.a1006_homework.vo;

import java.util.ArrayList;

import javaexp.z02_homework.a19_cjw.a1006_homework.vo.Products;
import javaexp.z02_homework.a19_cjw.a1006_homework.vo.ShopBag;

public class Shopping {

	private ArrayList<Products> plist;
	private ArrayList<ShopBag> blist;
	private String products;
	private String orderPro;
	private int orderPrice;
	
	public Shopping() {
	}

	public Shopping(String orderPro, int orderPrice, String products) {
		plist = new ArrayList<Products>();
		this.orderPro = orderPro;
		this.orderPrice = orderPrice;
		this.products = products;
		blist = new ArrayList<ShopBag>();
	}
	
	public void showPlist() {
		System.out.println("<<상품 목록>>");
		plist.add(new Products("가방",40000));
		plist.add(new Products("신발",80000));
		plist.add(new Products("청바지",50000));
		plist.add(new Products("티셔츠",30000));
		plist.add(new Products("모자",25000));
		System.out.println("제품명\t가격");
		for(Products prod:plist) {
			System.out.println(prod.getName()+"\t"+prod.getPrice()+"원");
		}
	}
	
	public void regBlist(ShopBag bag) {
		blist.add(bag);
		System.out.println(bag.getName()+"을/를 장바구니에 추가했습니다.");
		System.out.println("현재 장바구니 속 상품은 "+blist.size()+"개 입니다.");
	}
	
	public void showBlist() {
		System.out.println("<<장바구니 목록>>");
		if(blist.size()>0) {
			System.out.println("제품명\t가격");
			for(ShopBag bag:blist) {
				System.out.println(bag.getName()+"\t"+bag.getPrice()+"원");
			}
		}else {
			System.out.println("장바구니에 등록된 상품이 없습니다!");
		}
	}
	
	public void order() {
		for(ShopBag bag:blist) {
			orderPro += bag.getName()+", ";
			orderPrice += bag.getPrice();
		}
		orderPro.substring(0,(orderPro.length()-2));
		System.out.println("주문한 상품들은 "+orderPro+" 입니다.");
		System.out.println("총 금액은 "+orderPrice+"원 입니다.");
	}
	
	public String getProducts() {
		products = "";
		for(Products prod:plist) {
			products += prod.getName()+" | ";
		}
		products.substring(0,(products.length()-3));
		return products;
	}

	public ArrayList<Products> getPlist() {
		return plist;
	}

	public ArrayList<ShopBag> getBlist() {
		return blist;
	}

	public void setBlist(ArrayList<ShopBag> blist) {
		this.blist = blist;
	}

	public String getOrderPro() {
		return orderPro;
	}

	public int getOrderPrice() {
		return orderPrice;
	}
}
