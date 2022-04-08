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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        return help(prev,curr,next);
    }
    ListNode help(ListNode prev,ListNode curr,ListNode next)
    {
        if(curr==null)
            return prev;
        next=curr.next;
        //curr=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        return help(prev,curr,next);
    }
}