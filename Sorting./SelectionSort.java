public class SelectionSort{
    public static void  selection_Process(int arr[]){
      
        for(int i=0;i<arr.length;i++){

            int min_idx=i;
           
            for(int j=i+1;j<arr.length;j++){

                 if(arr[min_idx]>arr[j])  min_idx=j;
              }

            
           //  System.out.println("letmin :"+ arr[i]+ "min "+ arr[min_idx]);
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        } 
        

    }
      static void printArray(int arr[]){
         for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

     }
    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
         selection_Process(arr);
         printArray(arr);

    }
}