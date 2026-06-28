class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] two = new int[2];
        // for(int i = 0 ; i <nums.length;i++){
        //     for(int j = i+1 ; j<nums.length;j++){
        //         if((nums[i]+nums[j])==target){
        //             if(i>j){
        //                 two[0]=j;
        //                 two[1]=i;
        //             }
        //             two[0]=i;
        //             two[1]=j;
        //         }
        //     }
        // }
        // return two;


        HashMap<Integer, Integer> map = new HashMap<>();
   
        for(int i = 0 ; i<nums.length;i++){
        int sum = target - nums[i];
        if(map.containsKey(sum)){
            return new int[]{map.get(sum),i};
        }
        map.put(nums[i],i);   
        }
        return new int[]{};
    }
}