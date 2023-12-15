package javaexp.z02_homework.a02_oys.z03_miniProgram;

import java.util.List;

public class Seat {
	private int column;
	private int row;
	private int[][] seats;
	private boolean[][] isSeat;
	
	public Seat(int column, int row) {
		this.column = column;
		this.row = row;
		seats = new int[column][row];
		isSeat = new boolean[column][row];
		/*for (int i = 0; i < column; i++) {
			columns.add(i + 1);
		}
		for (int i = 0; i < row; i++) {
			rows.add(i + 1);
		}*/
	}
	
	public int getColumn() {
		return column;
	}
	public int getRow() {
		return row;
	}
	
	// 예매
	public void reservationSeat(int column, int row) {
			isSeat[column][row] = true;
	}
	
	// 예매된지 확인
	public boolean checkReservationSeat(int column, int row) {
		if (isSeat[column][row] == true) {
			return false;
		} else {
			return true;
		}
	}
	
	public void getSeat() {
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
//				System.out.println(i + 1 + "행 " + (j + 1) + "열");
				if (isSeat[i][j]) {
					System.out.print("■ ");
				} else {
					System.out.print("□ ");
				}
			} 
			System.out.println();
		}
	}
	
	

}
