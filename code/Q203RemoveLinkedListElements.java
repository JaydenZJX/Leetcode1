public class Solution{
    public ListNode removeElements(ListNode head, int val){
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode per = fakeHead, cur = head;
        while(cur != null){
            if(cur.val == val)
                per.next = cur.next;
            else
                per=per.next;

            cur = cur.next;
        }
        return fakeHead.next;
    }
}


public ListNode removeElements(List head, int val){
    if(head == null) return null;
    head.next == removeElements(head.next, val);
    return head.val == val? head.next: head;
}
