import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumBruteF {
    public static List<List<Integer>> fourSum(int[] nums, int target){
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k= j+1; k<n; k++){
                    for(int l= k+1; l<n; l++){
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target){
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        int target =0;

        System.out.println(fourSum(nums, target));
    }
}
