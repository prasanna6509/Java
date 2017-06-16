package com.javarealtime;


public class Circle
{
	public static double prasanna()
	{
		double pie=3.14;
		 int radi=2;
		 double value = pie*radi*radi;
		return value;

	}
	
	public static void main(String[] args)  
	{
		MethodOverriding methodOverriding = new MethodOverriding(10,20);
		MethodOverriding  methodOverloading  = new MethodOverloading();
		MethodOverloading methodoverload = new MethodOverloading();
		double areaofcube = methodoverload.Area(4, 5, 6);
		System.out.println(areaofcube);
		double value= Circle.prasanna();
		System.out.println("radius of circle is "+value);
		
		System.out.println(methodoverload.Area(5));
		System.out.println(methodOverloading.Area(5));
		System.out.println(methodOverriding.Area(5));
	
   }
	
			}

//**********Non-Static method calling********//

