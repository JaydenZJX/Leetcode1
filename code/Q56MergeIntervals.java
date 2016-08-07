/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 *
 *union set;
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>(){
                @Override
                public int compare(Interval obj0,Interval obj1){
                    return obj0.start-obj1.start;
                }
            });

        List<Interval> ret = new ArrayList<>();

        Interval per=null;

        for(Interval inter : intervals){
            if(per == null || per.end<inter.start){
                ret.add(inter);
                per=inter;
            }else if(inter.end>per.end){
                per.end= inter.end;
            }
        }
        return ret;
    }
}
