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
class palindrome {
  public Node rev(Node head)
  {
    Node prev=null;
    Node ne=null;
    Node curr=head;
    while(curr!=null)
    {
      ne=curr.next;
      curr.next=prev;
      prev=curr;
      curr=ne;
    }
    return prev;
  }
public boolean pali(Node head)
{
int c=0,i,j,p;
Node slow=head;
Node fast=head.next;
while(fast!=null&&fast.next!=null)
{
  slow=slow.next;
  fast=fast.next.next;
}
Node head1=slow.next;
Main m=new Main();
head1=m.rev(head1);
while(head1!=null)
{
  if(head.data!=head1.data)
  {
    return false;
  }
  head=head.next;
  head1=head1.next;
}
return true;
  
}
  
  public static void main(String[] args) {
    palindrome m=new palindrome();
    int data,i;
    Scanner o=new Scanner(System.in);
    Node head=null;
    System.out.println("enter elements of linked list or -1 to exit to check palindrome");
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
    
    
    //m.insatmid(head);

System.out.println(m.pali(head));    
//m.display(head);

  }
}