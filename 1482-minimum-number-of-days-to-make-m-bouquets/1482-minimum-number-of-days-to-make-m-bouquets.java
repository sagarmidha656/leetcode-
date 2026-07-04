class Solution {
    public boolean possible(int[] arr , int day , int m , int k ){
        int count = 0 , bouq = 0 ; 
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                bouq += (count/k);
                count=0;
            }
        }
        bouq += (count/k);

        if(bouq >= m ) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)m*k > n) return -1;
        int mini = bloomDay[0] , maxi = bloomDay[0];
        for(int num : bloomDay){
            mini = Math.min(mini, num);
            maxi = Math.max(maxi,num);
        }
        int l = mini , h = maxi;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(possible(bloomDay,mid,m,k)){
                h = mid -1;
            }
            else{
                l = mid +1;
            }

        }
        return l ;
    }
}