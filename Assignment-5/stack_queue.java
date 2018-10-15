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
class queue {
  node head=null;
  node tail=null;
  int c=0;
  public void enqueue(int data){
    node n=new node(data);
    if(head==null)
    {
      head=n;
      tail=n;
      c++;
    }
    else
    {
      tail.next=n;
      tail=n;
      c++;
    }
  }
  public void dequeue(){
      if (isEmpty())
      {
        System.out.println("you are mad");
        return;
      }
      if(head == tail) {
        head = null;
        tail = null;
      } else {
        head=head.next;
      }
      c--;
    }
  public void size(){
      System.out.println(c);
    }
    public boolean isEmpty(){
      if(head==null)
      return true;
      else
      return false;
    }
    public void print(){
      node temp=head;
      while(temp!=null)
      {
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      System.out.println();
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
}
class stack_queue{
  public static void main(String[] args) {
    int data;
    queue m=new queue();
    Scanner o=new Scanner(System.in);
    System.out.println("enter elements for queue");
    data=o.nextInt();
    while(data!=-1)
    {
      m.enqueue(data);
      data=o.nextInt();
    }
    m.print();
    m.dequeue();
    m.print();
    m.size();
    System.out.println("enter elements for stack");
stack s=new stack();
	data=o.nextInt();
    while(data!=-1)
    {
      s.push(data);
      data=o.nextInt();
    }
    
 	System.out.println("size "+s.size());
	System.out.println("top "+s.top());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop()); 
  }
}