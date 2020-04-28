package com.sample.test;

import java.awt.geom.Arc2D.Float;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.sun.tools.javac.parser.ReferenceParser.ParseException;

public class fibbnocci {
	
	
	public static ArrayList<Integer>arr (int limit) {
		
		ArrayList<Integer> ln=new ArrayList<Integer>();
		for (int i=0;i<=limit;i++)
		{
			if (i==0||i==1)
			{
			ln.add(i);	
			}
			else
			{
				ln.add(ln.get(i-1)+ln.get(i-2));
			}
			
		}
		System.out.println("List of Fibbonocci elements : "+ln);
		return ln;
	}
	
	public static void find_Keyvalue(int key,int limit1)
	{
		ArrayList<Integer>val=new ArrayList<Integer>();
		val=arr(limit1);
		System.out.println("The Value of f("+key+") is : "+val.get(key));
	}
	
	public static int fino(int n)
	{
		 if (n==0) {
			 return 0;
		 }else if (n==1)
		 {
			 return 1;
		 }
		 int m=fino(n-1);
		 int k=fino(n-2);		 
		return m+k;
	}
	
	public static void sorting(float[] arr)
	{
		float temp;
     	for(int i=0;i<arr.length-1;i++)
     	{
          for(int j=0;j<arr.length-i-1;j++) 
          { 
        	if (arr[j]<arr[j+1]) 
        	{
   			temp=arr[j];
   			arr[j]=arr[j+1];
   			arr[j+1]=temp;
   		    }
        	  
          }
     		
     	 
     	}
     	float [] end=arr;
     	for (float temp1:end)
     	{
     		System.out.println(" "+temp1);
     	}
     	
	}
	
	public static void BigDc(String []str)
	{
		
		Arrays.sort(str, Collections.reverseOrder(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				BigDecimal a=new BigDecimal(o1);
				BigDecimal b=new BigDecimal(o2);
				System.out.println("a and b value is "+a+" " +b+" "+" and value is "+a.compareTo(b));
				return a.compareTo(b);
			}
			
		}));
		for (String temp:str)
		{
			System.out.println(temp);
		}
	}
	
public static final Comparator<String> com1=new Comparator<String>() {
	
	

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		BigDecimal b1=new BigDecimal(o1);
		BigDecimal b2=new BigDecimal(o2);
				
		return b1.compareTo(b2);
	}
};

public static final Comparator<String> comparator=new Comparator<String>() {
	@Override
	public int compare(String a,String b) {
		BigDecimal b1=new BigDecimal(a);
		BigDecimal b2=new BigDecimal(b);
		return b1.compareTo(b2);
	}
	
};

public static void Sort() {
  String[] ars= {"10","20.3","10.33","55.01","45.06","55.25"};
  Arrays.sort(ars, Collections.reverseOrder(comparator));
  for (String temp:ars) {
	  System.out.println(temp);
  }
}

public static void stairs(int n)
{
	for (int i=n;i>0;i--)
	{
		for (int j=1;j<=i-1;j++)
		{
			
			System.out.print(" ");
		}
		
		for(int k=0;k<=n-i;k++)
		{
			System.out.print("#");
		}
		
		System.out.println();
		
		
	}
}

public static void stairs2(int m)
{
	int spaceCnt=0;
	for (int i=1;i<=m;i++)
	{
		spaceCnt=m-(i);
		System.out.println(new String(new char[spaceCnt]).replace("\0", " ")+new String(new char[m-spaceCnt]).replace("\0", "#")); 	
	}
}

public static void FindMaxMin(int[] arr) {
    
    int temp;
    for (int i=0;i<arr.length;i++) {
    	for (int j=0;j<arr.length-1;j++) {
    		if (arr[j]>arr[j+1]) {
    			temp=arr[j];
    			arr[j]=arr[j+1];
    			arr[j+1]=temp;
    		}
    	}
    }
    
    
	
	  long max=0; 
	  for (int i=arr.length-1;i>0;i--)
	  { 
		  max+=arr[i]; 
		  }
	 
    long min=0;
    for (int i=0;i<arr.length-1;i++) {
    	min+=arr[i];
    }
    
  
    System.out.println(max+" "+min);
    }


public static int candle(int [] arr)
{
	int temp=0;
	for(int i=0;i<arr.length-1;i++) {
		for (int j=0;j<arr.length-i-1;j++) {
			if (arr[j]<arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	int count=1;
	for(int k=1;k<arr.length-1;k++) {
		if (arr[0]==arr[k]) {
			count++;
		}
	}
	System.out.println(count);
	
	return count;
}

public static String MilitaryTimeFomrat(String str) {
	String newFormat = "";
	if (str.substring((str.length())-2).toUpperCase().equalsIgnoreCase("PM") ) {
		String [] st=str.split(":");
		int hr=Integer.valueOf(st[0]);
		hr=hr+12;
		st[0]=String.valueOf(hr);
		 newFormat=st[0]+":"+st[1]+":"+st[2].substring(0, 2);
		
		System.out.println(newFormat);
	}else if (str.substring(str.length()-2).equalsIgnoreCase("AM") || str.substring(0,2).equalsIgnoreCase("12")){
		return newFormat="00:00:00";
	}else
	{
		newFormat=str.substring(0, str.length()-2);
	}
	return newFormat;
}

public static void newdate(String Str)  {
	DateFormat informat=new SimpleDateFormat("hh:mm:ssaa");
	DateFormat outFomrat=new SimpleDateFormat("HH:mm:ss");
	
	Date dt=null;
	
		try {
			dt=informat.parse(Str);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	if (dt!=null)
	{
		String mydate=outFomrat.format(dt);
		System.out.println(mydate);
	}
}
		
	


public static void bs(int n) {
	for(int i=0;i<n;i++) {
		for (int j=0;j<n;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
	

public static int[][] magicSquare(int n){
	int[][] MagicSquare=new int[n][n];
    int k=n/2;
    int L=n-1;
    for (int i=1;i<=n*n;) {
    	
    	if (k==-1 && L==n ) {
    		k=0;
    		L=n-2;
    	}else {
    		if (k<0)
    			k=n-1;
    		if(L==n)
    			L=0;
    	}
    	
    	if(MagicSquare[k][L]!=0) {
			/*
			 * k=k+1; L=L-2;
			 */
    	
    	   k++;
    	   L-=2;
    	   continue;
    	}
    	else {
    		MagicSquare[k][L]=i++;
    	}
    	k--;
    	L++;
    
    }
	
	return MagicSquare;
}


public static void  find_number(List<Integer>arr,int num)
{
	
	if (arr.contains(num)) {
		System.out.println("Yes");
	}else {
		System.out.println("False");
	}
	
}

public static void find_oddNumbers(int initial,int end) {
	List<Integer> OddNumber=new ArrayList<Integer>();
	for (int i=initial;i<=end;i++)
	{
		if (i%2!=0) {
			OddNumber.add(i);
		}
	}
	System.out.println(OddNumber);
}

	public static void main(String[] args) {
		
		List<Integer>arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(50);
		arr.add(60);
		arr.add(70);
		
		
		find_oddNumbers(1,100);

}
}