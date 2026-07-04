class Solution {
    public int possible(int[] nums ,int x ){
        int sum = 0;
        for(int i =0 ; i<nums.length;i++){
            sum += (int)Math.ceil((double)nums[i]/x);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi = nums[0];
        for(int num : nums){
            maxi = Math.max(maxi , num);
        }
        int l = 1 , h = maxi ;
        while(l<=h){
            int mid = l+(h-l)/2;
            int sum = possible(nums, mid);
            if(sum<= threshold){
                h = mid-1;
            }
            else{
                l = mid +1;
            }
        }
        return l;
    }
}