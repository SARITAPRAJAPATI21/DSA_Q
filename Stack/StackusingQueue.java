
import java.util.LinkedList;
import java.util.Queue;

class MyStack{
    Queue<Integer> q;

    MyStack(){
        q=new LinkedList<>();

    }
    void push(int x){
    q.add(x);
    System.out.println(q);
    int size=q.size();
    while(size>1){
        q.add(q.remove());
        size--;
    }
    System.out.println(" Shift");
    System.out.println(q+ " "+q.peek());
 }
    int pop(){
        return q.remove();

    }
    int top(){
        return q.peek();

    }
    boolean isEmpty(){
        return q.isEmpty();

    }
    void print(){
    if(q.isEmpty())return ;
    
    for(int i: q){
        System.out.print(i+" ");

    }
    
     System.out.println();
    }
}

public class StackusingQueue{
     static class Stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();

        void push(int val){
            q1.add(val);
        
       }
       void pop(){
           if(q1.isEmpty())
            return;
     // shift q1-->q2
       while(q1.size()-1>0){
        q2.add(q1.peek());
        q1.remove();
         }

         q1.remove();

         //shift q2-->q1
         while(q2.size()>0){
            q1.add(q2.peek());
            q2.remove();
         }
         System.out.println();

     }
     int top(){
        if(q1.isEmpty())
        return -1;
     
     int topvalue=0;
     for(int i: q1){
        topvalue=i;
       }  
       return topvalue;
      
     }
     void print(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for(int i: q1){
            System.out.print(i+" ");

        }
     }
    }

    public static void main(String[] args) {
       /* Queue<Integer> q=new LinkedList<>();
        q.add(12);
        q.add(13);
        System.out.println(q); */
        Stack s=new Stack();
      /*  s.push(11);
        s.push(12);
        s.push(13);
        s.pop();
        s.pop();
    
        s.print();
        System.out.println();
        System.out.println(s.top());*/ 
        MyStack m=new MyStack();
        m.push(11);

        m.push(12);

         m.push(13);
        
     
       
       
       
        
        
        
    }
}
