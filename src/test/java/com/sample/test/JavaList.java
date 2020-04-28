package com.sample.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaList {

	
	public static void Inerst_Delete(List<Integer> arr,int insertindex,int insernumber,int deleteindex)
	{
		
		List<Integer>obj1=inserted(insertindex,insernumber,arr);
		obj1=deleted(deleteindex,obj1);
		System.out.println("After insertion and deletion"+obj1);
	}
	
	public static List<Integer> inserted(int index,int number,List<Integer>insert)
	{
		List<Integer>arr1=insert;
		arr1.add(index, number);
		System.out.println("After Insertion : "+arr1);
		return arr1;
		
	}
	
	public static List<Integer> deleted(int index,List<Integer>delete)
	{
		delete.remove(index);
		System.out.println("After Deletion : "+delete);
		return delete;
	}
	
	public static void main(String[] args) {
		List<Integer>mianobj=new ArrayList<Integer>();
		int [] ne= {12,0,1,78,12};
		for(int i=0;i<ne.length;i++)
		{
			mianobj.add(ne[i]);
			
		}
		System.out.println("Before Insertion and operation : "+mianobj);
		int st=2;
		int val=55;
		int del=3;
		Inerst_Delete(mianobj, st, val, del);
	
	
		
	}
}
