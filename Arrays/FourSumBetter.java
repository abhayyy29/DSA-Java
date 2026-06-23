import java.util.*;
public class FourSumBetter {
    public static List<List<Integer>> fourSum (int[] nums, int target){

        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                HashSet<Integer> set = new HashSet<>();
                for(int k= j+1; k<n; k++){
                    int fourth = target - (nums[i] + nums[j] + nums[k]);
                    if(set.contains(fourth)){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], fourth);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                    set.add(nums[k]);
                }
            }
        }
            return new ArrayList<>(ans);
    }
    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        int target =0;

        System.out.println(fourSum(nums, target));
    }
}
