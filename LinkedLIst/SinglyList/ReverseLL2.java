package ll;

import java.util.Stack;

public class ReverseLL2  extends  LL{
    static  void reverse(Node head,int ld,int rd) {
        Node current=head;
        Node  prev=null;
        while(current!=null&& current.data!=ld){
            prev=current;
            current=current.next;
        }
        current=current.next;
        Node next=null;
        while(current!=null && current.data!=rd){
            current=current.next;
            next=current.next;
        }
        current.next=null;
     Node newHead= ReverseList(prev.next);
     prev.next=newHead;
     while(newHead.next!=null){
         newHead=newHead.next;
     }
     newHead.next=next;
    }
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


    public static void main(String[] args) {
        LL l=new LL();
        int arr[]={1,2,3,4,5,6,7,8};
       // Stack<Integer> s1=new Stack<>();
        l.AddFast(arr);
       l.Display(l.head);
       reverse(l.head,4,7);
        System.out.println();
       l.Display(l.head);


    }
}
