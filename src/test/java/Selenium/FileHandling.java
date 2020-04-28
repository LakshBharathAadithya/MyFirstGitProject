package Selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling {
	static String FilePath="D:\\Bharath.txt";
	
	File createfile ;
	FileOutputStream fos=null;
	public static void DownloadFile()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		WebElement DownloadButton=driver.findElement(By.xpath("//*[@id='messenger-download']"));
		String source_location=DownloadButton.getAttribute("href");
		
		String wget_command="cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate "+source_location;
		
		
		
			try {
				Process exec=Runtime.getRuntime().exec(wget_command);
				int exitval;
				exitval = exec.waitFor();
				System.out.println("Exit Value: "+exitval);
			} catch (InterruptedException |IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.toString());
			}
			driver.quit();
	}
	
	
	
	
	public static void createfile()
	{
		String FilePath="D:\\Bharath.txt";
		File file=new File(FilePath);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void WritingFile() throws IOException
	{
		String FilePath="D:\\LakshBharath.txt";
		String mycontent="\r\n" + 
				"File IO is a critical part of any software process. We frequently create a file, "
				+ "open it & update something or delete it in our Computers. Same is the case "
				+ "with Selenium Automation. We need a process to manipulate files with Selenium.";
		
		
		FileOutputStream f2=null;
		File file=new File(FilePath);
		try {
			 f2=new FileOutputStream(file);
			if (!file.exists())
			{
				file.createNewFile();
				
			}
			
			byte [] chr=mycontent.getBytes();
			f2.write(chr);
			f2.flush();
			System.out.println("File Written Sucessfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if (f2 !=null){
					f2.close();
				}
			}catch (IOException ex) {
				System.out.println(ex);
			}
		}
	}
	
	
	
	public static void splitString()
	{
		String Mycontent="File IO is a critical part of any software process. We frequently create a file, \"\r\n" + 
				"				+ \"open it & update something or delete it in our Computers. Same is the case \"\r\n" + 
				"				+ \"with Selenium Automation. We need a process to manipulate files with Selenium.";
		
		String [] str=Mycontent.split(".");
		System.out.println("String.split");
		for (int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
				
		String []str2=Mycontent.split(".", 5);
		System.out.println("String.split(regex,limit)");
		for (int j=0;j<str2.length;j++)
		{
			System.out.println(str2[j]);
		}
	}
	
	
	public static void appendFile()
	{
		try {
			FileWriter fw=new FileWriter(FilePath);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Hi Good Morninghave a nice day Bye Good luck");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		appendFile();
	}

}
