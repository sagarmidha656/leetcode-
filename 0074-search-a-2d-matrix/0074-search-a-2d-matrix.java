class Solution {
    public boolean binarysearch(int[] arr , int target ){
        int n = arr.length;
        int l =0, h = n-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]>target){
                h =mid -1;
            }
            else{
                l = mid +1;

            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m= matrix[0].length;
        for(int i =0 ; i<n ; i++){
            if(matrix[i][0]<=target && target <= matrix[i][m-1]){
                return binarysearch(matrix[i],target);
            }
        }
        return false;
    }
}