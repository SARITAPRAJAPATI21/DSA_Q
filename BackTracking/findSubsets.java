
public class findSubsets {
    // t(n)=n*2^n
  public  static void Subsets(String str ,String ans,int i) {

      if(i==str.length()) {//Base case
          if(ans.length()== 0) {
              System.out.print("null");
          }else
          {
              System.out.print(ans+" ");
          }
          return;
      }
          //recursion
     //yes choice
    Subsets(str,ans+str.charAt(i),i+1);
     //no choice
      Subsets(str,ans,i+1);// Backtracking

  }
   public static void main(String[] args) {
     String str="abc";
     Subsets(str,"", 0  );

   }
}
