package com.kn.Basic_Programs;

import java.util.Scanner;

public class SumOfEvenNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int res=sum(num);
		System.out.println(res);
		sc.close();
	}

	private static int sum(int num) 
	{
		while(num>0)
		{
			if(num%2==1)
			{
				return num+sum(num-1);
			}
			num--;
		}
		return 0;
	}
}
