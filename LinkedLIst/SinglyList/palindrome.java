package ll;

import java.util.ArrayList;

public class palindrome  extends LL{
    static  boolean isPalindrome(Node head){
        ArrayList<Integer> list=new ArrayList<>();
        while (head!=null){
            list.add(head.data);
            head=head.next;
        }
        // using arraylist
        for(int i=0;i< list.size()/2;i++){
            if(list.get(i)!=list.get(list.size()-i-1))
                return false;
        }
        return  true;
    }
    public static void main(String[] args) {
        int nr[]={1,7,1};
        LL n=new LL();
        n.AddFast(nr);
        //System.out.println(n.head);
        System.out.println("Given Linked  list");
        n.Display(n.head);
       if(isPalindrome(n.head))
        System.out.println("\n which is Palindrome" );
       else
           System.out.println("\nwhich is not Palindrome");

        System.out.println("\n hello world");




    }
}
