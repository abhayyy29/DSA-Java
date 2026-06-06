import java.util.ArrayList;
import java.util.List;

public class MajorityElement2{
    public List<Integer> majorElement(int[] nums){

        int count1 =0; int count2 =0;
        int candidate1 = 0; int candidate2 = 0;

        for(int num : nums){
            if(candidate1 == num){
                count1++;
            }
            else if(candidate2 == num){
                count2++;
            }
            else if(count1 == 0 ){
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 ==0){
                candidate2 = num;
                count2 = 1;
            }
            else{
                count1 --;
                count2 --;

            }
        }
        count1 =0;
        count2 =0;

        for(int num : nums){
            if(num == candidate1){
                count1++;
            }else if(num == candidate2){
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        int n = nums.length;
        if(count1 > n/3){
            ans.add(candidate1);
        }
        if(count2 > n/3){
            ans.add(candidate2);
        }
        return ans;
    }
    public static void main(String[] args){

        int[] nums = {1,2,4,2,4,5,4,2};
        MajorityElement2 ab = new MajorityElement2();
        System.out.println(ab.majorElement(nums));
    }
}
