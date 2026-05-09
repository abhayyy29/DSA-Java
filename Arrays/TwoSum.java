import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n-1;

        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{nums[left],nums[right]};
            }else if(sum<target){
                left ++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {1,6,2,10,3};
        int target = 8;
        TwoSum ab = new TwoSum();
        int[] ans =ab.twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
