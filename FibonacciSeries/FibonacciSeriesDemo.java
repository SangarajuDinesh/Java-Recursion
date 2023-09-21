package com.kn.FibonacciSeries;

public class FibonacciSeriesDemo {

	public void fibonacciSeries(int num) 
	{
		int a=0,b=1;
		int sum=0;
		System.out.print(a+" "+b+" ");
		if(num>=0)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
			fibonacciSeries(num--);
		}
		
	}

}
