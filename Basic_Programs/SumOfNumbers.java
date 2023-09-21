package com.kn.Basic_Programs;

import java.util.Scanner;

public class SumOfNumbers 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int res=sum(num);
		System.out.println(res);
		sc.close();
	}

	private static int sum(int num) 
	{
		if(num>0)
		{
			return num+sum(num-1);
		}
		else
		{
			return 0;
		}
	}
}
