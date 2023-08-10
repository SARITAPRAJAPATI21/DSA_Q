import java.util.Stack;


class Solution{
    public  int evalRPN(String[] tokens){
        Stack<Integer> st=new Stack<>();
        for(String t:tokens)
        {
            if("+-/*".contains(t)){
             st.push(eval(st.pop(), st.pop(), t));
            }
            else
             st.push(Integer.parseInt(t));
        }
        return st.peek();

    }
  private   int eval(int b,int a,String op){
        if("+".equals(op))
         return a+b;

        else if("-".equals(op))
        return a-b;
      
        else if("*".equals(op))
        return a*b;

        else
        return a/b;

     
    }
}


public class Leetcode150{
    //Reverse Polish Evaluation

    public static void main(String[] args) {
     String   tokens[] = {"2","1","+","3","*"};
      Solution s=new Solution();
      
     
      System.out.println( s.evalRPN(tokens));
   //   s.eval(12,23,"+");// Only public is accessible in  using object

     
    
    }
}