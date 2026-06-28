class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ss = new HashSet<>();
        for(int num : nums){
            if(ss.contains(num)){
                return true;
            }
            ss.add(num);
        }
        return false;
    }
}