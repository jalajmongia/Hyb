package org.kunal.spring;

public class Tringle {
	private String type;
	private int height;
	
	

	public Tringle(String type) {
		this.type = type;
	}
	
	public Tringle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String getType() {
		return type;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/

	public void draw() {
		System.out.println("Drawing "+getType()+" Tringle with height:"+getHeight());
	}
}
