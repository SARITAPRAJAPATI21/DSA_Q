import java.util.PriorityQueue;

public class ktthlargest{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int arr[]={3,2,1,5,6,4};
        int k=2;
         for(int i=0;i<k;i++){
            pq.add(arr[i]);
         }
         for(int i=k;i<arr.length;i++){
            if(pq.peek()<arr[i])
            {
                pq.remove();
                pq.add(arr[i]);
            }
         }
         System.out.println(pq.peek());//min Heap

         
    }
}