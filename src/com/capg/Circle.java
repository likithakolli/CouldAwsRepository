package com.capg;

public class Circle extends Shapes {
	int r;
public Circle(int r) {
	this.r=r;
	
}
public void draw() {
	System.out.println("draw circle");
	
}

public  void CaluculateArea() {
	System.out.println(3.14*r*r);
}

}
