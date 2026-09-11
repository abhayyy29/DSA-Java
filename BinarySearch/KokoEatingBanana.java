package BinarySearch;

public class KokoEatingBanana {
    public int minimumRateToEatBanana(int[] arr, int h){
        int low = 0;
        int high = findMax(arr);
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high)/2;
            int totalH = findHrs(arr,mid);
            if(totalH <= h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return  low;
    }

    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int findHrs(int[] arr, int hourly){
        int totalH = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            totalH += Math.ceil((double)arr[i]/hourly);
        }
        return  totalH;
    }
    public static void main(String[] args) {
        int[] arr = {7,15,6,3};
        int h = 8;
        KokoEatingBanana ab = new KokoEatingBanana();
        System.out.println(ab.minimumRateToEatBanana(arr, h));
    }
}
