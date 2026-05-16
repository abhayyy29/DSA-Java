import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public List<Integer> leaders(int[] nums){
        
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int maxRight = nums[n-1];
        ans.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(nums[i]>maxRight){
            maxRight = nums[i];
            ans.add(nums[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {c
        int[] nums = {10,22,12,3,0,6};

        LeadersInArray ab = new LeadersInArray();
        List<Integer> result = ab.leaders(nums);
        System.out.println(result);
    }
}
