package com.jda.ds.util;

public class StackLink<T> {
	
	private class Node<T>
	{
		private T data;
		private Node<T> next;

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	//head of the list
	private Node<T> head; 
	
	/**
	 * This method for insert data into LinkedList algo.
	 * @param value Generic value
	 */
	public void push(T value)
	{
		/**
		 * allocates memory for node and put value in data part of node
		 */
		Node<T> new_node=new Node<T> (value);
		/**
		 * if head is null then make the new node as head.
		 */
		if(head==null)
		{
			new_node.next=null;
			head=new_node;
		}
		else
		{
			new_node.next=head;
			head=new_node;
		}
	}
	/**
	 * prints the list
	 */
	public void printList()
	{
		Node<T> current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	/**
	 * pop element from list
	 * @param item
	 */
	public void pop()
	{
		if(head!=null)
		head=head.next;
	}
	public T getTop()
	{
		if(head==null)
			return null;
		return head.data;
	}
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		return false;
	}
	public void printCalendar(int day)
	{
		Node<T> current=head;
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
