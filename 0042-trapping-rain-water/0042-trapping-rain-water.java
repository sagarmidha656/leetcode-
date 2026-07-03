class Solution {
    public int trap(int[] height) {
       int n = height.length;
       int count=0;
       int[] left = new int[n];
       int[] right = new int[n];
       left[0] = height[0];
       right[n-1]=height[n-1];
      int i = 1 , j = n -2;
      while(i<n && j >=0){
        left[i] = Math.max(height[i],left[i-1]);
        right[j] = Math.max(height[j],right[j+1]);
        j--;i++;
      }
      for(int k =0 ;k<n;k++){
       int x = Math.min(left[k],right[k]);
       count += x-height[k];
      }
      return count;
    }
}