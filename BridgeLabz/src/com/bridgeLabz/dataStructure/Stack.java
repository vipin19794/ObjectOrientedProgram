package com.bridgeLabz.dataStructure;

public class Stack<T extends Comparable<T>>
{
    Node head ;
    public  Stack() 
    {
	   head = null;
    }

/**
 *@purpose adds a new item to the top of the stack
 * @param item it needs a item
 * @return it returns nothing 
 */
public void push(T item) 
{
	Node n =new Node(item);
	n.next =head;
	head = n;
}
/**
 * @purpose removes the top item from the stack 
 * @param  it needs nothing 
 * @return returns the top item
 */
@SuppressWarnings("unchecked")
public T pop() 
{
	T data = null;
	if(head == null) 
	{
		System.out.println("stack is empty");
		return null;
	}
	else 
	{
		data = (T) head.data;
		head = head.next;
		
	}
	return data;
}
	
/**
 * @purpose returns top item from stack but does not remove it.
 * @param it needs nothing 
 * @return it return top item from stack
 */
	
@SuppressWarnings("unchecked")
public  T peek() 
{
	T data =  null;
	if( head  ==  null) 
	{
		System.out.println(" stack is empty");
		return null;
	}
	else 
	{
		data = (T) head.data;
		
	}
	return data;
}

/**
 * @purpose tests to see wheather the stack is empty or not
 * @param it needs nothing 
 * @return it returns boolean value 
 */
public boolean isEmpty() 
{
return head==null?true:false;
}

/**
 * @purpose checks the size of the stack 
 * @param  it needs nothing
 * @return it returns INTEGER to  show size
 */
public int size() 
{
	Node t = head;
	int count= 0 ;
	while(t.next!=null) 
	{
		count++;
		t = t.next;
	}
	return count; 
}

public void disp() 
{
	Node t = head;
	int count = 0  ; 
	while(t!=null) {
		if(count%2 == 0 )
		{
			System.out.println();
		}
		System.out.print(t.data+" ");
		t = t.next;
		count++;
	}
}

}