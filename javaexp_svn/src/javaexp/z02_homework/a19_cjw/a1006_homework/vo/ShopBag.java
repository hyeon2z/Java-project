package javaexp.z02_homework.a19_cjw.a1006_homework.vo;

import java.util.ArrayList;

import javaexp.z02_homework.a19_cjw.a1006_homework.vo.Shopping;

public class ShopBag {

	private String name;
	private int price;
	private ArrayList<Shopping> shop;
	
	public ShopBag() {
	}

	public ShopBag(String name, int price) {
		this.name = name;
		this.price = price;
		shop = new ArrayList<Shopping>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
