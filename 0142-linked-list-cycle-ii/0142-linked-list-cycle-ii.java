/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       Set<ListNode> hm=new HashSet<>();
     /*   ListNode slow=head;
        ListNode fast=head;
        
        while((null!=fast && fast.next!=null) || (null!=fast.next && fast.next.next!=null))
        {
             slow=slow.next;
            fast=fast.next.next;
            if(m.containsKey(slow))
                
            if(slow==fast )
                return fast.next;
        }
       return null;*/
   //   HashMap<ListNode, Integer> hm = new HashMap<ListNode, Integer>();
        
        while(true){
		// If we hit null node then no cycle is present
          if(head == null){
              return null;
          }
		  // If the current node is already visited then cycle exists, and it starts at the current node
          if(hm.contains(head)){
              return head;
          }else{
              hm.add(head);
              head = head.next;
          }
        }
    }
}