class Solution {
    public long totalhours(int[] piles , int mid){
        long  hours = 0;
        for(int i =0 ; i<piles.length;i++){
            // hours += (long)Math.ceil((double)piles[i]/mid);
            hours += (piles[i]+mid-1)/mid;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int H) {
        int maxx = piles[0];
        for(int num : piles){
            maxx= Math.max(maxx,num);
        }
        int l =1 , h= maxx;
        while(l<=h){
            int mid = l+(h-l)/2;
            long hours = totalhours(piles,mid);
            if(hours<=H){
                h = mid -1;
            }
            else{
                l = mid +1;
            }
        }
        return l;






        //-----------BRUTE FORCE ------------------------
        // int maxx = piles[0];
        // for(int num : piles){
        //     maxx = Math.max(maxx,num);
        // }
        // for(int time = 1 ; time <= maxx ; time++){
        //     int hours =0;
        //     for(int i =0; i<piles.length;i++){
        //     hours += (int)Math.ceil((double)piles[i]/time);
        //     }
        //     if(hours<=h){
        //         return time;
        //     }
        // }
        // return -1;
    }
}