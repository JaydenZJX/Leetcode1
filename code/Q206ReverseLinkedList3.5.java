/**
 *recur 或者 iter
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newhead=null;
        while(head != null){
            ListNode next= head.next;
            head.next = newhead;
            newhead = head;
            head=next;
        }
        return newhead;
    }
}

/*recur */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head== null || head.next==null){
            return head ;
        }
        ListNode nextNode=head.next;
        ListNode newhead= reverseList(nextNode);
        nextNode.next=head;
        head.next=null;
        return newhead;
    }
}
