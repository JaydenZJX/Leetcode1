

/**
 *
 */

public class Solution{
    public ListNode rotateRight(ListNode head, int k){
        if(head == null || k ==0)
            return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode fast =fakeHead, slow = fakeHead;

        int i;

        for(i = 0 ; fast.next != null; i++){
            fast = fast.next;
        }

        for(int j = i -(k % j); j > 0; j--){
            slow = slow.next;
        }

        fast.next = fakeHead.next;
        fakeHead.next = slow.next;
        slow.next = null;
            
        //          |-------|
        //          ⬇️     |️������
        // fakeHead 1 2 3 4 5
        //        |       ⬆️
        //        |-------|️  ／／所以要重置3后面的到null 不然就要变成循环的list了
        return fakeHead.next;
    }
}
