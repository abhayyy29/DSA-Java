public class ReArrangeArrayOptimal{
    public static int[] reArrange(int[] arr){
        
        int n = arr.length;
        int[] ans = new int[n];

        int pos =0;
        int neg =1;

        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans[pos] = arr[i];
                pos = pos + 2;
            }else{

                ans[neg] = arr[i];
                neg =+ 2;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = reArrange(arr);

        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}