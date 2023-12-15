package javaexp.z02_homework.a17_okw;

import java.util.ArrayList;
import java.util.Scanner;

public class A1006_Team_shoppingApp {

	public static void main(String[] args) {
		ArrayList<User1> users = new ArrayList<>();
        ArrayList<Product1> products = new ArrayList<>();
        ArrayList<Product1> shoppingCart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        products.add(new Product1("1.사과", 3000));
        products.add(new Product1("2.딸기", 4000));
        products.add(new Product1("3.바나나", 2000));
        products.add(new Product1("4.참외", 1500));
        products.add(new Product1("5.수박", 12000));
        
        while (true) {
            System.out.println("1. 회원 가입 | 2. 로그인 | 3. 상품 목록 | 4. 장바구니 | 5. 주문 | 6. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Enter 키 처리

            switch (choice) {
                case 1:
                    System.out.print("사용자 이름을 입력하세요: ");
                    String newUser = scanner.nextLine();
                    System.out.print("비밀번호를 입력하세요: ");
                    String newPassword = scanner.nextLine();
                    users.add(new User1(newUser, newPassword));
                    System.out.println("회원 가입이 완료되었습니다.");
                    break;
                case 2:
                    System.out.print("사용자 이름을 입력하세요: ");
                    String username = scanner.nextLine();
                    System.out.print("비밀번호를 입력하세요: ");
                    String password = scanner.nextLine();
                    if (login(users, username, password)) {
                        System.out.println("로그인 성공!");
                    } else {
                        System.out.println("로그인 실패. 사용자 이름 또는 비밀번호가 올바르지 않습니다.");
                    }
                    break;
                case 3:
                    listProducts(products);
                    break;
                case 4:
                    listShoppingCart(shoppingCart);
                    System.out.print("장바구니에 추가할 상품 번호를 입력하세요: ");
                    int productIndex = scanner.nextInt();
                    if (productIndex >= 1 && productIndex <= products.size()) {
                        Product1 selectedProduct = products.get(productIndex - 1);
                        shoppingCart.add(selectedProduct);
                        System.out.println(selectedProduct.getName() + "이(가) 장바구니에 추가되었습니다.");
                    } else {
                        System.out.println("잘못된 상품 번호를 입력하셨습니다.");
                    }
                    break;
                case 5:
                    makeOrder(shoppingCart);
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }
        }
        
    }

    private static boolean login(ArrayList<User1> users, String username, String password) {
        for (User1 user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    private static void listProducts(ArrayList<Product1> products) {
        System.out.println("상품 목록:");
        for (Product1 product : products) {
            System.out.println(product.getName() + " - ￦" + product.getPrice());
        }
    }

    private static void listShoppingCart(ArrayList<Product1> shoppingCart) {
        System.out.println("장바구니:");
        if (shoppingCart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            for (Product1 product : shoppingCart) {
                System.out.println(product.getName() + " - ￦" + product.getPrice());
            }
        }
    }

    private static void makeOrder(ArrayList<Product1> shoppingCart) {
    	double total = 0.0;
        System.out.println("주문 내역:");
        if (shoppingCart.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다. 먼저 상품을 장바구니에 추가하세요.");
        } else {
            for (Product1 product : shoppingCart) {
                System.out.println(product.getName() + " - ￦" + product.getPrice());
                total += product.getPrice();
            }
        }
        System.out.println("총 주문 금액: ￦" + total);
        shoppingCart.clear(); // 장바구니 비우기
        System.out.println("주문이 완료되었습니다.");
    }
    

}

class User1 {
    private String username;
    private String password;

    public User1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}

class Product1 {
    private String name;
    private double price;

    public Product1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
}
