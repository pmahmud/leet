/*

42. Trapping Rain Water
https://leetcode.com/problems/trapping-rain-water/description/

*/

class Solution {
    public int trap(int[] height) {
        
        int water = 0;
        int li = 0;
        int ri = height.length - 1;
        int lmax = 0;
        int rmax = 0;
        
        while(li < ri) {
            lmax = Math.max(lmax, height[li]);   
            rmax = Math.max(rmax, height[ri]);
            if (lmax < rmax) {
                water += lmax - height[li];
                li++;
            } else {
                water += rmax - height[ri];
                ri--;                
            } 
        }
        
        return water;
    }
}

// Trapping rain problem with the stack: https://www.youtube.com/watch?v=lhzrp3Nbj-w
