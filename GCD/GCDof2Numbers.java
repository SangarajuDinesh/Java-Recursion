package com.kn.GCD;

import java.util.Scanner;

public class GCDof2Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers = ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		//Create an object
		GcdDemo gc=new GcdDemo();
		//Call the Method
		int res=gc.gcd(num1,num2);
		System.out.println(res);
		sc.close();
	}
}
