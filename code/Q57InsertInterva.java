

public class Solution{
    public List<Interval> insert(List<Interval> intervals, Interval newInterval){
        List<Interval> result = new LinkedList<>();

        int i = 0;

        while(i < intervals.size() && intervals.get(i).end < newInterval.start){
            result.add(intervals.get(i++));
        }
        // Interval tmp;
        while( i < intervals.size() && intervals.get(i).start <= newInterval.end){

            newInterval = new Interval(
                                       Math.min(intervals.get(i).start, newInterval.start),
                                       Math.max(intervals.get(i).end, newInterval.end)
                                       );
                i++;
        }
        result.add(newInterval);

        while(i < intervals.size()){
            result.add(intervals.get(i++));
        }

        return result;
    }
}
