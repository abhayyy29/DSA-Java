public class LongestConsecutiveSeqBruteF {
    boolean linearSearch(int[] nums, int target){

        for(int num : nums){
            if(num == target){
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums){
        int longest =0;

        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            int count = 1;
            while(linearSearch(nums, x + 1)){
                x++;
                count++;
            }
            longest = Math.max(longest,count);
        }
        
        return longest;
    }
    public static void main(String[] args) {
        int[] nums = {101,4,100,2,102,3,1,1};
        LongestConsecutiveSeqBruteF ab = new LongestConsecutiveSeqBruteF();
        System.out.println(ab.longestConsecutive(nums));
    }
}
