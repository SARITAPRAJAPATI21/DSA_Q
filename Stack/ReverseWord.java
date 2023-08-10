public class ReverseWord {
    static  String Reverse(String []words){
        String ans=" ";
       
        for(int i=words.length-1;i>=0;i--){
            ans=ans+words[i];
            ans=ans+" ";
         }
    
      return ans;
       
    }
    public static void main(String[] args) {
        String str="the sky is blue  ";
        System.out.println(str.stripTrailing());
        str.stripTrailing();
        String words[]=str.split(" ");
       // for(String s: words)
          // System.out.println(s);
         System.out.println(Reverse(words));
          

    
       
       
     


    }
    
}
