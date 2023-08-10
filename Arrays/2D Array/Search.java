public class Search {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3,8},
            {4,11,6,7},
            {18,5,12,10}
        };
        int target=12;
       /*  System.out.println(a.length);//row
        System.out.println(a[0].length);//row[o]->col1
        System.out.println(a[1].length);//row[1]->col2
        System.out.println(a[2].length);*/
        int r=0;
        int c=a.length-1;
        int n=a[0].length;
        boolean found=false;
        while(r<n && c>=0){
            if(a[r][c]==target){
                found =true;
                 break;
            }
            if(a[r][c]>target) c--;

            else r++;
            
        }
        if(found==true)
        System.out.println("target value is found in matrix ");
        else
        System.out.println("not found in matrix ");

    }
    
}
