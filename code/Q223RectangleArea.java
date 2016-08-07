/**
 *Math
 * if the two rectrangle do not interact with each other
 *which will sperate in left and right;

                |
                |
                |
                |   right
 _______________|__________________
                |
                |
      left      |
                |
                |
                |
 */

public class Solution{
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areanA = (C-A)*(D-B);
        int areanB = (G-E)*(H-F);

        int left = Math.max(A,E);
        int right = Math.min(C,G);
        int top = Math.min(D,H);
        int bottom = Math.max(B,F);

        int overleap=0;
        if(right > left && top > bottom){
            overleap = (right - left) * (top - bottom);
        }

        return areanA+areanB-overleap;
    }
}
