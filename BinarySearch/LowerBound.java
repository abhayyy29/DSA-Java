package BinarySearch;

public class LowerBound {
    public int search(int[] arr,int x){
        int low =0;
        int high = arr.length - 1;
        int ans = arr.length;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int x = 2;
        LowerBound ab = new LowerBound();
        System.out.println(ab.search(arr, x));
    }
}
