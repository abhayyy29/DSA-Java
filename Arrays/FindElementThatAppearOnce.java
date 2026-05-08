public class FindElementThatAppearOnce {
    public int findElement(int [] nums) {
    
        int XOR =0;
        for(int i =0;i<nums.length;i++){
            XOR = XOR^nums[i];
        }
        return XOR;
    }
    public static void main(String[] args) {
            int [] nums = {1,1,2,3,3,8,8};
            FindElementThatAppearOnce ab = new FindElementThatAppearOnce();
            System.out.println(ab.findElement(nums));
            

    }
}
