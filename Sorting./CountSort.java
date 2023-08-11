public class CountSort {

    public static void  count_process(int nums[]){
    // Step 1 : Count size of count array 
        int k=nums[0];
        for(int i=0;i<nums.length;i++){
            k=Math.max(k,nums[i]);

        }
     
    // Step 2:  Freq count of each ele
        int count[]=new int[k+1];
      
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
         
        }
     // Step 3 : update count array  
        for(int i=1;i<=k;i++){
            count[i]+=count[i-1];
        }
      //Step 4: insert ele at correct position
        int output[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            output[--count[nums[i]]]=nums[i];
        }


        for(int i=0;i<nums.length;i++){
            nums[i]=output[i];
            System.out.print(nums[i]+" ");
        }

    }
    public static void main(String[] args) {
        int nums[]={5,2,3,1};
         System.out.println("Note : Count sort is valid only positive number ");
         count_process(nums);
      
      
        
    }
    
}
