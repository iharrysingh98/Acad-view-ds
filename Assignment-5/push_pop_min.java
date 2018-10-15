import java.util.*;
class node{
  int data;
  node next;
  node(int data)
  {
    this.data=data;
    this.next=null;
  }
}
class stack
{	int min=32767;
	node head;
	int c=0;
	public void push(int data)
	{
		if(data<min)
    {
      min=data;
    }
    node n=new node(data);
		n.next=head;
		head=n;
		c+=1;
	}
	public int pop(){
	if(isEmpty())
	{
    
		System.out.println("stack is empty");
		return -1;
	}
	int d=head.data;
	head=head.next;
	c-=1;
	return d;
	}
	public int top(){
		return head.data;
	}
	public boolean isEmpty(){
		if(head==null)
		{
			return true;
		}
		return false;
	}
	public int getMinimum()
	{
		return min;
	}
  public void print()
  {
    node temp=head;
    while(temp!=null)
    {
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    System.out.println();
  }
}
class push_pop_min 
{  
    
public static void main(String[] args)  
{  
  Scanner o=new Scanner(System.in);
    stack s = new stack();  
    int n=o.nextInt();
    while(n!=-1)
    {
      s.push(n);
      n=o.nextInt();
    }
    s.print();  
    System.out.println("Minimum element is :"+s.getMinimum());  
    s.pop();
    s.print();
    stack s1=new stack();
    while(!s.isEmpty())
    {
      s1.push(s.pop());
    }
      System.out.println("Minimum element is :"+s1.getMinimum());  
} 
}  