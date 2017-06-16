package com.javarealtime;

public class InheritanceOfAll extends AdditionOfNumbers
{
	public int Square(int a)
	{
	 int Square=4*a;
	 return Square;
	}
	
	public static void main(String[] args) 
	{
		AdditionOfNumbers additionOfNumbers= new AdditionOfNumbers();
		int Add=additionOfNumbers.Add(6, 3);
		System.out.println(Add);
		InheritanceOfAll inheritanceOfAll= new InheritanceOfAll();
		int Square=inheritanceOfAll.Square(4);
		System.out.println(Square); 
		AdditionOfNumbers.Sub(6, 3, 4);
		
		
		
		

	}

}
