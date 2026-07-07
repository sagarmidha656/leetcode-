class Solution {
    // public boolean binarysearch(int[] arr , int target ){
    //     int n = arr.length;
    //     int l =0, h = n-1;
    //     while(l<=h){
    //         int mid = l+(h-l)/2;
    //         if(arr[mid]==target){
    //             return true;
    //         }
    //         if(arr[mid]>target){
    //             h =mid -1;
    //         }
    //         else{
    //             l = mid +1;

    //         }
    //     }
    //     return false;
    // }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0 , h = n*m-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            int row = mid /m ;
            int col = mid%m;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) l = mid+1;
            else{
                h = mid-1;
            }
        }
        return false;
        //-------------BRUTE FORCE --------O(n*log(m))
        // int n = matrix.length;
        // int m= matrix[0].length;
        // for(int i =0 ; i<n ; i++){
        //     if(matrix[i][0]<=target && target <= matrix[i][m-1]){
        //         return binarysearch(matrix[i],target);
        //     }
        // }
        // return false;
    }
}