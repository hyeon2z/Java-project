package javaexp.z02_homework.a21_hcj.bookManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String name;
	private String id;
	private String pass;
	private boolean rental;
	private Book rentalBook;
	public Member( String id,String pass, String name) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		rental = false;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public boolean getRental() {
		return rental;
	}
	public void setRental(boolean rantal) {
		this.rental = rantal;
	}
	public Book getRentalBook() {
		return rentalBook;
	}
	public void setRentalBook(Book rentalBook) {
		this.rentalBook = rentalBook;
	}
	
	
	
	
}
