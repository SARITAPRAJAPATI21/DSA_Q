import java.util.Stack;

public class PostfixEvaluation {
    static int PostFixValue(String s){
    
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>'0'&&s.charAt(i)<='9')
              st.push(s.charAt(i)-'0');
            
            else if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='/'||s.charAt(i)=='*') {

               int op2=st.peek();
                st.pop();

               int op1=st.peek();
               st.pop();

              switch(s.charAt(i)){
                case '+':
                     st.push(op1+op2);
                     break;
                case '-':
                     st.push(op1-op2);
                     break;

                case '/' :
                     st.push(op1/op2);
                     break;
                case '*' :
                     st.push(op1*op2);
                     break;
                default:
                  break;
                
              }
               
            } 
        }
        return st.peek();

    }
    public static void main(String[] args) {

System.out.println(PostFixValue("75-92/*"));//8
System.out.println('9'-'2');//9
System.out.println(Integer.parseInt("9")-Integer.parseInt("2"));
System.out.println("2".equals("2"));
System.out.println("2"=="2");// valid
System.out.println(Integer.parseInt("2")>=Integer.parseInt("0"));
//System.out.println(("/">="/")||("*"<="*") );// invalid
//System.out.println(("2">0) & ("2"<9));
//System.out.println(Integer.parseInt("abc"));// NumberFormatException Error 

//ystem.out.println(Integer.valueOf("1"));
System.out.println("234".charAt(2)-'2');
StringBuilder s=new StringBuilder();
   s.append("123");
System.out.println(s);
  s.append("234");
System.out.println(s);


        
        
    }
    
}
