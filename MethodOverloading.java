package com.javarealtime;

public class MethodOverloading extends MethodOverriding {

	public  double Area(int radius)
	{
	    double area=3.14*radius*radius;
		return area;
	}
	
	public double Area(int length,int breadth){
		double area=length*breadth;
		return area;
	}
	public double Area(int length, int breadth, int height)
	{
	 double area=length*breadth*height;
	 return area;
	}
	
	public static void main(String[] args) {
		MethodOverriding methodOverloading= new MethodOverriding(); 
		System.out.println("Area of Circle:"+methodOverloading.Area(4));
		double areaofsquare= methodOverloading.Area(4);
		System.out.println("Area of Square:"+areaofsquare);
		System.out.println("Area of Cube:"+methodOverloading.Area(3));
		double chandu=Circle.prasanna();
		System.out.println("before class"+chandu);
	}

}
