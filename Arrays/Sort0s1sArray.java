public class Sort0s1sArray {
    public static void sortArray(int[] arr){

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for( int num : arr){
            if(num == 0){
                count0++;
            }else if(num ==1){
                count1++;
            }else{
                count2++;
            }
        }
        int i =0;

        while(count0-- > 0){
            arr[i++] =0;
        }
        while(count1-- > 0){
            arr[i++] = 1;
        }
        while(count2-- > 0){
            arr[i++] = 2;
        }

        for(int x : arr){
            System.out.print(x + "");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,1,0,1,2};
        sortArray(arr);
    }

}
