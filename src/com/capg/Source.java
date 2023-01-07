package com.capg;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes rect = new Rectangle(4,5);
		rect.draw();
		rect.CaluculateArea();
		Shapes circle =new Circle(5);
		circle.draw();
		circle.CaluculateArea();
		

	}

}
