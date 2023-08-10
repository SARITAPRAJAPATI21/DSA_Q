package  ll;
public class RemoveEle203 extends LL {
    static  void remove(Node head,int val){
        while(head!=null && head.data==val){
            head=head.next;
        }
        Node current_node=head;
        while(current_node!=null && current_node.next!=null){
            if(current_node.next.data==val){
                current_node.next=current_node.next.next;
            }
            else{
                current_node=current_node.next;
            }
        }


    }

    public static void main(String[] args) {
        int arr[]={1,2,6,3,4,5,6};
        LL r=new LL();
       r.AddFast(arr);
        System.out.println(" Before Deletion  List ele");
       r.Display(r.head);
        remove(r.head, 6);
        System.out.println("\n After delete ele in list");
        r.Display(r.head);

    }

}
