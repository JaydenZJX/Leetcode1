/**
 *sort list
 */

public class Solution{
    public ListNode insertionSortList(ListNode head){


        ListNode helper = new ListNode(0);

        ListNode cur = head;
        ListNode next = null;

        while(cur != null){
            next= cur.next;

            ListNode per= helper;

            while( per.next != null && per.next.val< cur.val){
                per=per.next;
            }
            cur.next = per.next;
            per.next = cur;
            cur = next;

            
        }
        return helper.next;
    }
}


/******************/

public ListNode insertionSortList(ListNode head){
    ListNode dummy = new ListNode(Integer.MIN_VALUE);

    for(ListNode cur = head; cur != null;){
        ListNode pos = findInsertPos(dummy, cur.val);
        ListNode tmp = cur.next;
        cur.next=pos.next;
        pos.next=cur;
        cur=tmp;
    }
    return dummy.next;
}

ListNode findInsertPos(ListNode head, int x){
    ListNode per = null;
    ListNode cur= head;
    while(cur != null && cur.val <=x){
        per=cur;
        cur = cur.next;
    }
    return per;
}
