import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingInterval {
    public List<List<Integer>> mergeOverlap(List<List<Integer>> intervals){

        intervals.sort((a,b) -> a.get(0)- b.get(0));
        List<List<Integer>> ans = new ArrayList<>();


        for(List<Integer> interval : intervals){
            if(ans.isEmpty() || interval.get(0) > ans.get(ans.size()-1).get(1)){
                ans.add(new ArrayList<>(interval));
            }else{

                List<Integer> last = ans.get(ans.size()-1);
                last.set(1, Math.max(last.get(1),interval.get(1)));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        List<List<Integer>> intervals = new ArrayList<>();

        intervals.add(Arrays.asList(1,3));
        intervals.add(Arrays.asList(2,6));
        intervals.add(Arrays.asList(8,10));
        intervals.add(Arrays.asList(15,18));

        MergeOverlappingInterval ab = new MergeOverlappingInterval();
        List<List<Integer>> result = ab.mergeOverlap(intervals);
        System.out.println(result);
    }
}
