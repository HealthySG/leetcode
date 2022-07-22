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
    public ListNode partition(ListNode head, int x) {
       
        ListNode temp=head;    
         ListNode tail1=new ListNode(0);
          ListNode tail2=new ListNode(0);
        ListNode curr1=tail1;
        ListNode curr2=tail2;
        while(temp!=null)
        {
            if(temp.val<x)
            {
               // tail1.next=new ListNode(temp.val);
             
                 tail1.next=temp;  
                 tail1=tail1.next;
            }
            else
            {
                tail2.next=temp;
                tail2=tail2.next;
            }
            temp=temp.next;
        }
        tail2.next=null;
        tail1.next=curr2.next;
        
        return curr1.next;
         
    }
}