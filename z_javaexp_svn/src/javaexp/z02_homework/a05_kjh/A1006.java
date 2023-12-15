package javaexp.z02_homework.a05_kjh;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class A1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      **화폐 단위 변환기**:
//      - 다양한 국가의 화폐 단위 간 변환 기능*한국, 미국, 일본, 중국
    Scanner scanner = new Scanner(System.in);

       // 환율 정보 (1 단위당 외화 금액)
       double usdToKrw = 1349;  // 달러 환율 (원화에 대한 달러)
       double jpyToKrw = 9.343;    // 엔화 환율 (원화에 대한 엔화)
       double cnyToKrw = 184.58;  // 위안화 환율 (원화에 대한 위안화)

       System.out.print("환산할 통화를 선택하세요 (KRW, USD, JPY, CNY): ");
       String fromCurrency = scanner.next().toUpperCase();

       System.out.print("환산할 금액을 입력하세요: ");
       double amount = scanner.nextDouble();

       System.out.println("환전된 금액:");

       if ("KRW".equals(fromCurrency)) {
           System.out.println("USD: " + amount / usdToKrw);
           System.out.println("JPY: " + amount / jpyToKrw);
           System.out.println("CNY: " + amount / cnyToKrw);
       } else if ("USD".equals(fromCurrency)) {
           System.out.println("KRW: " + amount * usdToKrw);
           System.out.println("JPY: " + amount * usdToKrw / jpyToKrw);
           System.out.println("CNY: " + amount * usdToKrw / cnyToKrw);
       } else if ("JPY".equals(fromCurrency)) {
           System.out.println("KRW: " + amount * jpyToKrw);
           System.out.println("USD: " + amount * jpyToKrw / usdToKrw);
           System.out.println("CNY: " + amount * jpyToKrw / cnyToKrw);
       } else if ("CNY".equals(fromCurrency)) {
           System.out.println("KRW: " + amount * cnyToKrw);
           System.out.println("USD: " + amount * cnyToKrw / usdToKrw);
           System.out.println("JPY: " + amount * cnyToKrw / jpyToKrw);
       } else {
           System.out.println("지원하지 않는 통화입니다.");
       }




  //미니프로젝트 로또추첨기 만들기(버블정렬 연습)
       
       List<Integer> numbers = new ArrayList<>();
       for (int i = 1; i <= 45; i++) {
           numbers.add(i);
       }
       // 랜덤으로 6개의 번호 추출
       List<Integer> lottoNum = new ArrayList<>();
       Random random = new Random();

       for (int i = 0; i < 6; i++) {
           int index = random.nextInt(numbers.size());
           lottoNum.add(numbers.get(index));
           numbers.remove(index);
       }

       // 버블 정렬을 사용하여 오름차순으로 정렬
       bubbleSort(lottoNum);

       // 정렬된 번호 출력
       System.out.println("로또 번호: " + lottoNum);
   }

   // 버블 정렬 함수
   private static void bubbleSort(List<Integer> arr) {
       int n = arr.size();
       for (int i = 0; i < n - 1; i++) {
           for (int j = 0; j < n - i - 1; j++) {
               if (arr.get(j) > arr.get(j + 1)) {
                   // Swap arr[j] and arr[j+1]
                   Collections.swap(arr, j, j + 1);
                   //버블정렬이 익숙치 않아요
               }
           }
       }
}
}