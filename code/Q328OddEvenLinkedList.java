/**
 *Linked list move teo point around.
 *at the last put the ：
 */
public class Solution{


    public ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode odd=head, even= head.next, evenHead == head.nenxt;

        while(even != null && even.next != null){
            odd.next=odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            eve = even.next;
        }

        odd.next=evenHead;

        return head;
    }
}