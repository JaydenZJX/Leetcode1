/**
 *1.divided && conquer  master theroy O(nk logn) space O(logky);
 *2.priority queue
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
public ListNode mergeKLists(ListNode[] lists) {
      if (lists.length == 0) return null;
      else if (lists.length == 1) return lists[0];
      else {
      int len = lists.length;
      while (len > 1) {
        int j = (len + 1) / 2;
        for (int i=0; i<len/2; i++) {
            lists[i] = mergeTwoLists(lists[i],lists[i+j]);
            }
            len = j;
            }
      return lists[0];

      }


      public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode dummyHead = new ListNode(0);
      ListNode currCopy = dummyHead;
      if (l1 == null) return l2;
      if (l2 == null) return l1;
      while (l1 != null || l2 != null) {
      if (l1 == null) {
      currCopy.next = l2;
      break;
      }
      if (l2 == null) {
      currCopy.next = l1;
      break;
      } 
      if (l1.val <= l2.val) {
      currCopy.next = new ListNode(l1.val);
      l1 = l1. next;
      }
      else {
      currCopy.next = new ListNode(l2.val);
      l2 = l2.next;
      }
      currCopy = currCopy.next;
      }
      return dummyHead.next;
    }
*/
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.Length==0) return null;

        return mergerKSortedList(lists,0,lists.Length-1);
    }

    public ListNode mergerKSortedList(ListNode[] lists,int left ,int right){
        if(left<right){
            int m= (left+right)/2;
            return mergeTwoSortedList(mergerKSortedList(lists,left,m),mergerKSortedList(lists,m+1,right));
        }
        return lists[left];
    }

    public ListNode mergeTwoSortedList(ListNode listNode1, ListNode listNode2){
        ListNode p;
        ListNode q;
        ListNode fakeHead;
        ListNode head = new ListNode(0);
        fakeHead = head;
        p= listNode1;
        q= listNode2;
        while(p != null && q!= null){
            if(p.val<=q.val){
                fakeHead.next=p;
                p = p.next;
            }else{
                fakeHead.next=q;
                q=q.next;
            }
            fakeHead=fakeHead.next;
        }
        if(p== null){
            fakeHead.next=q;
        }
        if(q==null){
            fakeHead.next = p;
        }

        return head.next;
    }
}



/************************************/
public class Solution{
    public ListNode mergeKLists(ListNode[] lists){
        //special case*/
        if(lists.length==0 || lists == null) return null;

        Comparator<ListNode> order = new Comparator<ListNode>(){
                public int compare(ListNode o1,ListNode o2){
                    //todo auto-generated method stub//
                    return o1.val-o2.val;
                }
            };
        PriorityQueue<ListNode> p = new PriorityQueue<ListNode>(lists.length,order);
        for(ListNode list : lists){
            if(list != null)
                p.add(list);
        }

        ListNode head = new ListNode(-1);
        ListNode q = head;
        while(!q.isEmpty){
            ListNode item = p.poll();
            q.next =item;
            if(item.next != null){
                p.add(item.next);
            }
            q = q.next;
        }
        return head.next
    }
}
