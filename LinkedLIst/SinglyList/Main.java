package ll;

class LL{
    class Node{
        int data;
        Node next;
         Node(int d){ this.data=d; }
        }
   Node head;
  void AddLast(int data){
    Node n=new Node(data);
    if(head==null)head=n;

    else{ 
         Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=n;
    }
}

  void  AddFast(int arr[]){
      for(int i=0;i<arr.length;i++){
          AddLast(arr[i]);
      }
  }
  void Display(Node temp){
    if(temp==null) return;
    System.out.print(temp.data+"  ");
     Display(temp.next);

  }

}

public class Main {
    public static void main(String[] args) {
        // make 1st linked  list
        int arr[]={1,2,3,4,5};
        int arr1[]={6,7,8,9,10};
         LL m=new LL();
      m.AddFast(arr);
       // System.out.println(m.head);
         m.Display(m.head);
         // make 2nd linked list
         System.out.println();
         LL n=new LL();
        n.AddFast(arr1);
         // System.out.println(n.head);
          n.Display(n.head);
          System.out.println("\n Hello world!");
    }


}