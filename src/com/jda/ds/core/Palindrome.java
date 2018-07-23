package com.jda.ds.core;

import java.util.Scanner;

import com.jda.ds.util.Dequeue;

public class Palindrome {
	
	public static void main(String[] args)
	{
		System.out.println("Enter size of the array:");
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		Dequeue  dq= new Dequeue(size);
		System.out.println("Enter elements of the array:");
		for(int i=0;i<size;i++)
		{
			int input=sc.nextInt();
			dq.addRear(input);
		}
		int f=0;
		while(!dq.isEmpty())
		{
			if(dq.getFront()==dq.getRear())
			{
				dq.removeFront();
				if(!dq.isEmpty())
					dq.removeRear();
			}
			else{
				f=1;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
