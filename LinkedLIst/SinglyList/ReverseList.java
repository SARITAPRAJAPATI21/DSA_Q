package ll;

import java.util.Stack;

public class ReverseList  extends LL{
   static Node  ReverseList(Node head  ){
      Node  prev=null;
      Node  next=null;
      Node  curr=head;
      while(curr!=null){
     next=curr.next;
     curr.next=prev;
     prev=curr;
     curr=next;
      }
     head=prev;// new head is created
       return head;
   }
   static  void ReverseData(Node head){
       Node temp=head;
       Stack<Integer> s=new Stack<>();
       while(temp!=null){
           s.push(temp.data);//push procedure
           temp=temp.next;
       }
       temp=head;
       while(temp!=null){
          temp.data=s.pop();
           temp=temp.next;
       }}


   public static void main(String[] args) {
      int arr[]={1,2,3,4,5};
      LL m=new LL();
      m.AddFast(arr);
      m.Display(m.head);
      //System.out.println("\nReverse List is :");// m.Display( ReverseList(m.head));
      ReverseData(m.head);
      System.out.println();
     m.Display(m.head);
   }
    
}
