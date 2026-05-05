public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,-4,4,0,10};
        int idx = -1;
        int target = 4;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                idx = i;
                break;
            }
    }
    System.out.println(idx);
}
}
