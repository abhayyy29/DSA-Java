public  class RearrangeArrayBySign{
    public static int[] rearrange(int[] arr){
        
        int n = arr.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];

        int ps =0;
        int ng= 0;

        for(int i=0;i<n;i++){

            if(arr[i] > 0){
                pos[ps++] = arr[i];
            }else{
                neg[ng++] = arr[i];
            }
        }

        for(int i =0; i<n/2; i++){
            arr[2 * i] = pos[i];
            arr[ 2* i +1] = neg[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = rearrange(arr);
        for(int i=0; i< ans.length; i++){
        System.out.print(ans[i] + " ");
    }
    }
}