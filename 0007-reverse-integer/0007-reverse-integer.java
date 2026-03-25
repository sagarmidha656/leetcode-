class Solution {
    public int reverse(int x) {
        int rev = 0;
        int dup = x;
        x = Math.abs(x);
        while(x > 0 ){
            int ld = x % 10;
              x /= 10 ;
         


              rev = (rev*10) + ld;
        }
        if ( dup < 0){
            return rev * -1;
        }
        return rev;
    }
}