public class FIndRepeatingMissingNumBruteF {
    public static int[] findNumbers(int[] nums){
        int n = nums.length;
        int repeating = -1;
        int missing = -1;
        

        for(int i=0; i<=n; i++){
            int count =0;
            for(int j=0; j<n; j++){

                if(nums[j] == i){
                    count++;
                }
            }
            if(count == 2){
                repeating = i;
            }
            if(count ==0){
                missing = i;
            }
        }
        return new int[]{repeating,missing};
    }
    public static void main(String[] args) {
        int[] nums = {2,4,3,6,1,1};
        int[] ans = findNumbers(nums);
        System.out.println("Repeating " + ans[0]);
        System.out.println("Missing " + ans[1]);
    
    }
}
