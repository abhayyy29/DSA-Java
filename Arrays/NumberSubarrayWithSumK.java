import java.util.HashMap;

public class NumberSubarrayWithSumK {
    public int subarraySum(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixSum = 0;
        int count = 0;

        for(int num : nums){
            prefixSum += num;
            if(map.containsKey(prefixSum - k)){
                count+= map.get(prefixSum -k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        int k= 3;

        NumberSubarrayWithSumK ab = new NumberSubarrayWithSumK();
        int result = ab.subarraySum(nums,k);

        System.out.println("Number of subarray with sum k =" + k + " is :" + result);
    }
}
