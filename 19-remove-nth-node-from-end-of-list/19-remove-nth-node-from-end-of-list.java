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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        
            
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(n==1 && count==1)
        {
            return null;
        }
        
         System.out.println(count);
        temp=head;
        int startnode=(count-n);
        int g=1;
        if(startnode==0 && count!=1)
        {
            return head.next;
        }
        while(g!=startnode)
        {
            
            temp=temp.next;
            g++;
        }
        System.out.println(temp.val);
        if(temp.next.next!=null)
            temp.next=temp.next.next;
        else
            temp.next=null;
        
        return head;
    }
}