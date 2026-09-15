package BinarySearch;

public class FindDivisor {
    public int find(int[] arr, int limit){
        int max = 0;
        for(int num : arr){
            max = Math.max(max,num);
        }

        int low = 1;
        int high = max;

        while(low <= high){
            int mid = (low + high)/2;

            int sum = calculateSum(arr,mid);
            if(sum <= limit){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    private static int calculateSum(int[] arr, int d){
        int sum = 0;
        for(int num : arr){
            sum += (num + d -1)/d;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int limit = 8;
        FindDivisor a = new FindDivisor();
        System.out.println(a.find(arr,limit));
    }
}
