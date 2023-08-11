public class HeapSort {
    public static void maxHeapify(int arr[],int n,int i){
        int largest=i;
        int l=2*i;
        int r=2*i +1;
        if(l<=n && arr[l]>arr[largest])  largest=l;
        
        if(r<=n && arr[r]>arr[largest])   largest=r;
        
       if(largest !=i){
        int temp=arr[largest];
        arr[largest]=arr[i];
        arr[i]=temp;
        maxHeapify(arr, n, largest);
       }

    }
     public static void minHeapify(int arr[],int n,int i){
        int smallest=i;
        int l=2*i;
        int r=2*i +1;
        if(l<=n && arr[l]<arr[smallest])  smallest=l;
        
        if(r<=n && arr[r]<arr[smallest])   smallest=r;
        
       if(smallest !=i){
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
        minHeapify(arr, n, smallest);
       }

    }
    static void buildHeap(int arr[],int n){

        System.out.println("\nMinHeap Process  ");
        for(int i=n/2-1;i>=0;i--)   minHeapify(arr, n, i);

     printArray(arr);
         
         System.out.println("\nMaxHeap Process");
            for(int i=n/2-1;i>=0;i--)   maxHeapify(arr, n, i);

    printArray(arr);
           
         

    }
    static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int arr[]={10,30,50,20,35,15};
        System.out.println("Before sorted Array ");
        printArray(arr);
       
        buildHeap(arr, arr.length);
        /*  Output
           Before sorted Array 
           10 30 50 20 35 15
            
           MinHeap Process
           10 15 30 20 35 50

          MaxHeap Process
            50 35 30 20 15 10 
         */
      
        
    }
    
}
