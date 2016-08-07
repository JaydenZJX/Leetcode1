/**
 *题目意思不是时间删掉 应为that access that node;
 *意思是说 先要得到那个 val 意思是复制后面的数字直接到cur location
 *然后把 next 的指针指向next.next
 */
public class Solution{
    public void deleteNode(ListNode node){
        /*现在复制val到目前node的位置*/
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
