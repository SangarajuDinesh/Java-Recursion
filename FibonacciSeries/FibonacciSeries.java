package com.kn.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		FibonacciSeriesDemo fs=new FibonacciSeriesDemo();
		fs.fibonacciSeries(num);
		sc.close();
		
	}
}
