public class ArrayReverse {

    static void SwappingMethodOfReverse(int arr[],int start,int end){
        int len=end-start+1;

       // System.out.println("len of Array "+len);
       // System.out.println(start+" "+end);
        for(int i=1;i<=len/2;i++){

           // System.out.print(i);
              System.out.println(end);
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
               end=end-1;
        }
    }
    static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ,");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        
        PrintArray(arr);
      // SwappingMethodOfReverse(arr, 0, arr.length-1);
       // PrintArray(arr);
     SwappingMethodOfReverse(arr, 2, 5);
PrintArray(arr);
        System.out.println(" Successful Execution program");
        

        
    }
    
}
