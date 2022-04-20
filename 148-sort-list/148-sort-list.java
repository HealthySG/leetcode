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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode mid=getMiddleNode(head);
        ListNode nhead=mid.next;
        mid.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(nhead);
        return merge(l1,l2);
    }
   ListNode getMiddleNode(ListNode curr)
    {
        if(curr == null || curr.next ==null)
            return curr;
        ListNode slow = curr;
        ListNode fast = curr;
        while(fast.next!=null && fast.next.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode dummy = new ListNode(-1);
          ListNode curr=dummy;
        while(l1!=null && l2!=null)
        {
            if(l1.val>l2.val)
            {
               /* if(dummy==null)
                {
                    curr=l2;
                    dummy=l2;
                }
                else
                {
                  dummy.next=l2;
                }
                */
                curr.next=l2;
                l2=l2.next;
            }
            else
            {
                /*if(dummy==null)
                {
                     curr=l1;
                    dummy=l1;
                }
                else
                {
                 dummy.next=l1;
                }*/
                curr.next=l1;
                l1=l1.next;
            }
            curr=curr.next;
        }
        if(l1!=null || l2!=null)
            curr.next=(l1==null)? l2:l1;
            
        return dummy.next;
    }
}