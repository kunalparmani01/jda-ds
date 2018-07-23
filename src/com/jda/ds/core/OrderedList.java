package com.jda.ds.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import com.jda.ds.util.LinkedList;

public class OrderedList {
	
public static void main(String[] args) throws Exception {
		
		LinkedList<Integer> list=new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		  File file1=new File("//home/bridgelabz/workspace/DataStructures/src/com/jda/ds/util/inttext");
		  BufferedReader br=new BufferedReader(new FileReader(file1));
		  String s1 ;
		  String str="";
		  while((s1=br.readLine())!=null){
			 
			       str=str+s1+' ';
		  }
		  br.close();
		  String[] arr=str.split(" ");
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(arr[i]+" ");
			  list.Ascendingaddition(Integer.parseInt(arr[i]));
		  } 
		  System.out.println("Sorted form:");
		  list.printList();
		  System.out.println("Integer to be searched:");
		  //String item=Utility.getString();
		  int item= sc.nextInt();
		  //String item=item.toLowerCase();
		  boolean flag=list.contains(item);
		  if(flag)
		  {
			  System.out.println("Element found and removed from the list:");
			  list.remove(item);
		  }
		  else
		  {
			  System.out.println("Element found and added to the list in sorted order");
			  list.Ascendingaddition(item);
		  }
		  list.printList();
			  
		}

}
