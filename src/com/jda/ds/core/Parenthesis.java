package com.jda.ds.core;

import java.util.Scanner;

import com.jda.ds.util.Stack;

public class Parenthesis {
		public static void main(String[] args) {
			Stack st=new Stack();
			System.out.println("Expression?");
			Scanner sc = new Scanner(System.in);
			String exp= sc.nextLine();
			char[] charArr=exp.toCharArray();
			char ch;
			for(int i=0;i<charArr.length;i++)
			{
				if(charArr[i]=='(' || charArr[i]=='{' || charArr[i]=='[')
				    st.push(charArr[i]);
				else if(!st.isEmpty() && ((charArr[i]==')' && st.Peek()=='(') || (charArr[i]=='}' && st.Peek()=='{') || (charArr[i]==']' && st.Peek()=='[' )))
					 ch = st.pop();
				else
					st.push(charArr[i]);
			}
			if(st.isEmpty())
				System.out.println("Paranthesis are Balanced");
			else
				System.out.println("Paranthesis are not Balanced");
		}
	

}
