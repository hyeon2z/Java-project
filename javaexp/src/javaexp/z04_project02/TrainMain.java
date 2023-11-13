package javaexp.z04_project02;

import java.util.Scanner;

import javaexp.z04_project02.vo.Oneway;

public class TrainMain {

	public static void main(String[] args) {
		Oneway ow = new Oneway();
		Scanner sc = new Scanner(System.in);
		String userDate = "";
		System.out.println("기차표 예매 조건설정 페이지\n");
		while(true) {
			ow.stationInfo();
			System.out.print("출발역을 선택하세요(0입력 시 종료)");
			try {
				int usrNum = Integer.parseInt(sc.nextLine());
				if(usrNum <= ow.stationLength() && usrNum > 0) {
					ow.setDepartureStation(usrNum-1);
					System.out.println("선택한 역 : " + ow.getDepartureStation()+"\n");
					while(true) {
						ow.stationInfo();
						System.out.print("도착역을 선택하세요(0입력 시 종료)");
						try {
							int usrNum2 = Integer.parseInt(sc.nextLine());
							if(usrNum2 <= ow.stationLength() && usrNum2 > 0) {
								ow.setArrivalStation(usrNum2-1);
								System.out.println("선택한 역 : " + ow.getArrivalStation()+"\n");
								while(true) {
									ow.dateInfo();
									System.out.print("탑승할 날짜를 선택하세요(0입력 시 종료)");
									try {
										int usrNum3 = Integer.parseInt(sc.nextLine());
										if(usrNum3 <= ow.dateLength() && usrNum3 > 0) {
											userDate = ow.getDate(usrNum3-1);
											System.out.println("선택한 날짜 : " + ow.getDate(usrNum3-1)+"\n");
											while(true) {
												System.out.print("탑승할 성인 수를 설정하세요(0입력 시 종료)");
												try {
													int usrNum4 = Integer.parseInt(sc.nextLine());
													if(usrNum4 <= 9 && usrNum4 > 0) {
														System.out.println("선택한 인원 : 성인 " + usrNum4 + "명"+"\n");
														ow.setAdult(usrNum4);
														while(true) {
															System.out.print("탑승할 아동 수를 설정하세요(-1입력 시 종료)");
															try {
																int usrNum5 = Integer.parseInt(sc.nextLine());
																if(usrNum5 <= (9-usrNum4) && usrNum5 >= 0) {
																	System.out.println("선택한 인원 : 아동 " + usrNum5 + "명"+"\n");
																	ow.setChild(usrNum5);
																	System.out.println("###선택한 조건###");
																	System.out.println("출발역 : " + ow.getDepartureStation()
																	+"\n도착역 : " + ow.getArrivalStation()
																	+"\n탑승할 날짜 : " + userDate
																	+"\n성인 : "+ ow.getAdult() + "명"
																	+"\n아동 : "+ ow.getChild() + "명");
																}else if(usrNum5 == -1) {
																	break;
																}else {
																	System.out.println("잘못된입력");
																	continue;
																}
															}catch(NumberFormatException ne) {
																System.out.println("잘못된입력");
																continue;
															}
															break;
														}
													}else if(usrNum4 == 0) {
														break;
													}else {
														System.out.println("잘못된입력");
														continue;
													}
												}catch(NumberFormatException ne) {
													System.out.println("잘못된입력");
													continue;
												}
												break;
											}
										}else if(usrNum3 == 0) {
											break;
										}else {
											System.out.println("잘못된입력");
											continue;
										}
									}catch(NumberFormatException ne) {
										System.out.println("잘못된입력");
										continue;
									}
									break;
								}
							}else if(usrNum2 == 0) {
								break;
							}else {
								System.out.println("잘못된입력");
								continue;
							}
						}catch(NumberFormatException ne) {
							System.out.println("잘못된입력");
							continue;
						}
						break;
					}
				}else if(usrNum == 0) {
					break;
				}else {
					System.out.println("잘못된입력");
					continue;
				}
				
			}catch(NumberFormatException ne) {
				System.out.println("잘못된입력");
				continue;
			}
			break;
		}
		
		
	}

}
