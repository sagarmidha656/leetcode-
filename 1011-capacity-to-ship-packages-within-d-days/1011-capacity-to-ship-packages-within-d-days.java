class Solution {
    public int daysreq(int[] weights, int cap){
        int days =1, load =0 ; 
        for(int i =0 ; i<weights.length;i++){
            if(load +weights[i]>cap){
                days += 1; 
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxi = weights[0],sum =0;
        for(int num : weights){
            sum += num;
            maxi = Math.max(maxi ,num);
        }
        int l = maxi , h = sum;
        while(l<=h){
            int mid = l +(h-l)/2;
            int daysr = daysreq(weights, mid);
            if(daysr <= days){
                h = mid -1;
            }else{
                l = mid +1;
            }
        }
        return l;







        // ---------BRUTE FORCE -------------
        // for(int i =maxi ; i<=sum;i++){
        //     int daysr = daysreq(weights, i );
        //     if(daysr <= days){
        //         return i;
        //     }
        // }
        // return -1;
    }
}