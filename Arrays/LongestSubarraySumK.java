public class LongestSubarraySumK {
    public static int longestSubarray(int[] nums , int k){

        int left =0;
        int right =0;

        long sum = nums[0];
        int maxLen =0;

        while(right < nums.length){

            while(left <= right && sum > k){
                sum += nums[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < nums.length){
                sum += nums[right];
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,1,1,3,3};
        System.out.println(longestSubarray(nums, 6));
    }
}
