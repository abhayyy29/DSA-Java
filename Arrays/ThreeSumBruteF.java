import java.util.*;

public class ThreeSumBruteF {
    public static List<List<Integer>> threeSum(int[] nums){

        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i + 1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }
}
