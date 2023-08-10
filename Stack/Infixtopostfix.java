import java.util.Stack;



public class Infixtopostfix {
   static  int Precedence(char operator){
        if(operator=='^')
           return 3;

        else if(operator=='/'|| operator=='*')
        return 2;

         else if(operator=='+'||operator=='-')
         return 1;
        else
         return-1;
           
    }
    
   static  String InfixtopostfixCal(String s){
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++){

            if((s.charAt(i)>='a'&& s.charAt(i)<='z')||(s.charAt(i)>='A'&& s.charAt(i)<='Z')||(s.charAt(i)>='0'&& s.charAt(i)<='9')){
                res=res+s.charAt(i);
            }
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }

            else if(s.charAt(i)==')'){
                while( !st.empty()  &&  st.peek()!='('){
                    res=res+st.peek();
                    st.pop();
                 }
                if(!st.empty())
                   st.pop();
             }

            else{
                while(!st.empty()&& Precedence(st.peek()) >=Precedence(s.charAt(i))){
                    res=res+st.peek();
                    st.pop();
                    }
                st.push(s.charAt(i));
               } 
        }// end for loop
        
         while(!st.empty()){
            res=res+st.peek();
            st.pop();
           }
        return res;
 }
    public static void main(String[] args) {
     // Stack is a class 
     //  String expression="(a-b/c)*(a/k-l)";
System.out.println(InfixtopostfixCal("(a+(b+c*(d+e))+f/g)"));
 
//System.out.println(InfixtopostfixCal("a+b*(c^d-e)^(f+g*h)-i"));   

// System.out.println(InfixtopostfixCal("(a+(b*c-(d/e^f)*h))"));  
 //postfix   abc*def^/h*-+

 System.out.println(InfixtopostfixCal("(7-5)*(9/2)"));
        
    }
    
}
