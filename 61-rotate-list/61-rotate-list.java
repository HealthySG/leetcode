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
    public ListNode rotateRight(ListNode head, int k){
        if(head==null)
            return null;
        if(k==0)
            return head;
        ListNode temp=head;    
        int count=1;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        if(count==1)
            return head;
        k=count-k%count;
        temp.next=head;  
        while(k!=0)
        {
            temp=temp.next;
            k--;
        }
        head=temp.next;
       // ListNode dummy1=temp;
        temp.next=null;
      /*  System.out.println(dummy.val);
        while(dummy.next!=null)
        {
            
            dummy=dummy.next;
        }
        dummy.next=head;
        */
        return head;
    }
}