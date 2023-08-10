public class findPermutation {
    //   T(n)=n*n!
   public  static  void Permutation( String str,String ans ) {
  if(str.length()==0){
      System.out.print("Permuation : "+ans+" ");
      return;
  }
       //recursive
       //abcde= "ab" +"de" ="abde"
         for(int i=0;i<str.length();i++){
             char curr=str.charAt(i);
             //remove current char from original
             String Newstr=str.substring(0,i)+str.substring(i+1);
             //System.out.println(Newstr);
             Permutation(Newstr,ans+curr);
         }

       }
    public static void main(String[] args) {
        String str="abc";
         Permutation(str,"");
    
      // String s=str.substring(0, 3);
      // System.out.println(s);
    }
}
