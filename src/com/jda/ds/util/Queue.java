package com.jda.ds.util;

public class Queue <T>{
	private Node<T> front=null,rear=null; 
	

	private class Node<T>
	{
			private T data;
			private Node<T> next;
			public Node(T data) {
				this.data = data;
				this.next = null;
		}
}
	public void push(T value)
	{
		
		Node<T> new_node=new Node<T> (value);
	
		if(front==null)
		{
			new_node.next=null;
			front=new_node;
			rear=new_node;
		}
		else
		{
			rear.next=new_node;
			rear=new_node;
		}
	}

	public void printList()
	{
		Node<T> current=front;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}

	public void pop()
	{
		if(!isEmpty()){
		front=front.next;
		}
	}
	public boolean isEmpty()
	{
		if(front==null)
			return true;
		return false;
	}
	
	public void printCalendar(int day)
	{
		Node<T> current=front;
		while(current!=null)
		{
			if((int)current.data==0)
				     System.out.print(" " );
			else
					System.out.print(current.data+" ");
			if(((int)current.data+day)%7==0)
				   System.out.println();
			current=current.next;
		}
		System.out.println();
	}


}
