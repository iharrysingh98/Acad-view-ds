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
class reverse {
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
  public void display(Node head)
  {
    while(head!=null)
    {
      System.out.println(head.data);
      head=head.next;
    }
  }
   public static void main(String[] args) {
    reverse m=new reverse();
    int data,i;
    Scanner o=new Scanner(System.in);
    Node head=null;
    System.out.println("enter elements of linked list or -1 to exit");
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
    head=m.rev(head);
    m.display(head);    
  }
}