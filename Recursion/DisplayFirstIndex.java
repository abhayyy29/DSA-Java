import java.util.Scanner;
public class DisplayFirstIndex {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements for an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value to find its first index");
        int d = sc.nextInt();
        int fi = firstIndex(arr,0,d);
        System.out.println("Index:" + fi);
    }
    public static int firstIndex(int[] arr,int idx, int x){
        if(arr[idx]== arr.length){
            return -1;
        }

        if(arr[idx] == x){
            return idx;
        }else{
            int fiisa = firstIndex(arr, idx + 1, x);
            return fiisa;
        }
    }
}
