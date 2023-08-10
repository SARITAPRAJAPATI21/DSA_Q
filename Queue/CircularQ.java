
class circularQueue{
    private static int front, rear, capacity;
    private static int queue[];
    circularQueue(int c)
    {
        front = rear = -1;
        capacity = c;
        queue = new int[capacity];

    }
    public static boolean isEmpty(){
        return front==-1&&rear==-1;
    }
    public  static boolean isFull(){
     return front==0&&rear==capacity-1;
    }
    static  void Enqueue(int data){
        if(isFull()){
            System.out.println("Overflow--->Queue is Full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)% capacity;
        queue[rear]=data;
        System.out.println("insert value : "+queue[rear]+" Front->"+front+" rear->"+rear);
    }

    static  void Dequeue(){
        System.out.println("Delete operation");
        if(isEmpty()){
            System.out.println("Empty");
        }// 1==1 ||3==3
       else if(front==rear)// one element in queue
        {
            front=rear=-1;
            System.out.println("Front--> "+front+" rear-->  "+rear);
        }
        else {
            front = (front + 1) % capacity;
            System.out.println(" Front value  : " + queue[front] + " Front -> " + front + " rear--> " + rear);
        }
    }
    static void Display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+"<--");
        }
        System.out.println();
    }
}



public class CircularQ {
    public static void main(String[] args) {
        circularQueue cq=new circularQueue(4);
        // Insertion
        cq.Enqueue(1);
        cq.Enqueue(2);
        cq.Enqueue(3);
        cq.Enqueue(4);
        cq.Enqueue(5);

        cq.Dequeue();
        cq.Dequeue();
        cq.Dequeue();
        cq.Dequeue();

        //Deletion
       /* this is one condition here 1 ele id insert and then deleted */
        cq.Enqueue(6);

        cq.Dequeue();



    }
}
