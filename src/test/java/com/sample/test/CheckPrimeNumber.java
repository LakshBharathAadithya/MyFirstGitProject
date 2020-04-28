package com.sample.test;

public class CheckPrimeNumber {
	
	
	public static void check_prime_no( int a)
	{
		int count = 0;
		for (int i=2;i<=a/2;i++ )
		{
			
			if (a%i==0)
			{
				count=count+1;
			}
		}
			
		 
		
		if (count==0)
		{
		System.out.println("The "+a+" is a prime number");
		
		}else 
		{
			System.out.println("The "+a+" is not a prime number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
check_prime_no(4);
	}

}
