package javaexp.z02_homework.a16_jsr;
import java.util.Scanner;
import java.util.ArrayList;


public class A1006_Bank2 {
	public static void main(String[] args) {
		BankManagement bm = new BankManagement();
		Scanner input = new Scanner(System.in);
		System.out.println("===============계좌 관리 시스템===============");
		System.out.println("| 1.계좌생성 | 2.모든 고객정보 | 3.입금 | 4.출금 | 5.잔액조회 | 6.송금 | 7.종료 |");
		System.out.print("번호를 입력해주세요>>");
		int num = input.nextInt();
		switch (num) {
		case 1:
			bm.makeAccount();
			break;
		case 2:
			bm.info();
			break;
		case 3:
			bm.deposit();
			break;
		case 4:
			bm.withdrawal();
			break;
		case 5:
			bm.price();
			break;
		case 6:
			bm.remittance();
			break;
		case 7:
			System.out.println("===============프로그램 종료===============");
			System.exit(0);
		default:
			System.out.println("옵션에 있는 번호를 입력해주세요!");
			break;
		}
	}
}
	class BankInfo{
	   private String name;
	   private int price;
	   private String rating="General";
	   private String account;
	   
	   public String getAccount() {
	      return account;
	   }
	   public void setAccount(String account) {
	      this.account = account;
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
	   public void deposit(int price) {
	      this.price += price;
	      setRating();
	   }
	   public void withdrawal(int price) {
		   if(price>this.price) {
			  System.out.println("출금할 잔액이 부족합니다. 잔액:"+this.price);
		   }else {
			   this.price -= price;
			   System.out.println("출금했습니다. 잔액:"+this.price);
			   setRating();
		   }
	   }
	   public String getRating() {
	      return rating;
	   }
	   public void setRating() {
	      if(price<500000) {
	         rating="General";
	      }else if (price<1000000) {
	         rating="VIP";
	      }else {
	         rating="VVIP";
	      }
	   }
	   
	}
	class BankManagement{
	   ArrayList<BankInfo> arr=new ArrayList<BankInfo>();
	   Scanner input = new Scanner(System.in);
	   public void makeAccount() {
	      BankInfo bInfo =new BankInfo();
	      System.out.print("고객 이름:");
	      bInfo.setName(input.next());
	      System.out.print("고객 계좌번호:");
	      bInfo.setAccount(input.next());
	      arr.add(bInfo);
	      System.out.println("고객 등록 완료!!");
	   }
	   public void deposit() {
	      System.out.print("입금할 고객님의 이름을 입력하세요:");
	      String reName=input.next();
	      boolean flag=true;
	      for(int i=0;i<arr.size();i++) {
	         if(arr.get(i).getName().equals(reName)) {
	            flag=false;
	            System.out.print("얼마를 입금할까요?:");
	            int rePrice=input.nextInt();
	            arr.get(i).deposit(rePrice);
	            System.out.println("입금했습니다. 잔액:"+arr.get(i).getPrice());
	            break;
	         }
	      }
	      if(flag) {
	         System.out.println("해당 고객이 없습니다.");
	      }
	      
	   }
	   public void withdrawal() {
	      System.out.print("출금할 고객님의 이름을 입력하세요:");
	      String reName=input.next();
	      boolean flag=true;
	      for(int i=0;i<arr.size();i++) {
	         if(arr.get(i).getName().equals(reName)) {
	            flag=false;
	            System.out.print("얼마를 출금할까요?:");
	            int rePrice=input.nextInt();
	            arr.get(i).withdrawal(rePrice);
	            break;
	         }
	      }
	      if(flag) {
	         System.out.println("해당 고객이 없습니다.");
	      }
	   }
	   public void info() {
	      System.out.println("===============고객 정보 출력===============");
	      System.out.println("| 이름 | 계좌번호 | 잔액 | 등급 |");
	      for (int i = 0; i < arr.size(); i++) {
	         System.out.println("| "+arr.get(i).getName()+" | "+arr.get(i).getAccount()
	               +" | "+arr.get(i).getPrice()+" | "+arr.get(i).getRating()+" |");
	      }
	   }
	   public void price() {
	      System.out.print("잔액조회할 고객님의 이름을 입력하세요:");
	      String reName=input.next();
	      boolean flag=true;
	      for(int i=0;i<arr.size();i++) {
	         if(arr.get(i).getName().equals(reName)) {
	            flag=false;
	            System.out.println(reName+" 고객님 잔액:"+arr.get(i).getPrice());
	            break;
	         }
	      }
	      if(flag) {
	         System.out.println("해당 고객이 없습니다.");
	      }
	   }
	   public void remittance() {
	      System.out.print("송금하는 고객님의 이름을 입력하세요:");
	      String name01=input.next();
	      boolean flag1=true;
	      for(int i=0;i<arr.size();i++) {
	         if(arr.get(i).getName().equals(name01)) {
	            System.out.print("송금받는 고객님의 이름을 입력하세요:");
	            String name02=input.next();
	            flag1=false;
	            boolean flag2=true;
	            for(int j=0;j<arr.size();j++) {
	               if(arr.get(j).getName().equals(name02)) {
	                  System.out.print(name01+"님이 "+name02+"님께 얼마를 보내나요?:");
	                  int price01=input.nextInt();
	                  if(arr.get(i).getPrice()<price01) {
	                	  arr.get(i).withdrawal(price01);	                	  
	                  }else {
	                	  arr.get(i).withdrawal(price01);	                	  
	                	  arr.get(j).deposit(price01);
	                	  System.out.println(name01+"님이 "+name02+"님께 "+price01+"원을 보냈습니다.");
					}
	                  flag2=false;
	               }
	            }
	            if(flag2) {
	               System.out.println("해당 고객이 없습니다.");
	            }
	         }
	      }
	      if(flag1) {
	         System.out.println("해당 고객이 없습니다.");
	      }
	   }
	}
	
