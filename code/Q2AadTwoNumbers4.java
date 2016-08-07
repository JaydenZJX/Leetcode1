/*Aad Two Numbers
 *主要考linklist
 *defin 一个rest＝0 用 ／ 开始给第一个数字赋值 然后用％
 *应为是reverse order
 *reset base 10
 *have to have a tail pointer. cause you can not move aroud the head pointer
 *otherviews, at the final you your program you can not return
 *the node which you had added before.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = l1, list2 = l2;
        ListNode head = new ListNode(0);
        ListNode tail= head;
        int reset=0; //用来reset value；
        while (list1 != null || list2 != null)
            {
                reset=reset/10; //base 10
                if(list1 != null)
                    {
                        reset+=list1.val;
                        list1=list1.next;
                    }
                if(list2 != null)
                    {
                        reset+=list2.val;
                        list2=list2.next;
                    }
                tail.next=new ListNode(reset % 10);
                tail=tail.next;
            }

        if(reset/10 ==1)
            {
                tail.next=new ListNode(1);
            }
        return head.next;
    }
}

/**一定要搞清楚，这边的reset 是不会重置。一直累计增加
 *每次我们进入while loop 我们总是是先除以10 （尽管我们从0开始）
 *这样我们就可以从个位数开始除一位一位的降下来，然后到之后一定要检查
 *reset 里面剩余的数字 如果数字 除以10在（int）的情况下等于一 我们要在
 *list 的末尾在加上个node。
 *最后return head。next。
