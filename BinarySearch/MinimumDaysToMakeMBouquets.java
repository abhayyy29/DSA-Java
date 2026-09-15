package BinarySearch;

public class MinimumDaysToMakeMBouquets {
    public int roseGarden(int n , int[] arr, int k, int m){
        long val = (long) k * m;
        if(val > n){
            return -1;
        }

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        int low =  mini;
        int high = maxi;

        while(low <= high){
            int mid = (low + high)/2;
            if(possible(arr,mid,m,k)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean possible(int[] arr, int day, int m , int k){
        int cnt = 0;
        int noOfB = 0;

        for(int i =0; i < arr.length ; i++){
            if(arr[i] <= day){
                cnt ++;
            }else{
                noOfB = cnt/k;
                cnt = 0;
            }
        }

        noOfB += cnt/k;
        return noOfB >= m;
    }
    public static void main(String[] args) {
        int[] arr = {7,7,7,7,8,10,12,13};
        int n = 8;
        int m = 2;
        int k = 3;
        MinimumDaysToMakeMBouquets ab = new MinimumDaysToMakeMBouquets();
        System.out.println(ab.roseGarden(n, arr, k, m));
    }
}
