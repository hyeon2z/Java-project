package a01_diexp.z05_vo;

import org.springframework.stereotype.Service;

@Service
public class Pen {
	private String type;
	private String color;
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	public Pen(String type, String color) {
		this.type = type;
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
