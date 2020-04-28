package Selenium;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.imageio.ImageIO;

import org.apache.commons.collections4.KeyValue;
import org.apache.poi.ss.formula.functions.Value;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {
	public static WebDriver driver;
	public static Robot rb;
	
	
	
	
	
	public static void TakeScreenShot() throws IOException, InterruptedException
	{
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https:\\wwww.google.com");
			rb=new Robot();
			String filepath="D://Laksh.png";
			Rectangle cap= new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage image=rb.createScreenCapture(cap);
			ImageIO.write(image, "jpg", new File(filepath));
			System.out.println("Screen shot Saved");
			
		} catch (AWTException  | IOException ex ) {
			// TODO Auto-generated catch block
			
			System.out.println("Exception Generated :");
			System.out.println(ex);
			ex.printStackTrace();
		}
		
	}
	
	
	public static void find_strlenght() {
	String str="Goodmorning";
	SortedSet<String>sets=new TreeSet<String>();
	for(int i=0;i<=str.length()-3;i++)
	{
		sets.add(str.substring(i, i+3));
	}
	
	System.out.println(sets);
	System.out.println(sets.first()+" "+sets.last());

	
	}
	
	public static String sample(String text,int k) {
		String [] strs=new String[text.length()-k+1];
		for (int i=0;i<text.length()-k+1;i++) {
			strs[i]=text.substring(i, i+k);
		}
		String small=strs[0];
		String large= strs[0];
		
		for(int l=0;l<strs.length;l++ ) {
		
			if (strs[l].compareTo(small)<0) {
				small=strs[l];
			}else if(strs[l].compareTo(large)>0) {
				large=strs[l];
			}
			
			
		}
		
		
		System.out.println(large+" "+small);
		
		
		
		return small +" \n"+large;
		
	}
	
	
	
	public static void name() {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();

            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;}
		
	}
	
	
	public static boolean check_palindrome(String pal) {
	boolean pl;
		String pal1="";
		for (int x=pal.length()-1;x>=0;x--) {
			pal1=pal1+pal.charAt(x);
		}
		
		if (pal.toLowerCase().equalsIgnoreCase(pal1))
		{
			pl=true;
			
		}else {
			pl=false;
		}
		System.out.println(pal1);
		
		return pl;
	}
	
	public static void Check_anagram(String s1,String s2) {
		HashMap<Character,Integer> x=new HashMap<Character,Integer>();
		HashMap<Character,Integer> y=new HashMap<Character,Integer>();
		char[]a=s1.toLowerCase().toCharArray();
		Arrays.sort(a);
		
		for(Character c:a) {
			System.out.print(c);
		}
		System.out.println();
		
		char[]b=s2.toLowerCase().toCharArray();
		Arrays.sort(b);
		for (Character c:b)
		{
			System.out.print(c);
		}
		if (a.length==b.length) {
		
			for (int k=0;k<a.length;k++) {
				if (x.get(a[k])==null) {
					x.put(a[k], 1);
				}else {
					
					x.put(a[k], x.get(a[k])+1);
				}
				
			}
			for (int j=0;j<b.length;j++) {
				if (y.get(b[j])==null) {
					y.put(b[j], 1);
				}else {
					y.put(b[j], y.get(b[j])+1);
				}
			}
			System.out.println();
			for (Map.Entry<Character, Integer> abc:x.entrySet()) {
				System.out.println("Key :"+abc.getKey()+" Value :"+abc.getValue());
			}
			
			for (Map.Entry<Character, Integer> xyz:y.entrySet()) {
				System.out.println("Key :"+xyz.getKey()+" Value :"+xyz.getValue());
			}
			int f=0;
			for (int i=0;i<a.length;i++) {
				if (x.get(a[i])!=y.get(b[i])) {
					f=1;
					break;
				}
			}
			if(f==0) {
				System.out.println("YES");
				
			}else {
				System.out.println("NO");
			}
		}else {
			System.out.println("False");
		}
		
		
	}
	
	public static void check() {
		
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
	name();
		
	}
	
	

}
