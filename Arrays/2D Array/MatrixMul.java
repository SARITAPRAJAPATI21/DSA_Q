public class MatrixMul {
    public static void main(String[] args) {
        
        int a[][] = {       
            {1, 2, 3},    
            {4, 5, 4},    
            {0, 8, 9}    
        };//m1*n1

         int b[][] = {       
            {1, 2, 3},    
            {4, 5, 6},    
            {7, 1, 2}    
        }; //m2*n2
        //multiplication possible only = n1*m2
        //res[m1][n2]
        int m1=a.length;
        int n1=a[0].length;
        int  m2=b.length;
        int n2 =b[0].length;
        if(n1!=m2){
            System.out.println(" Multiplication Not possible");
        }
        else{
            int c[][]=new int[m1][n2];

            for(int i=0;i<m1;i++){
                for(int j=0;j<m2;j++){
                    for(int k=0;k<n2;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }

                }
            }
            for(int i=0;i<m1;i++){
                for(int j=0;j<n2;j++){
                     System.out.print(c[i][j]+"  ");
                   
                }
                 System.out.println();  
            }


        }

        
    }
    
}
