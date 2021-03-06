/*
Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
http://www.leetcode.com/wp-content/uploads/2012/08/rainwatertrap.png

The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

This is an O(n) solution designed by Suren.
*/


public class Solution {
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int area = 0, i = 0, j=A.length-1,lmax=-1,rmax=-1;
        while(i<j){
            lmax = Math.max(lmax,A[i]);
            rmax = Math.max(rmax,A[j]);
            if(lmax <= rmax)
                area += (A[++i]<lmax)?(lmax-A[i]):0;
            else
                area += (A[--j]<rmax)?(rmax-A[j]):0;
            
        }
        return area;
    }
}
