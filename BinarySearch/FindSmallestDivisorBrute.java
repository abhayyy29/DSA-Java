package BinarySearch;

public class FindSmallestDivisorBrute {
    public int findDivisor(int[] arr, int limit){
        int max = 0;
        for(int num : arr){
            max = Math.max(max,num);
        }
        for(int d = 1; d<= max; d++){
            int sum = 0;
            for(int i=0; i<arr.length; i++){
                sum += (arr[i] + d -1)/d;
            }
                if(sum <= limit){
                     return d;
                } 
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int limit = 8;
        FindSmallestDivisorBrute ab = new FindSmallestDivisorBrute();
        System.out.println(ab.findDivisor(arr, limit));
    }
}
