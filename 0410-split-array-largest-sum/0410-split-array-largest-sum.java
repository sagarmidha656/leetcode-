class Solution {
    public int number(int[] arr , int num){
      int  count = 1 , sum =0;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]+sum <= num){
                sum += arr[i];
            }
            else{
                count++;
                sum = arr[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int maxi = nums[0];
        int sum =0;
        for(int num : nums){
            sum += num;
            maxi = Math.max(maxi,num);
        }
        int l = maxi , h = sum ;
        while(l<=h){
             int mid = l + (h-l)/2;
             int numb = number(nums,mid);
             if(numb >k) l = mid +1;
             else h = mid -1;
        }
        return l;
    }
}