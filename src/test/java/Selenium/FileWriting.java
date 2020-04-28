package Selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	public static String Filepath="D:\\Bharath.txt";
	public static File f1;
	public static FileOutputStream fos;
	
	
	
	public static void FileWrite()
	{
		try {
			FileWriter fw=new FileWriter(new File(Filepath));
			fw.write("Hi Good MOrning have great day have a wonderful day nice to seee");
			fw.close();
			System.out.println("File Written sucessfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Generated:");
			e.printStackTrace();
		}
	}
	
	
	public static void BufferWriter()
	{
		try {
			FileWriter fw1=new FileWriter(new File(Filepath));
			BufferedWriter bw=new BufferedWriter(fw1);
			bw.write("Writing the File using buffered writer ");
			bw.close();
			fw1.close();
			System.out.println("File Written sucessfully using BufferedWriter");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error generated :");
			e.printStackTrace();
		}
		
	}
	
	public static void WriteFile() throws IOException
	{
		 
	try {
		String str="Hi Hello Good MOrning Have a nice day i will seee you later by good night";
		f1  = new File("D:\\Sachin.txt");
		if (!f1.exists())
		{
			f1.createNewFile();
		}
		 fos=new FileOutputStream(f1);
		
		fos.write(str.getBytes());
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			fos.close();
		} catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
		
	}
	
	public static void main(String[] args) throws IOException {
		WriteFile();	
		}
	
	
	

}
