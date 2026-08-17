package BinarySearch;

public class SearchingInSortedArray {
    public int search(int[] arr, int x){
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] < x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
}
public static void main(String[] args) {
    int[] arr = {1,3,4,5,6,7,8,9,12};
    int x = 6;
    SearchingInSortedArray ab = new SearchingInSortedArray();
    System.out.println(ab.search(arr, x));
}
}
