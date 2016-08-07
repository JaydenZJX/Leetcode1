import java.util.*;
/**
 *
 */

public class Solution{
    public void reorderList(ListNode head){
        if(head == null || head.next== null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode per  = null;

        while(fast != null && fast.next != null){
            per=slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        per.next = null;
        slow = reverse(slow);

        ListNode cur = head;
        while(cur.next != null){
            ListNode tmp = cur.next;

            cur.next = slow;
            slow = slow.next;
            cur.next.next = tmp;
            cur = tmp;
        }
        cur.next = slow;
    }

    public ListNode reverse(ListNode head){
        ListNode per=null;

        while(head != null){
            ListNode next=head.next;

            head.next=per;
            per=head;
            head=next;
        }
        return per;
    }
}
