package com.javarealtime;

public class AdditionOfNumbers 
{


	public int Add(int A1,int A2)
	{
		int Add=A1+A2;
		return Add;
	}
	public static void Sub(int S1,int S2,int S3)
	{
		int Sub=(S1-S2)*S3;
		System.out.println(Sub);
		
	}
	public float Mul(int M1,int M2,int M3,int M4)
	{
		float Mul=(M1*M2)+M3+M4;
		return Mul;
	}
	
	public static void main(String[] args) {
		AdditionOfNumbers additionOfNumbers= new AdditionOfNumbers();
	    float Mul=additionOfNumbers.Mul(6, 2, 5, 9);
		System.out.println("your value is "+Mul);
		AdditionOfNumbers.Sub(4, 3, 6);
		AdditionOfNumbers additionOfNumbers1= new AdditionOfNumbers();
	    int add= additionOfNumbers1.Add(4, 6);
	    System.out.println(add);
	
		

	}

}
