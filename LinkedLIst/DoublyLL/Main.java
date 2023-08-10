package doublyLL;
class DL{
     class Node{
         Node prev;
         int data;
         Node next;
         Node(int data){
             prev=null;
             this.data=data;
             next=null;
         }
     }
         Node head=null;
         Node tail=null;
         void AddFirst(int data){
             Node new_node=new Node(data);
             if(head==null)
             {head=new_node;
                 tail=new_node;
             }
             else{
            new_node.next=head;
            head.prev=new_node;
            head=new_node;
             }
         }
         void AddLast(int data) {
             Node new_node = new Node(data);
             if (head == null && tail == null) {
                 head = new_node;
                 tail = new_node;
             } else {
                 new_node.prev = tail;
                 tail.next = new_node;
                 tail = new_node;
             }
         }void Add_At_After(int ele,int data){
             Node n=new Node(data);
             Node temp=head;
             while(temp.data!=ele){
                 temp=temp.next;
             }
             n.prev=temp;
             n.next=temp.next;
             temp.next=n;
     }
         void Display(){
             Node temp=head;
             Node temp1=tail;
            // System.out.println(temp);
             while(temp!=null){

                // System.out.print( temp.prev+" "+temp.data +" "+temp.next+"\n");
                 System.out.print(temp.data+" ");
                 temp=temp.next;
             }
             System.out.println('\t');
            // System.out.println(temp1);
             while (temp1!=null){
                // System.out.print(temp1.next+" "+temp1.data+" "+temp1.prev+"\n");
                 System.out.print(temp1.data+" ");
                 temp1=temp1.prev;
             }

         }

 }
public class doublyLL {
    public static void main(String[] args) {
        DL l=new DL();
        //l.AddFirst(10);
       //l.AddFirst(11);
        l.AddLast(13);
        l.AddLast(14);
        l.AddLast(15);
        l.AddLast(16);
         l.Display();

    }
}
