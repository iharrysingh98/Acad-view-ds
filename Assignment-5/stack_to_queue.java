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
{	
	node head;
	int c=0;
	public void push(int data)
	{
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
	public int size()
	{
		return c;
	}
  public void print()
  {
    node temp=head;
    while(temp!=null)
    {
      System.out.print(" "+temp.data);
      temp=temp.next;
    }
    System.out.println();
  }
}
class stack_to_queue {
  public static void main(String[] args) {
    int n;
    stack s=new stack();
    Scanner o=new Scanner(System.in);
    System.out.println("enter the elements of queue or -1");
    n=o.nextInt();
    while(n!=-1)
    {
      s.push(n);
      n=o.nextInt();
    }
    
    
    stack s1=new stack();
    while(!s.isEmpty())
    {
      s1.push(s.pop());
    }
    s1.print();
    s1.pop();
    System.out.println("deletion of element in queue");
    s1.print();
    System.out.println("first element of queue is "+s1.top());
  }
}