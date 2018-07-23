package com.jda.ds.util;

class Node<T>
{
	T data;
	Node<T> next;
}
public class LinkedList<T>
{
	Node<T> head; 
	Node<T> last;
	public void add(T value)
	{
		Node<T> new_node=new Node<T> ();
		new_node.data=value;
		if(head==null)
		{
			new_node.next=null;
			head=new_node;
			last=head;
		}
		else
		{
		Node<T> ptr=head;
		while(ptr.next!=null)
			ptr=ptr.next;
		ptr.next=new_node;
		}
			}
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

	public boolean contains(T item)
	{
		Node<T> temp=head;
		System.out.println(temp.data);
		System.out.println(item);
		while(temp!=null)
		{
			if(temp.data.equals(item))
				return true;	
				temp=temp.next;
		}
		return false;
	}

	public void remove(T item)
	{
		Node<T> temp=head;
		Node<T> pre=null;
		while(temp!=null)
		{
			if(temp.data.equals(item))
			{
				pre.next=temp.next;
			}
			pre=temp;
			 temp=temp.next;
		}
	}

	public void  Ascendingaddition(T item)
	{
		Node<T> new_node=new Node<T> ();
		new_node.data=item;
		if(head==null)
		{
			new_node.next=null;
			head=new_node;
		}
		else if((int)head.data>(int)item) 
		{
			new_node.next=head;
			head=new_node;
		}
		else
		{
		Node<T> ptr=head;
		Node<T> pre=head,nxt=null;
		while(ptr!=null && (int)ptr.data<(int)item)
		{
			pre=ptr;
			ptr=ptr.next;
		}
		nxt=pre.next;
		pre.next=new_node;
		new_node.next=nxt;
	}
	}
}