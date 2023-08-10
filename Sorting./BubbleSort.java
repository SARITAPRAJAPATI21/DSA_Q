public class BubbleSort {
   public static  void Bubble_Sort(int arr[],int n){
        for(int r=1;r<n;r++){
            for(int j=0;j<n-r;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }


    }
  public  static void  printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ,");
        }

    }


    public static void main(String[] args) {
        int arr[] = { 13,2,5,18,54,7,9 };
        Bubble_Sort(arr,arr.length);
        printArray(arr,arr.length);
        /*  Time Complexity T(n)
         *   n=arr length
         *   Best= n, Aveg=n^2, Worst=n^2
         */

    }
}
