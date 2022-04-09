class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        
        int count = 0;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = dummy;    //ptr for iteration
        ListNode h1 = null;
        
        while(ptr != null){
            if(count == left - 1){
                 h1 = ptr;  //store it as we have to change its next pointer
            }
            
            if(count == left){
                ListNode h2 = ptr;      //store it as we have to change its next pointer
                reverse(h2,right - left,h1,h2);
                return dummy.next;
            }
            ptr = ptr.next;
            count++;
        }
        return dummy.next;
    }
    
    private void reverse(ListNode head,int con,ListNode h1,ListNode h2){
        //function for reversing the sub list and after that 
        //add it to main list using h1 and h2 pointers
        
        ListNode prev = head;
        ListNode cur = prev.next;
        ListNode next = null ;
        
        for(int i = 1;i<=con;i++){ //reverse the sub list
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        h1.next = prev;
        h2.next = cur;
    }
}