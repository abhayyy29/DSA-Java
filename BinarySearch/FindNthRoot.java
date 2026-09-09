package BinarySearch;

public class FindNthRoot {
    public static int nthRoot(int n, int m){
        int low = 1;
        int high = m;

        while(low <= high){
            int mid = (low + high)/2;
            int result = power(mid,n,m);

            if(result == 1){
                return mid;
            }

            if(result == 0){
                low  = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    private static int power(int mid, int n, int m){
            long result = 1;

            for(int i = 1; i<= n; i++){
                result *= mid;

                if(result > m){
                    return 2;
                }
            }

            if(result == m){
                return 1;
            }
            return 0;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 8;

        FindNthRoot a = new FindNthRoot();
        System.out.println(a.nthRoot(n,m));

    }
}
