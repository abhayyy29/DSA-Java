package Arrays;

import java.util.Scanner;

public class LeftRotate {
    public void rotateArrayByOne(int[] nums){


        int temp = nums[0];

        for(int i=1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = temp;

        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i] + "");
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        LeftRotate ab = new LeftRotate();
        ab.rotateArrayByOne(arr);
    }
}
