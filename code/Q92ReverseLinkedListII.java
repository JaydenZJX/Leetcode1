

/**
 *
 */

public class Solution{
    public ListNode reverseBetween(ListNode head, int m, int n){
        if(head == null) return null;

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode per = dummy;

        for(int i = 0; i < m - 1; i++) per = per.next;

        ListNode start  = per.next;
        ListNode then = start.next;

        for(int i = 0 ; i < n - m; i++){

            start.next = then.next;
            then.next = per.next;
            per.next = then;
            then = start.next;
        }
        return dummy.next;
    }
}
