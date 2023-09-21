package com.kn.Plaindrome;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		palindrome(num);
		sc.close();
	}

	public static void palindrome(int num) 
	{
		if(num==1)
		{
			System.out.print(1);		}
		else 
		{
			int rem=num%10;
			int sum=0;
			sum=sum*10+rem;
			System.out.print(sum);
			palindrome(num/10);
			
		}
	}
}
