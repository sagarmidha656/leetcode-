class Solution {
    public int[] findPeakGrid(int[][] mat) {
      int n = mat.length;
      int m = mat[0].length;
      int l = 0 , h = m-1;
      while(l<=h){
        int mid = l+(h-l)/2;
        int row = maxele(mat,mid);
        int left = mid-1>=0 ? mat[row][mid-1] : -1;
        int right = mid+1<m ? mat[row][mid+1] : -1;
        if(mat[row][mid]>left && mat[row][mid]>right){
            return new int[]{row,mid};
        }
        else if(mat[row][mid]<left) h = mid-1;
        else l = mid+1;

      }  
      return new int[]{-1,-1};
    }
    public int maxele(int[][] mat ,int mid){
        int maxi = Integer.MIN_VALUE;
        int ind = -1;
        for(int i =0;i<mat.length;i++){
            if(mat[i][mid]>maxi){
                maxi = mat[i][mid];
                ind = i;
            }
        }
        return ind;
    }
}