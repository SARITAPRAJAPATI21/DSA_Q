
public class MinMax{
    static void MaxElement(int arr[],int n){
        int i=0;
        int max=arr[i];
        for( i=i+1;i<n;){
            if(max>arr[i]){
                i++;
            }
            else{
            max=arr[i];
                i++;
            }

        }
        System.out.println("Max Element is: "+ max);

    }
    static void MinElement(int arr[],int n){
        int i=0;
        int min=arr[i];
        for( i=i+1;i<n;){
            if(min<arr[i]){
                i++;
            }
            else{
            min=arr[i];
                i++;
            }

        }
        System.out.println("Min Element is: "+ min);

    }
    static void ArrayReverse(int arr[],int n){
          int last=n-1;
          int temp;
         for(int f=0; f<n/2;f++){
            temp=arr[last];
            arr[last]=arr[f] ;
            arr[f] = temp;
            last=last-1;   
         }
        
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1 };
        int size=arr.length;
        MaxElement(arr,size);
        MinElement(arr, size);
       System.out.println("Before");
       for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
       }
       ArrayReverse(arr, size);
       System.out.println("\nAfer");
        for(int i=0;i<size;i++){
         System.out.print(arr[i]+" ");
        }
    

        
    }
}
