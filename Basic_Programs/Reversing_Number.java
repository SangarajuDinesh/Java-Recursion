package com.kn.Basic_Programs;

import java.util.Scanner;

public class Reversing_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(reverse(num));
		sc.close();
	}

	private static int reverse(int num) 
	{
		int rem=0,sum=0;
		if(num<=0)
		{
			return 0;
		}
		else
		{
			rem=num%10;
			sum=sum+rem;
			num/=10;
			return (sum*10)+reverse(num);
		}
		
	}
}
