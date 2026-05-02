package Arrays;
import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secondLargest = -1;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]> largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }

            if(arr[i]< smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]< secondSmallest && arr[i]!= smallest){
                secondSmallest = arr[i];
            }
        }
            System.out.println("Second Lar: "+ secondLargest);
            System.out.println("Second Smallest:" + secondSmallest);
    }
}