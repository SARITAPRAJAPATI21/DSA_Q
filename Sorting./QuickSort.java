public class QuickSort {
    public static void quickSort(int nums[],int low,int high){
        if(low<high){
            int pidx=partition(nums,low,high);

            quickSort(nums, low, pidx-1);
            quickSort(nums, pidx+1, high);
        }

    }
    public static int  partition(int nums[],int low,int high){
        int  pivot=nums[high];
        int pidx=low-1;

        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                pidx++;
                int temp=nums[pidx];
                nums[pidx]=nums[j];
                nums[j]=temp;
            }

        }
        pidx++;
        int temp= nums[pidx];
         nums[pidx]=pivot;
         nums[high]=temp;

         return pidx;


    }
    
   
    public static void main(String[] args) {
        int nums[]={24,9,29,14,19,27};
        int n=nums.length;
        quickSort(nums, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        
        
    }
    
}
