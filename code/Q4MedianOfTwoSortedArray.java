public class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int n = nums1.length, m = nums2.length;

        int l = (n + m + 1) / 2;
        int r = (n + m + 2) / 2;

        return (findKthElement(nums1, 0, nums2,0,l)+findKthElement(nums1, 0, nums2,0,r))/2.0;
    }

    public double findKthElement(int[] a, int aStart, int[] b,int bStart, int k){

        if(aStart > a.length - 1) return b[bStart + k -1];
        if(bStart > b.length - 1) return a[aStart + k -1];
        if(k == 1) return Math.min(a[aStart], b[bStart]);
        
        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;

        if(aStart + k/2 - 1  < a.length) aMid = a[aStart + k/2 - 1];
        if(bStart + k/2 - 1  < b.length) bMid = b[bStart + k/2 - 1];

        if(aMid < bMid)

            return findKthElement(a, aStart + k/2, b, bStart, k - k/2);
        else
            return findKthElement(a, aStart, b, bStart + k/2, k - k/2);

    }
}
