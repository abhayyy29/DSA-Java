package BinarySearch;

class SearchInRotatedSortedArray {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
       int low = 0;
       int high = nums.length - 1;

       while(low <= high){
        int mid = (low + high)/2;
        if(k == nums[mid]){
            return true;
        }
        if(nums[low] == nums[mid] && nums[mid] == nums[high]){
            low = mid +1;
            high = mid -1;
            continue;
        }
        if(nums[low] < nums[mid]){
           if(k >= nums[low] && k <= nums[mid]){
            high = mid -1;
           }else{
            low = mid + 1;
           }
        }else{
            if(k >= nums[mid] && k <= nums[high]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
       }
       return false;
    }
    public static void main(String[] args) {
        int[] nums = {7,8,1,2,3,3,3,4,5,6};
        int k = 3;
        SearchInRotatedSortedArray ab = new SearchInRotatedSortedArray();
        System.out.println(ab.searchInARotatedSortedArrayII(nums, k));
    }
}