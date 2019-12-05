package com.bridgeLabz.dataStructure;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
//import java.util.NoSuchElementException;
//import java.util.Stack;

public class LinkedList<T>
{
	/*
	 * this class create node type class
	 * Node type class have two variable,T type data And Node next 
	 * this class java generic class
	 */
	public class Node<T>
	{
		
	    T data;
		Node next;
		Node(T data)
		{
			this.data=data;
		}
	}
	Node head;
	Node next;
	int size;


	/*
	 * this public function add the node in list
	 * @param data
	 * @return void
	 */
 public void add(T data) 
 {
	 Node n =new Node(data);
	 n.next=null;
	 if(head==null) {
		 head=n;
		 
	 }
	 else
	 {
		 Node<T> t=head;
		 while(t.next!=null)
		 {
			 t=t.next;
		 }
		 t.next=n;
		 
	 }
 }
 
 /*
	 * this public method add the node in start in list 
	 * @param data
	 * @return void
 */
 public void addatstart(T data)
 {
	 Node n=new Node(data);
	 n.next=null;
	 n.next=head;
	 head=n;
 }
 
 /*
	 * this public method add node in list At position.like (3,45)..3 is the postion and 45 is data.
	 * @param data, index
	 * @return void 
	 */
 public void addAt(T data,int index)
 {
	 Node n=new Node(data);
	 n.data=data;
	 n.next=null;
	 Node prev=null;
	 Node next=head;
	 if(index==0)
	 {
		 addatstart(data);
	 }
	 else
	 {
	
		 for(int i=0;i<index;i++)
		 {
			 prev=next;
			 next=next.next;
		 }
		 prev.next=n;
		 n.next=next;
		 
	 }
 }
 
 /*
	 * this public method remove node from list .
	 * @param find
	 * @return void 
	 */
  public <T extends Comparable <T>>void remove(T find)
  {
	  Node <T> current=head;
	  Node <T> previous=head;
	  Node<T> next=head;
	  if(current.data.compareTo(find)==0)
	  head=head.next;
	  else {
		while(current.next!=null)
		   {
	          if(current.data.compareTo(find)==0)
	          {
	        	  previous.next=next;
	        	  break;
	          }
	  
	          else if(current.next==null && ((next.data).compareTo(find))==0)
	          {
	        	  current.next=null;
	          }
	          previous=current;
	          current=next;
	          next=next.next;
	          }  
  }
	  }
  
  
  /*
	 * this public method show node from list .
	 * @param 
	 * @return void 
	 */
  public void show()
  {
	  Node<T> t=head;
	  while(t!=null)
	  {
		  System.out.println(t.data+" ");
		  t=t.next;
	  }
	
	  
  }
  public int size()
  {
	  int size=0;
	  Node temp = head;
	  while(temp!=null) {
		 size++;
		 temp=temp.next;
	  }
	  
	  return size;
  }
  
  /*
	 * this method use for store the data to file .
	 * @param 
	 * @return void 
	 */
  public void toFile() throws Exception
  {
  Node t=head;
  String str="",f_name;
  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter the new file name to store processed list");
  f_name=bf.readLine();
  FileOutputStream file=new FileOutputStream(f_name);
  DataOutputStream dis=new DataOutputStream(file);
  while(t!=null)
  {
  str=str+t.data+",";
  t=t.next;
  }
  dis.writeUTF(str);
  dis.close();
  }
  
  @Override
  public String toString()
  {
	  StringBuffer s=new StringBuffer();
	  Node t=head;
	  while(t!=null)
	  {
		  s.append(t.data);
		  t=t.next;
	  }
	  return s.toString();
	  
  }
  public <T extends Comparable<T>>boolean search(T s[],T find)
  {
	  for(int i=0;i<s.length;i++)
	  {
		  if(s[i].equals(find))
		  {
			  return true;
	  }
	  }
	  return false;
  }
  
  /**
   Ordered list..
   */
  
  /*
	 * this public method store the node in list orderlly .
	 * @param data
	 * @return void 
	 */
  public <T extends Comparable<T>>int orderIndex(T data)
  {
	  Node<T> temp=head;
	  for(int i=0;temp!=null;i++)
	  {
		  if(temp.data.compareTo(data)<0)
		  {
			  temp=temp.next;
		  }
		  	else
		  	{
		  		return i;
		  	}

	  }
  return 0;
  }
 
 public static  boolean isBalanced(String st,LinkedList k) throws Exception
	{
	   char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='{' ||ch[i]=='(' ||ch[i]=='[')	
			{
				k.add(" ");
			}
			else if(ch[i]=='}' ||ch[i]==')' ||ch[i]==']')
			{
			     k.pop();
			}
		}System.out.println(k.isEmpty());
           return k.isEmpty();
}
public boolean isEmpty()
{
	if(head==null)
	return true;
	return false;
}
public void pop()
{
	Node cur=head;
	Node prev=head;
	while(cur.next!=null)
	{
		prev=cur;
		cur=cur.next;
	}
	prev.next=null;
	if(prev==cur)
	head=null;
}

public void queue(T data)
{
	
	Node n =new Node(data);
	 n.next=null;
	 if(head==null)
	 {
		 head=n;
		 
	 }
	 else
	 {
		 Node t=head;
		 while(t.next!=null)
		 {
			 t=t.next;
		 }
		 t.next=n;
		 
	 }
}

public T dequeue()
{
		Node <T> t=head;
		T value=t.data;
		head=head.next;
		return value;
}

public T get(int index) 
{
	Node temp =head;
	Node prev = null;
	T data = null;
    for(int i = 0 ; i<=index;i++) 
    {
	  prev = temp;
	  temp = temp.next;
    }
    return (T) prev.data;
}

}
