package BinarySearch;

public class CountOccurence {
    public static int count(int[] arr, int x){
        int first = lowerBound(arr,x);

        if(first == arr.length || arr[first] != x){
            return 0;
        }

        int last = upperBound(arr,x);

        return last - first;
    }

    private static int lowerBound(int[] arr, int x){
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] >=x){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
    private static int upperBound(int[] arr, int x){
        int low =0;
        int high = arr.length -1;
        int ans = arr.length;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] > x){
               ans = mid;
               high = mid - 1;
}else{
    low = mid + 1;
}
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,7,9};
        int x = 4;
        int result = count(arr,x);
        System.out.println(result);
    }
}
