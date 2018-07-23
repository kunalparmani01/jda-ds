package com.jda.ds.core;

import java.util.Scanner;

import com.jda.ds.util.Queue;

public class CashCounter {
	
	static long balance=10000;
	public static void main(String[] args) {
		Queue<Integer> q = new Queue <>();
		Scanner sc = new Scanner(System.in);
	   System.out.println("Enter total number of people:");
	   int n= sc.nextInt();
	  for(int i=0;i<n;i++)
		  q.push(i);
	  while(!q.isEmpty())
	  {
		     System.out.println("Enter- 1: to deposit, 0 : to withdraw")  ;
		     int check=sc.nextInt();
		     if(check==1)
		     {
		   	     System.out.println("Deposit Amount?");
		   	     int amount=sc.nextInt();
		   	    balance+=amount; //depositing amount
		   	     q.pop();
		     }
		     else
		     {
		   	  System.out.println("Withdraw Amount?");
	   	     int amount=sc.nextInt();
	   	     if(balance>=amount)
	   	     {
	   	    balance-=amount; 
	   	     }
	   	     else
	   	     {
	   	   	  System.out.println("Insufficient Funds");
	   	     }
	   	     q.pop();  
		     }
	  }
   System.out.print("Bank Balance:"+ balance);
	}

}
