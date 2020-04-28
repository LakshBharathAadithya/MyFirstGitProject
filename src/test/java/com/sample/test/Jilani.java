package com.sample.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Jilani {
	static String array;
	static boolean win=false;
	static HashMap<Integer,info> hp;
	static int m;
	
	
	static class info{
  boolean canjump=true;
  boolean cangoforward=true;
  boolean cangoback=true;
  int index=-1;
  info (int i){
	  this.index=i;
  }
	}
	
	
	
	public static void travrse(int index)
	{
		info in=hp.get(index);
		if (in.canjump)
		{
		in.canjump=false;
			if (index+m>=array.length())
			{
				win=true;
				return ;
			}
			if (array.charAt(index+m)=='0')
			{
				System.out.println("Jumping to the index+m");
				travrse(index+m);
			}
		}
		
		if (in.cangoforward)
		{
			in.cangoforward=false;
			if (index+1>=array.length())
			{
				win=true;
				return ;
			}
			if (array.charAt(index+1)=='0')
			{   
				System.out.println("Going forward to the index+1");
				travrse(index+1);
			}
		if (in.cangoback ) 
		{
			in.cangoback=false;
			if (index==0)
			{
				return;
			}
			if(array.charAt(index-1)=='0')
			{
				System.out.println("Going back to the index-1 cell");
				travrse(index-1);
			}
		}
			
		}
	
		
		
	}
	

	public static void main(String[] args) {
		try {
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("The number of testcases");
			int t=Integer.parseInt(bf.readLine());
			while(t-->0)
			{
				System.out.println("Enter the size of n and m");
				String[] twonos=bf.readLine().split(" ");
				int n=Integer.parseInt(twonos[0]);
				System.out.println(n);
				
			    m= Integer.parseInt(twonos[1]);
			    System.out.println(m);
				array=bf.readLine();
				array=array.replaceAll(" ", "");
				 hp=new HashMap<Integer,info>();
				
				if (m<2)
				{
					int no=array.replace("0", "").length();
					
					if (no==0)
							win=true;
				}
				else 
				{
				for (int i=0;i<array.length();i++)
				{
					if (array.charAt(i)=='0') {
						hp.put(i, new info(i));
				}
				}
				travrse(0);
					
				}
			if (win)
			{
			System.out.println("Yes");	
			}
			else
			{
				System.out.println("No");
			}
				
			}
		}catch (IOException ex)
		{
			ex.printStackTrace();
		}
	
		
		
	}

}
