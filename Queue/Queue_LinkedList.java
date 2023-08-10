public class Queue_LinkedList {
    class Node {
     private    int data;
     private    Node next;
        Node(int data){
            this.data=data;
            System.out.println(" insert value: "+this.data);
            this.next=null;
        }
    }
    Node left;
    Node right; 
     void push(int data){
        Node n=new Node(data);
        if(left==null&& right==null){
            left=n;
            right=n;
             
        }
        else{
            right.next=n;
            right=n;
        }
         System.out.println("n  Address :  "+ n +"  left: "+ left+" right :"+  right);
     }
     void Dequeue(){
         if(left==null &&right==null){
             System.out.println("empty");
         }
         else if (left==right) {
             left=null;
             right=null;

         } else{
             left=left.next;
         }
     }
     void  Display(){

        if(left==null&&right==null){
            System.out.println("Queue is Empty");
            return;
        }
        else {
            Node temp=left;
            while (temp != right) {
                // System.out.println(temp);
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            //   System.out.println(temp);
            System.out.println(temp.data);
        }
     }
    public static void main(String[] args) {
        Queue_LinkedList q=new Queue_LinkedList();
        q.push(12);
        q.push(13);
        q.push(14);
        //q.push(15);
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
        q.Dequeue();
       q.Display();
    
        
    }
}
