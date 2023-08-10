import java.util.Stack;
 class MyQueue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        
        void add(int x){
           s1.push(x);
           

        }
        int  remove(){
            int size=s1.size();
            System.out.println("s1 "+ s1);
            //s1->s2
               while(size>1){
                s2.push(s1.pop());
                size--;

            }
             int value= s1.pop();
            //s2->s1
            size=s2.size();
            while(size>0){
                s1.push(s2.pop());
                size--;
            }
            System.out.println(" After remove "+ s1);
            return value;

        }
        int peek(){
            int size=s1.size();
            System.out.println("s1 "+ s1);
            //s1->s2
               while(size>1){
                s2.push(s1.pop());
                size--;

            }
             int value= s1.peek();
            //s2->s1
            size=s2.size();
            while(size>0){
                s1.push(s2.pop());
                size--;
            }
          return value;
           
        }
        boolean isEmpty(){
           return s1.empty();
        }


 }
public class QueueusingStack{
    public static void main(String[] args) {
        MyQueue m=new MyQueue();
        m.add(1);
        m.add(2);
        m.add(3);
        System.out.println("Peek value:"+ m.peek());//1
        m.remove();

      

        
        
      


        
    }
}