package com.example.pack;

/*
 * Lab Exercise 24
 * 
 * 
 * 
 * Created by Sanul Raskar
 * 
 * */

public class Shape {

	private void area(float side) {
		System.out.println("Area of square with side " + side + " is:" + Math.pow(side, 2));
	}

	private void area(float length, float breadth) {
		System.out.println("Area of rectangle with lenght " + length + " and breadth " + breadth + " is:" + length * breadth);
	}

	private void perimeter(float side) {
		System.out.println("Perimeter of square with side " + side + " is:" + 4 * side);
	}
	
	private void perimeter(float length,float breadth) {
		float perimeter = 2*(length+breadth);
		System.out.println("Area of rectangle with lenght " + length + " and breadth " + breadth + " is:" + perimeter);
	}
	

	public static void main(String[] args) {

		Shape obj = new Shape();
		obj.area(5);
		obj.area(3,4);
		
		obj.perimeter(5);
		obj.perimeter(3,4);
		
	}

}
