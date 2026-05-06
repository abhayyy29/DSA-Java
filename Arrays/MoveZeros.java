
public class MoveZeros{
    public void moveZeroes(int[] nums) {
        int j=-1;
        int temp;

        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        for(int i = j+1;i<nums.length;i++){
            if(nums[i] != 0){
                temp = nums[i];
                nums[i] =  nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for(int i =0; i<nums.length;i++){
        System.out.print(nums[i] + "");
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,1,3,0,4,5};
        MoveZeros ab = new MoveZeros();
        ab.moveZeroes(arr);

    }
}