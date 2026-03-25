class Solution {
    public boolean isPalindrome(int x) {
        int revno = 0;
        int dup = x ;
        while(x > 0){
            int lastd = x % 10 ;
            revno = (revno * 10) + lastd ; 
            x = x / 10 ;
        }
        if (revno == dup){
            return true;
        }
        return false;
    }
}