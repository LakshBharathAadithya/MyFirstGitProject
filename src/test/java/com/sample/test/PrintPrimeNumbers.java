package com.sample.test;


import java.util.ArrayList;

public class PrintPrimeNumbers {
	static ArrayList<Integer> arr = new ArrayList<Integer> ();
	public static ArrayList<Integer> print_all_primenumbers(int n)
	{
		
		
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for (int j=2;j<=i/2;j++)
			{
				
				if (i%j==0)
				{
	             count=count+1;				
				}
			}
		if (count==0)
		{
			arr.add(i);
		}
		}
		return arr;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_all_primenumbers(10); 
		System.out.print("The Prime Numbers are : ");
		for (int a:arr)
		{
			System.out.print(a +" ");
		}

	}

}
