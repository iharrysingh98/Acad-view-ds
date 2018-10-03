import java.util.*;
class Node
{
  int data;
  Node next;
  Node(int data)
  {
    this.data=data;
    this.next=null;
  }
}
class duplicate {
public Node eli_dup(Node head)
{int c=0,i,j,p;
Node temp=head;
while(temp!=null)
{
  c++;
  temp=temp.next;
}
Node temp1=head;
temp=head;
while(temp1!=null)
{
    if(temp.data==temp1.data)
    {
      temp1=temp1.next;
    }
    else
    {
      temp.next=temp1;
      temp=temp1;
      temp1=temp1.next;
    }

  
}
  temp.next=null;
  return head;
  
}
  public void display(Node head)
  {
    while(head!=null)
    {
      System.out.println(head.data);
      head=head.next;
    }
  }
  public static void main(String[] args) {
    duplicate m=new duplicate();
    int data,i;
    Scanner o=new Scanner(System.in);
    Node head=null;
    System.out.println("Enter sorted elements of linked list or -1 to exit");
    data=o.nextInt();
    while(data!=-1)
    {
    Node n=new Node(data);
    if(head==null)
    {
      head=n;
    }
    else
    {
      Node p=head;
      while(p.next!=null)
      {
        p=p.next;
      }
      p.next=n;
    }
    data=o.nextInt();
    }
    head=m.eli_dup(head);
    
    //m.insatmid(head);

System.out.println("elements of linked list");    
m.display(head);

  }
}