
class LL {
     Node head;
  /*--- Inner class --->Node */
        class Node {
        int Data;
        Node next;

        Node(int data) {
            Data = data;
            next = null;
        }
    }

  /*--------- Add  operation in Linked list------------------- */  

    void AddFirst(int data) {
        Node newNode = new Node(data);
      
        newNode.next = head;
        head = newNode;
       

    }

    void AddLast(int data) {
        Node newNode = new Node(data);
        
        Node t = head;
        if (t == null) {
            head = newNode;
        } else {
            while (t.next != null) {
                t = t.next;
            }
            t.next = newNode;
        }
      
    }
    void  AddAfterElement(int ele,int data)
    {
        Node newNode =new Node(data);
    Node t=head;
    while(t.Data!=ele){
        t=t.next;

    }
    newNode.next=t.next;
    t.next=newNode;


    }
    void Add_At_index(int index,int data){
        Node new_node=new Node(data);
        Node prev=null;
        Node currentNode=head;

        if(index==1){
            new_node.next=head;
            head=new_node;
 }
else{
        for(int i=1;i<index;i++){
            prev=currentNode;
            currentNode=currentNode.next;
        }
        new_node.next=currentNode;
        prev.next=new_node;


    }
    }
    /*---------Delete Operation --------------*/
    void DeleteFirst(){
        if(head==null){
            System.out.println("list is empty");
        
        }
        else{
            head=head.next;
        }
    }
    void DeleteLast(){
        if(head==null){
         System.out.println("LISt is Empty");
         
        }
       else if(head.next==null){
            head=null;
    
        }
    else{
        Node fistNode=head;
        Node secondNode=head.next;
        while(secondNode.next!=null){
            secondNode=secondNode.next;
            fistNode=fistNode.next;
        }
        fistNode.next=null;
        secondNode=null;
    }
        
        
    }
   void DeleteElement(int  data){
    if ( head==null){
        System.out.println("List is Empty");
     }
     else if(head.next==null){
        if(head.Data==data){
            head=null;
            return;
        }
        else{
            System.out.println(" data is not present in list");
        }
     }
     else if(head.Data==data){
        head=head.next;
     }
     else {
        Node firstNode=head;
        Node secondNode=head.next;
        while(secondNode.Data!=data){
            secondNode=secondNode.next;
            firstNode=firstNode.next;
            
        }
    
          firstNode.next=secondNode.next;

   
     }
   }
   void Delete_At_index(int index){
if(index==1){
    head=head.next;
}
else{
    Node prev=null;
    Node currentNode=head;
    for(int i=1;i<index;i++){
         prev=currentNode;
         currentNode=currentNode.next;
    }
    prev.next=currentNode.next;
}
   }

   /* Reverse of linked list  */
    void ReverseList(){
        if(head==null|| head.next==null){
            return;
        }
       Node prev=head;
       Node currNode=head.next;
       while(currNode!=null){
       Node nextNode=currNode.next;
        currNode.next=prev;
        //update
        prev=currNode;
        currNode=nextNode;

       }
       head.next=null;
       head=prev;

    }
   /*------Size of linked list----*/
   void  ListSize(){
    Node t = head;
    int i=0;
    while (t != null) {
        t = t.next;
        i++;
    }
    System.out.println(i);
   }

   /* ----------   Display Operation   -------  */
    void Display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.Data +"-->");
            t = t.next;
    
        }
        System.out.println();


    }
    /* Recursion    */
  
}

public  class SinglyLinkedList{
    public static  void main(String[] args){
        LL L1 =new LL();
        L1.AddFirst(8);
        L1.AddFirst(9);
        L1.AddFirst(10);
        L1.AddFirst(11);
        L1.AddFirst(12);
        L1.AddFirst(13);
        L1.Display();

       // L1.Add_At_index(1,11);
       // L1.Delete_At_index(5);
     L1.ReverseList();
        
       L1.Display();
        L1.ListSize();
     
 }
}
