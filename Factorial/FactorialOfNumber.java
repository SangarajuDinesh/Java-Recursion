package com.kn.Factorial;

import java.util.Scanner;

public class FactorialOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num=sc.nextInt();
		//Create an object
		FactorialDemo f1=new FactorialDemo();
		//call a method using reference
		System.out.println(f1.fact(num));
		sc.close();
	}
}
