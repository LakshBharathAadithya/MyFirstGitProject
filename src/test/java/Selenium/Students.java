package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students implements Comparable<Students> {
	
private int age;
private String  name;
private String address;




public   Students (int age,String name,String address)
{
	this.age=age;
	this.name=name;
	this.address=address;
	
}

public int getage()
{
	return age;
	
}


public String getstudentname() {
	return name;
}




public String getaddress()
{
	return address;
	
}



@Override
public int compareTo(Students comparestu) {
   
    /* For Ascending order*/
    return this.age-comparestu.age;

    /* For Descending order do like this */
    //return compareage-this.studentage;
}

public String tostring() {
	return"[age="+age+",name="+name+"address="+address+"]";
}


public static void main(String[] args) {
	List<Students> stu=new ArrayList<Students>();
	stu.add(new Students(10,"poorna","GKB"));
	stu.add(new Students(15,"Hitashree","GKB2"));
	stu.add(new Students(16,"chandan","Hoskote"));

Collections.sort(stu);
for (Students st:stu) {
	System.out.println(st);
	
}
}







}
