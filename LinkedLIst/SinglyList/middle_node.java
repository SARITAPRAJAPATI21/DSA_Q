package ll ;
public class middle_node extends LL {
  static   Node middle_node(Node head) {
        Node fast=head;
        Node slow=head;
        while (fast.next != null && fast.next.next!=null  )
        {  fast=fast.next.next;
            slow=slow.next;
        }
      return (fast.next != null )?slow=slow.next:slow;

      /*  if(fast.next != null )
        System.out.println("\nmiddle node  "+slow.next.data);
        else
            System.out.println("\nmiddle node  "+slow.data);*/
    }
    public static void main(String[] args) {
        LL l=new LL();
        int arr[]={1,2,3,4,5};
        l.AddFast(arr);
        l.Display(l.head);
        System.out.println("\n Middle root  ");
        l.Display( middle_node(l.head));

    }
}
