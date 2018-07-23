package com.jda.ds.util;

public class Stack {

	int size;
   int top= -1;
   public Stack(int size) {
   	
	}
   public Stack() {
	}
   char stk[] = new char[100]; 
   public void push(char item)
	{
		
		stk[++top]=item;
		return;
	}
  public char pop()
	{
		char item=stk[top--];
		return item;
		
	}
   public boolean isEmpty()
   {
  	 	return top<0;
   }
   public int size()
   {
   		return stk.length;
   }
	public char Peek() {
		return stk[top];
		
	}
}
