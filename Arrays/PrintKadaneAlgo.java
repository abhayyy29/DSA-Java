public class PrintKadaneAlgo {
    public static int maxSubArray(int[] nums){

        int sum =0;
        int max =Integer.MIN_VALUE;
        int ansStart = 0;
        int ansEnd =0;
        int start =0;
        
        for(int i= 0; i<nums.length; i++){
            if(sum ==0){
                start = i;
            }
            sum += nums[i];
        
            if(sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0){
                sum =0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {-2,-1,4,-1,-2,5,-1};
        System.out.println(maxSubArray(nums));
    }
}
