

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
      int n = nums.length;

      int prefix = 1;
      int suffix = 1;
      int max = Integer.MIN_VALUE;
      for(int i=0; i<n; i++){
        if(prefix == 0) prefix = 1;
        if(suffix == 0) suffix = 1;

        prefix *= nums[i];
        suffix *= nums[n-1-i];
        max = Math.max(max, Math.max(prefix, suffix));
      }
      return max;
    }
    public static void main(String[] args) {
        MaximumProductSubarray solution = new MaximumProductSubarray();
        int[] nums = {2, 3, -2, 4};
        System.out.println(solution.maxProduct(nums)); 
    }
}
