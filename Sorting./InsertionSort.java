public class InsertionSort {

  public  static void InsertionSort_Process(int arr[]){
    
        for(int i=1;i<arr.length;i++){
             int j=i-1;
            int key =arr[i];
            while(j>=0 && key<arr[j]){
               // System.out.println("swap"+arr[i] +" "+arr[j]+" "+j);
                   arr[j+1]=arr[j];
                   j--;

            }
            arr[j+1]=key;

        }
           
        
    }
  public  static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
     int arr[] = { 12, 11, 13, 5, 6 };
     int arr1[] = {64,25,12,22,11};
     InsertionSort_Process(arr);
      printArray(arr);
     
        
    }
    
}
