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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
       ListNode temp1=head;
     
      // ListNode temp4=null;
      // ListNode temp3=null;
       return swap(temp1);
    }
    ListNode swap(ListNode temp1)
    {
       if(temp1==null || temp1.next==null)
           return temp1;
       ListNode temp2=temp1.next;
       ListNode temp3=temp2.next;
      
       temp2.next=temp1;
       //System.out.println(temp3.val);
       temp1.next=swap(temp3);
        //System.out.println(temp2.val);
   
        
     return temp2;
    }
}