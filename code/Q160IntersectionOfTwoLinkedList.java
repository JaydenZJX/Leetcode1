/**
 *len
 */
public class Solution{
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA == null || headB==null) return null;
        int lenA=1;
        int lenB=1;
        ListNode tailA=headA;
        ListNode tailB=headB;

        while(tailA.next != null){
            tailA=tailA.next;
            lenA++;
        }

        while(tailB.next != null){
            tailB = tailB.next;
            lenB++;
        }
        if(tailA !=tailB) return null;

        if(lenA> lenB){
            for(int i=0;i < lenA-lenB;i++){
                headA=headA.next;
            }
        }else{
                for(int i = 0;i<lenB-lenA;i++){
                    headB=headB.next;
                }
            }

        while(headA != headB){
            headA=headA.next;
            headA=headB.next;
        }

        return headA;
    }
}

/***第一次优化*/
public class Solution{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len=length(headA), lenB=length(headB);

        while(lenA>lenB){
            headA= headA.next;
            lenA--;
        }

        while(lenB>lenA){
            headB=headB.next;
            lenB--;
        }

        while(headA != headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }

    private int length(ListNode node){
        int length =0;
        while (node !=null){
            node=node.next;
            length++;
        }
        return length;
    }
}
/*并没有提升太多，只是把第一个解法的 长度计算写到外面躲过了 space 计算*/

/*************应该是最好的方法 O(n) O(1);*/
/*
  We can use two iterations to do that. In the first iteration, we will reset
  the pointer of one linkedlist to the head of another linkedlist after it
  reaches the tail node. In the second iteration, we will move two pointers until
  they points to the same node. Our operations in first iteration will help us
  counteract the difference. So if two linkedlist intersects, the meeting
  point in second iteration must be the intersection point. If the two linked
  lists have no intersection at all, then the meeting pointer in second iteration
  must be the tail node of both lists, which is null
 */
public class Solution{
    public ListNode getIntersectionNode(ListNode headA,ListNode headb){
        if(headA ==null || headb == null) return null;

        ListNode a= headA; b =headB;
        while(a != b){
            a= a==null? headB : a.next;
            b= b==null? headA : b.next;
        }

        return a;
    }
}
