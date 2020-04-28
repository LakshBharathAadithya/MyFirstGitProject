package com.sample.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sample {

	//dayName
	public String dayname(int year,int month,int day)
	{
	String d=LocalDate.of(year, month, day).getDayOfWeek().name();
		
		return d;
		
	}

	//Date class
	public static void date_class(int year,int month,int day)
	{
		String day2=LocalDate.of(year,month,day).getDayOfWeek().name();
		
		System.out.println(day2);		
	} 

	//Find Largest Number
	public static void find_largestnumber(int[] num)
	{
		
		int max = 0;
		
	 if (num[0]>num[1])
	 {
		if (num[0]>num[2])
		{
			max=num[0];
		}
	 }else if (num[1]>num[2])
	 {
		 max=num[1];
	 }else 
	 {
		 max=num[2];
	 }
	 System.out.println("The Maximum number is : "+max);
	}
	
	//Palindromeseries
	public static  void checkPalindrome(long num)
	{
		long originalnum=num;
		long reversenum=0,remainder;
		for(;num!=0;num/=10)
		{
			remainder=num%10;
			reversenum=reversenum*10+remainder;
		}
		if (reversenum==originalnum)
		{
			System.out.println("The Number "+originalnum+ " is palindrome");
		}else 
		{
			System.out.println("The Number "+originalnum+" is not a palindrome");
		}
		
	}
	
	
	//Leap Year
	public static void checkLeapYear(int year)
	{
		int yr=year;
		boolean flag=false;
		if (year%4==0)
		{
			if (year%100==0)
			{
			if (year%400==0)
			{
				flag=true;
			}else
				{
					flag=false;
				}
			
			}else
			{
				flag=true;
			}
		} else
		{
			flag=false;
		}
		
	if (flag==true)
	{
		System.out.println("The entered year "+yr+" is leap year");
	}else 
	{
		System.out.println("The entered year "+yr+" is not a leap year ");
	}
	
	}
	
	//Reverse string
	public static String reversestring(String str)
	{
		if (str.isEmpty())
			return str;
		return reversestring(str.substring(1))+str.charAt(0);
	}
	
	//for loop for reverse string
	public static void reverseString(String str)
	{
		char [] str1=new char[str.length()];
		int count=0;
		for (int i=str.length()-1;i>=0;i--)
		{
			str1[count]=str.charAt(i);
			count=count+1;
		}
		for (char a:str1)
		{
			System.out.print(a);
		}
	}
	
	//While loop for reverse sring
	public static void whilereversestring (String str)
	{
		
		StringBuilder str2=new StringBuilder();
		int i=str.length()-1;
		
		while (i>=0)
		{
			str2.append(str.charAt(i));
			i--;
		}
		System.out.println(str2);
	}
	
	//l on numbersbb
	public static void bubblesort(int [] arr )
	{
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length-i-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	
	for(int i:arr)
	{
		System.out.println(i);
	}
	}
	
	//sum of values of array
	public static void sum(int num)
	{
		int count =0;
		for (int i=0;i<num;i++)
		{
		count=count+i;
		}
		System.out.println("The sum is "+count);
	}
	
	public static void sum1(int num)
	{
		int i=1;
		int count =0;
		while ( i<num)
		{
			count=i+count;
			i++;
		}
		System.out.println("The sum is "+count);	
	}
	
	// Draw a Picture
	public static void picture()
	{
		for (int i=0;i<=9;i++)
		{
			for (int j=0;j<=9;j++)
			{
				System.out.print("- ");
			}
			System.out.println();
		}
	}
	
	
	//Drawing a picture
	public static void pictureStar()
	{
		for (int j=0;j<=9;j++)
		{
			for(int k=0;k<2*(9-j);k++)
			{
				System.out.print(" ");
			}
			for (int i=0;i<=2*j;i++)
			{
				
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	

	 public static void  main(String[] args) {
		// TODO Auto-generated methringod sbtubrin
		
		 
	boolean val=false;
	if (!val)
	{
		System.out.println(!val);
	}
		 
	}

	 
}
