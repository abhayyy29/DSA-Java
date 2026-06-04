public class MajorityElement {
    public int majorityEle(int [] nums){
        int count =0;
        int candidate = 0;


        for(int num : nums){

            if(count == 0){
                candidate = num;
            }
            if(num  ==  candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        int [] nums = {2,3,4,2,2,1,2,7,2};
        MajorityElement ab = new MajorityElement();
        System.out.println(ab.majorityEle(nums));
    }
}
