/**
 *连个指针 一个移动两格，一个移动一格，如果连个能相等
 *就说明有 cycle 再其中；
 */
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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head:
        if(head == null ) return false;
        while (fast.next != null && fast.next.next != null){
            solw= solw.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
