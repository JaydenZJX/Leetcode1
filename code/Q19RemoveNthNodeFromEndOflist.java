/**
 *linkList
 *2个pointer 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode empty = new ListNode(0);
        ListNode fast = empty;
        ListNode slow = empty;
        slow.next=head;

        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return empty.next;

    }
}
/**
▼
0 5 4 3 2 1；

▲
fast
slow

▼
0 5 4 3 2 1 null

      ▲      ▲
      slow   fast

      slow.next =solwo.next.next;

      return empty.next;
