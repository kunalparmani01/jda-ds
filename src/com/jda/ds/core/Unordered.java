package com.jda.ds.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import com.jda.ds.util.LinkedList;

public class Unordered {

	public static void main(String[] args) throws Exception {
		LinkedList<String> list=new LinkedList<String>();
		//LinkedList<Integer> list=new LinkedList<>();
		  File file1=new File("//home/bridgelabz/workspace/DataStructures/src/com/jda/ds/util/txtt");
		  BufferedReader br=new BufferedReader(new FileReader(file1));
		  Scanner sc = new Scanner(System.in);
		  String s1 ;
		  String str="";
		  while((s1=br.readLine())!=null){
			 
			       str=str+s1+',';
		  }
		  br.close();
		  String[] arr=str.split(",");
		  for(int i=0;i<arr.length;i++)
		  {
			  list.add(arr[i]);
		  } 
		  list.printList();
		  System.out.println("Enter word you want to be searched:");
		  //String item=Utility.getString();
		  String item= sc.nextLine();
		  //String item1=item.toLowerCase();
		  if(list.contains(item))
		  {
			  System.out.println("found");
			  list.remove(item);
		  }
		  else
		  {
			  System.out.println("not found");
			  list.add(item);
		  }
		  list.printList();
		  System.out.print(list);
		  {
			  
		  }
			  
		}

}
