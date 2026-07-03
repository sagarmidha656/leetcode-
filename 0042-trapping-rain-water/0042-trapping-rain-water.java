class Solution {
    public int trap(int[] height) {
        int lmax = 0,rmax =0;
        int count =0;
        int n = height.length;
        int i =0 , j = n-1;
        while(i<=j){
            if(height[i]<=height[j]){
                lmax = Math.max(lmax,height[i]);
                count += lmax - height[i];
                i++;
            }
            else{
                rmax = Math.max(rmax,height[j]);
                count += rmax - height[j];
                j--;
            }
        }
        return count;













        // -----Brute Force---------
    //    int n = height.length;
    //    int count=0;
    //    int[] left = new int[n];
    //    int[] right = new int[n];
    //    left[0] = height[0];
    //    right[n-1]=height[n-1];
    //   int i = 1 , j = n -2;
    //   while(i<n && j >=0){
    //     left[i] = Math.max(height[i],left[i-1]);
    //     right[j] = Math.max(height[j],right[j+1]);
    //     j--;i++;
    //   }
    //   for(int k =0 ;k<n;k++){
    //    int x = Math.min(left[k],right[k]);
    //    count += x-height;
    //   }
    //   return count;
    }
}