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
class sort {
  public Node sort(Node a,Node b){
{ 
  Main m=new Main();
  Node result = null; 
  

if (a == null) 
    return(b); 
else if (b==null) 
    return(a); 
  

if (a.data <= b.data) 
{ 
    result = a; 
    result.next = sort(a.next, b); 
} 
else
{ 
    result = b; 
    result.next = sort(a, b.next); 
} 
return(result); 
} 
  
     }
  public Node add(Node head)
  {
    Scanner o=new Scanner(System.in);
    System.out.println("Enter elements of linked list or -1 to exit");
    int data=o.nextInt();
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
    sort m=new sort();
    int data,i;
    Scanner o=new Scanner(System.in);
    Node head=null;
    Node head1=null;
    head=m.add(head);
    head1=m.add(head1);
    Node temp=head;
    
System.out.println("Elements of linked list after merging");    
m.sort(head,head1);
m.display(head);

  }
}