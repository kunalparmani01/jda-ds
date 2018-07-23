package com.jda.ds.core;

import java.util.Scanner;

public class BinaryTree {
	
	public static long catalanlist(int n)
   {
  	 long [] arr=new long[n+1];
  	 arr[0]=1;
  	 arr[1]=1;
  	 for(int i=2;i<=n;i++)
  	 {
  		 arr[i]=0;
  		 for(int j=0;j<i;j++)
  		 {
  			 arr[i]+=arr[j]*arr[i-j-1];
  		 }
  	 }
  	 return arr[n];
   }
	public static void main(String[] args) {
		System.out.println("Enter N:");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		long catalannumber=catalanlist(n);
    System.out.println("Number of binary search tree with N nodes = " +catalannumber);
	}

}
