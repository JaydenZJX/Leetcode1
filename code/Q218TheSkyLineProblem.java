

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 *lambda (a,b)->{a-b};
 *PriorityQueue<?>(E) E:rule of the
 */

public class Solution{
    public List<int[]> getSkyline(int[][] buildings){
        List<int[]> result = new ArrayList<>();
        List<int[]> height = new ArrayList<>();

        for(int[] i: buildings){
            //-i[2] 下面的 最后重组的时候拿来 当boolean
            // statement, 应为i[0] 是一个建筑的起始坐标；
            //这样以来就可以判断 新的hheight 是不是出现了;
            height.add(new int[]{i[0],-i[2]});
            height.add(new int[]{i[1],i[2]});
        }

        Collections.sort(height,(a,b)->{
                if(a[0] != b[0])
                    return a[0] - b[0];
                //special case 两个建筑的左边x一样那样我们就比较
                //他们的高；
                return a[1] - b[1];
            });

        Queue<Integer> q = new PriorityQueue<>((a,b) ->(b - a));//always cheack the new come in is higher or not than others;
        int per = 0;
        q.offer(0);
        for(int[] h: height){
            if(h[1] < 0){
                //上面设置成负数 便于识别
                //把这个数值放进 queue;
                q.offer(-h[1]);
            }else{
                //一般这种情况出现是说明；
                //某一个建筑的高度不应该在出现；
                //所以我们remove（Object);&****
                q.remove(h[1]);
            }

            int cur = q.peek();
            if(cur != per){
                result.add(new int[]{h[0],cur});
                per = cur;
            }
        }
        return result;
    }
}
