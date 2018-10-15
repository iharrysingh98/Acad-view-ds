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
  public int dequeue(){
      int p;
      if (isEmpty())
      {
        System.out.println("you are mad");
        return -1;
      }
      else {
        p=head.data;
        head=head.next;
      }
      c--;
      return p;
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
    public int top(){
      return head.data;
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
class queue_to_stack  
{  
    queue q1 = new queue(); 
    queue q2 = new queue();  
    static int curr_size;  
  
    queue_to_stack()  
    {  
        curr_size = 0;  
    }  
  
    void push(int x)  
    {  
        curr_size++;  
        q2.enqueue(x);  
  
        while (!q1.isEmpty())  
        {  
            q2.enqueue(q1.top());  
            q1.dequeue();  
        }  
  
        queue q = q1;  
        q1 = q2;  
        q2 = q;  
    }  
  
      void pop(){  
  
      if (q1.isEmpty())  
            return ;  
        q1.dequeue();  
        curr_size--;  
    }  
  
    int top()  
    {  
        if (q1.isEmpty())  
            return -1;  
        return q1.top();  
    }  
  
int size()  
    {  
        return curr_size;  
    }  
  
  
public static void main(String[] args)  
{  
    queue_to_stack s = new queue_to_stack();  
    s.push(1);  
    s.push(2);  
    s.push(3);  
  
    System.out.println("current size: " + s.size());  
    System.out.println(s.top());  
    s.pop();  
    System.out.println(s.top());  
    s.pop();  
    System.out.println(s.top());  
} 
}  