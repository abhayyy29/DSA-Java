import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutiveSeq(int[] nums){

    HashSet<Integer> set = new HashSet<>();

    for(int num : nums){
        set.add(num);
    }
    int longest = 0;

    for(int num : set){
        if(!set.contains(num -1)){
            int current = num;
            int count = 1;

        while(set.contains(current + 1)){
            current++;
            count++;
        }
        longest = Math.max(longest,count);
        }
    }
        return longest;
}
public static void main(String[] args) {
    int[] nums = {101,2,100,4,103,3,1,1};
    LongestConsecutiveSequence ab = new LongestConsecutiveSequence();
    System.out.println(ab.longestConsecutiveSeq(nums));
}
}
