package Selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileHandling {
	
	
	public static File file;
	public static  FileWriter fos ;
    public static 	XSSFWorkbook wb;
	public static XSSFSheet sh;
	
	public void CreatExcelFile(String filepath)
	{
		
		try {
			file=new File(filepath);
			if (!file.exists())
			{
				file.createNewFile();
				System.out.println("A new File is Created");
			}else {
				System.out.println("File already exists");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Generated :");
			e.printStackTrace();
		}
		
		
		
	}
	
	public void writeFile(String filepath) throws IOException
	{
	
		try {
			file=new File(filepath);
			 fos=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fos);
			
			if (!file.exists())
			{
				file.createNewFile();
				System.out.println("A new File Has been Created");
			}else {
				bw.write("Good Morning");
				
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		finally {
			try {fos.close();
	         
			
				
			}catch(IOException ex) {
				System.out.println("Error Generated :");
				System.out.println(ex);
			}
		}
		
	}
	
	public static void main(String[] args) {
		ExcelFileHandling el=new ExcelFileHandling();
		try {
			el.writeFile("D:\\Sachin.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	
	
	

}
