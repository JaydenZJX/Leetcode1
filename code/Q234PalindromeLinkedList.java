/**
 * two pinter fast slow;
 * reverse
 */
public class Solution{
    public boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast != null) slow = slow.next;

        slow=reverse(slow);
        while(slow != null && head.val == slow.val){
            head = head.next;
            slow = slow.next;
        }
        return slow == null;
    }

    public ListNode reverse(ListNode head){
        ListNode per= null;
        while(head != null){
            ListNode next= head.next;
            head.next = per;
            per=head;
            head=next;
        }

        return per;
    }
}
