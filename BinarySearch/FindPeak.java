package BinarySearch;
public class FindPeak {
    public int findPeakElement(int[] nums){
          int low = 0;
          int high = nums.length -1;

          while(low < high){
            int mid = (low + high)/2;
            if(nums[mid] < nums[mid + 1]){
                low = mid + 1;
            }else{
                high = mid;
            }
          }
          return low;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        FindPeak ab = new FindPeak();
        System.out.println(ab.findPeakElement(nums));
    }
}
