

public class RotateArray {
    static void RotationBackword(int arr[],int times){
        int len=arr.length-1;
       int rem=times%arr.length;
        if(times%arr.length==0){
            return;
        }
         else{  
            for(int i=1;i<=rem;i++){ 
              int ele=arr[len]; 
              System.out.println("Last Ele:"+ele);
                for(int j=len;j>0;j--){
                arr[j]=arr[j-1];                                                                                  
                
            }
            arr[0]=ele;
        }
        }
     }
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        int arr[]={4,5,7,8};
        System.out.println("Enter times of Rotation:");
       // int times=sc.nextInt();
       
        RotationBackword(arr, 2);
        for(int i=0;i<arr.length;i++)
             System.out.print(arr[i]+",");

    }
    
}
