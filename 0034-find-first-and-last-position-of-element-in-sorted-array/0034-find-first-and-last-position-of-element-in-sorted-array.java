class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerbound(nums,target);
        int up = upperbound(nums,target);
        if(lb == nums.length || nums[lb] != target) return new int[]{-1,-1};
        return  new int[]{lb,up-1};
    }
    public int lowerbound(int[] nums , int x ){
        int n = nums.length;
        int l = 0 , h = n -1 ; 
        int ans = n ;
        while(l<=h){
            int mid = l +((h-l)/2);
            if(nums[mid]>= x){
                ans = mid ; 
                h = mid -1;
            }
            else{
                l = mid +1;
            }
        }
        return ans ;
    }
     public int upperbound(int[] nums , int x ){
        int n = nums.length;
        int l = 0 , h = n -1 ; 
        int ans = n ;
        while(l<=h){
            int mid = l +((h-l)/2);
            if(nums[mid]> x){
                ans = mid ; 
                h = mid -1;
            }
            else{
                l = mid +1;
            }
        }
        return ans ;
    }
}