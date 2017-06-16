package com.javarealtime;

public class MethodOverriding {
	public MethodOverriding(){}
	
	public MethodOverriding(int length, int width){
		int Area= length*width;
		System.out.println(Area);
	}

	public double Area(int radiusofsphere)
	{
	double area =3.14*radiusofsphere*radiusofsphere*radiusofsphere;
	return area;
	}
	public static void main(String[] args) {
		
		

	}
	

}
