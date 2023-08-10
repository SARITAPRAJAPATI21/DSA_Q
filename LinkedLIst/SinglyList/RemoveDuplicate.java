package ll;
public class RemoveDuplicate extends LL{
    static  void Remove(Node head){
        Node current=head;

        while(current!=null&& current.next!=null) {
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next ;
            }
        }

    }

    public static void main(String[] args) {
        LL n=new LL();
        n.AddLast(1);

        n.AddLast(2);
       n.AddLast(3);
        n.AddLast(3);
        n.AddLast(7);

        System.out.println(n.head);
        Remove(n.head);
        n.Display(n.head);

    }
}
