
/**
 *binary search;
 * assume the class isBadversion alreadly defind;
 */

public class Solution extends VersionControl{
    public int firstBadVersion(int n){
        int start = 1, end = n;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(!isBadVersion(mid)) start = mid + 1;

            else end = mid;
        }

        return start;
    }
}
