
// Java program to implement a  linear queue using an array
class Queue {
    private static int front, rear, capacity;
    private static int queue[];
// constructor
    Queue(int c)
    {
        front = rear = -1;
        capacity = c;
        queue = new int[capacity];

    }
    /*-------------insert function-----------------------------------*/
    static   void queueEnqueue(int data){
        if(rear==capacity-1){
            System.out.println("Queue is Full");
        }
        else {
            if(front==-1&&rear==-1){
              front++;
             }
             rear++;
            queue[rear]=data;
           // System.out.println(" Insert value :"+queue[rear]+"  front -->"+front+" rear-->"+rear);
        }
    }
    /*-----------------------Display method----------------------*/
    static void queueDisplay(){
        if(front==-1&&rear==-1){
            System.out.println("Queue is empty");
            return;
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i]);
            }
        }
    }
    /*  --------------------- Delete Function-----------------------*/
    static void queueDequeue(){
        if(front==-1&&rear==-1){
            System.out.println("Element is not present in for Deletion operation");
        }
        else {
            if (front==0&&rear==0){
            front=front-1;
            rear=rear-1;
            //System.out.println("one ele delete "+ " front-->"+front+  "rear-->"+rear);
            }
            else {
               // System.out.println("shift operation");
              for(int i=0;i<rear;i++){
                  queue[i]=queue[i+1];
              }
              rear=rear-1;
               // System.out.println("rear  "+rear);
            }

        }
    }
    /*--------------------------- peek element --------------------*/
    static void FrontQueue(){
       if(front==-1&&rear==-1){
            System.out.println("No elements present in queue");
            return;
        }
        if(front==-1){
            System.out.println("No elements present in queue");
            return;
        }
        System.out.println ( "Front element in queue  -->"+queue[front]);
    }

}

public class Queue_Array {

    // Driver code
    public static void main(String[] args)
    {  /*  Queue q=new Queue(4);
        // insertion operation
        q.queueEnqueue(13);
        q.queueEnqueue(12);
        q.queueEnqueue(11);
        q.queueEnqueue(17);


        //Display
        q.Displayqueue();


      o  //delete operation
        q.queueEnqueue(15);
        q.queueDequeue();
        q.Displayqueue();
       q.queueDequeue();
        q.Displayqueue();
        q.queueDequeue();
        q.Displayqueue();

        //front element
        q.FrontQueue();
       q.queueDequeue();
        q.Displayqueue();
        q.FrontQueue();
        q.queueDequeue();
        */


    }
}
