public class SubArray{
    static void AllsubArray(int arr[]){
        int n=arr.length;
        int count=0;
        int maxsum=0;
        System.out.println("Sub Array      |    Sum     ");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int   sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    System.out.print( arr[k]+"  ");

                } 
                System.out.print("         || "+sum);
                 System.out.println();
                 maxsum=Math.max(maxsum,sum);
                 count++;
              
              }
            }
            System.out.println("Maximum SubArray | Largest Sum = "+ maxsum);
        System.out.println(" TOtal Sub Array = "+count);
    }
    public static void main(String[] args) {
       // int arr[]={-2,1,-3,4,-1,2,1,-5,4};
       int arr[]={-2,4,7,2};
        AllsubArray(arr);

    }
}