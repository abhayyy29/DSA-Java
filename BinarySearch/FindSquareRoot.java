package BinarySearch;
public class FindSquareRoot {
    public int findS(int n){
        int low = 0;
        int high = n;
        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;
            int val = mid * mid;
            if( val < n){
               ans = mid;
               low = mid + 1;
            }else{
                high = mid -1;
            } 
        }
        return high;
    }
    public static void main(String[] args) {
        int n = 38;
        FindSquareRoot a = new FindSquareRoot();
        System.out.println(a.findS(n));
    }
}
