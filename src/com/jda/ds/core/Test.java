/*package com.jda.ds.core;

import java.io.File;
import java.util.Scanner;

import com.jda.ds.util.LinkedList;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//LinkedList l1 = new LinkedList("");
		//l1.addAtIndex(2, "par");
		  File file =
			      new File("//home/bridgelabz/workspace/DataStructures/src/com/jda/ds/util/txtt");
			    Scanner sc = new Scanner(file);
			    String str = "";
			    while (sc.hasNextLine()){
			   	 str += sc.nextLine();
			   	 str += " ";
			    }
			    String charr[] = str.split("//s+");
			    //l1.addAtTail("hay");
			    //l1.addAtTail("how");
			    
 		     for(int i=0; i<charr.length; i++){
		    	  //if(l1.search(charr[i]) == false)
		    		  l1.addAtTail(charr[i]);
		
			    }
 		    System.out.println(l1.search(l1.head, "there"));
			    //System.out.println(l1.head.getData());
			    //System.out.println(l1.search(l1.head,  3));
			      // System.out.println(sc.nextLine());
	//	l1.addAtHead(11);
		//l1.addAtHead(12);
		//l1.addAtHead(13);
		//l1.addAtTail(8);
		//l1.addAtTail(7);
		//l1.addAtIndex(4,9);
		//l1.addAtIndex(4,9);
		//l1.deleteAtIndex(4);
		LinkedList.printList();
	}

}
*/