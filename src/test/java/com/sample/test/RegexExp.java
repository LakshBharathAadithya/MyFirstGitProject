package com.sample.test;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.bytebuddy.asm.Advice.Local;

public class RegexExp {
	int n=5;
	
	
	public static void checkemail(String str) {
	String regex="((\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	Pattern pat=Pattern.compile(regex);
	Matcher match=pat.matcher(str);
	boolean found=match.matches();
	System.out.println("The given IP address is valid/Invalid = "+found);
	
	}
	
	public static void groups() {
		Scanner sc=new Scanner(System.in);
		String regex="\\b(\\w+)(\\W+\\1\\b)+";
		Pattern p=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		System.out.println("Entern the number of texts");
		int numTests=Integer.parseInt(sc.nextLine());
		while(numTests>0) {
			String input=sc.nextLine();
			Matcher m=p.matcher(input);
			while(m.find()) {
				input=input.replaceAll(m.group(), m.group(1));
				
				
			}
			System.out.println(input);
			numTests--;
		}
		sc.close();
		}
		
		
	
		
			public static void Validate_UserName() {
				String Regex="^[a-zA-Z]\\w{7,29}";
				Pattern p=Pattern.compile(Regex);
				String text="Bhngdrs54546461";
				Matcher m=p.matcher(text);
				System.out.println(m.matches());
				
				
				
		}
			
			public static void Vali(String ars) {
				String regex="<(.+)>([^<]+)</\\1>";
				Pattern p=Pattern.compile(regex);
				Matcher m=p.matcher(ars);
				while(m.find()) {
					System.out.println(m.group(2));
				}
			}
	public static void CurrencyFormat() {
		double number=100000;
		Locale India=new Locale("en","IN");
		NumberFormat indiacu=NumberFormat.getCurrencyInstance(India);
		System.out.println(indiacu.format(number));
		String us=NumberFormat.getCurrencyInstance(Locale.US).format(number);
		String Indiaz=NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(number);
		
		
		
		
		System.out.println(us);
		
		
		
	}
	
	
	public static void boo(boolean [] vis)
	{
		boolean[] val=new boolean[5];
		for(int i=0;i<5;i++) {
			val[i]=vis[i];
		}
		for(boolean temp:val) {
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {

	for(boolean temp:new boolean[5]) {
		System.out.println(temp);
	}
		
		
}
}
