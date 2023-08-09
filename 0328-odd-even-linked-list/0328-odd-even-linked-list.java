/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)return  head;

        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;
        while(even !=null && even.next!=null){
         odd.next=even.next; //linking l1  1->3->5
         odd=even.next;//update
          even.next=odd.next;//linking l2 2->4
           even=odd.next;// update
       
        }
        odd.next=evenHead;// 1->3->5->2->5->null 
      
       return head;
        
    }
}