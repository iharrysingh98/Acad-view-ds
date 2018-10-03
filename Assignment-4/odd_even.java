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
class odd_even {
  public void merge(Node head,Node head1)
  {
    while(head.next!=null)
    {
      head=head.next;
    }
    head.next=head1;
  }
  public Node add(Node head,int data)
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
    return head;
    
    
  }
  public void display(Node head)
  {
    while(head!=null)
    {
      System.out.print(head.data+" ");
      head=head.next;
    }
  }
   public static void main(String[] args) {
    odd_even m=new odd_even();
    int data,i;
    Scanner o=new Scanner(System.in);
    Node head=null;
    Node head1=null;
    System.out.println("Enter elements of linked list or -1 to exit");
    data=o.nextInt();
    while(data!=-1)
    {
      if (data%2==0)
      {
        head=m.add(head,data);
      }
      else
      head1=m.add(head1,data);
    data=o.nextInt();
    }
    m.merge(head,head1);
    m.display(head);    
  }
}