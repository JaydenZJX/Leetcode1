public class Solution{
    public ListNode reverseKGroup(ListNode head, int k){
        ListNode begin;
        if(head == null || head.next == null || k == 1)
            return head;

        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;
        int i = 0;
        while(head != null){
            i++;
            if(i % k == 0){
                begin = reverse(begin, head.next);
                head = begin.next;
            }else{
                head = head.next;
            }
        }
        return dummyhead.next;
    }

    public ListNode reverse(ListNode begin, ListNode end){
        ListNode cur = begin.next;
        ListNode next, first;
        ListNode prev = begin;
        first = cur;

        while(curr != end){
            next = cur.next;
            cur.next = per;
            per = cur;
            cur = next;
        }

        begin.next = prev;
        first.next = cur;
        return first;
    }
}
