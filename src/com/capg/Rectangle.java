package com.capg;

public class  Rectangle extends Shapes{
	
		int l ,b;
	public Rectangle(int l , int b) {
		this.l=l;
		this.b=b;
		
	}
	public void draw() {
		System.out.println("rectangle draw");
	}
	public void CaluculateArea() {
		System.out.println(l*b);
	}

	}

	


