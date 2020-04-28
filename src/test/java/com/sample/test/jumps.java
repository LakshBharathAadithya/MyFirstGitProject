package com.sample.test;

import java.util.Scanner;

public class jumps {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of questions");
		int q=Integer.parseInt(scanner.nextLine());
		while(q-->0)
		{
			
			String [] in=scanner.nextLine().split(" ");
			int n=Integer.parseInt(in[0]);
			int m=Integer.parseInt(in[1]);
			for (int i=0;i<n;i++)
			{
				System.out.println("enter array elements");
				
			}
		}
	}

}
