package javaexp.z02_homework;

import java.util.Scanner;

public class A1006_miniprogram1 {

	public static void main(String[] args) {
		// 커피 주문 시스템
	Scanner sc = new Scanner(System.in);
	String[] coffee = {"에스프레소", "아메리카노", "콜드브루", "카페라떼"};
	String[] ingredients = {"물", "설탕", "우유", "크림", "초콜릿", "카라멜"};
	
	CoffeeOrderSystem coffee1 = new CoffeeOrderSystem(coffee, ingredients);
	
	System.out.println("##커피 주문 시스템##");
	System.out.println("베이스가 될 커피를 고르고 입맛에 맞게 재료를 추가해보세요!\n");
	
	coffee1.coffeeOrder();
	coffee1.ingredientsOrder();
	coffee1.coffeeChoiceResult();
	coffee1.coffeePaymentSystem();
	
	}

}

class CoffeeOrderSystem {
	private String[] coffee;
	private String[] ingredients;
	private int coffeeChoice;
	private int ingredientsChoice;
	private String coffeePayment;
	
	Scanner sc = new Scanner(System.in);
	
	public CoffeeOrderSystem() {}
	
	public CoffeeOrderSystem(String[] coffee, String[] ingredients) {
		this.coffee = coffee;
		this.ingredients = ingredients;
	}
	public int coffeeOrder() {
		System.out.println("=== 커피 메뉴 ===");
		
		while(true) {
			for(int i = 0; i < coffee.length; i ++) {
				System.out.println((i+1) + ") " + coffee[i]);
			}
			System.out.print("커피를 선택하세요 : ");
			try{
				coffeeChoice = Integer.parseInt(sc.nextLine())-1;
				if(coffeeChoice > 0 && coffeeChoice < coffee.length) {
					System.out.println("선택이 완료되었습니다.\n");
					break;
				}else {
					System.out.println("\n잘못된 입력입니다! 다시 선택해주세요\n");
				}
			}catch(NumberFormatException e){
				System.out.println("\n잘못된 입력입니다! 다시 선택해주세요\n");
			}
			
		}
		
		return coffeeChoice;
	}
	
	public int ingredientsOrder() {
		System.out.println("=== 추가할 재료 선택 ===");
		
		while(true) {
			for(int i = 0; i < ingredients.length; i ++) {
				System.out.println((i+1) + ") " + ingredients[i]);
			}
			System.out.print("재료를 선택하세요 : ");
			try{
				ingredientsChoice = Integer.parseInt(sc.nextLine())-1;
				if(ingredientsChoice > 0 && ingredientsChoice < ingredients.length) {
					System.out.println("선택이 완료되었습니다.\n");
					break;
				}else {
					System.out.println("\n잘못된 입력입니다! 다시 선택해주세요\n");
				}
			}catch(NumberFormatException e){
				System.out.println("\n잘못된 입력입니다! 다시 선택해주세요\n");
			}
			
		}
		
		return ingredientsChoice;
	}
	public void coffeeChoiceResult() {
		System.out.println("선택하신 커피 : " + coffee[coffeeChoice]);
		System.out.println("선택하신 재료 : " + ingredients[ingredientsChoice]);
		System.out.println();
	}
	
	public void coffeePaymentSystem() {
		while(true) {
			System.out.println("등록하신 결제정보로 결제하시려면 'Y'를 결제를 취소하시려면 'N'을 입력해주세요");
			coffeePayment = sc.nextLine();
			if(coffeePayment.equals("Y")) {
				System.out.println("결제가 완료되었습니다!");
				System.out.println("주문하신 " + coffee[coffeeChoice] + " 나왔습니다.");
				break;
			}else if(coffeePayment.equals("N")){
				System.out.println("결제가 취소되었습니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다! 다시 선택해주세요");
			}

		}
		
	}
	
	
}